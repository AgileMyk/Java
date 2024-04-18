package com.fifthJavaSwing;
import javax.swing.*;
import java.awt.*;
import java.io.FileReader;

public class MainGridFrame {
    private JPanel panel;
    private JFrame frame;
    public MainGridFrame() { initialize(); }

    public void initialize() {
        frame = new JFrame();
        frame.setSize(1200, 800);
        frame.setTitle("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.pack();
        frame.setVisible(true);

        panel = new JPanel(new GridLayout(3,5,5, 5));

        for (int i = 1; i <= 15; i++) {
            JButton button = new JButton(Integer.toString(i));
            panel.add(button);
        }

        frame.add(panel);
    }
    public void show() {
        frame.setVisible(true);
    }

}
