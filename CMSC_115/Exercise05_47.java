/*
ISBN-13 is a new standard for identifying books. It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13.
The last digit d13 is a checksum, which is calculated from the other digits using the following formula:
10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12) % 10
If the checksum is 10, replace it with 0. Your program should read the input as a string.
Display “invalid input” if the input is incorrect.
Sample Run 1
Enter the first 12 digits of an ISBN-13 as a string: 978013213080
The ISBN-13 number is 9780132130806
Sample Run 2
Enter the first 12 digits of an ISBN-13 as a string: 978013213079
The ISBN-13 number is 9780132130790
Sample Run 3
Enter the first 12 digits of an ISBN-13 as a string: 97801320
97801320 is an invalid input

 */

import java.util.Scanner;
public class Exercise05_47 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        String firstTwelve = in.next();
        if (firstTwelve.length() != 12) {
            System.out.printf("%s is an invalid input", firstTwelve);
        } else {
            char[] charConvert = firstTwelve.toCharArray();
            //System.out.println(charConvert);
            int[] intConvert = new int[charConvert.length];
            for (int i = 0; i < intConvert.length; i++) {
                intConvert[i] = Integer.parseInt(String.valueOf(charConvert[i]));
            }

            int total = 0;
            for (int i = 0; i < intConvert.length; i++) {
                if ((i + 1) % 2 != 0) {
                    total += intConvert[i];
                } else {
                    total += (intConvert[i]) * 3;

                }
            }
            int lastDigit = 10 - ((total) % 10);
            if (lastDigit == 10) lastDigit = 0;
            System.out.printf("The ISBN-13 number is %s", firstTwelve + lastDigit);
        }
    }
}
