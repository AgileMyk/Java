package Exercise_12_20;
/*
(Remove package statement) Suppose you have
Java source files under the directories chapter1 ,
chapter2 , . . . , chapter34 . Write a program to remove the
statement package chapteri; in the first line for each Java
source file under the directory chapteri . Suppose chapter1 , -
chapter2 , . . . , chapter34 are under the root directory
srcRootDirectory . The root directory and chapteri directory
may contain other folders and files. Use the following
command to run the program:
java Exercise12_20 srcRootDirectory
 */
import java.io.*;
import java.util.Scanner;

public class main {


    public static Scanner fileQuestions = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {

        File dirFile = new File("srcRootDirectory\\chapter1\\sourceFile1.java");
        System.out.println(dirFile.exists());

        StringBuilder folderPath = askForFolder();
        StringBuilder fileName = askForFileName();

        String folderPathFinal = folderPath.toString();
        String fileNameFinal = fileName.toString();


        File fileInQuestion = new File(folderPathFinal + fileNameFinal);
        System.out.println("You entered: " + folderPathFinal + fileNameFinal);
        System.out.println(fileInQuestion.getName() + " exists: " + fileInQuestion.exists());
        if (fileInQuestion.exists()) {
            try (Scanner fileScanner = new Scanner(fileInQuestion);
                 FileWriter fileWriter = new FileWriter(fileInQuestion, true)) {
                int count = 0;
                while (fileScanner.hasNextLine()) {
                    count++;
                    String tempString = fileScanner.nextLine();
                    System.out.println("tempString: " + tempString);
                    if (tempString.startsWith("package ") && count < 2) {
                        System.out.println("package found");
                    } else {
                        System.out.println("no appropriate file was found (no first line beginning with 'package')");
                    }
                        System.out.println("The initial line was found: " + tempString);
                        int index = tempString.indexOf("chapter");
                        index += 7;
                        int remainingLength = tempString.substring(index).length();
                        if (tempString.substring(tempString.length() - remainingLength).matches("[\\d]+")) {
                        System.out.println("The check for chapteri was found");
                       } else {
                            System.out.println("There were no valid lines to edit");
                            System.exit(0);
                        }
                        fileWriter.write(tempString + "\n");
                        System.out.println(tempString + " was written to the first line");
                        System.out.println("The resulting file is as follows: ");
                        while (fileScanner.hasNextLine()) {
                            System.out.println(fileScanner.nextLine());
                        }
                    }
                }
            }


    }

    //method for choosing folder path
    public static StringBuilder askForFolder() {
        System.out.println("Enter folder path: ");
        String result = fileQuestions.nextLine();
        StringBuilder changeableResult = new StringBuilder(result);
        if (!changeableResult.substring(0, 7).equals("srcRootDirectory\\")) {
            changeableResult.insert(0, "srcRootDirectory\\");
        }
        System.out.println("the result: " + changeableResult);
        return changeableResult;
    }

    //method for choosing file
    public static StringBuilder askForFileName() {
        System.out.println("Enter file name: ");
        String result = fileQuestions.nextLine();
        StringBuilder changeableResult = new StringBuilder(result);
        if (!changeableResult.substring(changeableResult.length() - 2, changeableResult.length()).equals("\\")) {
            changeableResult.insert(0, "\\");
        }
        if (!changeableResult.substring(result.length() - 4, result.length()).equals(".java")) {
            changeableResult.insert(changeableResult.length(), ".java");
        }
        System.out.println("the result: " + changeableResult);
        return changeableResult;
    }

    //remove targeted ending from String value of fileInQuestion
    public static String convertString(String input, int val) {
        return input.substring(0,input.length() - val);
    }

    //searching through file list of available files

}
