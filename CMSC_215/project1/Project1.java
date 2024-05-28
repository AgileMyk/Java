/*
Michael Hall
Programming Project 1
5-23-24
Project1 class for testing player/Height classes
continuously prompt user for player information, adding each to a Player array
average player age is calculated
tallest player whose age is less than or equal to the average age of all players is found
 */
package project1;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {

    //As the players are read in, the total age of all players should be computed to enable the average to be
    //calculate once all have been input
    static Scanner in = new Scanner(System.in);
    static int totalAges = 0;
    static int count = 0;
    static int averageAge = 0;
    static void updateAges(int val) {
        totalAges += val;
        count++;
    }
    static void calcAvgAge() {
        averageAge = totalAges / count;
    }
    static boolean continueBoolean = true;
    static void Playerprompt() {
        System.out.println("Would you like to enter another player? (y/n)");
    }
    static void loopDeterminant() {
        String response = in.next();
        if     (response.equalsIgnoreCase("y") ||
                response.equalsIgnoreCase("n")) {

            if (response.equalsIgnoreCase("n")) {
                continueBoolean = false;
            }
        } else {
            System.out.println("Valid entries include n/N/y/Y");
            loopDeterminant();
        }
    }
    public static void main(String[] args) {

        ArrayList<Player> Players = new ArrayList<>();

        System.out.print("Let's create all of our players. \nPlease enter player details:\n");
        //The third class Project1 should repeatedly prompt the user for the information for each of the
        //players
        while (continueBoolean == true) {
            System.out.print("Name: ");
            String currentName = in.next();
            System.out.printf("What is %s's age? ", currentName);
            int currentAge = in.nextInt();
            updateAges(currentAge);
            in.nextLine();
            System.out.print("""
                    You may enter the height in one of two formats:
                    a single number representing total height in inches 
                         OR
                    two numbers separated by a space; the 1st representing feet, the 2nd representing inches: \t""");
            //determines if two numbers were input via a separation space
            //consume prior nextLine remainders
            String heightRep = in.nextLine();
            //create height object with two values as input, first feet and second inches
            if (heightRep.length() > 1 && heightRep.indexOf(" ") == 1) {
                String[] heights = heightRep.split(" ");


                //convert first String array element to int feet
                int currentFeet = Integer.parseInt(heights[0]);
                //convert second String array element to int inches
                int currentInches = Integer.parseInt(heights[1]);

                Height currentHeight = new Height(currentFeet, currentInches);
                //It should create a Player object for each player and add the player to an ArrayList.
                Player currentPlayer = new Player(currentName, currentAge, currentHeight);
                Players.add(currentPlayer);
                System.out.println("Player added: " + currentPlayer);
                for (Player thisPlayer: Players) {
                    System.out.println(thisPlayer);
                }
                Playerprompt();
                loopDeterminant();
            } else if (heightRep.length() > 1 && heightRep.matches("\\d{2}")) {
                //create height object with single input value in total inches
                //currently no player breaks into three-digit inches range in height

                Height currentHeight = new Height(Integer.parseInt(heightRep));
                //It should create a Player object for each player and add the player to an ArrayList.
                Player currentPlayer = new Player(currentName, currentAge, currentHeight);
                Players.add(currentPlayer);
                System.out.println("Player added: " + currentPlayer);
                for (Player thisPlayer: Players) {
                    System.out.println(thisPlayer);
                }
                Playerprompt();
                loopDeterminant();
            } else {
                //create height object with input of one even-feet value
                int currentFeet = Integer.parseInt(heightRep);
                Height currentHeight = new Height(currentFeet);
                //It should create a Player object for each player and add the player to an ArrayList.
                Player currentPlayer = new Player(currentName, currentAge, currentHeight);
                Players.add(currentPlayer);
                System.out.println("Player added: " + currentPlayer);
                for (Player thisPlayer: Players) {
                    System.out.println(thisPlayer);
                }
                Playerprompt();
                loopDeterminant();
            }
        }
    }
}
