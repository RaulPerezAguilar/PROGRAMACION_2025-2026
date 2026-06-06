package EJ4a7;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class EJ7 extends JFrame implements ActionListener {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JLabel lblFichero;

    private JButton btnAceptar;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JButton btnFichero;

    public EJ7() {

        setTitle("Login");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 2));

        add(new JLabel("Usuario:"));
        txtUsuario = new JTextField();
        add(txtUsuario);

        add(new JLabel("Contraseña:"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        btnAceptar = new JButton("Aceptar");
        btnLimpiar = new JButton("Limpiar");
        btnSalir = new JButton("Salir");
        btnFichero = new JButton("Seleccionar fichero");

        btnAceptar.addActionListener(this);
        btnLimpiar.addActionListener(this);
        btnSalir.addActionListener(this);
        btnFichero.addActionListener(this);

        add(btnAceptar);
        add(btnLimpiar);

        add(btnSalir);
        add(btnFichero);

        lblFichero = new JLabel("Ningún fichero seleccionado");
        add(lblFichero);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAceptar) {

            String usuario = txtUsuario.getText();

            JOptionPane.showMessageDialog(
                    this,
                    "Bienvenido " + usuario,
                    "Login correcto",
                    JOptionPane.INFORMATION_MESSAGE);

        } else if (e.getSource() == btnLimpiar) {

            txtUsuario.setText("");
            txtPassword.setText("");
            lblFichero.setText("Ningún fichero seleccionado");

        } else if (e.getSource() == btnSalir) {

            dispose();

        } else if (e.getSource() == btnFichero) {

            JFileChooser selector = new JFileChooser();

            int resultado = selector.showOpenDialog(this);

            if (resultado == JFileChooser.APPROVE_OPTION) {

                File fichero = selector.getSelectedFile();

                lblFichero.setText(fichero.getAbsolutePath());
            }
        }
    }

    public static void main(String[] args) {
        new EJ7();
    }
}