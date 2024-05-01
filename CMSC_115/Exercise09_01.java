/*
write a class named Rectangle to represent a rectangle.
The class contains:
- Two double data fields named width and height that specify the width and height of the rectangle.
The default values are 1 for both width and height.
- A public no-arg constructor that creates a default rectangle.
- A public constructor that creates a rectangle with the specified width and height.
- A public method named getArea() that returns the area of this rectangle.
- A public method named getPerimeter() that returns the perimeter.
Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5
and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
Sample Run
The area of a rectangle with width 4.0 and height 40.0 is 160.0
The perimeter of a rectangle is 88.0
The area of a rectangle with width 3.5 and height 35.9 is 125.64999999999999
The perimeter of a rectangle is 78.8
 */
public class Exercise09_01 {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(4.0,40.0);
        Rectangle rect2 = new Rectangle(3.5,35.9);

        System.out.println("The area of a rectangle with width " + rect.width + " and height "+ rect.height +" is " + rect.getArea());
        System.out.println("The perimeter of a rectangle is " + rect.getPerimeter());

        System.out.println("The area of a rectangle with width " + rect2.width + " and height "+ rect2.height +" is " + rect2.getArea());
        System.out.println("The perimeter of a rectangle is " + rect2.getPerimeter());
    }

    static class Rectangle {
        private double width;
        private double height;

        public Rectangle() {
            this(5,5);
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return (width*2) + (height*2);
        }
    }
}
