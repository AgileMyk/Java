package Chapter_13;

/*
(Convert decimals to fractions) Write a program that prompts the user to
enter a decimal number and displays the number in a fraction. (Hint: read the
decimal number as a string, extract the integer part and fractional part from
the string, and use the BigInteger implementation of the Rational class in
Programming Exercise 13.15 to obtain a rational number for the decimal
number.) Here are some sample runs:

Enter a decimal number: 3.25 -->ENTER
The fraction number is 13/4

Enter a decimal number: –0.45452 -->ENTER
The fraction number is –11363/25000

 */
import Chapter_13.Ex15.Rational;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a decimal number: ");
            String value = in.next().trim();

            //set integer and decimal values in array for retrieval
            String[] values = new String[2];
            values[0] = value.split("\\.")[0];
            values[1] = value.split("\\.")[1];

            //pass decimal value to conversion method
            convertValue(values[1]);
    }

    public static Rational convertValue(String s) {
        //determine size of multiplier for fraction value
        StringBuilder multiplier = new StringBuilder("1");
        int zeros = s.length();
        multiplier.append("0".repeat(zeros));
        String sMultiplier = multiplier.toString();
        //create fraction representation via BigInteger  --> String s/1
        Rational r1 = new Rational(new BigInteger(s), new BigInteger("1"));
        //begin fraction conversion, multiplying String s/1 by the necessary multiplier
        return r1.multiply(new Rational(new BigInteger(sMultiplier), new BigInteger(sMultiplier)));
    }
    public static void requestDecimal() {
        String result = "";
        System.out.printf("The fraction number is %s", result);
    }

}
