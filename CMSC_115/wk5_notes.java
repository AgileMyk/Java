import java.util.Scanner;
public class wk5_notes {

    static int target = (int) Math.ceil(Math.random() * 25);

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter a number between 1 and 25: ");
        int guess = in.nextInt();
        while (guess != target) {
            String response = guess < target ? "too low\n" : "too high\n";
            System.out.printf(response);
            guess = in.nextInt();
        }
        System.out.printf("yep! the answer was %d", target);
    }
}

class guess {

}
