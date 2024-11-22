package Exercise_11_2;

import java.util.ArrayList;
import java.util.Date;


public class GeometricObject {
    private String color;
    protected boolean filled;
    protected Date dateCreated;
    private int totalNumberOfShapes = 0;
    private ArrayList<GeometricObject> shapes = new ArrayList<GeometricObject>();

    public GeometricObject() {
        totalNumberOfShapes++;
        shapes.add(this);
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        shapes.add(this);
        totalNumberOfShapes++;
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

    @Override
    public String toString() {
        return "color: " + this.color + "\nfilled: " + this.isFilled() + "\ndate " + this.getDateCreated() +
                "\nyou have created a total of " + getTotalNumberOfShapes() + " shapes.\n";
    }

}
