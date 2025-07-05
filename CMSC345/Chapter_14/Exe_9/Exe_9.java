package Chapter_14.Exe_9;

import java.io.File;
import java.io.IOException;

public class Exe_9 {
/*
(Display three cards) Write a program that displays three cards randomly
selected from a deck of 52, as shown in Figure 14.43c. The card image files are
named 1.png, 2.png, . . . , 52.png and stored in the image/card directory. All
three cards are distinct and selected randomly. (Hint: You can select random
cards by storing the numbers 1–52 to an array list, perform a random shuffle
introduced in Section 11.12, and use the first three numbers in the array list as
the file names for the i
 */

/*
APPROACH:
A --> create a card class and access card attributes
    1 --> create card class
        a. make image field
        b. associate image field with cardImage directory
        c. make getter method

    2 --> make image accessible through cards
    3 --> randomly access 3 given cards and use getImage()
B --> directly access an array of images
    1 --> create directory with images
    2 --> create accessible array with images
    3 --> facilitate access to directory images
    4 --> randomly present 3 images in directory
 */

    public class Exe_1 extends Application {
        @Override
        public void start(Stage stage) throws IOException {

            File cardsDir = new File("C:\\Users\\agile\\AppData\\Local\\Temp\\38abf524-86dd-470b-a239-602655dbb8cc_mapsforge-master.zip.8cc\\Exe_1\\src\\main\\java\\com\\example\\exe_1\\cardImage");

            String[] test2 = cardsDir.list();
            System.out.println(cardsDir.exists());
            for (String s : test2) {
                System.out.println(s);
            }

        /*
        String[] cards = new String[52];
        for (String s : cards) {
            File file = new File();
            s =
        }

        Image img1 = new Image(cards[(int) (Math.random() * 52)].getImage());
        Image img2 = new Image(cards[(int) (Math.random() * 52)].getImage());
        Image img3 = new Image(cards[(int) (Math.random() * 52)].getImage());
        Scene PrimaryScene = new Scene(new HBox(img1, img2, img3));
        stage.show();
         */
        }

        public static void main(String[] args) {
            launch();
        }
    }
}
