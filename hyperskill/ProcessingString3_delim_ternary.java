import java.util.Scanner;
public class ProcessingString3_delim_ternary {

    public static void main(String[]args) {

        String input = new Scanner(System.in).useDelimiter("\r\n").next();
        int length = input.length();
        int offset = length % 2 == 0 ? length / 2 - 1 : length / 2;
        System.out.println(input.substring(0, offset) + input.substring(length / 2 + 1));
    }

}
