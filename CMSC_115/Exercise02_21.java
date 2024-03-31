/*
Chapter 2: Programming Project 5
1 try left
(Financial application: calculate future investment value)
Write a program that reads in investment amount, annual interest rate, and number of years, and displays the future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12)
For example, if you enter amount 1000.56, annual interest rate 4.25%, and number of years 1, the future investment value is 1043.92.
Sample Run
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Future value is $1043.92
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Exercise02_21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an investment amount: ");
        double investmentAmount = in.nextDouble();
        System.out.print("Enter an annual interest rate: ");
        double annualInterestRate = in.nextDouble();
        annualInterestRate *= .01;
        System.out.print("Enter a number of years: ");
        double numberOfYears = in.nextDouble();
        double monthlyInterestRate = annualInterestRate/12;
        double calcOne = 1 + monthlyInterestRate;
        double calcTwo = numberOfYears * 12;

        double futureInvestmentValue = investmentAmount * (Math.pow(calcOne, calcTwo));
        BigDecimal futureIV = new BigDecimal(futureInvestmentValue).setScale(2, RoundingMode.DOWN);

        System.out.print("Future value is $" + futureIV);
    }



}
