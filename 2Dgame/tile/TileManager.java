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
            try {
                tile[0].image = ImageIO.read(getClass().getResourceAsStream("tiles/bricks.png"));
            } catch (FileNotFoundException fnf) {
                System.out.println(fnf.getClass() + ": " + fnf.getCause());
            }
            tile[1] = new Tile();
            try {
                tile[1].image = ImageIO.read(getClass().getResourceAsStream("\\tiles\\grass.png"));
            } catch (FileNotFoundException fnf) {
                System.out.println(fnf.getClass() + ": " + fnf.getCause());
            }
            tile[2] = new Tile();
            try {
                tile[2].image = ImageIO.read(getClass().getResourceAsStream("\\tiles\\grass-shore.png"));
            } catch (FileNotFoundException fnf) {
                System.out.println(fnf.getClass() + ": " + fnf.getCause());
            }
            tile[3] = new Tile();
            try {
                tile[3].image = ImageIO.read(getClass().getResourceAsStream("\\tiles\\ocean.png"));
            } catch (FileNotFoundException fnf) {
                System.out.println(fnf.getClass() + ": " + fnf.getCause());
            }
            tile[4] = new Tile();
            try {
                tile[4].image = ImageIO.read(getClass().getResourceAsStream("\\tiles\\sand.png"));
            } catch (FileNotFoundException fnf) {
                System.out.println(fnf.getClass() + ": " + fnf.getCause());
            }
            tile[5] = new Tile();
            try {
                tile[5].image = ImageIO.read(getClass().getResourceAsStream("\\tiles\\shore.png"));
            } catch (FileNotFoundException fnf) {
                System.out.println(fnf.getClass() + ": " + fnf.getCause());
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
    public void draw(Graphics2D g2) {

        g2.drawImage(tile[1].image, 0,0,gp.tileSize,gp.tileSize, null);

    }
}
