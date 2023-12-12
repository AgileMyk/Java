package Main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack(); //tells window to align dimensions of subcomponents (gamePanel)

        window.setLocationRelativeTo(null); //window centered in screen
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
