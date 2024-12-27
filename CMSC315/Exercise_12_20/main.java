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
import java.io.File;

public class main {

    public static void main(String[] args) {
        File file = new File(args[0]);
    }
}
