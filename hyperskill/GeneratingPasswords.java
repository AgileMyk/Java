/*
Generating passwords
A password is hard to crack if it contains at least A uppercase letters, at least B
lowercase letters, at least C digits and consists of exactly N symbols. Also, a password
cannot contain two or more of the same characters in a row.

For the given numbers A, B, C, and N, you should output a password that matches these requirements.

It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <= N. Keep in mind
that any parameter can be equal to zero. It means that it's ok if the password doesn't contain symbols
of such type.
 */

import java.util.Scanner;
public class GeneratingPasswords {


    /*
    Generating passwords
A password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters, at
least C digits and consists of exactly N symbols. Also, a password cannot contain two or more of the same
characters in a row.

For the given numbers A, B, C, and N, you should output a password that matches these requirements.

It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <= N. Keep in mind that any
parameter can be equal to zero. It means that it's ok if the password doesn't contain symbols of such type.
     */

    static Scanner in = new Scanner(System.in);

    public static void GenaratingPasswords(String password, int a, int b, int c, int n) {

        int upperCaseCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        for(int i = 0; i < password.length(); i++) {
            char myChar = password.charAt(i);
            if (String.valueOf(myChar) == String.valueOf(myChar).toUpperCase()) {
                upperCaseCount++;
            }
            if (Character.isAlphabetic(password.charAt(i))) {
                digitCount++;
            }
            if (!Character.isAlphabetic(password.charAt(i)) &&
                !Character.isDigit(password.charAt(i))) {
                symbolCount++;
            }
        }

    }

    public static int reEntry(int x) {
        int replace = 0;
        if (x < 0) {
            System.out.println(x + " is less than zero. It must be positive. Please enter a positive value.");
            replace+= in.nextInt();
        }
        return replace;
    }

    public static void main(String[] args) {

    }

}
