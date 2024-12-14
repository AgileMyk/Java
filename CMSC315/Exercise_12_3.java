/*
(ArrayIndexOutOfBoundsException) Write a program that meets the fol-
lowing requirements:
■ Creates an array with 100 randomly chosen integers.
■ Prompts the user to enter the index of the array, then displays the corre-
sponding element value. If the specified index is out of bounds, display the
message Out of Bounds.
 */

import java.util.ArrayList;
import java.util.Scanner;



public class Exercise_12_3 {

    public static int[] randArray = new int[100];

    public static void main(String[] args) {

        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (int) (Math.random() * 1000);
        }

        for (int ele : randArray) {
            System.out.println(ele);
        }

        Scanner in = new Scanner(System.in);
        int location = 0;
        try {
            System.out.println("Enter an array location: ");
            location = in.nextInt();
            System.out.println(randArray[location]);
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Invalid location: %d", location);
            e.getMessage();
        }

        //System.out.println("Guess a value within the array");
    }

    public static class invalidValueException extends RuntimeException {
        int val = randArray[0];
    }
}
