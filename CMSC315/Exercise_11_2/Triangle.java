/*
(The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
 ■ Three double data fields named side1, side2, and side3 with default
values 1.or 0 less to denote three sides of the triangle.
 ■ A no-arg constructor that creates a default triangle.
 ■ A constructor that creates a triangle with the specified side1, side2, and
side3.
 ■ The accessor methods for all three data fields.
 ■ A method named getArea() that returns the area of this triangle.
 ■ A method named getPerimeter() that returns the perimeter of this triangle.
 ■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not
 */

package Exercise_11_2;


import java.util.ArrayList;
import java.util.Date;

public class Triangle extends GeometricObject {

    protected double baseLength;
    protected double leftLength;
    protected double rightLength;
    protected double s = (baseLength + leftLength + rightLength) / 2;


    private Triangle(String color, boolean filled) {
        IllegalArgumentException ea = new IllegalArgumentException("""
                Either a String and boolean value were not passed to the contructor
                or the arguments were passed int he wrong order (string then boolean).""");
    }

    //static factories
    public static Triangle simpleTriangle(String color, boolean filled) {
        return new Triangle(color, filled);
    }

    public static Triangle instanceOfComplexTriangleOfOnes(String color, boolean filled) {
        totalNumberOfShapesInc();
        return new Triangle(color, filled, 1,1,1);
    }

    public static Triangle instanceOfComplexTriangleNonOnes(String color, boolean filled,
                                                            double baseLength, double leftLength, double rightLength)
                                                            throws IllegalArgumentException {
        totalNumberOfShapesInc();
            double bLength, lLength, rLength;
        if (baseLength <=  0 ) {
            bLength = 1;
            throw new IllegalArgumentException("\"an invalid value of or 0 less was input (base); setting to 1");
        } else {
            bLength = baseLength;
        }
        if (leftLength <=  0 ) {
            lLength = 1;
            throw new IllegalArgumentException("an invalid value of or 0 less was input (left); setting to 1");
        } else {
            lLength = leftLength;
        }
        if (rightLength <=  0) {
            rLength = 1;
            throw new IllegalArgumentException("an invalid value of or 0 less was input (right); setting to 1");
        } else {
            rLength = rightLength;
        }
        return new Triangle(color, filled, bLength, lLength, rLength);
    }

    public void getType() {
        System.out.println("Triangle");
    }
    //created separate method for adding geoObject to arrayList required? cannot be in constructor?
    public void incorporateGeo(GeometricObject g) {
        geoObjects.add(g);
    }

    //Three double data fields named side1, side2, and side3 with default values 1.or 0 less to denote three sides of the triangle.
    public Triangle() {
        baseLength = 1;
        leftLength = 1;
        rightLength = 1;
    }


    //A constructor that creates a triangle with the specified side1, side2, and side3.
    public Triangle(String color, boolean filled, double baseLength, double leftLength, double rightLength) {
        super(color, filled);
        if (baseLength <=  0 ) {
            this.baseLength = 1;
            System.out.println("an invalid value of or 0 less was input (base); setting to 1");
        } else {
            this.baseLength = baseLength;
        }
        if (leftLength <=  0 ) {
            this.leftLength = 1;
            System.out.println("an invalid value of or 0 less was input (left); setting to 1");
        } else {
            this.leftLength = leftLength;
        }
        if (rightLength <=  0 ) {
            this.rightLength = 1;
            System.out.println("an invalid value of or 0 less was input (right); setting to 1");
        } else {
            this.rightLength = rightLength;
        }
    }

    public void setBaseLength(double base) throws IllegalArgumentException {
        if (base <=  0 ) {
            throw new IllegalArgumentException("\"an invalid value of or 0 less was input (base); setting to 1");
        } baseLength = base;
    }

    public void setLeftLength(double left) throws IllegalArgumentException {
        if (left <= 0 ) {
            throw new IllegalArgumentException("\"an invalid value of or 0 less was input (base); setting to 1");
        } leftLength = left;
    }

    public void setRightLength(double right) {
        if (right <=  0 ) {
            throw new IllegalArgumentException("\"an invalid value of or 0 less was input (base); setting to 1");
        } rightLength = right;
    }

    public double getHeight() {
        return (leftLength + rightLength) / baseLength;
    }

    public double getS() {
        return (baseLength + leftLength + rightLength) / 2;
    }

    //A method named getPerimeter() that returns the perimeter of this triangle
    public double getPerimeter() {
        return baseLength + leftLength + rightLength;
    }

    //A method named getArea() that returns the area of this triangle
    public double getArea() {
        return Math.sqrt(this.getS() * (this.getS()-baseLength) * (this.getS()-rightLength) * (this.getS()-leftLength));
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return "base length: " +  baseLength + "\n" +
                "right length: " +  rightLength + "\n" +
                "left length: " +  leftLength + "\n" +
                "perimeter: " +  getPerimeter() + "\n" +
                "area: " +  getArea() + "\n";
    }

    public String reportFilled() {
        return this.isFilled() ? "is filled" : "is not filled";
    }

}
