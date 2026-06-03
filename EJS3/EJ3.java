package EJS3;

import java.awt.*;
import java.awt.event.*;

public class EJ3 {

    public static void main(String[] args) {
        ejemploBorderLayout();
        ejemploFlowLayout();
        ejemploGridLayout();
        ejemploCardLayout();
    }

    // BorderLayout
    public static void ejemploBorderLayout() {
        Frame frame = new Frame("BorderLayout");
        frame.setLayout(new BorderLayout());

        frame.add(new Button("NORTE"), BorderLayout.NORTH);
        frame.add(new Button("SUR"), BorderLayout.SOUTH);
        frame.add(new Button("ESTE"), BorderLayout.EAST);
        frame.add(new Button("OESTE"), BorderLayout.WEST);
        frame.add(new Button("CENTRO"), BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setLocation(100, 100);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    // FlowLayout
    public static void ejemploFlowLayout() {
        Frame frame = new Frame("FlowLayout");
        frame.setLayout(new FlowLayout());

        frame.add(new Button("Botón 1"));
        frame.add(new Button("Botón 2"));
        frame.add(new Button("Botón 3"));
        frame.add(new Button("Botón 4"));

        frame.setSize(300, 200);
        frame.setLocation(450, 100);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    // GridLayout
    public static void ejemploGridLayout() {
        Frame frame = new Frame("GridLayout");
        frame.setLayout(new GridLayout(2, 2));

        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));

        frame.setSize(300, 200);
        frame.setLocation(100, 350);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    // CardLayout
    public static void ejemploCardLayout() {
        Frame frame = new Frame("CardLayout");
        CardLayout cardLayout = new CardLayout();
        Panel panel = new Panel();

        panel.setLayout(cardLayout);

        panel.add(new Label("Tarjeta 1", Label.CENTER), "card1");
        panel.add(new Label("Tarjeta 2", Label.CENTER), "card2");
        panel.add(new Label("Tarjeta 3", Label.CENTER), "card3");

        Button siguiente = new Button("Siguiente");

        siguiente.addActionListener(e -> cardLayout.next(panel));

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(siguiente, BorderLayout.SOUTH);

        frame.setSize(300, 200);
        frame.setLocation(450, 350);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}