/*
Generating passwords
A password is hard to crack if it contains at least A uppercase letters, at least B
lowercase letters, at least C digits and consists of exactly N symbols. Also, a password
cannot contain two or more of the same characters in a row.

For the given numbers A, B, C, and N, you should output a password that matches these requirements.

It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <= N. Keep in mind
that any parameter can be equal to zero. It means that it's ok if the password doesn't contain symbols
of such type.
 */
import javax.sound.sampled.AudioInputStream;
import java.io.*;
import java.util.Scanner;
import java.util.Scanner;
public class GeneratingPasswords {


    /*
    Generating passwords
A password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters, at
least C digits and consists of exactly N symbols. Also, a password cannot contain two or more of the same
characters in a row.

For the given numbers A, B, C, and N, you should output a password that matches these requirements.

It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <= N. Keep in mind that any
parameter can be equal to zero. It means that it's ok if the password doesn't contain symbols of such type.
     */

    static Scanner in = new Scanner(System.in);

    public static StringBuilder GenaratingPasswords(int a, int b, int c, int n) {


        try {
            FileReader fR = new FileReader("someDirectory\\someFolder\\someFile.txt");
            char[] chA = new char[30];
            fR.read(chA);
            fR.close();
        } catch (FileNotFoundException fnf) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        CharArrayReader cA = new CharArrayReader(new char[] {'a','b','c'});
        StringReader sR = new StringReader("someDirectory\\someFolder\\someFile.txt");

        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.println();

        StringBuilder sb = new StringBuilder("");


        int upperCaseCount = 0;
        int digitCount = 0;
        int symbolCount = 0;

        char[] uL = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] lL = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] ns = {'1','2','3','4','5','6','7','8','9','0'};

        while (sb.length() < n) {
            for (int i = 0; ; i++) {
                if (i % 0 == 2) {
                    sb.append(uL[i]);
                } else if (i % 3 == 0 && (i % 3 == 0 && i % 2 != 0) ) {
                    sb.append(lL[i]);
                } else {
                    sb.append(ns[i]); //CHANGE THIS
                }
            }
        }
        return sb;
    }
        /*
        for(int i = 0; i < password.length(); i++) {
            char myChar = password.charAt(i);
            if (String.valueOf(myChar) == String.valueOf(myChar).toUpperCase()) {
                upperCaseCount++;
            }
            if (Character.isAlphabetic(password.charAt(i))) {
                digitCount++;
            }
            if (!Character.isAlphabetic(password.charAt(i)) &&
                !Character.isDigit(password.charAt(i))) {
                symbolCount++;
            }
        }
         */


        public static int reEntry ( int x){
            int replace = 0;
            if (x < 0) {
                System.out.println(x + " is less than zero. It must be positive. Please enter a positive value.");
                replace += in.nextInt();
            }
            return replace;
        }

        public static void main (String[]args)  {

            byte[] bytes = new byte[10];
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream("file.txt");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            int numberOfBytes = 0;
            try {
                numberOfBytes = inputStream.read(bytes);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(numberOfBytes);


            File first = new File("thisFile.txt");

            try {
                FileReader fRead = new FileReader(first);
                fRead.read();
            } catch (FileNotFoundException fnf) {

            } catch (IOException ioe) {

            }

            File one = new File("D/F/f.txt");



            try {
                Reader reader = new FileReader("file.txt");
                int charAsNumber = reader.read();
                while (charAsNumber != -1) {
                    char character = (char) charAsNumber;
                    System.out.println(character);
                    charAsNumber = reader.read();
                }
                reader.close();

                ByteArrayInputStream bA1 = new ByteArrayInputStream(new byte[] {});
                FileInputStream fi1 = new FileInputStream("somefile.txt");
                fi1.read();
                fi1.read();
                fi1.close();
                FileInputStream fi2 = new FileInputStream("thisFile.txt");
                fi2.read();

                try {
                    FileInputStream fis = new FileInputStream("file.txt");
                    byte[] arr = new byte[3];
                    fis.read(arr);
                    for(byte b : arr) {
                        System.out.print((char) b);
                    }
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                char[] others = new char[12];
                int number = reader.read(others);
                System.out.println(others);
                char char1 = (char) reader.read();
                char char2 = (char) reader.read();
                char char3 = (char) reader.read();
                char char4 = (char) reader.read();
                char[] chars = new char[15];
                for (char ele : chars) {
                    System.out.println(ele);
                }
                System.out.println(chars);
            } catch (FileNotFoundException fnf) {

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

}