package com.thirdJavaSwing;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
public class MainFrame {
    private JFrame frame;
    public MainFrame() {
        initialize();
    }
    public void initialize() {
        frame = new JFrame();
        frame.setLayout(new BorderLayout(6, 3));
        frame.setTitle("Java Swing Panel Demo");
        frame.setSize(1100,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);

        //create JPanel

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 4, 6));
        panel.setBackground(Color.CYAN);
        //many prefer to not setPreferredSize, allowing the algorithm to do so automatically
        // sets preffered size --> panel.setPreferredSize(new Dimension(250, 800));
        frame.add(panel, BorderLayout.EAST);
        frame.setVisible(true);

        Button button = new Button("click me!");
        Button button2 = new Button("but don't click me!");

        panel.add(button);
        panel.add(button2);


    }

    public void show() {
        frame.setVisible(true);
    }
}
