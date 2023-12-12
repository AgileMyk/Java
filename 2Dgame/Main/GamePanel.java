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

    Thread gameThread;
    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    @Override
    public void run() {
        while (gameThread != null) {
            //   System.out.println("Game is running");
            // UPDATE: update information such as character positions
            update();
            //   DRAW: draw the screen with the update information
            repaint();
        }
    }

    public void update() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        g2.fillRect(380,285,charDimensions,charDimensions);
        g2.dispose();
    }
}
