package Exercise_12_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
  /** Main method */
          public static void main(String[] args) {
         // Check number of strings passed
              System.out.println(System.getProperty("CMSC315>Exercise_12_1.Calculator.class"));
              String[] operators = {"+","-","/","*"};
              ArrayList<String> userInput = new ArrayList<>(Arrays.asList(operators));
              Scanner in = new Scanner(Arrays.toString(args));

              while (in.hasNext()) {
                    userInput.add(in.next());
              }
              //check if last input is an operator and correct
              if (userInput.getLast().equals(operators[0]) ||
                      userInput.get(userInput.size() - 2).equals(operators[1]) ||
                      userInput.get(userInput.size() - 2).equals(operators[2]) ||
                      userInput.get(userInput.size() - 2).equals(operators[3])) {
                  userInput.removeLast();
                  System.out.println("""
                                      The last input entered was not legal; an operator instead of an operand
                                      removing last input and calculating as if last input was not an operand""");
              }
              //check if first input is an operator and correct
              if (userInput.getFirst().equals(operators[0]) ||
                      userInput.get(userInput.size() - 2).equals(operators[1]) ||
                      userInput.get(userInput.size() - 2).equals(operators[2]) ||
                      userInput.get(userInput.size() - 2).equals(operators[3])) {
                  userInput.removeFirst();
                  System.out.println("""
                                      The last input entered was not legal; an operator instead of an operand
                                      removing last input and calculating as if last input was not an operand""");
              }

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
         }
 }
