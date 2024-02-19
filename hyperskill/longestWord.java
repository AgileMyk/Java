/*
The longest word
In the given string find the first longest word and output it.

Input data
Given a string in a single line. Words in the string are separated by a single space.

Output data
Output the longest word. If there are several such words, you should output the one, which occurs earlier.

Sample Input 1:
one two three four five six

Sample Output 1:
three
 */

import java.io.IOException;
import java.util.Scanner;
public class longestWord {


        public static String longestWord (String str){
            String result = null;
            int length = 0;
            String[] str2 = str.split(" ");
            for (String ele : str2) {
                if (ele.length() > length) {
                    length = ele.length();
                }
            }

            for (String ele : str2) {
                if (ele.length() == length) {
                    result = ele;
                    break;
                }
            }
            return result;
        }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);

            String phrase = in.nextLine();
            System.out.println(longestWord(phrase));
        }

}