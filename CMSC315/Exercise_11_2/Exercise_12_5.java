/*
(IllegalTriangleException) Programming Exercise 11.1 defined the
Triangle class with three sides. In a triangle, the sum of any two sides is
greater than the other side. The Triangle class must adhere to this rule.
Create the IllegalTriangleException class, and modify the constructor
of the Triangle class to throw an IllegalTriangleException object if a
triangle is created with sides that violate the rule, as follows:
/** Construct a triangle with the specified sides
public Triangle(double side1, double side2, double side3)
        throws IllegalTriangleException {
// Implement it
}
 */

package Exercise_11_2;

public class Exercise_12_5 {
    public static void main(String[] args) throws IllegalTriangleException {

        try {
            Triangle t = new Triangle(33,3,3);
            System.out.println(t);
        } catch (IllegalTriangleException _) {
        }

        try {
            Triangle t1 = new Triangle(1,1,1);
            Triangle t2 = new Triangle(2,1,1);
            Triangle t3 = new Triangle(1,2,1);

            System.out.println("t1\n"+t1);
            System.out.println("t2\n"+t2);
            System.out.println("t3\n"+t3);
        } catch (IllegalTriangleException _) {
        }

        try {
            Triangle t2 = new Triangle(10,1,1);
            Triangle t1 = new Triangle(1,1,10);
            Triangle t3 = new Triangle(1,10,1);
        } catch (IllegalTriangleException _) {
        }
    }

}

