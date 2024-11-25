package Exercise_11_2;

//using composition instead of inheritance to avoid receiving unnecessary fields/methods
public class Triangular {

    private final String type = "Triangular";

    //ignore warning, yet to be made a parent class
    protected double side1, side2, side3;

    public Triangular() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangular(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

}
