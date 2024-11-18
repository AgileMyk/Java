
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
        ArrayList<Object> arr = new ArrayList<>();
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
        Date thisDate = new Date();
        arr.add(newString);
        arr.add(thisDate);
        arr.add(thisLoan);
        arr.add(userTriangle);

        System.out.println("the populated objects: ");
        for (int i = 0; i < arr.size(); i++) {
            if (i != arr.size() - 1) {
              System.out.println(arr.get(i));
              System.out.println("---------------------------------");
            } else {
                System.out.println(arr.get(i));
                System.out.println("The end!");
            }
        }

    }

    public static Triangle createTriangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Hello. We are going to make a triangle
                Please enter a length for the left side,\s
                then right side\s
                and lastly the base""");
        double lSide = in.nextDouble();
        double rSide = in.nextDouble();
        double base = in.nextDouble();
        System.out.println("""
                To continue creating the triangle, please enter a color
                and whether or not you want the triangle filled with that color""");
        String color = in.next();
        boolean filled = in.nextBoolean();

        return new Triangle(color, filled, base, lSide, rSide);
    }
}
