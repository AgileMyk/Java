package com.example.progproj3;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

/*
Michael Hall
6-20-24
The second class com.example.progproj3.TripCost should be an immutable class that has at a
minimum a constructor that creates a trip cost object and a method that
computes and returns the
total trip cost.
 */
public class TripCost {
    //convert int later
    private int distance;
    private double gasolineCost;
    //convert int later
    private int gasMileage;
    private int numberOfDays;
    private int hotelCost;
    private double foodCost;
    private int attractions;
    private double totalTripCost;

    //The output field should not be editable
    protected String result;
    private Button calc;

    //method for converting based on user choice of miles/kilos
    public double distanceMult() {
        return 0.0;
    }
    public double setTotalTripCost() {
        return gasolineCost + (hotelCost + foodCost) * numberOfDays + attractions;
    }
    public TripCost() {}

    public TripCost(int distance, double gasolineCost, int gasMileage, int numberOfDays, int hotelCost, double foodCost, int attractions) throws incompleteObject Exception {
        this.distance = distance;
        this.gasolineCost = gasolineCost;
        this.gasMileage = gasMileage;
        this.numberOfDays = numberOfDays;
        this.hotelCost = hotelCost;
        this.foodCost = foodCost;
        //total trip cost = gasoline cost + (hotel cost + food cost) x number of days + attractions
        //gasoline cost = distance/mileage * gasoline cost
        this.totalTripCost = ((distance/gasMileage)*gasolineCost) + ((hotelCost + foodCost) * numberOfDays) + attractions;
        this.result = new String(String.valueOf(totalTripCost));
    }

    @Override
    public String toString() {
        System.out.println(distance);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        return "";
    }
}
