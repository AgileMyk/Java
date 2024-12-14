package Exercise_11_2;

import java.awt.*;
import java.util.Date;

abstract public class Shape {

    private final Date date = new Date();

    public Shape() {
        switch (this) {
            case Quadrilateral quadrilateral -> System.out.println(this);
            case Triangle triangle -> System.out.println(this);
            case Circle circle -> System.out.println(this);
            default -> System.out.println("""
                    A new shape object has been created, referenced by your variable choice.
                    No fields with values exist for this object.""");
        }
    }

    protected Date getDateCreated() {
        return date;
    }

    abstract protected void getType();

    abstract protected double getPerimeter();

    protected abstract boolean comparePerimeter(GeometricObject g);

    abstract protected double getArea();

    abstract protected boolean compareArea(GeometricObject g);
}
