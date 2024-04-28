import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;
import java.awt.*;

class ToDo {
    private MainToDoJFrame MainFrameOne;
    private JFrame mainJFrame;
    private JLabel NorthPanel;
    private JButton backButton;
    private JLabel CenterPanel;
    private JLabel SouthPanel;
    private JPanel SouthGrid;
    public ToDo() {};
    public void initialize() {



        //Panels
        //NORTH
        NorthPanel = new JLabel("Current Task");
        NorthPanel.setText("task name goes here");
        NorthPanel.setBackground(Color.LIGHT_GRAY);
        NorthPanel.setForeground(Color.DARK_GRAY);
        NorthPanel.setFont(new Font("Arial", Font.BOLD, 20));
        NorthPanel.setHorizontalTextPosition(SwingConstants.CENTER);
        NorthPanel.setVerticalTextPosition(SwingConstants.TOP);
        NorthPanel.setSize(450,225);
        NorthPanel.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        backButton = createBackButton();
        NorthPanel.add(backButton);
        mainJFrame.add(NorthPanel, BorderLayout.NORTH);


        //CENTRAL


        //SOUTH
        SouthPanel = new JLabel();
        SouthPanel.setText("fuck you");
        SouthPanel.setSize(450,225);
        SouthPanel.setBackground(Color.BLACK);
        SouthPanel.setForeground(Color.WHITE);
        SouthGrid = new JPanel(new GridLayout(1,3,2,10));
        JButton southButton = new JButton();
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                southButton = new JButton("Reset Session");
            } else if (i == 1) {
                southButton = new JButton("0 / 4");
            } else if (i == 2) {
                southButton = new JButton("Add note");
            }
            SouthGrid.add(southButton);
        }
        SouthPanel.add(SouthGrid);
        mainJFrame.add(SouthPanel, BorderLayout.SOUTH);

    }

    //BUTTONS

    private JButton createBackButton() {
        JButton backButton = new JButton();
        backButton.setFocusable(false);
        ImageIcon backArrow = new ImageIcon("toDoApp//src//img//backButton.png");
        backButton.setIcon(backArrow);
        backButton.setMnemonic(KeyEvent.VK_B);
        backButton.setMargin(new Insets(4,20,4,20));
        backButton.setPreferredSize(new Dimension(40,40));
        backButton.setBorder(null);

        return backButton;
    }

    public void show() {initialize();
    }
}