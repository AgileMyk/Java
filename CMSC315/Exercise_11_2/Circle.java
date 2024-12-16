package Exercise_11_2;

public class Circle extends GeometricObject {
    public static final double PI = 3.141593;
    private double radius;
    private double circumference;
    private double perimeter;

    public Circle() {}

    public Circle(double radius) {}

    public double getRadius() {
        return radius;
    };

    public void setCircumference(double radius) {}

    public double getCircumference() {
        return circumference;
    }

    protected void setPerimeter(double perimeter) {}

    @Override
    protected double getPerimeter() {
        return PI * radius;
    }

    @Override
    protected boolean comparePerimeter(GeometricObject g) {
        return false;
    }

    @Override
    protected double getArea() {
        return 0;
    }

    @Override
    protected boolean compareArea(GeometricObject g) {
        return false;
    }
}
