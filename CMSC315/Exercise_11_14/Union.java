package Exercise_11_14;

/*
11.14 (Combine two lists) Write a method that returns the
union of two array lists of integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)

 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Union {

    private static final String[] typesList = {"short", "int", "integer", "long", "float",
                                  "double", "boolean", "char", "string", "date", "object"};

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("We are going to create two separate arraylists and combine them with a union method");
        System.out.println("You will be asked to choose a type of among the common data types in Java..." +
                "if you choose a primitive type, the resulting data type will be the associated wrapper object");

        //ask for arraylist with type
        System.out.println("Please choose a data type:");
        String type1 = sc.next().trim().toLowerCase();

        //ensure answer associates with valid data type
        String finalInput = getType(type1);

        ArrayList arrList1 = createArrayList(finalInput);

        System.out.println("You have created an arrayList that can contain the following data types: " + finalInput);

        dataAddQuery();


        //System.out.println("Please choose a second data type:");
        //String type2 = sc.next().trim().toLowerCase();

        //ask for arraylist with type
        //String finalInput2 = getType(type2);
        //dataAddQuery(type2);



    }

    //cycles through available data types, testing against valid choices, returns valid chosen type
    public static String getType(String input) {
        String returnVal = "";
        boolean b = false;
        for (int i = 0; i < typesList.length; i++) {
            if (input.equals(typesList[i])) {
                b = true;
                returnVal = typesList[i];
                break;
            }
        }
        if (!b) {
            System.out.println("Please choose a valid data type: ");
            for (String type : typesList) {
                System.out.print(" " + type);
            }
            System.out.println();
            String additionalAttempt = sc.next().trim();
            returnVal = getType(additionalAttempt);
        }
        //System.out.println("returnVal: " + returnVal);
        return returnVal;

    }

    public static ArrayList<? extends Object> createArrayList(String var) {
        if (var.equals("short")) {
            return new ArrayList<Short>();
        } else if (var.equals("int")) {
            return new ArrayList<Integer>();
        } else if (var.equals("integer")) {
            return new ArrayList<Integer>();
        } else if (var.equals("long")) {
            return new ArrayList<Long>();
        } else if (var.equals("float")) {
            return new ArrayList<Float>();
        } else if (var.equals("double")) {
            return new ArrayList<Double>();
        } else if (var.equals("boolean")) {
            return new ArrayList<Boolean>();
        } else if (var.equals("char")) {
            return new ArrayList<Character>();
        } else if (var.equals("string")) {
            return new ArrayList<String>();
        } else if (var.equals("date")) {
            return new ArrayList<Date>();
        } else if (var.equals("object")) {
            return new ArrayList<>();
        }
        System.out.println("An arrayList containing the " + var + " data type");
        return new ArrayList<>();
    }

    public static long dataAddQuery() {
        System.out.println("Would you like to add items?: ");
        String choice = sc.next().trim().toLowerCase();
        long i = 0;
        if (choice.equals("yes".toLowerCase()) || choice.equals("y".toLowerCase())) {
            System.out.println("How many items?");
            String answer = sc.next().trim().toLowerCase();
            //check if input is a valid numerical value
            String stringNumber = "";
            boolean numStatus = false;
            for (int j = 0; j < answer.length(); j++) {
                if (Character.isDigit(answer.charAt(j))) {
                    numStatus = true;
                } else {
                    numStatus = false;
                }
            }
            //convert string representation of valid number value to long data type
            if (numStatus) {
                i = Long.parseLong(answer);
            } else {
                System.out.println("invalid value entry: " + answer);
            }
        } else if (choice.equals("no".toLowerCase()) || choice.equals("n".toLowerCase())) {
            System.out.println("Good bye");
        } else {
            System.out.println("Please enter yes/y or no/n");
            dataAddQuery();
        }
        System.out.println("number of items: " + i);
        return i;
    }


    public static void addPrompt(String dataType, ArrayList arrList ) {
        System.out.println("Would you like to add items to " + arrList +"?");
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
