import javax.print.attribute.standard.Finishings;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
public class MainToDoJFrame {
    private JFrame frame;
    private JPanel northPanel;
    private JLabel northLabel;
    private JButton menuButton;
    private JPanel centerPanel;
    private JPanel southPanel;
    public MainToDoJFrame() {
        initialize();
    }
    public void initialize() {
        frame = new JFrame();
        this.frame.setSize(450,825);
        this.frame.setTitle("Tasker");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setVisible(true);
        this.frame.setLocationRelativeTo(null);
        //this.frame.setFont(new Font("Arial",Font.BOLD,16));
        ImageIcon logo = new ImageIcon("toDoApp//src//img/logo.png");
        //import JAR file
        //ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("logo.png"));
        this.frame.setIconImage(logo.getImage());

        //Panels
        //NORTH
        northPanel = new JPanel();
        northPanel.setSize(frame.getWidth(),125);
        northPanel.setPreferredSize(new Dimension(frame.getWidth(), 125));
        northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        northPanel.setBackground(Color.lightGray);
        northPanel.setFont(new Font("Arial", Font.BOLD, 18));
        //northPanel.add(new JButton("north"));
        frame.add(northPanel, BorderLayout.NORTH);
        northPanel.setBorder(new EmptyBorder(10,20,10,20));
        northLabel = new JLabel("Task name here(insert object title)");
        menuButton = createMenuButton();
        menuButton.setPreferredSize(new Dimension(38, 38));
        menuButton.setContentAreaFilled(false);
        northPanel.add(menuButton);


        //CENTER
        centerPanel = new JPanel();
        centerPanel.setSize(frame.getWidth(),400);
        centerPanel.setPreferredSize(new Dimension(frame.getWidth(),400));
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerPanel.setBackground(Color.darkGray);

        frame.add(centerPanel, BorderLayout.CENTER);

        //SOUTH
        southPanel = new JPanel();
        southPanel.setSize(frame.getWidth(),200);
        southPanel.setPreferredSize(new Dimension(250, 250));
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.setBackground(Color.lightGray);
        frame.add(southPanel, BorderLayout.SOUTH);
    }

    private JButton createMenuButton() {
        JButton menuButton = new JButton();
        ImageIcon menuIcon = new ImageIcon("toDoApp/src//img/menu.png");
        menuButton.setIcon(menuIcon);

        return menuButton;
    }
}
