package Exercise_12_11;/*(Remove text) Write a program that removes all the occurrences of a specified
string from a text file. For example, invoking
java Exercise12_11 John filename
removes the string John from the specified file. Your program should get the
arguments from the command line.*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12_11 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        File file = new File("CMSC315/Exercise_12_11/dis2.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        File fileResult = new File("CMSC315/Exercise_12_11/fileResult.txt");

        try (FileWriter fw = new FileWriter(file, true); Scanner in2 = new Scanner(file);
             FileWriter fw2 = new FileWriter(fileResult)) {
            //ArrayList<Character> tempLineArray = new ArrayList<>();
            while (in2.hasNextLine()) {
                String tempLine = in2.nextLine();
                char firstChar = tempLine.charAt(0);
                char[] tempAdd = {'0','.','0','.','0','.','0',' ',' ',' ',' '};

                tempLine = tempLine.replaceFirst(String.valueOf(tempLine.charAt(0)),String.valueOf(tempAdd));
                fw2.write(tempLine+"\n");
                //System.out.println(tempLine);
            }
        }
    }
}