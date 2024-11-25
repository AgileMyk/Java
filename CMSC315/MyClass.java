import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {

    final private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public Object peek() {
        return list.getLast();
    }

    public Object pop() {
        Object o =  list.getLast();
        list.removeLast();
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public static void main(String[] args) {


    }
}
