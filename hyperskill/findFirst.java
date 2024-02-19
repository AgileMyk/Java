/*
Find the first occurrence of the word "the"
Write a program that takes a sentence as input and returns the index of the first occurrence
of the word "the" (can be part of a word), regardless of the capitalization. If there is no
occurrence of it, it must output -1.

For instance, if the sentence is “The apple is red.” the output should be 0, if the sentence
is “I ate the red apple.” the output should be 6, and if the sentence is “I love apples.” the
output should be -1.

Note, the and The are equal.
 */

public class findFirst {

    public static int findFirst(String words) {
        int temp = 0;
        int i = 0;

        return temp;
    }

    public static void main(String[] args) {

        String testString = "I ate the red apple.";

        System.out.println(findFirst(testString));
    }
}
