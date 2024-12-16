package Exercise_11_2;


import java.util.ArrayList;
import java.util.Date;


public class GeometricObject extends Shape {
    protected String color;
    protected boolean filled;
    String type = "Geometric Object";
    protected Date dateCreated = new Date();
    private double area;
    private static int totalNumberOfShapes = 0;
    protected static ArrayList<GeometricObject> geoObjects = new ArrayList<>();


    public static void totalNumberOfShapesInc() {
        totalNumberOfShapes++;
    }

    protected static int getNumberOfShapes() {
        return totalNumberOfShapes;
    }

    public GeometricObject() {
        setColor("white");
        setFilled(false);
        totalNumberOfShapesInc();
        geoObjects.add(this);
    }

    public GeometricObject(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
        geoObjects.add(this);
        totalNumberOfShapesInc();
    }

    public String getType() {
        return type;
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

    protected Date getDateCreated() {
        return dateCreated;
    }

    public int getTotalNumberOfShapes() {
        return totalNumberOfShapes;
    }

    public int getCurrentShapeLocation() {
        return geoObjects.indexOf(this) + 1;
    }

    protected double getPerimeter() {
        System.out.println("As a general Geometric Object, this object has no perimeter field");
        return 0.0;
    }

    @Override
    protected boolean comparePerimeter(GeometricObject g) {
        return this.getPerimeter() == g.getPerimeter();
    }


    protected double getArea() {
        return this.area;
    };

    @Override
    protected boolean compareArea(GeometricObject g) {
        return this.getArea() == g.getArea();
    }

    @Override
    public String toString() {
        return "color: " + this.getColor() + "\nfilled: " + this.isFilled() + "\ndate " + this.getDateCreated() +
                "\nyou have created a total of " + (getTotalNumberOfShapes() + 1) + " shapes.\n";
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

    public static void main(String[] args) {
        GeometricObject geo1 = new GeometricObject();
        System.out.println(geo1);
    }
}
