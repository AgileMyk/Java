/*
(Count characters, words, and lines in a file) Write a program that will count
the number of characters, words, and lines in a file. Words are separated by
whitespace characters. The file name should be passed as a command-line
argument, as shown in Figure 12.13
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class Exercise_12_13 {

    public static void main(String[] args) throws IOException {

        System.out.println("""
        Passing a file to this program will give you a count of:
        total lines
        total words
        total spaces
        Keep in mind that trailing spaces at the end of a sentence are not counted.
        Additionally, grammatical marks are not taken into account in any way."""
        );

        int lineCount = 0;
        int wordCount = 0;
        long spaceCount = 0;
        String word = "";
        int n = 0;
        int space = 0;


        if (args[0] == null || args[0].trim().isEmpty()) {
            System.out.println("Please enter a valid file name/specify a path");
            return;
        } else {
            File file = new File(args[0]);
            try (Scanner in = new Scanner(file)) {
                while (in.hasNextLine()) {
                    lineCount++;
                    //determine space count
                    word += in.nextLine() + "\n";

                }
                String[] forWordCount = word.split("");
                System.out.println("word to array: " + Arrays.toString(forWordCount));
                for (int i = 0; i < forWordCount.length; i++) {
                    if (forWordCount[i].equals(" ")) {
                        wordCount++;
                    }
                }
                wordCount += lineCount;
                System.out.println("Word: " + word);
                n = word.length();
                space = word.replace(" ","").length();
                spaceCount = (n-space);
            }

        }

        System.out.println("line count: " + lineCount);
        System.out.println("word count: " + wordCount);
        System.out.println("space count: " + spaceCount);
    }
}
