/*
Calculate Square
You need to implement the calculateSquare method.

It should output the square of the element by the provided index of an array.
In the case when the exception might happen, your program output should be: Exception!
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

import java.nio.file.Files;
import java.nio.file.Paths;


class FixingExceptions {
    public static void calculateSquare(int[] array, int index) {

        File thisFile = new File("Dir\\subFolder\\file.txt");
        
        int age = 33;
        String status = null;
        String status2 = null;

        long longNum = 312_412_412;
        float floaty = -1.123_1f;

        int[] numbers;
        float[] floaties;
        floaties = new float[10];
        int a = 5224;
        int b = 1221;
        String result = (a == b) ? "equal" :
                a > b ? "more than" : "less than";

        status = (age > 17) ? "adult" : "minor";
        status2 = (age < 18) ? yes() : no();

        try {
            if (index > array.length || index < 0) {
                System.out.println("Exception!");
            } else {
                System.out.println(array[index] * array[index]);
            }
        } catch (NullPointerException npe) {
            System.out.println("Exception!");
        }

    }

    public static String evenOrOdd(int n) {
        return (n % 2 ==0) ? "even" : "odd";
    }

    public static void evenOrOdd2(int n) {
        System.out.println((n % 2 == 0) ? "true" : "false");
    }

    public static String yes() {
        return "yes";
    }

    public static String no() {
        return "no";
    }

    public static String yesOrNo(int age) {
        String answer = (age < 18) ? "yes" : "no";
        return answer;
    }
}
