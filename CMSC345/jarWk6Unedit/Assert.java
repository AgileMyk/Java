package jarWk6Unedit;

import java.io.PrintStream;
import java.util.Date;
import java.util.UUID;

public class Assert {
    private static final String ANSI_RED = "\u001b[31m";
    private static final String ANSI_BLACK = "\u001b[30m";
    private static final String ANSI_WHITE = "\u001b[37m";
    private static final String ANSI_BG_RED = "\u001b[41m";
    private static final String ANSI_BG_GREEN = "\u001b[42m";
    private static final String ANSI_BG_CYAN = "\u001b[46m";
    private static final String ANSI_BG_YELLOW = "\u001b[43m";
    private static final String ANSI_RESET = "\u001b[0m";

    public static void assertEqualsDouble(double var0, double var2) {
        PrintStream var10000;
        String var10001;
        if (Double.compare(var0, var2) == 0) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var2 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var2 + " " + fail());
        }

    }

    public static void assertNotEqualsDouble(double var0, double var2) {
        PrintStream var10000;
        String var10001;
        if (Double.compare(var0, var2) != 0) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var2 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var2 + " " + fail());
        }

    }

    public static void assertEqualsInt(int var0, int var1) {
        PrintStream var10000;
        String var10001;
        if (var0 == var1) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertNotEqualsInt(int var0, int var1) {
        PrintStream var10000;
        String var10001;
        if (var0 != var1) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertEqualsLong(Long var0, Long var1) {
        PrintStream var10000;
        String var10001;
        if (var0.equals(var1)) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertNotEqualsLong(Long var0, Long var1) {
        PrintStream var10000;
        String var10001;
        if (!var0.equals(var1)) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertEqualsString(String var0, String var1) {
        PrintStream var10000;
        String var10001;
        if (var0.equals(var1)) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertNotEqualsString(String var0, String var1) {
        PrintStream var10000;
        String var10001;
        if (!var0.equals(var1)) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertEqualsDate(Date var0, Date var1) {
        PrintStream var10000;
        String var10001;
        if (var0.compareTo(var1) == 0) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertNotEqualsDate(Date var0, Date var1) {
        PrintStream var10000;
        String var10001;
        if (var0.compareTo(var1) != 0) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertEqualsUUID(UUID var0, UUID var1) {
        PrintStream var10000;
        String var10001;
        if (var0.equals(var1)) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    public static void assertNotEqualsUUID(UUID var0, UUID var1) {
        PrintStream var10000;
        String var10001;
        if (!var0.equals(var1)) {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + doesNotEqualInBG() + expextedlLabel() + var1 + " " + pass());
        } else {
            var10000 = System.out;
            var10001 = actualLabel();
            var10000.println(var10001 + var0 + equalsInBG() + expextedlLabel() + var1 + " " + fail());
        }

    }

    private static String actualLabel() {
        return "Actual:";
    }

    private static String expextedlLabel() {
        return "Expected:";
    }

    private static String equalsInBG() {
        return " \u001b[43mequals\u001b[0m ";
    }

    private static String doesNotEqualInBG() {
        return " \u001b[43mdoes not equal\u001b[0m ";
    }

    private static String pass() {
        return " \u001b[30m\u001b[42mPASS\u001b[0m ";
    }

    private static String fail() {
        return " \u001b[37m\u001b[41mFAIL\u001b[0m ";
    }
}
