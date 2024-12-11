package Exercise_12_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

            final static String stopOne = "s".toLowerCase();
            final static String stopTwo = "stop".toLowerCase();
            final static String[] OPERATORS = {"+","-","/","*"};
  /** Main method */
          public static void main(String[] args) {
              // Check number of strings passed
              ArrayList<String> userInput = new ArrayList<>();

              System.out.println("""
                      We are going to perform some calculations.
                      Please enter a series of values, alternating between integer operators
                      and operands. The result will show.
                      -----
                      Type 's' or 'stop' to stop the entering of values.""");
              //Scanner in = new Scanner(Arrays.toString(userInput.toArray()));
              Scanner in = new Scanner(System.in);
              //checking if inputs were valid values/ integer or operator
              while (in.hasNext()) {
                  if (in.next().equals(stopOne) || in.next().equals(stopTwo)) {
                      System.exit(0);
                  }
                  if (!in.next().equals(OPERATORS[0]) ||
                      !in.next().equals(OPERATORS[1]) ||
                      !in.next().equals(OPERATORS[2]) ||
                      !in.next().equals(OPERATORS[3]) ||
                      !in.next().matches("[0-9]")) {
                      System.out.println("In invalid value was entered; either non-integer or non operator ");
                      return;
                    }
                  }
                  userInput.add(in.next());


              System.out.println(userInput);
              //check if last input is an operator and correct
              if (userInput.getLast().equals(OPERATORS[0]) ||
                      userInput.getLast().equals(OPERATORS[1]) ||
                      userInput.getLast().equals(OPERATORS[2]) ||
                      userInput.getLast().equals(OPERATORS[3])) {
                  userInput.removeLast();
                  System.out.println("""
                          The last input entered was not legal; an operator instead of an operand -
                          removing last input and calculating as if last input was not an operand""");
              }
              //check if first input is an operator and correct
              if (userInput.getFirst().equals(OPERATORS[0]) ||
                      userInput.getFirst().equals(OPERATORS[1]) ||
                      userInput.getFirst().equals(OPERATORS[2]) ||
                      userInput.getFirst().equals(OPERATORS[3])) {
                  userInput.removeFirst();
                  System.out.println("""
                          The last input entered was not legal; an operator instead of an operand -
                          removing last input and calculating as if last input was not an operand""");
              }

/*
              if (args.length != 3) {
             System.out.println(
                     "Usage: java Calculator operand1 operator operand2");
             System.exit(0);
             }

         // The result of the operation
         int result = 0;

         // Determine the operator
         switch (args[1].charAt(0)) {
             case '+': result = Integer.parseInt(args[0]) +
                     Integer.parseInt(args[2]);
                 break;
             case '-': result = Integer.parseInt(args[0]) -
                     Integer.parseInt(args[2]);
                 break;
             case '.': result = Integer.parseInt(args[0]) *
                     Integer.parseInt(args[2]);
                 break;
             case '/': result = Integer.parseInt(args[0]) /
                     Integer.parseInt(args[2]);
                 }

         // Display result
         System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                 + " = " + result);

 */
          }
    public static int perCalcResult(String first, String second, String third) {
            if (second.equals(OPERATORS[0])) {
                return Integer.parseInt(first) + Integer.parseInt(third);
            } else if (second.equals(OPERATORS[1])) {
                return Integer.parseInt(first) - Integer.parseInt(third);
            } else if (second.equals(OPERATORS[2])) {
                return Integer.parseInt(first) / -Integer.parseInt(third);
            } else if (second.equals(OPERATORS[3])) {
                return Integer.parseInt(first) * -Integer.parseInt(third);
            } else {
                System.out.println("There was an error with operator placement; exiting");
                return 0;
            }
    }
 }


