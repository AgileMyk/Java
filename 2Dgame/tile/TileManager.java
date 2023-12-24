package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TileManager {

    GamePanel gp;
    Tile[] tile;

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[10];

        getTileImage();
    }

    public void getTileImage() {

        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/bricks.png"));


            tile[1] = new Tile();
                tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));

            tile[2] = new Tile();
                tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass-shore.png"));

            tile[3] = new Tile();

                tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/ocean.png"));

            tile[4] = new Tile();

                tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/sand.png"));

            tile[5] = new Tile();

                tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shore.png"));

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
    public void draw(Graphics2D g2) {

        g2.drawImage(tile[1].image, 0,0,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 48,0,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 96,0,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 144,0,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 192,0,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 240,0,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 288,0,gp.tileSize,gp.tileSize, null);

        g2.drawImage(tile[1].image, 0,48,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 48,48,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 96,48,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 144,48,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 192,48,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 240,48,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 288,48,gp.tileSize,gp.tileSize, null);

        g2.drawImage(tile[1].image, 0,96,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 48,96,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 96,96,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 144,96,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 192,96,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 240,96,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 288,96,gp.tileSize,gp.tileSize, null);

        g2.drawImage(tile[1].image, 0,144,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 48,144,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 96,144,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 144,144,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 192,144,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 240,144,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 288,144,gp.tileSize,gp.tileSize, null);

        g2.drawImage(tile[1].image, 0,192,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 48,192,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 96,192,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 144,192,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 192,192,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 240,192,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 288,192,gp.tileSize,gp.tileSize, null);

        g2.drawImage(tile[1].image, 0,240,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 48,240,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 96,240,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 144,240,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 192,240,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 240,240,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 288,240,gp.tileSize,gp.tileSize, null);

        g2.drawImage(tile[1].image, 0,288,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 48,288,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 96,288,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 144,288,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 192,288,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 240,288,gp.tileSize,gp.tileSize, null);
        g2.drawImage(tile[1].image, 288,288,gp.tileSize,gp.tileSize, null);
    }
}
