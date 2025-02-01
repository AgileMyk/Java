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
            StringBuilder value = new StringBuilder(in.next().trim());
            if (value.charAt(0) == '.') {
                value.insert(0, "0");
            }
            System.out.print(value);

            //set integer and decimal values in array for retrieval
            String[] values = new String[2];
            //values[0] = value.split("\\.")[0];
            //values[1] = value.split("\\.")[1];
            //pass decimal value to conversion method
            requestDecimal(convertIntegerValue(values[0]), convertDecimalValue(values[1]));
    }

    public static Rational convertIntegerValue(String s) {
        System.out.println(new Rational(new BigInteger(s), BigInteger.ONE));
        return new Rational(new BigInteger(s), BigInteger.ONE);
    }
    public static Rational convertDecimalValue(String s) {
        //determine size of multiplier for fraction value
        StringBuilder multiplier = new StringBuilder("1");
        int zeros = s.length();
        multiplier.append("0".repeat(zeros));
        System.out.println("mult: " + multiplier);
        String sMultiplier = multiplier.toString();
        //create fraction representation via BigInteger  --> String s/1
        Rational r1 = new Rational(new BigInteger(s), new BigInteger("1"));
        //begin fraction conversion, multiplying String s/1 by the necessary multiplier
        System.out.println(new Rational(new BigInteger(s), new BigInteger(sMultiplier)));
        return r1.multiply(new Rational(new BigInteger(s), new BigInteger(sMultiplier)));
    }
    public static void requestDecimal(Rational r1, Rational r2) {
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.printf("The fraction number is %s", r1.add(r2));
    }

}
