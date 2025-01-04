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
    public static final int phraseLength = 7;

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
                 FileWriter fileWriter = new FileWriter(fileInQuestion)) {
                while (fileScanner.hasNextLine()) {
                    if (fileScanner.nextLine().startsWith("package ")) {
                        if (fileScanner.nextLine().endsWith(String.valueOf("chapter".matches("\\d")))) {
                            String toRemove = fileScanner.nextLine();
                            System.out.println("toRemove: " + toRemove);
                            String toRemoveEdit = toRemove.substring(0, toRemove.length() - phraseLength);
                            System.out.println("toRemoveEdit" + toRemoveEdit);
                            fileWriter.write(toRemoveEdit + "\n");
                        } else {
                            System.out.println("There were no valid lines to edit");
                            System.exit(0);
                        }
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

    //searching through file list of available files

}
