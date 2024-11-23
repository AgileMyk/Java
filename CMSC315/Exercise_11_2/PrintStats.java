package Exercise_11_2;

public class PrintStats <T> extends GeometricObject {       //make static?
    T detailedObject;

    public String constructor (GeometricObject object) {
        switch (object) {
            case RightTriangle rightTriangle -> {
                return object.getType();
            }
            case AcuteTriangle acuteTriangle -> {
                return object.getType();
            }
            case ObtuseTriangle obtuseTriangle -> {
                return object.getType();
            }
            case IsoscelesTriangle isosceleseTriangle -> {
                return object.getType();
            }
            case EquilateralTriangle equilateralTriangle -> {
                return object.getType();
            }
            case Triangle triangle -> {
                return object.getType();
            }
            default -> throw new IllegalStateException("Unexpected value: " + object);
        }

    }
    public void getDetails(T detailedObject) {

    }
}
