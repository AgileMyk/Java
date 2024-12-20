package Exercise_12_7_12_9;
/*
BinaryFormatException) Exercise 12.7 implements the bin2Dec method
to throw a BinaryFormatException if the string is not a binary string.
Define a custom exception called BinaryFormatException. Implement the
bin2Dec method to throw a BinaryFormatException if the string is not a
binary string
 */

import java.util.Scanner;

public class Exercise_12_9 {

    public static void main(String[] args) throws BinaryFormatException {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a binary string number: ");
        String s = in.next();
        double result = 0.0;
        boolean status = true;

        try {
            result = bin2DecB(s);
        } catch (BinaryFormatException e) {
            status = false;
            System.out.println(e.getMessage());
        }
        if (status) {
            System.out.println("result: " + result);
        } else {
            System.out.println("there was an error, no double result");
        }
    }

    public static double bin2DecB(String s) throws BinaryFormatException {
        double result = 0.0;
        char[] c = s.toCharArray();
        for (char ele : c) {
            if (ele == '0' || ele == '1') {

            } else {
                throw new BinaryFormatException(s);
            }
        }
        return Double.parseDouble(s);
    }

}
