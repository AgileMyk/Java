public class Exercise10_11 {
    public static void main(String[] args) {
        // Create a Circle2D object
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // Display results
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is " + c1.getPerimeter());
        System.out.println(
                "c1 contains point (3, 3)? " + c1.contains(3, 3));
        System.out.println(
                "c1 contains circle Circle2D(4, 5, 10.5)? "
                        + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(
                "c1 overlaps circle Circle2D(3, 5, 2.3)? "
                        + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {
    private double x;
    private double y;
    private double radius;

    Circle2D() {
        this(0, 0, 1);
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2))
                < radius;
    }

    public boolean contains(Circle2D circle) {
        // find the distance between this.circle x,y
        //	and circle.radius + their center distances
        // see if that point is contained in this.circle
        double distance = Math.sqrt(
                Math.pow(this.x - circle.getX(), 2) +
                        (Math.pow(this.y - circle.getY(), 2)) ) + circle.getRadius();
        return distance < this.getRadius() ? true:false;
    }


    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) +
                Math.pow(circle.getY() - y, 2))
                <= radius + circle.getRadius();
    }
}
