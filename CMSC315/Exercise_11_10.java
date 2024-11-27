/*
(Implement MyStack using inheritance) In Listing 11.10, MyStack is implemented using composition.
Define a new stack class that extends ArrayList.
Draw the UML diagram for the classes and then implement MyStack. Write
a test program that prompts the user to enter five strings and displays them in
reverse order.
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise_11_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyStack stringStack = new MyStack();

        System.out.println("Enter 5 strings: ");
        int count = 0;
        while (count < 5) {
            stringStack.push(in.nextLine());
            count++;
        }
        stringStack.reverseToString();

    }

    }

    class MyStack extends ArrayList{
        ArrayList<Object> commonList = new ArrayList<>();

        public boolean isEmpty() {
            return size() == 0;
        }

        public int getSize() {
            return size();
        }

        public void pop() {
            Object o = commonList.get(commonList.size()-1);
            System.out.println(o.toString());
            commonList.removeLast();
        }

        public Object peek() {
            System.out.print("The last object is: "); return commonList.get(commonList.size() - 1);
        }

        public void push(Object o) {
           if (o != null) {
               commonList.add(o);
           } else {
               System.out.println(o + "is not an object/object is null");
           }
        }

        public int getObjectLocation(Object o) {
            for (Object ele : commonList) {
                if (o.equals(ele)) {
                    return commonList.indexOf(ele);
                }
            }
            return -1;
        }

        public Object getObjectAtLocation(int i) {
            if (i < 0 || i > commonList.size()) {
                System.out.println("invalid location input: (0 to " + (commonList.size() -1) + ")");
            } else if (commonList.isEmpty()) {
                System.out.println("empty stack");
            }
            return commonList.get(i);
        }

        public void reverseToString() {
            System.out.println("this is an object of the MyStack class.");
            int tempSize = commonList.size();
            for (int i = commonList.size() - 1; i >= 0; i--) {
                System.out.println(commonList.get(i));
            }
        }

        @Override
        public String toString() {
            System.out.println("this is an object of the MyStack class.");
            return commonList.toString();
        }

}


