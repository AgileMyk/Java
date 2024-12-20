package Exercise_12_7_12_9;/*
(NumberFormatException) Write the bin2Dec(String binaryString)
method to convert a binary string into a decimal number. Implement the
bin2Dec method to throw a NumberFormatException if the string is not a
binary string.
 */

import java.util.Scanner;

public class Exercise_12_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        double result = 0.0;
        System.out.println("Enter a binary string: ");
        try {
            str = in.nextLine();
            result = bin2Dec(str);
        } catch (BinaryFormatException e) {
            System.out.println("Invalid entry; non binary string");
        }
        System.out.println("Result: "+result);
    }

    public static double bin2Dec(String s) throws BinaryFormatException {
        double val = 0.0;
        char[] c = s.toCharArray();
        for (char value : c) {
            if (value == '1' || value == '0') {
                throw new BinaryFormatException(s);
            }
        }
        return val;
    }

 /*
    public static int numFrombinary(String str){
        double j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '1'){
                j=j+ Math.pow(2,str.length()-1-i);
            }

        }
        return (int) j;
    }
  */
}
