package main;

import entity.Player;
import tile.TileManager;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    //SCREEN SETTINGS
    final int originalTileSize = 16;
    final int scale = 3; //for scaling up from early SNES etc. 16x16 scaling to fit modern screen resolutions

    public final int tileSize = originalTileSize * scale; //characters, etc. final size ends up being 48x48
    final int maxScreenCol = 16; //	■	■	■	■	■	■	■	■	■	■	■	■	■	■	■	■
    final int maxScreenRow = 12; //4 to 3 ratio
    final int charDimensions = maxScreenRow * scale;
    final int screenWidth = tileSize * maxScreenCol; // 768px
    final int screenHeight = tileSize * maxScreenRow; // 576px

    //FPS
    int FPS = 60;
    KeyHandler keyH = new KeyHandler();
    Player player = new Player(this, keyH);
    TileManager tileM = new TileManager(this);

    Thread gameThread;


    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;


        while (gameThread != null) {

            // UPDATE: update information such as character positions
            update();
            //   DRAW: draw the screen with the update information
            repaint();


            try {
                double remainingTime = (nextDrawTime - System.nanoTime()) / 1000000;

                if(remainingTime < 0) {
                    remainingTime = 0;
                }
                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }


    //ANOTHER GAME LOOP APPROACH - DELTA/ACCUMULATOR LOOP

    /*

    public static void run() {

        double drawInterval = 100000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {

            currentTime = system.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            lastTime = currentTime;

            if (delta > 1) {
                update();
                repaint();
                delta--;
            }
        }

    }

     */
        public void update () {
            player.update();
        }

        public void paintComponent (Graphics g){
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;
            tileM.draw(g2); //background draw before player draw
            player.draw(g2);
            g2.dispose();
        }
    }

