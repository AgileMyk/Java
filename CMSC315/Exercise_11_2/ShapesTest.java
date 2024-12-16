package Exercise_11_2;
import javax.swing.text.Style;
import java.util.*;

public class ShapesTest {

    public static String calendarDayOfWeekConversion(int i) {
        return switch (i) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid number for day representation";
        };
    }

    public static void main(String[] args) {

        Triangle at1 = new AcuteTriangle();
        at1.setBaseLength(Triangle.getNumberOfShapes());

        Calendar calendar = new GregorianCalendar();
        System.out.println("current date: " + new Date());
        System.out.println("year:\t" + calendar.get(Calendar.YEAR));
        Calendar calendar2 = new GregorianCalendar(2024, Calendar.DECEMBER,7,12,17,34);

        System.out.println("The day of the week is " + calendarDayOfWeekConversion(calendar2.get(Calendar.DAY_OF_WEEK)));

        Scanner in = new Scanner(System.in);
        int first = 1;
        int last = 1;

       try {
           first = Integer.parseInt(divideByZero(13, 7));
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
           try {
               last = Integer.parseInt(divideByZero(10, 3));
           } catch (Exception e) {
               System.out.println(e.getMessage());
               throw e;
           }
                try {
                   Integer.parseInt(divideByZero(first, last));
                } catch (Exception e) {
                   System.out.println(e.getMessage());
                   throw e;
                }

        System.out.println("Geos array: ");
        GeometricObject.objectListReport();
        System.out.println("pre-make shapes count: " + GeometricObject.getNumberOfShapes());




        System.out.println("---- testing object toString downcast/upcast ----");
        System.out.println("--- upcasting ---    o --> triangle");
        GeometricObject o1 = new Triangle();

        System.out.println("status START: " + status(o1));
        // upcasting prevents access to GeoObject's inherited getCurrentShapeLocation method below
        //System.out.println(o1.getCurrentShapeLocation());
        System.out.println("status END");
        System.out.println("****");



        System.out.println("--- downcasting ---    triangle --> o");
        // Triangle t2 = new Object(); <-- cannot IMPLICITLY downcast from Object to create t2 and access triangle methods
        // --> illegal System.out.println("status: " + status(t2));
        // --> illegal System.out.println(t2.toString());
        // --> illegal System.out.println(t2.getCurrentShapeLocation());


/*
        Triangle t3 = new Triangle();
        System.out.println("currentShapeLocation: " + t3.getCurrentShapeLocation());
        Triangle t4 = new Triangle();
        System.out.println("currentShapeLocation: " + t3.getCurrentShapeLocation());
        Triangle t5 = new Triangle();
        System.out.println("currentShapeLocation: " + t3.getCurrentShapeLocation());
 */

        //Triangle t5 = (Triangle) new GeometricObject();



        Triangle aTriangle = new Triangle();

        System.out.println(aTriangle.getHeight());
        Triangle bTriangle = new Triangle();
        System.out.println(bTriangle.getHeight());
        //change prompt to allow options to user, creating triangle per stat via setters with try catch
        System.out.println("""
                Hello. We are going to make a triangle
                Please enter a length for the left side, 
                then right side 
                and lastly the base""");
        double lSide = in.nextDouble();
        double rSide = in.nextDouble();
        double base = in.nextDouble();

        System.out.println("""
                To continue creating the triangle, please enter a color,
                and whether or not you want the triangle filled with that color
                """);
        String color = in.next();
        boolean filled = in.nextBoolean();

            Triangle userTriangle = new Triangle();
        try {
            userTriangle = new Triangle(color, filled, base, lSide, rSide);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
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


    public static String divideByZero(int y, int x) throws ArithmeticException {
        if (x == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        return y/x + "";
    }
}



