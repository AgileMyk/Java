package Exercise_11_2;

public class Quadrilateral extends GeometricObject {
    static int sides = 4;
    String type = "Quadrilateral";
    private double side1, side2, side3, side4;

    public Quadrilateral() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
        side4 = 1.0;
    }

    public Quadrilateral(String color, boolean filled) {
        super(color, filled);
    }

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public double getPerimeter() {
        return side1 + side2 + side3 + side4;
    }

    public double getArea() {
        return side1 * side2 * side3 * side4;
    }
}
