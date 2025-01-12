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
import java.util.Scanner;

public class Exercise12_27 {
    static boolean location = false;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int fileCount = 0;
        System.out.print("Enter a directory name: ");
        File chosenFile = fileForDir(sc.next());
        makeDir(chosenFile);


    }

    public static File fileForDir(String name) {
        location = namePrompt();
        if (sc.next().equalsIgnoreCase("t") || sc.next().equalsIgnoreCase("top")) {
            if (Character.isDigit(name.charAt(0))) {
                System.out.println("Invalid directory name: " + name);
                System.out.print("The first letter must not be a digit");
                System.out.println("Please enter a valid directory name.");
                fileForDir(sc.next());
            }
        }
        if (location) {
            name = "\\Java\\CMSC315\\Exercise_12_26_mergedWith_27" + name;
        }
        return new File(name);
    }

    public static boolean namePrompt() {
        System.out.print("Would you like to create a directory at the top level or the present level?");
        if (!sc.next().equalsIgnoreCase("t") || !sc.next().equalsIgnoreCase("top")) {
            return true;
        } else if (!sc.next().equalsIgnoreCase("p") || !sc.next().equalsIgnoreCase("present")) {
            System.out.print("please enter 't' or 'top' or 'p' or 'present'");
            namePrompt();
        }
        return false;
    }

    public static void makeDir(File file) {
        if (file.mkdirs()) {
            System.out.println("Directory created successfully: " + file.getAbsolutePath());
        } else {
            System.out.println("Directory already exists: " + file.getAbsolutePath());
        }
    }


}


