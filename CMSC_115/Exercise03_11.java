/*
Chapter 3: Programming Project 3
1 try left
(Find the number of days in a month)
Write a program that prompts the user to enter the month and year and displays the number of days in the month.
For example,
If the user entered month 2 and year 2012, the program should display that February 2012 has 29 days.
If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.
Sample Run 1
Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2012
February 2012 has 29 days
Sample Run 2
Enter a month in the year (e.g., 1 for Jan): 4
Enter a year: 2005
April 2005 has 30 days
Sample Run 3
Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2006
February 2006 has 28 days
Sample Run 4
Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2000
February 2000 has 29 days
 */

import java.util.Scanner;
public class Exercise03_11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a month in the year (e.g., 1 for Jan):");
        int month = in.nextInt();
        System.out.print("Enter a year:");
        int year = in.nextInt();
        String returnMonth = "";
        int returnDay = 0;

        switch (month) {
            case 1 -> {returnMonth = "January"; returnDay = 31;}
            case 2 -> returnMonth = "February";
            case 3 -> {returnMonth = "March"; returnDay = 31;}
            case 4 -> {returnMonth = "April"; returnDay = 30;}
            case 5-> {returnMonth = "May"; returnDay = 31;}
            case 6 -> {returnMonth = "June"; returnDay = 30;}
            case 7 -> {returnMonth = "July"; returnDay = 31;}
            case 8 -> {returnMonth = "August"; returnDay = 31;}
            case 9 -> {returnMonth = "September"; returnDay = 30;}
            case 10 -> {returnMonth = "October"; returnDay = 31;}
            case 11 -> {returnMonth = "November"; returnDay = 30;}
            case 12 -> {returnMonth = "December"; returnDay = 31;}
            default -> {returnMonth = null; returnDay = 0;}
        }

        if ((year % 4 == 0 && year % 100 != 0 && month == 2) || (year % 400 == 0 && month == 2)) {
            returnDay = 29;
        } else if (!(year % 4 == 0 && year % 100 != 0) && month == 2 || !(year % 400 == 0) && month == 2){
            returnDay = 28;
        }

        if (returnMonth == null || returnDay == 0) {
            System.out.println("An invalid entry was made for year and/or month. Nothing to return.");
        }

        System.out.printf("%s %s has %d days", returnMonth, year, returnDay);
    }
}
