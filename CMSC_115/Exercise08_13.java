/*
Write the following method that returns the location of the largest element in a two-dimensional array.
public static int[] locateLargest(double[][] a)
The return value is a one-dimensional array that contains two elements. These two elements indicate the
row and column indices of the largest element in the two-dimensional array. If there are more than one
largest element, return the smallest row index and then the smallest column index.
Write a test program that prompts the user to enter a two-dimensional array and displays the location of
the largest element in the array.
Sample Run
Enter the number of rows and columns of the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The location of the largest element is at (1, 2)
 */
import java.util.Scanner;
public class Exercise08_13 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = in.nextInt();
        int columns = in.nextInt();

        double[][] arr = popArray(rows, columns);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            }
        }
        locateLargest(arr);
        System.out.println("The location of the element is at ("+ locateLargest(arr)[0]+","+locateLargest(arr)[1]+")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] locale = {0, 0};
        double largest = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > largest) {
                    locale[0] = i;
                    locale[1] = j;
                    largest = a[i][j];
                }
            }
        }
        return locale;
    }

    public static double[][] popArray(int row, int col) {
        double[][] arr = new double[row][col];
        System.out.println("Enter the array:");


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        return arr;
    }
}

