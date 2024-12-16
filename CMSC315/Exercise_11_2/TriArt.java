package Exercise_11_2;

abstract public class TriArt extends Triangular implements ShapeCalculations {
         abstract public double getPerimeter();
         abstract public double getArea();

         public TriArt() {}

        public TriArt(double perimeter, double area) {}

        public TriArt(double perimeter) {}

        public TriArt(double perimeter, double area, double perimeterArea) {}


}
