package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //SCREEN SETTINGS
    final int originalTileSize = 16;
    final int scale = 3; //for scaling up from early SNES etc. 16x16 scaling to fit modern screen resolutions

    final int tileSize = originalTileSize * scale; //characters, etc. final size ends up being 48x48
    final int maxScreenCol = 16; //	■	■	■	■	■	■	■	■	■	■	■	■	■	■	■	■
    final int maxScreenRow = 12; //4 to 3 ratio
    final int charDimensions = maxScreenRow * scale;
    final int screenWidth = tileSize * maxScreenCol; // 768px
    final int screenHeight = tileSize * maxScreenRow; // 576px

    //FPS
    int FPS = 60;

    Thread gameThread;

    //set player default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }

    KeyHandler keyH = new KeyHandler();

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {

        double drawInterval = 1000000000/FPS; //9 zeros => 1 billion / 1 nanosecond ... drawInterval becomes 16,666,666.6666 or screen draw occurs every .01666667 seconds
        double nextDrawTime = System.nanoTime() + drawInterval;
        while (gameThread != null) {
            //   System.out.println("Game is running");

            // UPDATE: update information such as character positions
            update();
            //   DRAW: draw the screen with the update information
            repaint();


            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000; //divide remaining time by 1mill to convert it for below sleep method which is in milliseconds

                if (remainingTime < 0) { remainingTime = 0};
                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    public void update() {
        if (keyH.upPressed == true) {
            playerY -= playerSpeed;
        } else if (keyH.downPressed == true) {
            playerY += playerSpeed;
        } else if (keyH.rightPressed == true) {
            playerX += playerSpeed;
        } else if (keyH.leftPressed == true) {
            playerX -= playerSpeed;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        g2.fillRect(playerX,playerY,charDimensions,charDimensions);
        g2.dispose();
    }
}
