/*
(NumberFormatException) Write the bin2Dec(String binaryString)
method to convert a binary string into a decimal number. Implement the
bin2Dec method to throw a NumberFormatException if the string is not a
binary string.
 */

import java.util.Scanner;

public class Exercise_12_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a binary string: ");
        String str;
        double result = 0.0;

        try {
            str = in.nextLine();
            result = bin2Dec(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid entry; non binary string");
        }
        System.out.println(result);
    }

    public static double bin2Dec(String s) throws NumberFormatException{
        return Integer.parseInt(s,2);
    }
}
