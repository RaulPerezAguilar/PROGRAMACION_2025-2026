package EJ4a7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EJ6 extends JFrame implements ActionListener {

    private JButton btnRestar;
    private JButton btnSumar;
    private JLabel lblNumero;

    private int contador = 0;

    public EJ6() {

        setTitle("Contador");
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        btnRestar = new JButton("-1");
        lblNumero = new JLabel("0");
        btnSumar = new JButton("+1");

        btnRestar.addActionListener(this);
        btnSumar.addActionListener(this);

        add(btnRestar);
        add(lblNumero);
        add(btnSumar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnRestar) {
            contador--;
        } else if (e.getSource() == btnSumar) {
            contador++;
        }

        lblNumero.setText(String.valueOf(contador));
    }

    public static void main(String[] args) {
        new EJ6();
    }
}