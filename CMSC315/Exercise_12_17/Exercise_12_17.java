package Exercise_12_17;
import java.util.HashSet;

/*
12.17 (Game: hangman) Rewrite Programming Exercise
7.35 .
*/

/*
Write a hangman game that randomly generates a word
and prompts the user to guess one letter at a time, as presented in the sample run.
Each letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display the
number of misses and ask the user whether to continue to play with another word.
Declare an array to store words, as follows:

Add any words you wish in this array
String[] words = {"write", "that",...};

(Guess) Enter a letter in word ******* > p [press enter]
(Guess) Enter a letter in word p****** > r [press enter]
(Guess) Enter a letter in word pr**r** > p [press enter]
p is already in the word
(Guess) Enter a letter in word pr**r** > o [press enter]
(Guess) Enter a letter in word pro*r** > g [press enter]
(Guess) Enter a letter in word progr** > n [press enter]
n is not in the word
(Guess) Enter a letter in word progr** > m [press enter]
(Guess) Enter a letter in word progr*m > a [press enter]
The word is program. You missed 1 time
Do you want to guess another word? Enter y or n>
 */

import javax.print.DocFlavor;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12_17 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> words = new ArrayList<>();

        File file = new File("Java/CMSC315/Exercise_12_17/EE1.txt");
        System.out.println(file.exists());
        populateWordsArray(file, words);

        System.out.println("----------");
        System.out.println(words.size());
        for (String s : words) {
            System.out.println(s);
        }

        Scanner fileChoice = new Scanner(System.in);
        System.out.println("Create a file name. Any space will end the file's name");
        String fileName = fileChoice.next();
        System.out.println(fileName.length());
        fileName = convertToDotText(fileName);
        System.out.println(fileName.length());

        File hangmanFile = new File(fileName);
        System.out.println(hangmanFile.getName());

        try (Scanner fileEdit = new Scanner(hangmanFile); PrintWriter filePW = new PrintWriter(hangmanFile)) {
            System.out.println("Enter a word for the hangman game: ");
            String word = fileEdit.next();
            filePW.println(word);
        }
    }

    public static String convertToDotText(String s) {
        s = s.endsWith(".txt") ? s : s + ".txt";
        return s;
    }

    public static void populateWordsArray(File file, ArrayList<String> arr) throws IOException {
        Scanner fileEdit = new Scanner(file);

        // Temporary list to store new strings to be added
        ArrayList<String> tempList = new ArrayList<>();

        while (fileEdit.hasNextLine()) {
            String word = fileEdit.next().toLowerCase();
            if (!word.contains("-") && !word.contains("—") && word.length() > 4) {
                tempList.add(word);  // Add valid words to tempList
            }
        }

        // Process tempList for delimiters and clean up
        ArrayList<String> cleanedList = new ArrayList<>();
        for (String currentString : tempList) {
            if (currentString.contains(",")) {
                cleanedList.add(currentString.replace(",", ""));
            }
            if (currentString.contains(";")) {
                cleanedList.add(currentString.replace(";", ""));
            }
            if (currentString.contains(".")) {
                cleanedList.add(currentString.replace(".", ""));
            }
            if (currentString.contains(":")) {
                cleanedList.add(currentString.replace(":", ""));
            }
            if (currentString.contains("?")) {
                cleanedList.add(currentString.replace("?", ""));
            }
            if (currentString.contains("!")) {
                cleanedList.add(currentString.replace("!", ""));
            }
            // Add the unmodified word if it doesn't need cleaning
            if (!cleanedList.contains(currentString)) {
                cleanedList.add(currentString);
            }
        }

        // Remove duplicates using a HashSet
        ArrayList<String> uniqueList = new ArrayList<>(new HashSet<>(cleanedList));

        // Add unique words to the main array
        arr.addAll(uniqueList);

        // Log the additions
        for (String s : uniqueList) {
            System.out.printf("'%s' added to the array\n", s);
        }

        fileEdit.close();
    }

            //remove repeating words

            public static void SpecificString (String s, ArrayList < String > arr){
                arr.add(s);
                System.out.printf("'%s' added to the array\n", s);
            }
        }

