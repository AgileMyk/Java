package com.example.progproj3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HorizontalDirection;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
Michael Hall
6-20-24
The first class com.example.progproj3.Project3 should define the GUI
illustrated above
 */
public class Project3 extends Application {
    private final int WIDTH_DIMENSION = 470;
    private final int HEIGHT_DIMENSION = 400;
    private final int COMBOBOX_WIDTH = 150;
    private final int COMBOBOX_HEIGHT = 20;
    private TripCost tCost;
    private Button calc;
    //comboBoxes

    @Override
    public void start(Stage primaryStage) throws Exception {
        //fonts
        Font mainFont = Font.font("Arial", FontWeight.LIGHT, 12);

        //Layout
        GridPane gridContainer = new GridPane(3,9);
        /*
        Slider aSlider = new Slider();
        aSlider.setOrientation(Orientation.VERTICAL);
        gridContainer.add(aSlider,9,9);
        aSlider.setShowTickLabels(true);
        aSlider.setShowTickMarks(true);
        aSlider.valueProperty().addListener(ov -> calc.setText(String.valueOf(aSlider.getValue())));
         */

        ComboBox<String> costGalOrLit = new ComboBox<>();
        costGalOrLit.getItems().addAll("dollars/gal","dollars/liter");
        costGalOrLit.setValue("dollars/gal");
        costGalOrLit.setPrefSize(COMBOBOX_WIDTH,COMBOBOX_HEIGHT);
        gridContainer.add(costGalOrLit,3,2);

        ComboBox<String> milesGalOrLit = new ComboBox<>();
        milesGalOrLit.getItems().addAll("miles/gallon","kilometers/gallon");
        milesGalOrLit.setValue("miles/gallon");
        milesGalOrLit.setPrefSize(COMBOBOX_WIDTH,COMBOBOX_HEIGHT);
        gridContainer.add(milesGalOrLit, 3,3);

        //Labels
        //MAKE PRIVATE INSTANCES
        Label distance = new Label("Distance");
        Label labelGasCost = new Label("Gasoline Cost");
        Label labelGasMileage = new Label("Gas Mileage");
        Label labelNumOfDays = new Label("Number of Days");
        Label hotelCost = new Label("Hotel Cost");
        Label foodCost = new Label("Food Cost");
        Label Attractions = new Label("Attractions");
        Label totTripCost = new Label("Total Trip Cost");
        Label[] Labels = {distance, labelGasCost, labelGasMileage, labelNumOfDays, hotelCost, foodCost, Attractions, totTripCost};
        for (Label aLabel: Labels) {
            aLabel.setPrefSize(160, 20);
        }

        //Text Fields
        //MAKE PRIVATE INSTANCES
        TextField distanceTextField = new TextField();
        TextField gasCostTextField = new TextField();
        TextField gasMileageTextField = new TextField();
        TextField numOfDaysTextField = new TextField();
        TextField hotelCostTextField = new TextField();
        TextField foodCostTextField = new TextField();
        TextField attractionsTextField = new TextField();
        TextField totalTripCostTextField = new TextField();
        TextField[] Texts = {distanceTextField,
                            gasCostTextField,
                            gasMileageTextField,
                            numOfDaysTextField,
                            hotelCostTextField,
                            foodCostTextField,
                            attractionsTextField,
                            totalTripCostTextField};
        for (TextField aField : Texts) {
            aField.setAlignment(Pos.CENTER_RIGHT);
        }
        totalTripCostTextField.setDisable(true);
        totalTripCostTextField.setStyle("-fx-opacity: 1.0");


        //Layout
        //gridContainer.setGridLinesVisible(true);
        gridContainer.setPrefSize(WIDTH_DIMENSION, HEIGHT_DIMENSION);
        gridContainer.setHgap(7.5);
        //430 total width - padding 20/label 120/gap 5/label 120/gap 5/label 120/padding 20
        //row 1
        gridContainer.add(new Label("Distance"),1,1);
        gridContainer.add(distanceTextField,2,1);
        //row 2
        gridContainer.add(new Label("Gasoline Cost"),1,2);
        gridContainer.add(gasCostTextField,2,2);
        //gridContainer.add(gasCost,3,2);
        gridContainer.setMinWidth(430);
        gridContainer.setPadding(new Insets(20));
        //row 3
        gridContainer.add(new Label("Gas Mileage"),1,3);
        gridContainer.add(gasMileageTextField,2,3);
        //gridContainer.add(mileageChoice,3,3);
        //row4
        gridContainer.add(new Label("Number Of Days:"),1,4);
        gridContainer.add(numOfDaysTextField,2,4);
        //row4
        gridContainer.add(new Label("Hotel Cost"),1,5);
        gridContainer.add(hotelCostTextField,2,5);
        //row4
        gridContainer.add(new Label("Food Cost"),1,6);
        gridContainer.add(foodCostTextField,2,6);
        //row4
        gridContainer.add(new Label("Attractions"),1,7);
        gridContainer.add(attractionsTextField,2,7);
        //row8
        //Buttons
        calc = new Button("Calculate");
        calc.setMinWidth(150);
        calc.setOnAction( e -> {
            System.out.println("works");
            //construct tripCost object and return total calculation
        try {
            TripCost tCost = new TripCost(Integer.parseInt(distanceTextField.getText()),
                    Double.parseDouble(gasCostTextField.getText()),
                    Integer.parseInt(gasMileageTextField.getText()),
                    Integer.parseInt(numOfDaysTextField.getText()),
                    Integer.parseInt(hotelCostTextField.getText()),
                    Double.parseDouble(foodCostTextField.getText()),
                    Integer.parseInt(attractionsTextField.getText()));
            totalTripCostTextField.setText("$" + tCost.result);
        } catch (incompleteObject Exception) {

        }
        });


        gridContainer.add(calc,2,8);

        //row4
        gridContainer.add(new Label("Total Trip Cost"),1,9);
        gridContainer.add(totalTripCostTextField,2,9);

        /*
              HBox[] HBoxes = {
                new HBox(distance, distanceTextField, distanceChoice),
                new HBox(new Label("Gasoline Cost"),new TextField(), gasCost),
                new HBox(new Label("Gas Mileage"),new TextField(), mileageChoice),
                new HBox(new Label("Number of Days"),new TextField()),
                new HBox(new Label("Hotel Cost"),new TextField()),
                new HBox(new Label("Food Cost"),new TextField()),
                new HBox(new Label("Attraction"),new TextField()),
                new HBox(calc),
                new HBox(new Label("Total Trip Cost"), new TextField())
        };

        for (int i = 0; i < HBoxes.length; i++) {
            gridContainer.add(HBoxes[i],1,i);
        }
         */
        //Pane labels = new VBox(9);
        //labels.setMinHeight(400);
        //labels.setMinWidth(120);
        //labels.setPadding(new Insets(5,0,0,0));
        //gridContainer.add(labels,1,1);

        Pane inputs = new VBox();
        inputs.setMinHeight(400);
        inputs.setMinWidth(120);

        ComboBox<String> distMilesOrKilo = new ComboBox<>(FXCollections.observableArrayList());
        distMilesOrKilo.getItems().addAll("miles","kilometers");
        distMilesOrKilo.setValue("miles");
        distMilesOrKilo.setPrefSize(COMBOBOX_WIDTH,COMBOBOX_HEIGHT);
        gridContainer.add(distMilesOrKilo, 3, 1);

        Scene mainScene = new Scene(gridContainer);

        primaryStage.setTitle("Trip Cost Estimator");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
