import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_18 {
/*
 (ArrayList of Character) Write a method that returns
an array list of Character from a string using the following
header:
public static ArrayList<Character>
toCharacterArray(String s)
For example, toCharacterArray("abc") returns an array list
that contains characters 'a' , 'b' , and 'c' .

 */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("please type a word: ");
        String word = sc.next().trim();


        ArrayList<Character> alist = toCharacterArray(word);
        for (Character c : alist) {
            System.out.println(c);
        }
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> l = new ArrayList<>();
        for (char c : s.toCharArray()) {
            l.add(c);
        }
        return l;
    }

}
