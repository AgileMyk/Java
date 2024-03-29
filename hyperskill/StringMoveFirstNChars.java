    /*
Move the first N characters
Write a program that reads a string s and an int n, and then moves the first n
characters of s to the end of the string. The program must output the changed string.
If n is greater than the length of the string, it must output the string unchanged.

Note, the substring method can help you, but you may choose another way to solve the problem.
Input data format
The single input line contains s and n separated by a space.

Sample Input 1:
Hello 3

Sample Output 1:
loHel
*/
    public class StringMoveFirstNChars {

        public static void main(String[] args) {
            String test = "hello";
            System.out.println(stringMove(test, 6));

        }
        public static String stringMove(String s, int n) {

            if (n > s.length()) {
                n = s.length();
            }

            String front = s.substring(n);
            String back = s.substring(0, n);
            return front + back;
        }



}
