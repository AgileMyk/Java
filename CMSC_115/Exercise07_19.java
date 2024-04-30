/*
Write the following method that returns true if the list is already sorted in increasing order.
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether the list is sorted or not.
Here is a sample run.
Sample Run 1
Enter the size of the list: 8
Enter the contents of the list: 10 1 5 16 61 9 11 1
The list has 8 integers 10 1 5 16 61 9 11 1
The list is not sorted
Sample Run 2
Enter the size of the list: 10
Enter the contents of the list: 1 1 3 4 4 5 7 9 11 21
The list has 10 integers 1 1 3 4 4 5 7 9 11 21
The list is already sorted
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int[] numbers = new int[in.nextInt()];
        //declare/inst string via user entry
        System.out.print("Enter the contents of the list ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println("The list is " + (isSorted(numbers) ? "already " : "not ") + "sorted");
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }
        return true;
    }
}
