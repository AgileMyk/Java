/*
Write a method with the following header to format the integer with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. The size of the string is the width.
For example,
format(34, 4) returns 0034
format(34, 5) returns 00034
If the number is longer than the width, the method returns the string representation for the number.
For example,
format(34, 1) returns 34
Write a test program that prompts the user to enter a number and its width and displays a string returned
by invoking format(number, width).
Sample Run
Enter an Integer: 34
Enter the width: 5
The formatted number is 00034
 */
import java.util.Scanner;
public class Exercise06_37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Integer:  ");
        int number = in.nextInt();
        System.out.println("Enter the width:  ");
        int width = in.nextInt();

        System.out.println(format(number, width));
    }

    public static String format(int number, int width) {

        String string = "";
        int length = String.valueOf(number).length();
        String converted = String.valueOf(number);

        if (length > width) {
            string = converted;
        } else {
            int zeroes = width - length;
            for (int i = 1; i <= zeroes; i++) {
                string += "0";
            }
            string = string += converted;
        }

        return string;
        }
}
