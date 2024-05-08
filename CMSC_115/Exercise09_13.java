/*
write the following method that returns the location of the largest element in a two-dimensional array a:
public static Location locateLargest(double[][] a)
The return value is an instance of Location.
Write a class named Location. The class contains three public data fields row, column, and maxValue. maxValue
stores the maximal value in the two-dimensional array. row and column are the row and column indices for maxValue
in the array.
Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest
element in the array.
If there are more than one largest element, find the location with the smallest row index and then the smallest column index.
Sample Run
Enter the number of rows and columns in the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The largest element is 45, located at (1, 2)
 */
import java.util.Scanner;

public class Exercise09_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = in.nextInt();
        int columns = in.nextInt();

        // Create a matrix
        double[][] array = new double[rows][columns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = in.nextDouble();
            }
        }

        Location max = locateLargest(array);

        System.out.println("The location of the largest element is " +
                max.maxValue + " at (" + max.row + ", " + max.column + ")");
    }

    public static Location locateLargest(double[][] a) {

        return new Location(a);
    }
}

class Location {
    int row;
    int column;
    double maxValue;
    Location(double[][] a) {
        maxValue = a[0][0];
        row = 0;
        column = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }
}
