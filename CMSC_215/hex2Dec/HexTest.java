/*
(NumberFormatException) Listing 6.8 implements the hex2Dec(String
hexString) method, which converts a hex string into a decimal number.
Implement the hex2Dec method to throw a NumberFormatException if the
string is not a hex string. Write a test program that prompts the
user to enter a hex number as a string and displays its decimal
equivalent. If the method throws an exception, display "Not a hex
number."
 */
package hex2Dec;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.StreamSupport;

public class HexTest {
    //for more efficient reuse
    //re-occurring regex instantiated as compiled pattern class
    final static Pattern hex = Pattern.compile("[0-9A-Fa-f]");
    final static String hexaDecValues = "[0-9a-fA-F]";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter a hexadecimal value for conversion.");
        System.out.println("This value will be returned in its decimal (base 10) equivalent.");
        System.out.println("Enter your hexadecimal value here: ");
        String userInput = in.next();

        try {
            hex2Dec(userInput);
        } catch (NumberFormatException nfe) {
            System.out.println("Please try again. a Valid hexadecimal number contains values ranging from " +
                    "0 through 9 and A through F (or a through f): ");
            userInput = in.next();
            hex2Dec(userInput);
        } catch (IllegalArgumentException iae) {
            System.out.println("Enter a value of at least one length: ");
            userInput = in.next();
            hex2Dec(userInput);
        }
    }

    public static void hex2Dec(String input) throws NumberFormatException, IllegalArgumentException {
        //place this first and separate; if length test fails, saves calculation resources
        if (input.length() < 1)
            throw new IllegalArgumentException("Length must be at least 1 to be a valid input");

        //create Matcher object for matching any user input to the hexadecimal possible values
        Matcher m = hex.matcher(input);

        if (m.find()) {
            String digits = "0123456789ABCDEF";
            String invalidValues = "GHIJKLMNOPQRSTUVWXYZ";
            input = input.trim();
            input = input.toUpperCase();
            int val = 0;
            //check for invalid letter use
            for (int i = 0; i < input.length(); i++) {
                for (int j = 0; j < invalidValues.length(); j++) {
                    if (input.charAt(i) == invalidValues.charAt(j)) {
                        throw new NumberFormatException("Not a hex number.");
                    }
                }
            }
            //perform hexa to non-hexa conversion
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int d = digits.indexOf(c);
                val = 16*val + d;
            }
            System.out.println("The decimal value is: " + val);
        } else
            throw new NumberFormatException("Not a hex number.");
    }

}

