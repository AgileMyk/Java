package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {

    GamePanel gp;
    Tile[] tile;
    int mapTileNum[][];

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[10];
        mapTileNum = new int[gp.maxScreenCol][gp.maxScreenRow];

        getTileImage();
    }

    public void getTileImage() {

        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));
            tile[0].collision = true;


            tile[1] = new Tile();
                tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/bricks.png"));

            tile[2] = new Tile();
                tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass-shore.png"));

            tile[3] = new Tile();

                tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/ocean.png"));
                tile[3].collision = true;

            tile[4] = new Tile();

                tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/sand.png"));

            tile[5] = new Tile();

                tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shore.png"));

            tile[6] = new Tile();

                tile[6].image = null;

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public void loadMap() {
        try {
            InputStream is = getClass().getResourceAsStream("/maps/map01.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            int col = 0;
            int row = 0;

            while (col < gp.maxScreenCol && row < gp.maxScreenRow) {
                String line = br.readLine();

                while (col < gp.maxScreenCol) {

                    String numbers[] = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][num] = num;
                    col++;
                }
                if (col == gp.maxScreenCol) {
                    col =0;
                    row++;
                }
            }
            br.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(tile[1].image, 0, 0, gp.tileSize,  gp.tileSize, null);

        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;

        while (col < gp.maxScreenCol && row < gp.maxScreenRow) {

            g2.drawImage(tile[0].image, x, y, gp.tileSize, gp.tileSize, null);
            col++;

            x+=gp.tileSize;

            if (col == gp.maxScreenCol) {
                col = 0;
                row++;
                x = 0;
                y+= gp.tileSize;
            }

        }
    }


}
