package Exercise_11_2;
import java.util.Scanner;
public class ShapesTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("---- testing object toString downcast/upcast ----");
        System.out.println("--- upcasting ---    o --> triangle");
        Object o1 = new Triangle();
        System.out.println(o1.toString());
        System.out.println("status START: " + status(o1));
        System.out.println("status END");
        System.out.println("****");

        System.out.println("--- downcasting ---    triangle --> o");
        Object t2 = new Object();
        System.out.println("status: " + status(t2));
        System.out.println(t2.toString());

        Object o = new Object();
        Object t = new Triangle();


        Object aTriangle = new Triangle();
        System.out.println(((Triangle) aTriangle).getHeight());
        Triangle bTriangle = new Triangle();
        System.out.println(bTriangle.getHeight());

        System.out.println("""
                Hello. We are going to make a triangle
                Please enter a length for the left side, 
                then right side 
                and lastly the base""");
        double lSide = in.nextDouble();
        double rSide = in.nextDouble();
        double base = in.nextDouble();
        System.out.println("To continue creating the triangle, please enter a color,\n" +
                "and whether or not you want the triangle filled with that color\n");
        String color = in.next();
        boolean filled = in.nextBoolean();

        Triangle userTriangle = new Triangle(color, filled, base, lSide, rSide);
        System.out.println("stats:");
        System.out.println(userTriangle.getColor());
        System.out.println(userTriangle.isFilled());
        System.out.println(userTriangle.baseLength);
        System.out.println(userTriangle.leftLength);
        System.out.println(userTriangle.rightLength);

        System.out.println("The result of your created triangle is as follows:\n");
        System.out.println(userTriangle);

    }

    //static method which accepts any sub-type of the GeoShape hierarchy and
    //through dynamic binding, performs the appropriate associated toString method
    //based on the actual type of the object parameter
    static String status(Object o) {
        return o.toString();
    }
}
