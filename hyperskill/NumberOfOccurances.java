import java.util.Scanner;

/*
Number of occurrences
Write a program that finds the frequency of occurrences of a substring in a given string.
Substrings cannot overlap: for example, the string ababa contains only one substring aba.

Input data format
The first input line contains a string, the second one contains a substring.

Sample Input 1:
ababa
aba

Sample Output 1:
1

Sample Input 2:
hello there
the

Sample Output 2:
1

Sample Input 3:
hello yellow jello
ll

Sample Output 3:
3

 */
public class NumberOfOccurances {


    public static int NumberOfOccurances(String s, String a) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder();
            if (s.charAt(i) == a.charAt(i) && a.length() - 1 <= i) {
                temp.append(a.charAt(i));
                if (temp.toString().equals(a)) {
                    count++;
                    temp.setLength(0);
                }
            } else {
                i = 0;
                if (s.charAt(i + (a.length() * count)) == a.charAt(i) && a.length() - 1 <= i) {
                    temp.append(a.charAt(i));
                    if (temp.toString().equals(a)) {
                        count++;
                        temp.setLength(0);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "ababa";
        String b = "aba";
        System.out.println(NumberOfOccurances(s, b));
    }


}
