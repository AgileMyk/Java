/*
Write a program that reads an unspecified number of integers, determines how many positive and negative values have
been read, and computes the total and average of the input values (not counting zeros). Your program ends with the
input 0. Display the average as a floating-point number.
Sample Run 1
Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25
Sample Run 2
Enter an integer, the input ends if it is 0: 0
No numbers are entered except 0
Sample Run 3
Enter an integer, the input ends if it is 0: 2 3 4 5 0
The number of positives is 4
The number of negatives is 0
The total is 14
The average is 3.5
Sample Run 4
Enter an integer, the input ends if it is 0: -4 3 2 -1 0
The number of positives is 2
The number of negatives is 2
The total is 0
The average is 0.0
 */

import java.util.Scanner;
public class Exercise05_01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negCount = 0;
        int posCount = 0;
        int count = 0;
        int total = 0;

        System.out.printf("Enter an integer, the input ends if it is 0: ");
        while (in.hasNextInt()) {
            int input = in.nextInt();
            if (input > 0) { posCount++; count++; total+= input;
            } else if (input < 0) { negCount++; count++; total += input;
            } else break;
        }

            if (count == 0) {
                System.out.printf("No numbers are entered except 0");
            } else {
                System.out.printf("The number of positives is %d%n", posCount);
                System.out.printf("The number of negatives is %d%n", negCount);
                System.out.printf("The total is is %d%n", total);
                System.out.printf("The average is %.2f", (double) total / count);
            }
    }

}
