package Chapter_13;
/*
(The Octagon class) Write a class named Octagon that extends -
GeometricObject  and implements the Comparable and Cloneable interfaces.
Assume all eight sides of the octagon are of equal length. The area can be -
computed using the following formula:
The Octagon class has a private double data field named side with its getter
and setter methods. The class has a no-arg constructor that creates an
Octagon with side 0, and a constructor to create an Octagon with a specified
side.
Draw the UML diagram that involves Octagon , GeometricObject , Comparable ,
and Cloneable . Write a test program that creates an Octagon object with side
value 5 and displays its area and perimeter. Create a new object using the
clone method, and compare the two objects using the compareTo method.
 */


import Chapter_13.Ex5.GeometricObject;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Octagon o1 = new Octagon();
        o1.toString();
        Octagon o2 = new Octagon(1,2,1,2,1,2,1,2);
        o2.toString();
        Octagon o3 = o1;
        o3.compareTo(o1);
    }

    static class Octagon extends GeometricObject implements Cloneable, Comparable<GeometricObject> {

        private boolean isRegular;
        private final Scanner forSides = new Scanner(System.in);
        private final ArrayList<Double> sides = new ArrayList<>();
        private double perimeter = 0;

        public Octagon() {
            autoSetSides();
        }
        public Octagon(double side1, double side2, double side3, double side4,
                       double side5, double side6, double side7, double side8) {
            this.sides.add(side1);
            this.sides.add(side2);
            this.sides.add(side3);
            this.sides.add(side4);
            this.sides.add(side5);
            this.sides.add(side6);
            this.sides.add(side7);
            this.sides.add(side8);
            this.perimeter = side1 + side2 + side3 + side4 + side5 + side6 + side7 + side8;
        }

        public boolean getRegular() {
            if (Objects.equals(this.sides.get(0), this.sides.get(1)) &&
                    Objects.equals(this.sides.get(0), this.sides.get(2)) &&
                    Objects.equals(this.sides.get(0), this.sides.get(3)) &&
                    Objects.equals(this.sides.get(0), this.sides.get(4)) &&
                    Objects.equals(this.sides.get(0), this.sides.get(5)) &&
                    Objects.equals(this.sides.get(0), this.sides.get(6)) &&
                    Objects.equals(this.sides.get(0), this.sides.get(7)))
                return true;
            return false;
        }

        public void autoSetSides() {
            for (int i = 0; i < sides.size(); i++) {
                this.sides.add(1.0);
            }
            this.perimeter = 8.0;
        }

        public void reportSides() {
            for (int i = 0; i < sides.size(); i++) {
                System.out.println("Side " + i + "'s length: " + sides.get(i));
            }
        }

        public double getPerimeter() {
            if (perimeter < 0) {
                System.out.println("Perimeter is not set/invalid");
                return -1;
            }
            return perimeter;

        }

        @Override
        public double getArea() {
            if (this.isRegular) {
                return 2 * (this.sides.getFirst() * this.sides.getFirst()) * (1 + Math.sqrt(2));
            }
            //adjust later, shortened for sake of assignment's focused task
            return 2 * (this.sides.getFirst() * this.sides.getFirst()) * (1 + Math.sqrt(2));
        }

        @Override
        public String toString() {
            for (int i = 0; i < sides.size(); i++) {
                System.out.println("side " + i + ": " + sides.get(i));
            }
            System.out.println("Perimeter: " + perimeter);
            System.out.println("regularity: " + getRegular());
            return "";
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public int compareTo(GeometricObject o) {
            int result = 0;
            for (int i = 0; i < this.sides.size(); i++) {
                if (o.sides.get(i) == this.sides.get(i)) {
                    result = 0;

                }
            }
            return result;
        }
    }
}
