package EJ4a7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EJ5 extends JFrame implements ActionListener {

    private JLabel lblTexto;

    private JMenuItem mNegrita;
    private JMenuItem mNormal;

    private JMenuItem mRojo;
    private JMenuItem mAzul;
    private JMenuItem mNegro;

    public EJ5() {

        setTitle("Editor de Texto");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblTexto = new JLabel("Texto de prueba", SwingConstants.CENTER);
        add(lblTexto);

        JMenuBar barra = new JMenuBar();

        JMenu menuEstilo = new JMenu("Estilo");
        JMenu menuColor = new JMenu("Color");

        mNegrita = new JMenuItem("Negrita");
        mNormal = new JMenuItem("Normal");

        mRojo = new JMenuItem("Rojo");
        mAzul = new JMenuItem("Azul");
        mNegro = new JMenuItem("Negro");

        mNegrita.addActionListener(this);
        mNormal.addActionListener(this);
        mRojo.addActionListener(this);
        mAzul.addActionListener(this);
        mNegro.addActionListener(this);

        menuEstilo.add(mNegrita);
        menuEstilo.add(mNormal);

        menuColor.add(mRojo);
        menuColor.add(mAzul);
        menuColor.add(mNegro);

        barra.add(menuEstilo);
        barra.add(menuColor);

        setJMenuBar(barra);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == mRojo) {
            lblTexto.setForeground(Color.RED);
        } else if (e.getSource() == mAzul) {
            lblTexto.setForeground(Color.BLUE);
        } else if (e.getSource() == mNegro) {
            lblTexto.setForeground(Color.BLACK);
        } else if (e.getSource() == mNegrita) {
            lblTexto.setFont(new Font("Arial", Font.BOLD, 14));
        } else if (e.getSource() == mNormal) {
            lblTexto.setFont(new Font("Arial", Font.PLAIN, 14));
        }
    }

    public static void main(String[] args) {
        new EJ5();
    }
}