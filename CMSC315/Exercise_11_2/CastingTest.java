package Exercise_11_2;

public class CastingTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        RightTriangle rightTriangle = new RightTriangle();
        ObtuseTriangle obtuseTriangle = new ObtuseTriangle();
        ScaleneTriangle scaleneTriangle = new ScaleneTriangle();
        AcuteTriangle acuteTriangle = new AcuteTriangle();

    }

    public String TriangleDetails(Triangle t) {
        if (t instanceof RightTriangle) {
            return ((RightTriangle)t).toString();
        } else if (t instanceof ObtuseTriangle) {
            return ((ObtuseTriangle)t).toString();
        } else if (t instanceof ScaleneTriangle) {
            return ((ScaleneTriangle)t).toString();
        } else if (t instanceof AcuteTriangle) {
            return ((AcuteTriangle)t).toString();
        }
            return "invalid Object - non-Triangle";
        }
}
