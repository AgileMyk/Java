package Exercise_11_14;

//NEXT:
// ADD POPULATE CREATED ARRAY METHODS
// CHECK IF ARRAYS COMPATIBLE METHOD
// COMBINE ARRAYS AND RETURN NEW ARRAY

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

        String lengthOfArray = dataAddQuery();
        System.out.println("your array: " + arrList1);
        System.out.println("length:" + lengthOfArray);
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
            System.out.println("you have created an ArrayList containing shorts(wrapped as Short) ");
            return new ArrayList<Short>();
        } else if (var.equals("int")) {
            System.out.println("you have created an ArrayList containing int(wrapped as Integer) ");
            return new ArrayList<Integer>();
        } else if (var.equals("integer")) {
            System.out.println("you have created an ArrayList containing Integers) ");
            return new ArrayList<Integer>();
        } else if (var.equals("long")) {
            System.out.println("you have created an ArrayList containing long(wrapped as Long) ");
            return new ArrayList<Long>();
        } else if (var.equals("float")) {
            System.out.println("you have created an ArrayList containing float(wrapped as Float) ");
            return new ArrayList<Float>();
        } else if (var.equals("double")) {
            System.out.println("you have created an ArrayList containing double(wrapped as Double) ");
            return new ArrayList<Double>();
        } else if (var.equals("boolean")) {
            System.out.println("you have created an ArrayList containing booleans");
            return new ArrayList<Boolean>();
        } else if (var.equals("char")) {
            System.out.println("you have created an ArrayList containing chars");
            return new ArrayList<Character>();
        } else if (var.equals("string")) {
            System.out.println("you have created an ArrayList containing strings");
            return new ArrayList<String>();
        } else if (var.equals("date")) {
            System.out.println("you have created an ArrayList containing Dates");
            return new ArrayList<Date>();
        } else if (var.equals("object")) {
            System.out.println("you have created an ArrayList containing objects");
            return new ArrayList<>();
        }
        System.out.println("An arrayList containing the " + var + " data type");
        return new ArrayList<>();
    }

    public static String dataAddQuery() {
        String answer = "";
        System.out.println("Would you like to add items? ");
        String choice = sc.next().trim().toLowerCase();
        if (choice.equals("yes".toLowerCase()) || choice.equals("y".toLowerCase())) {
            System.out.println("How many items?");
            answer = sc.next().trim().toLowerCase();


            //check if input is a valid numerical value
            boolean numStatus = false;
            for (int j = 0; j < answer.length(); j++) {
                if (Character.isDigit(answer.charAt(j)) && !answer.contains(".")) {
                    numStatus = true;
                } else {
                    numStatus = false;
                }
            }
            //convert string representation of valid number value to long data type

                if (numStatus) {
                    return answer;
                } else {
                    System.out.println("""
                            Please ensure your answer is a whole number
                            Let's begin again
                            """);
                    answer = dataAddQuery();
                }
            } else if (choice.equals("no".toLowerCase()) || choice.equals("n".toLowerCase())) {
            System.out.println("Good bye");
        } else {
            System.out.println("Please enter yes/y or no/n");
            dataAddQuery();
        }
        return answer;
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
