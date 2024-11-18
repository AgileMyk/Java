package Exercise_11_2;

import java.util.Date;

public class GeometricObject {
    protected String color;
    protected boolean filled;
    protected Date dateCreated;

    public GeometricObject() {}

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
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

    @Override
    public String toString() {
        return "color: " + this.color + "\nfilled: " + this.isFilled() + "\ndate " + this.getDateCreated();
    }
}
