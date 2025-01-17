package Chapter_13;

/*
*13.5 (Enable GeometricObject comparable) Modify the GeometricObject class
to implement the Comparable interface and define a static max method in the
GeometricObject class for finding the larger of two GeometricObject objects.
Draw the UML diagram and implement the new GeometricObject class. Write a
test program that uses the max method to find the larger of two circles, the
larger of two rectangles.
 */
public class Ex5 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5,5);
        Rectangle r3 = new Rectangle(3,3);
        Rectangle r4 = new Rectangle(5,5);
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(3.0);
        Circle c4 = c2;
        System.out.println(r2.compareTo(r4));
        System.out.println(c2.compareTo(c4));
        System.out.println(r1.compareTo(c1));
        System.out.println(r1.compareTo(c2));
        System.out.println(r1.compareTo(c3));
        System.out.println(r2.compareTo(c1));
        System.out.println(r2.compareTo(c2));
        System.out.println(r2.compareTo(c3));
        System.out.println(r3.compareTo(c1));
        System.out.println(r3.compareTo(c2));
        System.out.println(r3.compareTo(c3));

    }

    abstract static public class GeometricObject implements Comparable<GeometricObject> {
        private String color = "white";
        private boolean filled;
        private final java.util.Date dateCreated;

        @Override
        public int compareTo(GeometricObject o) {
            return Double.compare(this.getArea(), o.getArea());
        }

        abstract public double getArea();

        public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
            return o1.getArea() > o2.getArea() ? o1 : o2;
        }

        public int max(GeometricObject o) {
            int result;
            result = this.getArea() > o.getArea() ? 1 : -1;
            return result;
        }
        public GeometricObject() {
            dateCreated = new java.util.Date();}
            public GeometricObject(String color, boolean filled) {
            dateCreated = new
            java.util.Date();
            this.color = color;
            this.filled = filled;
            }

        public String getColor() {return color;}

        public void setColor(String color) {this.color = color;}
        public boolean isFilled() {return filled;}

        public void setFilled(boolean filled) {this.filled = filled;}

        public java.util.Date getDateCreated() {return dateCreated;}

          public String toString() {
             return "created on " +
                    dateCreated + "\ncolor: " + color +
                    " and filled: " + filled;
             }
    }
    static class Circle extends GeometricObject {
        private double radius;
        private final double circumference = Math.PI * 2 * radius;
        public Circle() {}
        public Circle(double radius) {
            this.radius = radius;
            setColor("white");
            setFilled(true);
        }
        public Circle(String color, boolean filled, double radius) {
            super(color, filled);
        }
        public double getRadius() {return radius;}
        public void setRadius(double radius) {this.radius = radius;}
        public double getArea() {return Math.PI * radius * radius;
        }
        public double getCircumference() {
            return circumference;
        }
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Rectangle extends GeometricObject {
        double width;
        double height;
        String color;
        boolean filled;
        public Rectangle() {
            height = 1;
            width = 1;
            String color = "white";
            filled = true;
        }
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
            color = "white";
            filled = true;
        }
        public Rectangle(String color, boolean filled, double width, double height) {
            this.width = width;
            this.height = height;
            this.color = color;
            this.filled = filled;
        }
        public double getWidth() {return width;}
        public double getHeight() {return height;}
        public void setWidth(double width) {this.width = width;}
        public void setHeight(double height) {this.height = height;}
        public double getArea() {return width * height;}
        public double getPerimeter() {return 2 * width * height;}

    }
}
