package Chapter_13;
/*
*13.4 (Display calendars) Rewrite the PrintCalendar class in Listing 6.12
to display a calendar for a specified month using the Calendar and
GregorianCalendar classes. Your program receives the month and year from
the command line. For example:
java Exercise13_04 5 2016
*
*           Month, Year
* -------------------------------
* Sun Mon Tue Wed Thu Fri Sat Sun
*   1   2   3   4   5   6   7   8
*  ..
* Figure 13.9
The program displays a calendar for May 2016.
You can also run the program without the year. In this case, the year is the
current year. If you run the program without specifying a month and a year, the
month is the current month.
 */
import java.util.Scanner;

public class Ex4 {

    public class PrintCalendar {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter full year (e.g., 2012): ");
            int year = input.nextInt();
            System.out.print("Enter month as a number between 1 and 12:");
            int month = input.nextInt();
            printMonth(year, month);
            }
        public static void printMonth(int year, int month) {
            printMonthTitle(year, month);
            printMonthBody(year, month);
        }
        public static void printMonthTitle(int year, int month) {
            System.out.println(" " + getMonthName(month) + " " + year);
            System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
             }
        public static String getMonthName(int month) {
            return switch (month) {
                case 1 -> "January";
                case 2 -> "February";
                case 3 -> "March";
                case 4 -> "April";
                case 5 -> "May";
                case 6 -> "June";
                case 7 -> "July";
                case 8 -> "August";
                case 9 -> "September";
                case 10 -> "October";
                case 11 -> "November";
                case 12 -> "December";
                default -> "";
            };
        }
        public static void printMonthBody(int year, int month) {
            int startDay = getStartDay(year, month);
            int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
            int i; for (i = 0; i < startDay; i++)
                System.out.print(" ");
            for (i = 1; i <= numberOfDaysInMonth; i++) {
                    System.out.printf("%4d", i);
                    if ((i + startDay) % 7 == 0)
                        System.out.println();
                    }
                System.out.println();
        }
        public static int getStartDay(int year, int month) {
            final int START_DAY_FOR_JAN_1_1800 = 3;
            int totalNumberOfDays = getTotalNumberOfDays(year, month);
            return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
        }
        public static int getTotalNumberOfDays(int year, int month) {
            int total = 0;
            for (int i = 1800; i < year; i++)
                if (isLeapYear(i))
            total = total + 366;
                else
            total = total + 365;
            for (int i = 1; i < month; i++)
                total = total + getNumberOfDaysInMonth(year, i);
            return total;
            }
        public static int getNumberOfDaysInMonth(int year, int month) {
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12)
                return 31;
            if (month == 4 || month == 6 || month == 9 || month == 11)
                return 30;
            if (month == 2) return isLeapYear(year) ? 29 : 28;
            return 0; // If month is incorrect
            }
        public static boolean isLeapYear(int year) {
            return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
             }
    }
}
