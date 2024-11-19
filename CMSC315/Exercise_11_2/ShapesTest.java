package Exercise_11_2;
import java.util.Scanner;
public class ShapesTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

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
}
