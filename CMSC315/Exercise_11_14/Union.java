package Exercise_11_14;

//NEXT:

//ALLOW FOR OBJECT ADDITION

/*
11.14 (Combine two lists) Write a method that returns the
union of two array lists of integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)

 */

import java.io.File;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Union {

    private static final String[] typesList = {"short", "int", "integer", "long", "float",
                                  "double", "boolean", "char", "string", "date", "object"};

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        File first = new File("Exercise_11_14","first.txt");

        System.out.println(first.getAbsolutePath());
        System.out.println("We are going to create two separate arraylists and combine them with a union method");
        System.out.println("You will be asked to choose a type from among the common data types in Java...");
                //"if you choose a primitive type, the resulting data type will be the associated wrapper object");

        //ask for arraylist with type
        String type1 = dataTypeQuery();

        //ensure answer associates with valid data type within final array of valid options
        String askedType = chooseType(type1);
        ArrayList arrList1 = createArrayListByType(askedType);
        String lengthOfArray1 = arrayPopulator();

        populateArray(lengthOfArray1, type1, arrList1);

        //ask for arraylist with type
        String type2 = dataTypeQuery();

        //ensure answer associates with valid data type within final array of valid options
        String askedType2 = chooseType(type2);
        ArrayList arrList2 = createArrayListByType(askedType2);
        String lengthOfArray2 = arrayPopulator();
        populateArray(lengthOfArray2, type2, arrList2);

        arrayUnion(arrList1, arrList2);

    }

    //cycles through available data types, testing against valid choices, returns valid chosen type
    public static String chooseType(String input) {
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
            returnVal = chooseType(additionalAttempt);
        }
        //System.out.println("returnVal: " + returnVal);
        return returnVal;

    }

    public static ArrayList<? extends Object> createArrayListByType(String var) {
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

    public static String arrayPopulator() {
        String answer = "";
        System.out.println("Would you like to add items? ");
        String choice = sc.next().trim();
        if (choice.equals("yes".toLowerCase()) || choice.equals("y".toLowerCase())) {
            System.out.println("How many items?");
            answer = sc.next().trim().toLowerCase();
            if (answer.contains("-")) {
                answer = answer.substring(1);
                System.out.println("an invalid value with a negative was given; answer changed to it's positive form: " + answer);
            }
            //check if input is a valid numerical value
            boolean numStatus = false;
            int value = Integer.parseInt(answer);

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
                    answer = arrayPopulator();
                }
            } else if (choice.equals("no".toLowerCase()) || choice.equals("n".toLowerCase())) {
            System.out.println("Good bye");
            //System.exit(0);
        } else {
            System.out.println("Please enter yes/y or no/n");
            answer = arrayPopulator();
        }

        return answer;
    }

    public static void fillArray(ArrayList l, String arrayType) {
        if (arrayType.equals(typesList[0])) { //short
            l.add(Short.parseShort(sc.next().trim()));
        } else if (arrayType.equals(typesList[1])
                || (arrayType.equals(typesList[2]))) { //int, integer
            l.add(Integer.parseInt(sc.next().trim()));
        } else if (arrayType.equals(typesList[3])) {  //long
            l.add(Long.parseLong(sc.next().trim()));
        } else if (arrayType.equals(typesList[4])) {
            l.add(Float.parseFloat(sc.next().trim()));
        } else if (arrayType.equals(typesList[5]))  { //decimal nums
            l.add(Double.parseDouble(sc.next().trim()));
        } else if (arrayType.equals(typesList[6])) { //boolean
            l.add(Boolean.parseBoolean(sc.next().trim()));
        } else if (arrayType.equals(typesList[7])) { //char
            l.add(Character.getNumericValue(sc.next().trim().charAt(0)));
        } else if (arrayType.equals(typesList[8])) { //string
            l.add(sc.next().trim());
        } else if (arrayType.equals(typesList[9])) {
            System.out.println("\nEnter year: ");
            int yr = sc.nextInt();
            System.out.println("Enter month: (in number format; 1-12)");
            int m = sc.nextInt();
            while (m < 1 || m > 12) {
                System.out.println("Invalid month (1-12)\nreenter month: ");
                m = sc.nextInt();
            }
            switch (m) {
                case 1:
                    m = Calendar.JANUARY;
                    break;
                case 2:
                m = Calendar.FEBRUARY;
                    break;
                    case 3:
                m = Calendar.MARCH;
                    break;
                    case 4:
                m = Calendar.APRIL;
                    break;
                    case 5:
                m = Calendar.MAY;
                    break;
                    case 6:
                m = Calendar.JUNE;
                    break;
                    case 7:
                m = Calendar.JULY;
                    break;
                    case 8:
                m = Calendar.AUGUST;
                    break;
                case 9:
                    m = Calendar.SEPTEMBER;
                    break;
                case 10:
                    m = Calendar.OCTOBER;
                    break;
                case 11:
                    m = Calendar.NOVEMBER;
                    break;
                case 12:
                    m = Calendar.DECEMBER;
                    break;
                default:
            }
            System.out.println("Enter day: ");
            int d = sc.nextInt();
            l.add(new Date(yr,m,d));
        } else if (arrayType.equals(typesList[10])) { //object
            //ADDRESS FOR INSERTING OBJECTS
        }
    }

    public static void populateArray(String arrayLength, String arrayType, ArrayList l) {
        if (Integer.parseInt(arrayLength) > 0) {
            int k = Integer.parseInt(arrayLength);
            System.out.printf("Let's populate the array with items of the %s type\n", arrayType);
            for (int i = 0; i < k; i++) {
                System.out.printf("please type a value of the type %s:  ", arrayType);
                //ADD
                fillArray(l, arrayType);
            }
        }
    }

    public static void arrayUnion(ArrayList l1, ArrayList l2) {
        ArrayList l = new ArrayList();
        l.addAll(l1);
        l.addAll(l2);
        System.out.println("Below is a listing of what is contained within the resulting merge of ArrayLists: ");
        for (Object o : l) {
            System.out.println(o);
        }
        //get type, make variable
        //compare both types
        //explain types don't match
        //convert one type to the other
        //unite arrays
        //return united array
    }

    public static String dataTypeQuery() {
        System.out.println("Please choose a data type:");
        return sc.next().trim().toLowerCase();
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
