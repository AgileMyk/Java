package Exercise_12_11;/*(Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking
java Exercise12_11 John filename
removes the string John from the specified file. Your program should get the
arguments from the command line.*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_12_11 {

    public static void main(String[] args) throws IOException {

//
        File file = new File("CMSC315/Exercise_12_11/dis2.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        File fileResult = new File("CMSC315/Exercise_12_11/fileResult.txt");

        try (Scanner in2 = new Scanner(file);
             FileWriter fw2 = new FileWriter(fileResult)) {
            char[] tempAdd = {'0','.','0','.','0','.','0',' ',' ',' ',' '};
            while (in2.hasNextLine()) {
                String tempLine = in2.nextLine();
                String firstLetter = tempLine.substring(0, 1);

                tempLine = tempLine.replaceFirst(String.valueOf(tempLine.charAt(0)),(firstLetter+String.valueOf(tempAdd)));
                fw2.write(tempLine+"\n");
            }
        }
    }
}
