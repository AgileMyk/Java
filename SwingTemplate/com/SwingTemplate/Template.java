package com.SwingTemplate;
import javax.swing.*;
import javax.swing.text.html.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.*;
public class Template {
    private JFrame frame;
    private JPanel panel;
    private JPanel panel2;
    private Panel CharacterPanel;
    private JLabel label;
    private JButton button;
    private JButton textButton;
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

        frame.add(panel, BorderLayout.WEST);
        panel.add(button);

        panel2 = new JPanel();
        frame.add(panel2, BorderLayout.EAST);

        panel2.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
        label = new JLabel("Tasks");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        ImageIcon questIcon = new ImageIcon("SwingTemplate/com/graphics/QuestIcon.png");
        label.setIcon(questIcon);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.TOP);
        //label.setIconTextGap(10);
        panel2.add(label, BorderLayout.EAST);
        panel2.setBackground(Color.cyan);
        panel2.setForeground(Color.WHITE);

        textButton = new JButton("Update Task Log");
        frame.add(textButton, BorderLayout.SOUTH);
        textButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("<html> no current tasks <br> visit your local town for more</html>");
                label.setVerticalTextPosition(SwingConstants.CENTER);
                label.setHorizontalTextPosition(SwingConstants.LEADING);

            }
        });

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
        button.setForeground(Color.WHITE);
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

   /*
    private JLabel createJLabel() {
        JLabel jLabel = new JLabel();

        return jLabel;
    }
    */
}
