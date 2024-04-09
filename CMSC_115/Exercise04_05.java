/*
A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree
(i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is
area = n * s ^ 2 / (4 * tan(pi / n))
Here, s is the length of a side.
Write a program that prompts the user to enter the number of sides and their length and displays its area.
Sample Run
Enter the number of sides: 5
Enter the length of the side: 6.5
The area of the polygon is 72.69017017488385
 */

import java.util.Scanner;
public class Exercise04_05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of sides: %n");
        int numOfSides = in.nextInt();
        System.out.printf("Enter the length of the side: %n");
        double lengthOfSides = in.nextDouble();

        double polyArea = numOfSides * Math.pow(lengthOfSides, 2) / (4 * Math.tan(Math.PI / numOfSides));

        System.out.printf("The area of the polygon is %.14f", polyArea);
    }

}
