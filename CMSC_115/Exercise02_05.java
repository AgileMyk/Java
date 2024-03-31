
/*
Chapter 2: Programming Project 1
1 try left
(Financial application: calculate tips)
Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.
Sample Run
Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5
 */
import java.util.Scanner;
public class Exercise02_05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a subtotal and gratuity rate: ");
        int subTotal = in.nextInt();
        double gratuity = in.nextDouble();
        double gratuityCalc = subTotal * (gratuity / 100);
        double total = subTotal + gratuityCalc;

        System.out.println("The gratuity is $" + gratuityCalc + " and the total is $" + total);
    }
}
