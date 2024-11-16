/*
(The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
 ■ Three double data fields named side1, side2, and side3 with default
values 1.0 to denote three sides of the triangle.
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

import java.awt.*;
import java.util.Date;

public class Triangle extends GeometricObject{

    protected double baseLength;
    protected double leftLength;
    protected double rightLength;
    protected double s = (baseLength + leftLength + rightLength) / 2;
    protected double perimeter = baseLength + leftLength + rightLength;

    //A no-arg constructor that creates a default triangle.
    public Triangle(String color, boolean filled) {
        super(color, filled);
    };

    //Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
    public Triangle() {
        baseLength = 1;
        leftLength = 1;
        rightLength = 1;
    }


    //A constructor that creates a triangle with the specified side1, side2, and side3.
    public Triangle(String color, boolean filled, double baseLength, double leftLength, double rightLength) {
        super(color, filled);
        this.baseLength = baseLength;
        this.leftLength = leftLength;
        this.rightLength = rightLength;
    }

    @Override
    public String getColor() {
        System.out.println("this is a triangle");
        return color;
    }

    @Override
    public void setColor(String color) {
        System.out.println("this is a triangle");
        this.color = color;
    }

    @Override
    public void setFilled(boolean filled) {
        System.out.println("this is a triangle");
        this.filled = filled;
    }

    @Override
    public boolean isFilled() {
        System.out.println("this is a triangle");
        return filled;
    }

    @Override
    public Date getDateCreated() {
        System.out.println("this is a triangle");
        return super.getDateCreated();
    }

    public double getHeight() {
        return this.baseLength + this.leftLength + this.rightLength;
    }

    //A method named getPerimeter() that returns the perimeter of this triangle
    public double getPerimeter() {
        return this.perimeter;
    }

    public double getS() {
        return s;
    }

    //A method named getArea() that returns the area of this triangle
    public double getArea() {
        return Math.sqrt(this.s * (this.getS()-baseLength) * (this.getS()-rightLength) * (this.getS()-leftLength));
    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        System.out.println("this is a triangle: ");
        return "base length: " +  baseLength + "\n" +
                "right length: " +  rightLength + "\n" +
                "left length: " +  leftLength + "\n" +
                "perimeter: " +  getHeight() + "\n" +
                "area: " +  getArea() + "\n";
    };

}
