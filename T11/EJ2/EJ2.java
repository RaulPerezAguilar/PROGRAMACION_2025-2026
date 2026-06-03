package EJ2;

import java.awt.*;
import java.awt.event.*;

public class EJ2 extends Frame {

    public EJ2() {
        // Título de la ventana
        setTitle("Posicionamiento Absoluto");

        // Tamaño de la ventana
        setSize(400, 300);

        // Desactivar Layout Manager
        setLayout(null);

        // Crear etiqueta
        Label etiqueta = new Label("Hola Mundo");
        etiqueta.setBounds(50, 80, 100, 30);

        // Crear botón
        Button boton = new Button("Aceptar");
        boton.setBounds(200, 80, 100, 30);

        // Agregar componentes
        add(etiqueta);
        add(boton);

        // Cerrar ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        // Mostrar ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new EJ2();
    }
}