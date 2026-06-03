package EJ1;

import java.awt.*;
import java.awt.event.*;

public class EJ1 extends Frame implements ActionListener {

    private Button btnSalir, btnLimpiar;
    private TextField txtCampo;

    public EJ1() {
        setTitle("Ejemplo AWT");
        setSize(300, 200);
        setLayout(new FlowLayout());

        btnSalir = new Button("Salir");
        btnLimpiar = new Button("Limpiar");
        txtCampo = new TextField("Escribe algo...", 20);

        add(btnSalir);
        add(btnLimpiar);
        add(txtCampo);

        btnSalir.addActionListener(this);
        btnLimpiar.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            System.exit(0);
        }

        if (e.getSource() == btnLimpiar) {
            txtCampo.setText("");
        }
    }

    public static void main(String[] args) {
        new EJ1();
    }
}