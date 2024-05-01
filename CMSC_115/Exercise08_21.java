/*
Given a set of cities, the center city is the city that has the shortest total dist to all other cities.
Write a program that prompts the user to enter the number of the cities and the locations of the cities
(coordinates), and finds the center city and its total dist to all other cities.
Sample Run
Enter the number of cities: 5
Enter the coordinates of the cities: 2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
The center city is at (2.5, 5.0)
The total dist to all other cities is 60.81
 */
import java.util.Scanner;
public class Exercise08_21 {
    static final int DIST = 2;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int numOfCities = input.nextInt();
        double[][] coords = new double[numOfCities][3];

        System.out.println("Enter the coordinates of the cities:");
        for (int i = 0; i < coords.length; i++)
            for (int j = 0; j < coords[i].length - 1; j++)
                coords[i][j] = input.nextDouble();

        double[] central = findMostCentral(coords);
        System.out.println("The center city is at ("+ central[0]+","+central[1]+")");
        System.out.printf("The total dist to all other cities is %.2f %n",central[DIST]);
    }
    public static double[] findMostCentral(double[][] coords) {
        for (int i = 0; i < coords.length; i++) {
            for (int j = 0; j < coords.length; j++) {
                if (j != i) {
                    coords[i][DIST] += dist(coords[i][0], coords[i][1], coords[j][0],coords[j][1]);
                }
            }
        }
        double[] central = coords[0];
        for (int i = 1; i < coords.length; i++) {
            if (coords[i][DIST] < central[DIST]) {
                central = coords[i];
            }
        }
        return central;
    }
    public static double dist(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
