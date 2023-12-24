package entity;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;

        direction = "right";

    }

    public void update() {
        if (y <= 3) {
            y = 3;
        } else if (y > 520) {
            y = 520;
        }

        if (x <= 3) {
            x = 3;
        } else if (x >= 718) {
            x = 718;
        }

        if (keyH.upPressed == true || keyH.downPressed == true || keyH.rightPressed == true || keyH.leftPressed == true) {
            spriteCounter++;
            if (keyH.upPressed == true) {
                direction = "up";
                y -= speed;
                if (spriteCounter > 9) {
                    if (spriteNum == 1) {
                        spriteNum = 2;
                    } else if (spriteNum == 2) {
                        spriteNum = 1;
                    }
                    spriteCounter = 0;
                }
            } else if (keyH.downPressed == true) {
                direction = "down";
                y += speed;
                if (spriteCounter > 9) {
                    if (spriteNum == 1) {
                        spriteNum = 2;
                    } else if (spriteNum == 2) {
                        spriteNum = 1;
                    }
                    spriteCounter = 0;
                }
            } else if (keyH.rightPressed == true) {
                direction = "right";
                x += speed;
                if (spriteCounter > 9) {
                    if (spriteNum == 1) {
                        spriteNum = 2;
                    } else if (spriteNum == 2) {
                        spriteNum = 1;
                    }
                    spriteCounter = 0;
                }
            } else if (keyH.leftPressed == true) {
                direction = "left";
                x -= speed;
                if (spriteCounter > 9) {
                    if (spriteNum == 1) {
                        spriteNum = 2;
                    } else if (spriteNum == 2) {
                        spriteNum = 1;
                    }
                    spriteCounter = 0;
                }
            }
        }

    }

    public void draw(Graphics2D g2) {
     //   g2.setColor(Color.white);
     //   g2.fillRect(x, y, gp.tileSize, gp.tileSize);

        BufferedImage image = null;
        switch (direction) {
            case "up":
                if (spriteNum == 1) {
                    image = up1;
                }
                if (spriteNum == 2) {
                    image = up2;
                }
                break;
            case "down":
                if (spriteNum == 1) {
                    image = down1;
                }
                if (spriteNum == 2) {
                    image = down2;
                }
                break;
            case "right":
                if (spriteNum == 1) {
                    image = right1;
                }
                if (spriteNum == 2) {
                    image = right2;
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = left1;
                }
                if (spriteNum == 2) {
                    image = left2;
                }
                break;
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }

    public void getPlayerImage() {

        try {
            up1 = ImageIO.read(getClass().getResourceAsStream("/player/playerCharUp.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/player/playerCharUp2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/playerCharDown.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/playerCharDown2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/player/playerCharRight.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/player/playerCharRight2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/player/playerCharLeft.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/player/playerCharLeft2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
