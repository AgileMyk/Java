/*
Cutting out the middle of a string
Write a program that reads a string, and then outputs the string without its
middle character when the length is odd, and without the middle 2 characters
when the length is even.

Hint: Remember substring() method. It can help you a lot.

Sample Input 1:
Hello

Sample Output 1:
Helo

Sample Input 2:
abcd

Sample Output 2:
ad
 */
public class ProcessingStrings {

    public static void main(String[] args) {

        String what = "Test me out!";

        System.out.println(stringProcessor(what));
    }

    public static String stringProcessor(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (s.length() % 2 == 0) {
            //System.out.println("Even");
            sb.deleteCharAt(sb.length() / 2);
            sb.deleteCharAt(sb.length() / 2);
            return sb.toString();
        } else {
            //sb.deleteCharAt(sb.length() / 2);
            System.out.println("odd");
            return sb.toString();
        }
    }
}
