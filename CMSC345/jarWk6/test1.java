package jarWk6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test1 {
//
    static String equalsInBG() {
        return " \u001b[43mequals\u001b[0m ";
    }

    static String doesNotEqualInBG() {
        return " \u001b[43mdoes not equal\u001b[0m ";
    }

    static String expextedlLabel() {
        return "Expected:";
    }

    public static void main(String[] args) throws ParseException {

        //date test
        System.out.println("var1");
        long var1 = (new SimpleDateFormat("MMM dd, yyyy")).parse("feb 7, 2025").getTime();
        System.out.println("var3");
        long var3 = (new SimpleDateFormat("MMM dd, yyyy")).parse("feb 14, 2025").getTime();
        long resOther = var3 - var1;
        long reservationNumberOfDays = (var3 - var1) / 8640000L;
        System.out.println("res num:" + reservationNumberOfDays);
        //ERROR
        System.out.println("res num2:" + (var3 - var1) / 86400000L);
        System.out.println("res num4:" + (var3 - var1) % 86400000L);
        //CORRECT
        System.out.println("res num3:" + (resOther) / 86400000L);
        System.out.println((var3 - var1) / 86400000L);

        String ANSI_RED = "\u001b[31m";
        String ANSI_BLACK = "\u001b[30m";
        String ANSI_WHITE = "\u001b[37m";
        String ANSI_BG_RED = "\u001b[41m";
        String ANSI_BG_GREEN = "\u001b[42m";
        String ANSI_BG_CYAN = "\u001b[46m";
        String ANSI_BG_YELLOW = "\u001b[43m";
        String ANSI_RESET = "\u001b[0m";
        System.out.println("red:");
        System.out.println(ANSI_RED);
        System.out.println("black:");
        System.out.println(ANSI_BLACK);
        System.out.println("white:");
        System.out.println(ANSI_WHITE);
        System.out.println("bg-red:");
        System.out.println(ANSI_BG_RED);
        System.out.println("bg-green:");
        System.out.println(ANSI_BG_GREEN);
        System.out.println("bg-cyan:");
        System.out.println(ANSI_BG_CYAN);
        System.out.println("bg-yellow:");
        System.out.println(ANSI_BG_YELLOW);
        System.out.println("reset:");
        System.out.println(ANSI_RESET);

        double var0 = 5.5;
        double var2 = 5.5;

        System.out.println("Actual" + var0 + equalsInBG() + expextedlLabel() + var2);


        System.out.println(equalsInBG());
        System.out.println(doesNotEqualInBG());
    }
}
