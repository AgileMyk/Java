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

        bin2DecB(s);

        System.out.println("result: " + s);
    }

    public static void bin2DecB(String s) {
        try {
            checkString(s, '1','0');
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String s1, char c1, char c2) throws BinaryFormatException {
        for (char ele : s1.toCharArray()) {
            if (ele != c1 || ele != c2) {
                throw new BinaryFormatException(s1);
            }
        }
    }

}
