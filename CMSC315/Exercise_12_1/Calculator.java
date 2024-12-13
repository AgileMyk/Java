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

              Scanner in = new Scanner(System.in);

              System.out.println("""
                      We are going to perform some calculations.
                      Please enter a series of values, alternating between integer operators
                      and operands. The result will show.
                      -----
                      Type 's' or 'stop' to stop the entering of values.""");
              String input = in.nextLine();
              System.out.println(input);
              char[] allInputs = input.toCharArray();
              ArrayList<String> OperatorInputs = new ArrayList<>();
              ArrayList<String> OperandInputs = new ArrayList<>();
              int total = 0;
              int count = 0;
              for (char ele: allInputs) {
                  if (String.valueOf(ele).matches(OPERATORS[0]) ||
                      String.valueOf(ele).matches(OPERATORS[1]) ||
                      String.valueOf(ele).matches(OPERATORS[2]) ||
                      String.valueOf(ele).matches(OPERATORS[3])) {
                      OperatorInputs.add(String.valueOf(ele));
                  } else if (String.valueOf(ele).matches("\\d")) {
                      OperandInputs.add(String.valueOf(ele));
                  }
                  /*

                  ) && count == 0) {
                      total = Integer.parseInt(ele);
                      count++;

                  } else if (ele.matches(OPERATORS[0]) ||
                             ele.matches(OPERATORS[1]) ||
                             ele.matches(OPERATORS[2]) ||
                             ele.matches(OPERATORS[3])) {
                      OperatorInputs.add(ele);
                  } else if (ele.matches("\\d") && count != 0) {
                      OperatorInputs.add(ele);
                  } else {
                      System.out.println("The input " + ele + " is invalid. Skipping to next input");
                  }
                  for (String s : OperatorInputs) {
                      System.out.print(s + " ");
                  }
                  for (String s : OperandInputs) {
                      System.out.print(s + " ");
                  }
                  */
              }
              /*

              //Scanner in = new Scanner(Arrays.toString(userInput.toArray()));
              Scanner in = new Scanner(System.in);
              //checking if inputs were valid values/ integer or operator
              int total = 0;
              ArrayList<String> Operands = new ArrayList<>();
              ArrayList<String> Operators = new ArrayList<>();
              int i = 0;
              int j = 0;
              if (in.hasNext() && !in.next().equals(stopOne) || !in.next().equals(stopTwo)) {
                  if (in.next().equals(OPERATORS[0]) ||
                      in.next().equals(OPERATORS[1]) ||
                      in.next().equals(OPERATORS[2]) ||
                      in.next().equals(OPERATORS[3])) {
                      Operands.add(in.next());
                      System.out.println("entered value: " + Operands.get(i));
                      System.out.println(Operands.get(i) + " added to Operands ArrayList");
                      i++;
                  } else if (in.nextInt() && !in.nextInt().equals(stopOne) || !in.next().equals(stopTwo)) {
                      Operands.add(in.next());
                      System.out.println("entered value: " + Operands.get(j));
                      System.out.println(Operands.get(j) + " added to Operands ArrayList");
                      j++;
                  }
              }

              for (String ele : userInput) {
                  if (ele.equals(OPERATORS[0]) ||
                          ele.equals(OPERATORS[1]) ||
                          ele.equals(OPERATORS[2]) ||
                          ele.equals(OPERATORS[3])) {
                      System.out.println(ele + " added to operands");
                      Operands.add(ele);
                  }
                  if (ele.matches("\\d")) {
                      System.out.println(ele + " added to operators");
                      Operators.add(ele);
                  }
              }
              //String tempTotal = Operands.getFirst();
              Operands.removeFirst();
              while (!Operators.isEmpty() && !Operands.isEmpty()) {
                    total = perCalcResult(String.valueOf(total), Operators.getFirst(), Operands.getFirst());
                    Operators.removeFirst();
                    Operands.removeFirst();
                    System.out.println(total);
              }
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
              /*
                 System.out.print("count: "+count);
                  if (in.next().equals(stopOne) || in.next().equals(stopTwo)) {
                      return;
                  }
                  //checks if invalid values (non operator/operand) are entered
                  if (!in.next().equals(OPERATORS[0]) ||
                      !in.next().equals(OPERATORS[1]) ||
                      !in.next().equals(OPERATORS[2]) ||
                      !in.next().equals(OPERATORS[3]) ||
                      !in.next().matches("[0-9]")) {
                      System.out.println("An invalid value was entered; either non-integer or non operator ");
                      return;
                    }
                  //error if an operator is entered at the wrong time
                  if (count % 2 == 0 && !in.next().equals(OPERATORS[0]) ||
                          !in.next().equals(OPERATORS[1]) ||
                          !in.next().equals(OPERATORS[2]) ||
                          !in.next().equals(OPERATORS[3])) {
                      System.out.print("""
                                        An operand was entered at the wrong time.
                                        Value entry should reflect the following patter:
                                        operand/operator/operand/operator, etc., not ending with an operator.""");
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
               */

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


