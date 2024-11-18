
/*
(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Triangle object to the list, and use a loop
to display all the elements in the list by invoking the object’s toString()
method
 */

package Exercise_11_6;

import Exercise_11_2.Triangle;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Let's create an array list and populate it with different objects.");
        ArrayList arr = new ArrayList();
        System.out.println("A date object representing today's date will be auto populated in the list.");
        System.out.println("It is your job to create a loan object, a string object and a triangle object for the list.");
        System.out.println("Choose a string: ");
        String newString = in.next();

        System.out.println("What does your loan object look like?");
        int loanID = in.nextInt();
        double amount = in.nextDouble();
        double rate = in.nextDouble();

        Loan thisLoan = new Loan(loanID, amount, rate);

        System.out.println("Let's create our triangle: ");
        Triangle userTriangle = createTriangle();
        arr.add(new Date());
        arr.add(thisLoan);
        arr.add(userTriangle);

        for (ele : arr) {
            System.out.println(ele);
        }

    }

    public static Triangle createTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello. We are going to make a triangle\n" +
                "Please enter a length for the left side, \nthen right side \nand lastly the base");
        double lSide = in.nextDouble();
        double rSide = in.nextDouble();
        double base = in.nextDouble();
        System.out.println("To continue creating the triangle, please enter a color,\n" +
                "and whether or not you want the triangle filled with that color\n");
        String color = in.next();
        boolean filled = in.nextBoolean();

        return new Triangle(color, filled, base, lSide, rSide);
    }
}
