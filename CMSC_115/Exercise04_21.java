/*
Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD, where D is a digit.
Your program should check whether the input is valid.
Sample Run 1
Enter a SSN: 232-23-5435
232-23-5435 is a valid social security number
Sample Run 2
Enter a SSN: 23-23-5435
23-23-5435 is an invalid social security number
 */

import java.util.Scanner;
public class Exercise04_21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a SSN: ");
        String s = in.next();

        char[] s2 = s.toCharArray();

        int count = 0;

        if (s.length() == 11) {
            for (int i = 0; i < s2.length; i++) {
                if (i == 3 || i == 6) {
                    System.out.println(s2[i]);
                    if (s2[i] == '-') {
                        count++;
                        System.out.println("count: " + count);
                    }
                } else {
                    System.out.println(s2[i]);
                    if (Character.isDigit(s2[i])) {
                        count++;
                        System.out.println("count: " + count);
                    }
                }
            }
            if (count == 11) {
                System.out.printf("%s is a valid social security number%n", s);
            } else {
                System.out.printf("%s is an invalid social security number%n", s);
            }
        } else {
            System.out.printf("%s is an invalid social security number%n", s);
        }
    }
/*

    public static void isDigit(char c) {
        if (Character.isDigit(c)) {count++; }
    }

    public static void isDash(char c) {
        if (c == 'c') { count++; }
    }
 */
}

/*
        boolean valid = false;

            if (s.length() == 11 ) {
                char[] s2 = s.toCharArray();
                int dash1 = 3;
                int dash2 = 6;

                for (int i = 0; i < s2.length; i++) {

                    if ((i == dash1 && s2[i] == '-') &&
                        (i == dash2 && s2[i] == '-') &&
                        (i != dash1 && i != dash2) && Character.isDigit(s2[i])) {
                        valid = true;
                    } else {
                        valid = false;
                    }
                }
        } else { valid = false; }
            if (valid == true) {
                System.out.printf("%s is a valid social security number", s);
            } else {
                System.out.printf("%s is an invalid social security number", s);
            }
 */