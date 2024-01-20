import java.util.Scanner;
public class ProcessingStrings2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length() / 2 + s.length() % 2 - 1;
        System.out.println(s.length() % 2 - 1);
        System.out.println("n is: "+n);
        System.out.print("(0,n): " + s.substring(0,n));
        System.out.println(s.substring(s.length() - n));
        System.out.println(s.substring(0, n) + s.substring(s.length() - n));

    }
}
