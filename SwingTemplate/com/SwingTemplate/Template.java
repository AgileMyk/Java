package com.SwingTemplate;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.*;
public class Template {
    private JFrame frame;
    private JPanel panel;
    private Panel CharacterPanel;
    private JButton button;
    private Template firstTemplate;
    public Template() { }
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
        JButton button = new JButton("character");
        //set focusability of button
        button.setFocusable(false);

        ImageIcon characterIcon = new ImageIcon("SwingTemplate/com/graphics/Character.png");
        button.setIcon(characterIcon);
        button.setToolTipText("Character status screen");
        button.setMnemonic(KeyEvent.VK_C);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.setBackground(Color.LIGHT_GRAY);
        button.setIconTextGap(2);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.HORIZONTAL);
        button.setMargin(new Insets(4,20,4,20));
        button.setPreferredSize(new Dimension(280,160));
        button.setBorder(null);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Intellect: 10");
                System.out.println("Spirit: 10");
                System.out.println("Strength: 7");
                System.out.println("Grace: 8");
                System.out.println("Stamina: 7");
            }
        });
        return button;
    }
}
