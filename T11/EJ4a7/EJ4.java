package EJ4a7;

import java.awt.*;
import javax.swing.*;

public class EJ4 extends JFrame {

    public EJ4() {
        setTitle("Ascensor");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 2));

        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new EJ4();
    }
}