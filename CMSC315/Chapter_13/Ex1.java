package Chapter_13;
/*
(Shuffle ArrayList) Write the following method that shuffles an ArrayList
of numbers:

 */

import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> test1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            test1.add(i);
        }
        for (int i : test1) {
            System.out.println(i);
        }
        ArrayListShuffle(test1);
        System.out.println(test1);
    }

    public static void ArrayListShuffle(ArrayList<Integer> a) {
        Collections.shuffle(a);
    }
}



