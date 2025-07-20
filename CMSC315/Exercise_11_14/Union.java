package Exercise_11_14;

/*
11.14 (Combine two lists) Write a method that returns the
union of two array lists of integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Union {

    private static final String[] typesList = {"short", "int", "integer", "long", "float", "double",
            "boolean", "char", "string", "date", "array", "object"
    };

    static Scanner sc = new Scanner(System.in);
    private ArrayList list1 = new ArrayList();
    private ArrayList list2 = new ArrayList();

    public static void main(String[] args) {
        System.out.println("We are going to create two separate arraylists and combine them with a union method");
        System.out.println("You will be asked to choose a type of among the common data types in Java..." +
                "if you choose a primitive type, the resulting data type will be the associated wrapper object");

        System.out.println("Please choose a data type:");
        String type1 = sc.next().trim();

        String finalInput = getType(type1);
        System.out.println("You've chosen " + finalInput + " as your data type in the ArrayList");
    }

    //cycles through available data types, testing against valid choices, returns valid chosen type
    public static String getType(String input) {
        boolean b = false;
        int index = 0;
        for (int i = 0; i < typesList.length; i++) {
            if (input.trim().toLowerCase().equals(typesList[i])) {
                index = i;
                b = true;
            }
        }
        if (!b) {
            System.out.println("Please choose a valid data type: ");
            for (String type : typesList) {
                System.out.print(" " + type);
            }
            System.out.println();
            String additionalAttempt = sc.next().trim();
            getType(additionalAttempt);
        }
        //System.out.println(index);
        //System.out.println(typesList[index]);
        return typesList[index];

    }
}
/*
SWITCH OPTION

 switch (choice) {
            case "short":
                return "short";
            case "int":
            case "integer":
                return "Integer";
            case "float":
                return "Float";
            case "double":
                return "Double";
            case "long":
                return "Long";
            case "char":
            case "character":
                return "Character";
            case "string":
                return "String";
            case "boolean":
                return "Boolean";
            case "date":
                return "Date";
            case "array":
                return "Array";
            case "object":
                return "Object";
                default:
                    System.out.println("Invalid data type" +
                            "The following are valid options:");
 */
