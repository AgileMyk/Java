package Exercise_11_2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


abstract public class Shape {

    private final Date date = new Date();
    protected String type;
    static ArrayList<String> shapeList = new ArrayList<>();



  /* ADJUST THIS CONSTRUCTOR - CAUSES DOUBLE OBJECT CREATION
    public Shape() {
        switch (this) {
            case Quadrilateral quadrilateral -> System.out.println(this);
            case Triangle triangle -> System.out.println(this);
            case Circle circle -> System.out.println(this);
            default -> System.out.println("""
                    A new shape object has been created, referenced by your variable choice.
                    No fields with values exist for this object.""");
        }
        shapeList.add(this.getClass().getName()); //will this work or error?
    }
   */


    protected Date getDateCreated() {
        return date;
    }

/*
    abstract public String typeName();

    public String info() {
        return typeName();
    }
 */

    abstract protected String getType();

    //abstract double getPerimeter();

    protected abstract boolean comparePerimeter(GeometricObject g);

    //abstract double getArea();

    abstract protected boolean compareArea(GeometricObject g);
}
