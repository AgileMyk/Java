package Chapter_13;
/*
(Revise the MyStack class) Rewrite the MyStack class in Listing 11.10
to perform a deep copy of the list field.
 */
import java.util.ArrayList;

import Chapter_13.Ex5.*;

public class Ex8 {
    //not overriding clone - object.clone is a bad method
    public static class MyStack {
        private final ArrayList<Object> list = new ArrayList<>();
        public boolean isEmpty() {
             return list.isEmpty();
             }
        public int getSize() {
            return list.size();
            }
        public Object peek() {
            return list.get(getSize() - 1);
             }
        public void printItems() {
            for (Object o : list) {
                System.out.println(o);
            }
        }
        public Object pop() {
             Object o = list.get(getSize() - 1);
             list.remove(getSize() - 1);
             return o;
             }
        public void push(Object o) {
             list.add(o);
             }
        @Override
        public String toString() {
             return "stack: " + list;
             }
             //not overriding clone - object.clone is a bad method
        public Object clone() {
            MyStack tempStack = new MyStack();
            for (Object o : this.list) {
                tempStack.push(o);
            }
            return tempStack;
        }

    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Circle c2 = new Circle(5);
        Rectangle r2 = new Rectangle(5,5);
        MyStack stack = new MyStack();
        stack.push(r1);
        stack.push(c1);
        stack.push(c2);
        stack.push(r2);

        System.out.println("Stack1");
        stack.printItems();
        System.out.println("Stack2");
        MyStack stack2 = (MyStack) stack.clone();
        stack2.printItems();



    }

}
