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
        String str = "";
        System.out.println("Enter a binary string: ");
        try {
            str = in.next();
            bin2Dec(str);
        } catch (BinaryFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Result: "+ str);
    }

    public static void bin2Dec(String s) throws BinaryFormatException {
        char[] c = s.toCharArray();
        for (char ele : c) {
            if (ele == '0' || ele == '1') {

            } else {
                throw new BinaryFormatException(s);
            }
        }

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
