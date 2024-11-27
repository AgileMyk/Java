/*
(Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:
public static double sum(ArrayList<Double> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays their sum.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_12 extends Exercise_11_10 {
        static Scanner in = new Scanner(System.in);

    public static double sum(ArrayList<Double> list) {
        double sum = 00.00;
        for (double ele : list) {
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Double> tempList = new ArrayList<>();

        System.out.println("Enter 5 numbers, whole or decimal ");
        double one = in.nextDouble();
        double two = in.nextDouble();
        double three = in.nextDouble();
        double four = in.nextDouble();
        double five = in.nextDouble();

        tempList.add(one);
        tempList.add(two);
        tempList.add(three);
        tempList.add(four);
        tempList.add(five);

        System.out.println(sum(tempList));
    }
}
