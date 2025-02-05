package Exercise_12_26_mergedWith_27;
/*
12.26 (Create a directory) Write a program that prompts the
user to enter a directory name and creates a directory using
the File ’s mkdirs method. The program displays the
message “Directory created successfully” if a directory is
created or “Directory already exists” if the directory already
exists.
**12.27 (Replace words) Suppose you have a lot of files in a
directory that contain words Exercisei_j, where i and j are
digits. Write a program that pads a 0 before i if i is a single
digit and 0 before j if j is a single digit. For example, the word
Exercise2_1 in a file will be replaced by Exercise02_01. In
Java, when you pass the symbol * from the command line, it
refers to all files in the directory (see Supplement III.V). Use
the following command to run your program:
java Exercise12_27 *
 */
//program requirements: statement that defines and qualifies program needs (see above)
//functional requirements: what the program must do
/*
-the following command to run your program: 'java Exercise12_27'
-function for method creation
-means to prompt user to create a specific directory
-use CLI
-must use mkdir method from File package
-lets user know creation was successful “Directory created successfully”
    -states it already exists if user prompt name refers to an existing file
    -> hybridize exercise 26 and 27 <-
-create prompt to ask for a number of files to created in a dir (min of 10)
-method that pads 0 before all single-digit occurrences
-function that works with a to-from process
    -method to search for specific char/number combinations (from)
    -method to alter those found combinations (to)
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise12_27 {
    static boolean location = false;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        File aFile = new File("aFile");
        File bFile = new File("aFile","bFile");
        System.out.println(aFile.isFile());
        System.out.println(bFile.isFile());
        System.out.println(aFile.exists());
        System.out.println(bFile.exists());
        System.out.print("Enter a directory name: ");
        File chosenFile = fileForDir(sc.next());
        System.out.print("name: " + chosenFile.getName() + "\n");
        makeDir(chosenFile);

        populateDirectory(chosenFile);
    }

    public static File fileForDir(String name) {
        if (Character.isDigit(name.charAt(0))) {
            System.out.println("Invalid directory name: " + name);
            System.out.println("The first letter must not be a digit");
            System.out.println("Please enter a valid directory name.");
            fileForDir(sc.next());
        }
        location = namePrompt();
        if (location) {
            name = "C:\\Users\\agile\\IdeaProjects\\Java\\CMSC315\\Exercise_12_26_mergedWith_27\\" + name;
        } else
            name = "C:\\Users\\agile\\IdeaProjects\\" + name;
        return new File(name);
    }

    public static File nameForFile(File dir, String name) {
        if (Character.isDigit(name.charAt(0))) {
            System.out.println("Invalid directory name: " + name);
            System.out.println("The first letter must not be a digit");
            System.out.println("Please enter a valid directory name.");
            nameForFile(dir, sc.next());
        }

        return new File(dir, name);
    }

    public static boolean namePrompt() {
        boolean b = false;
        System.out.println("Would you like to create a directory at the top level or the present level?");
        String response = sc.next().trim();
         if (response.equalsIgnoreCase("p") || response.equalsIgnoreCase("present")) {
             b = true;
         } else if (response.equalsIgnoreCase("t") || response.equalsIgnoreCase("top")) {
             b = false;
         } else {
             System.out.print("please enter 't' or 'top' or 'p' or 'present'\n");
             namePrompt();
         }
         return b;
    }

    public static void populateDirectory(File dir) {
        if (!dir.isDirectory()) {
            System.out.println("Invalid file input: " + dir.getName() + " is not a directory");
        }
        if (!dir.exists()) {
            System.out.println("Invalid file input: " + dir.getName() + " does not exist");
        }

        System.out.println("We are going to populate your directory with 10 files");
        for (int fileCounter = 0; fileCounter < 10; fileCounter++) {
            System.out.print("Enter a file name: ");
            String fileName = sc.next()+".txt";
            File currentFile = nameForFile(dir, fileName);
            if (currentFile.exists()) {
                System.out.println("File already exists");
            }
            try {
                currentFile.createNewFile();
            } catch (IOException e) {
                System.out.println(currentFile.getName() + " <- there was an error with the following file creation attempt");
            }
        }
    }


    public static void makeDir(File file) {
        if (file.mkdirs()) {
            System.out.println("Directory created successfully: \nPath\t" + file.getAbsolutePath());
        } else {
            System.out.println("Directory already exists: " + file.getAbsolutePath());
        }
    }



}


