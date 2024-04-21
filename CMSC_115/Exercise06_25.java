/*
(Convert milliseconds to hours, minutes, and seconds)
Write a method that converts milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds.
For example,
convertMillis(5500) returns a string 0:0:5,
convertMillis(100000) returns a string 0:1:40
convertMillis(555550000) returns a string 154:19:10.
Write a test program that prompts the user to enter a long integer for milliseconds and displays a string
in the format of hours:minutes:seconds.
Sample Run
Enter time in milliseconds: 555550000
154:19:10
 */
import java.util.Scanner;
public class Exercise06_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter time in milliseconds: ");
        long millis = in.nextLong();
        System.out.println(convertMillis(millis));
    }
    public static String convertMillis(long millis) {

        long remainderDivisor = millis / 1000;
        int hours = (int) (millis / 1000 / 60 / 60);
        int minutes = (int) ((remainderDivisor / 60) % 60);
        int seconds = (int) remainderDivisor % 60;

        return hours+":"+minutes+":"+seconds;
    }
}
