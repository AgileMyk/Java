package Chapter_13;

import java.util.ArrayList;
import java.util.Collections;

/*
3 (Sort ArrayList) Write the following method that sorts an ArrayList of
numbers:
public static void sort(ArrayList<Number> list)
 */
public class Ex2 {
public static void main(String[] args) {
    ArrayList<Integer> test2 = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        test2.add((int) Math.round(Math.random() * 100));
    }
    for (int i : test2) {
        System.out.println(i);
    }
    SortArrayList(test2);
    System.out.println(test2);
}

public static void SortArrayList(ArrayList<Integer> a) {
        Collections.sort(a);
    }
}
