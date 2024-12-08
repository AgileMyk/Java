package Exercise_11_2;


import javax.sound.sampled.Line;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;



public class GeometricObject {
    private String color;
    protected boolean filled;
    protected Date dateCreated = new Date();
    private static int totalNumberOfShapes = 0;
    protected static ArrayList<GeometricObject> geoObjects = new ArrayList<>();


    public static void totalNumberOfShapesInc() {
        totalNumberOfShapes++;
    }

    public static int getNumberOfShapes() {
        return totalNumberOfShapes;
    }

    public GeometricObject() {
        color = "white";
        filled = false;
        totalNumberOfShapesInc();
        geoObjects.add(this);
    }

    public GeometricObject(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        geoObjects.add(this);
        totalNumberOfShapesInc();
    }

    public void getType() {
        System.out.println("geometric object");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getTotalNumberOfShapes() {
        return totalNumberOfShapes;
    }

    public int getCurrentShapeLocation() {
        return geoObjects.indexOf(this) + 1;
    }

    public double getPerimeter() {
        System.out.println("As a general Geometric Object, this object has no perimeter field");
        return 0.0;
    }

    @Override
    public String toString() {
        return "color: " + this.color + "\nfilled: " + this.isFilled() + "\ndate " + this.getDateCreated() +
                "\nyou have created a total of " + getTotalNumberOfShapes() + " shapes.\n";
    }


    //generics

    public static void objectListReport() {
        for (GeometricObject gObj: geoObjects) {
            System.out.println(geoObjects.indexOf(gObj) + ": " + gObj);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            return ((Triangle) obj).getPerimeter() == this.getPerimeter();
        } else if (obj instanceof Quadrilateral) {
            return ((Quadrilateral) obj).getPerimeter() == this.getPerimeter();
        }
        return false;
    }


}
