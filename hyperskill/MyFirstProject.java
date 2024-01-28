import java.util.Scanner;

/*
STEP 1: Description
You've recently opened a new corner shop. It is relatively small; it contains only a bubblegum, toffee,
ice cream, milk chocolate, doughnuts, and pancakes. The first version of the program will display a
list of all the products with their prices.
 */

public class MyFirstProject {


    public enum flavors {
        BUBBLEGUM("Bubble Gum", 202),
        TOFFEE("Toffee", 118),
        ICECREAM("Ice cream", 2250),
        MILKCHOCOLATE("Milk chocolate", 1680),
        DOUGHNUT("Doughnut", 1075),
        PANCAKE("Pancake", 80);

        private String name;
        private int spent;

        flavors(String name, int spent) {
            this.name = name;
            this.spent = spent;
        }
    }


    public static int total() {
        int total = 0;
        System.out.println("Earned amount:");
        for (flavors flavor : flavors.values()) {
            total += flavor.spent;
            System.out.println(flavor.name + ": $" + flavor.spent);
        }
        System.out.print("Income: $");
        return total;
    }


    public static void main(String[] args) {

        flavors Bubblegum = flavors.BUBBLEGUM;

        //variables

        firstProjectProductPrices bubblegum = firstProjectProductPrices.BUBBLEGUM;
        firstProjectProductPrices toffee = firstProjectProductPrices.TOFFEE;
        firstProjectProductPrices iceCream = firstProjectProductPrices.ICE_CREAM;
        firstProjectProductPrices milkChocolate = firstProjectProductPrices.MILK_CHOCOLATE;
        firstProjectProductPrices doughnut = firstProjectProductPrices.DOUGHNUT;
        firstProjectProductPrices pancake = firstProjectProductPrices.PANCAKE;

        firstProjectProductPrices flavor1 = bubblegum;
        firstProjectProductPrices flavor2 = toffee;
        firstProjectProductPrices flavor3 = iceCream;
        firstProjectProductPrices flavor4 = milkChocolate;
        firstProjectProductPrices flavor5 = doughnut;
        firstProjectProductPrices flavor6 = pancake;


        total();


        /*
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "Prices: ",
                "Bubblegum: $2",
                "Toffee: $0.2",
                "Ice cream: $5",
                "Milk Chocolate: $4",
                "Doughnut: $2.5",
                "Pancake: $3.2");
         */


        }

  /*
    public static float calcEarning() {
        Scanner in = new Scanner(System.in);
        int total = 0;
        for (firstProjectProductPrices flavor : firstProjectProductPrices.values()) {
            System.out.printf("What were the earnings on %s?%n", flavor.name().toLowerCase());
            total += in.nextInt();
        }
        System.out.print("Income: $");
        return total;
    }
   */

    //print out enum converted to Array
    public static <E extends Enum<E>> void enumArrayer(E[] values) {
        System.out.println(java.util.Arrays.asList(values));
    }

}
