import java.util.*;
import javax.swing.*;
import java.awt.*;

class ToDo {
    private JFrame mainJFrame;
    public ToDo() {};
    public void initialize() {

        mainJFrame = new JFrame();
        mainJFrame.setSize(450,825);
        mainJFrame.setTitle("Tasker");
        mainJFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainJFrame.setVisible(true);
        mainJFrame.setLocationRelativeTo(null);
        ImageIcon logo = new ImageIcon("toDoApp//src//img/logo.png");
        //import JAR file
        //ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("logo.png"));
        mainJFrame.setIconImage(logo.getImage());

    }

    public void show() {initialize();
    }
}