package Exercise_11_2;

import java.util.ArrayList;

interface ShapeCalculations {

    default String testInterfaceMethod() {
          return"tested";
};
    default String yetToBeDetermined1() {
        return "We'll see";
    };

    static double yetToBeDetermined2() {
        return 2.0;
    }

    ArrayList<ShapeCalculations> shapeList = new ArrayList<>();

    static void addToList(ShapeCalculations calculation) {
        shapeList.add(calculation);
    }

    private static ArrayList<ShapeCalculations> ShapesList() {
        return shapeList;
    };

    boolean HAS_SIDES = true;
    boolean HAS_AREA = true;

    double getPerimeter();

    double getArea();
}
