package Exercise_11_2;

public class IllegalTriangleException extends Exception {
    private double baseLength;
    private double leftLength;
    private double rightLength;

    public IllegalTriangleException(double baseLength, double leftLength, double rightLength) {
        super("In a triangle, the sum of any two sides mut be greater than the third side");
        if (baseLength + leftLength < rightLength) {
            System.out.println("right length is greater than the sum of the base length and left length");
        } else if (leftLength + rightLength < baseLength) {
            System.out.println("base length is greater than the sum of the left length and right length");
        } else if (baseLength + rightLength < leftLength) {
            System.out.println("left length is greater than the sum of the base length and right length");
        }
    }

    public String getLengths() {
        return "baseLength: " + baseLength + "\nleftLength: " + leftLength + "\nrightLength: " + rightLength;
    }
}
