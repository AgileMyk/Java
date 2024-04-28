import javax.print.attribute.standard.Finishings;
import javax.swing.*;
import java.awt.*;
public class MainToDoJFrame {
    private JFrame frame;
    private JPanel northPanel;
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
        northPanel.setSize(450,175);
        northPanel.setPreferredSize(new Dimension(450, 125));
        northPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        northPanel.setBackground(Color.lightGray);
        //northPanel.add(new JButton("north"));
        frame.add(northPanel, BorderLayout.NORTH);

        //CENTER
        centerPanel = new JPanel();
        centerPanel.setSize(450,400);
        centerPanel.setPreferredSize(new Dimension(450,400));
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerPanel.setBackground(Color.darkGray);

        frame.add(centerPanel, BorderLayout.CENTER);

        //SOUTH
        southPanel = new JPanel();
        southPanel.setSize(450,200);
        southPanel.setPreferredSize(new Dimension(250, 250));
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.setBackground(Color.lightGray);
        frame.add(southPanel, BorderLayout.SOUTH);
    }
}
