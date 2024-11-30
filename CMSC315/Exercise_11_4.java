import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_4 {
    /*
    (Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)
Write a test program that prompts the user to enter a sequence of numbers ending
with 0, and invokes this method to return the largest number in the input.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("""
                Please enter a series of integer value.
                To stop entering values, enter any non-number value.""");
        while (in.hasNextInt()) {
            list.add(in.nextInt());
        }
        System.out.printf("The highest value in the array is:\n%d", returnMax(list));
    }

    public static int returnMax(ArrayList<Integer> arr) {
            int comp = 0;
        for (int ele : arr) {
           comp = Math.max(ele, comp);
        }
        return comp;
    }
}
