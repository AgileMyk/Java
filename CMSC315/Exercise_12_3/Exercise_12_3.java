package Exercise_12_3;/*
(ArrayIndexOutOfBoundsException) Write a program that meets the fol-
lowing requirements:
■ Creates an array with 100 randomly chosen integers.
■ Prompts the user to enter the index of the array, then displays the corre-
sponding element value. If the specified index is out of bounds, display the
message Out of Bounds.
 */

import java.util.Scanner;



public class Exercise_12_3 {

    public static int[] randArray = new int[100];
    public static int val;

    public static void main(String[] args) throws invalidValueException {

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
            System.out.printf("Invalid location: %d\n", location);
        }

        System.out.println("Guess a value within the array");

        val = in.nextInt();
        try {
            for (int j : randArray) {
                if (j == val) {
                    System.out.printf("You have entered the same value: %d", val);
                } else {
                    throw new invalidValueException(val);
                }
            }
        } catch (invalidValueException e) {
            System.out.println(e.getMessage());
        }
    }

}
