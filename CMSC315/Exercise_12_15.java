/*
(Write/read data) Write a program to create a file named Exercise12_15.txt if
it does not exist. Write 100 integers created randomly into the file using text
I/O. Integers are separated by spaces in the file. Read the data back from the
file and display the data in increasing order.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_12_15 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String test = "Exercise_12_15.txt";

        System.out.println("Please enter a file name for a text file:");
        String chosenFile = in.next();
        chosenFile = chosenFile.endsWith(".txt") ? chosenFile : chosenFile + ".txt";
        if (!chosenFile.equals(test)) {
            System.out.println("""
                    The file name is not named 'Exercise_12_15.txt'
                    Changing the file name to 'Exercise_12_15.txt'""");
        }
        chosenFile = chosenFile.equals(test) ? chosenFile : "Exercise_12_15.txt";
        System.out.println("File name: " + chosenFile);
        File file = new File(chosenFile);

        System.out.println("Status of file's existence:");
        System.out.println(file.exists());
        System.out.println("Status of file being a file:");
        System.out.println(file.isFile());
        //test for txt file

        if (!file.exists()) {
            System.out.println("File does not exist: Creating file Exercise_12_15.txt");
            file = new File("Exercise_12_15.txt");
            System.out.println("File created: " + chosenFile);
            try (PrintWriter filePW = new PrintWriter(file)) {
                for (int i = 0; i < 100; i++) {
                    filePW.println(Math.round(Math.random() * 100));
                }
            }
        } else {
            file = new File(chosenFile);
            try (PrintWriter filePW = new PrintWriter(file)) {
                for (int i = 0; i < 100; i++) {
                    filePW.println(Math.round(Math.random() * 100));
                }
            }
        }
    }

    public void orderValues(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        while (in.hasNext()) {

        }
    }

}
