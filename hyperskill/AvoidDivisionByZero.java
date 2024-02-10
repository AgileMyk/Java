/*
First glance at exceptions repetition
Recommended topics to repeat: 0 / 5

Hard
12638
6 hours ago
Avoid division by zero
Here is a program that reads numbers and performs some calculations.
It outputs the result to the standard output.

In some cases, the program will throw an ArithmeticException. Fix the
program so that it prints "Division by zero!" instead of this exception.

Sample Input 1:
5 2 0 1

Sample Output 1:
2
 */

import java.util.Scanner;
public class AvoidDivisionByZero {

    public static int dByZero(int x) {
        if (x == 0) {
            System.out.println("Division by Zero!");
        } else {
            x = x;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (d == 0) {
            System.out.println("Division by Zero!");
        } else {
            System.out.println(dByZero(a) / dByZero(dByZero(b + c) / dByZero(d)));
        }
        /*
        if (d == 0 || b + c == 0 || (b + c) / d == 0 ) {
            System.out.println("Division by Zero!");
        } else {
            int result = a / ((b + c) / d);
            System.out.println(result);
        }
         */
    }

}

