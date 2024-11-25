package Exercise_11_2;

import javax.sound.sampled.Line;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;


public class GeometricObject {
    protected String color;
    protected boolean filled;
    protected Date dateCreated = new Date();
    private int totalNumberOfShapes = 0;
    private final ArrayList<GeometricObject> shapes = new ArrayList<>();

    public GeometricObject() {
        color = "white";
        filled = false;
        totalNumberOfShapes++;
        shapes.add(this);
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        shapes.add(this);
        totalNumberOfShapes++;
    }

    public String getType() {
        return "geometric object";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return shapes.indexOf(this) + 1;
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
