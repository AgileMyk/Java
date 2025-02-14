package Exercise_12_17;

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

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_12_17 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> originalList = new ArrayList<>();

        File file = new File("Java/CMSC315/Exercise_12_17/EE1.txt");
        //creates initial list of word options from a text file
        //removes any word with dash/hyphens
        populateWordsArray(file, originalList);

        //cleans original list, removing grammatical marks
        ArrayList<String> finalResultsList = removePunctuation(originalList);

        //creates chosen word for Hangman
        String hangmanWord = randomWordGenerator(finalResultsList);
        //used to repeat game if desired
        boolean ask = true;
        Scanner playAgain = new Scanner(System.in);
        //determine if game will end or continue
        while (ask) {
            executeHangman(hangmanWord);
            System.out.println("\nWould you like to play again? (y/n)");
            char answer = playAgain.nextLine().charAt(0);
            if (answer == 'y') {
                hangmanWord = randomWordGenerator(finalResultsList);
                System.out.println("Here we go. You will be asked again at the end of the game if you'd like to continue or not");
            } else if (answer == 'n') {
                System.out.println("Goodbye!");
                ask = false;
            } else {
                System.out.println("Invalid entry, exiting game.");
                ask = false;
            }
        }
    }


    //creates an array of words from a text file, removing any words with dash/hyphens
    public static void populateWordsArray(File file, ArrayList<String> arr) throws IOException {
        Scanner fileEdit = new Scanner(file);

        //remove words with hyphens
        while (fileEdit.hasNextLine()) {
            String word = fileEdit.next().toLowerCase();
            if (!word.contains("-") && !word.contains("—") && word.length() > 4) {
                arr.add(word);  // Add valid words to tempList
            }
        }
    }

    public static ArrayList<String> removePunctuation(ArrayList<String> arr) {

        // Process tempList for delimiters and clean up
        ArrayList<String> cleanedList = new ArrayList<>();
        for (String currentString : arr) {
            if (currentString.contains(",")) {
                cleanedList.add(currentString.replace(",", ""));
            } else if (currentString.contains(";")) {
                cleanedList.add(currentString.replace(";", ""));
            } else if (currentString.contains(".")) {
                cleanedList.add(currentString.replace(".", ""));
            } else if (currentString.contains(":")) {
                cleanedList.add(currentString.replace(":", ""));
            } else if (currentString.contains("?")) {
                cleanedList.add(currentString.replace("?", ""));
            } else if (currentString.contains("!")) {
                cleanedList.add(currentString.replace("!", ""));
            } else if (currentString.contains("”")) {
                cleanedList.add(currentString.replace("”", ""));
            } else if (currentString.contains("“")) {
                cleanedList.add(currentString.replace("“", ""));
            } else {
                cleanedList.add(currentString);
            }
        }
        return cleanedList;
    }

    //random word generator
    public static String randomWordGenerator(ArrayList<String> arr){
        int randomIndex = (int)(Math.random() * arr.size());
        return arr.get(randomIndex);
    }

    public static void executeHangman(String s) {

        char[] wordArray = s.toCharArray();
        char[] guessResult = new char[wordArray.length];
        //create guessArray with all '*'
        for (int i = 0; i < wordArray.length; i++) {
            guessResult[i] = '*';
        }

        int attemptsCount = 0;
        int missCount = 0;


        //boolean condition used to check letter match and move to next step
        boolean status = false;
        //boolean condition to test if user inputs a non-letter guess
        boolean isNonLetter = false;

        for (char c : wordArray) {
            System.out.print(c);
        }

        while (!Arrays.equals(guessResult, wordArray)) {
            Scanner input = new Scanner(System.in);

            System.out.print("\nGuess: enter a letter > ");
            char guess = input.nextLine().charAt(0);
            attemptsCount++;
            for (int i = 0; i < wordArray.length; i++) {
                if (!Character.isLetter(guess)) {
                    isNonLetter = true;
                }
                if (wordArray[i] == guess) {
                    guessResult[i] = guess;
                    status = true;
                }
            }

            if (isNonLetter) {
                System.out.printf("You typed in %s; that's not a letter...\n", guess);
                System.out.print("of course the ");
            }

            if (status) {
                System.out.println("the letter '" + guess + "' is in the word");
            } else {
                System.out.print("the letter '" + guess + "' is not in the word\n");
                missCount++;
            }
            reportProgress(guessResult, wordArray);
        }

        if (Arrays.equals(guessResult, wordArray)) {
            System.out.println("You guessed the word!");
            System.out.printf("It took you %d attempts to guess the word, with %s misses.\n ", attemptsCount, missCount);
        }
    }

    public static void reportProgress(char[] chars, char[] chars2) {
        if (!Arrays.equals(chars, chars2)) {
            System.out.print("Your guess word progress is ");
            for (char c : chars) {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
