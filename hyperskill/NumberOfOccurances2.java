import java.util.Arrays;
import java.util.Objects;

public class NumberOfOccurances2 {


    public static void main(String[] args) {
        String stringVariable = null;
        String one = "test";
        String two = "test";
        String three = "fail";

        Objects.equals(one, two);
        Objects.equals(two, three);
        Objects.equals(one, three);


        if ("Abc".equals(stringVariable)) {
            System.out.println("yep");
        } else {
            System.out.println("nope");
        }

    }

    public static String toUpperCase(String str) {
        return str == null ? "" : str.toUpperCase();
    }

    public static int occCount(String s, String a) {
        int sLength = s != null ? s.length() : 0;
        int aLength = a != null ? a.length() : 0;


      /*
        while (s2.length > a.length()) {
        }
        for (int i = 0; i < s2.length; i++) {
            if (i + 1 % a.length() == 0) {
                StringBuilder temp = new StringBuilder();
                int count2 = a.length();
                while (count2 > 0) {
                    count2--;
                    temp.append(s.length() - count2);

                }
            }
        }
       */

        return 1;
    }
}


