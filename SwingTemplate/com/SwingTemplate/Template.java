package com.SwingTemplate;
import javax.swing.*;
import java.util.*;
import java.awt.*;
public class Template {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private Template firstTemplate;
    public Template() {initialize(); }
    public void initialize() {
        frame = new JFrame();
        frame.setTitle("Random Template");
        frame.setSize(1200,800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        button = createButton();

        frame.add(panel, BorderLayout.CENTER);
        panel.add(button);
    }

    public void show() {
        initialize();
    }
    private JButton createButton() {
        JButton button = new JButton("Character");
        //set focusability of button
        button.setFocusable(false);
        return button;
    }
}
