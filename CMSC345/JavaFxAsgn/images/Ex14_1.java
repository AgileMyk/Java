package JavaFxAsgn.images;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex14_1 extends Application {

    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.BOTTOM_CENTER);
        gridPane.setPadding(new Insets(0, 2.5, 2.5, 2.5));
        Image flag1 = new Image("imgs/img.png");
        Image flag2 = new Image("imgs/img_1.png");
        Image flag3 = new Image("imgs/img_2.png");
        Image flag4 = new Image("imgs/img_3.png");
        ImageView[] views = {new ImageView(flag1), new ImageView(flag2), new ImageView(flag3), new ImageView(flag4)};

        gridPane.add(new ImageView(flag1), 0, 0);
        gridPane.add(new ImageView(flag2), 0, 1);
        gridPane.add(new ImageView(flag3), 1, 0);
        gridPane.add(new ImageView(flag4), 1, 1);





        Scene gridScene = new Scene(gridPane);
        primaryStage.setScene(gridScene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
