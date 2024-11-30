/*
(Algebra: perfect square) Write a program that prompts the user to enter an integer m and
find the smallest integer n such that m * n is a perfect square. (Hint:
Store all smallest factors of m into an array list. n is the product of the factors that
appear an odd number of times in the array list. For example, consider m = 90,
store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
in the array list. So, n is 10.) Here are sample runs:

Enter an integer m: 1500
The smallest number n for m * n to be a perfect square is 15
m * n is 22500
Enter an integer m: 63
The smallest number n for m * n to be a perfect square is 7
m * n is 441
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise_11_17 {
    public static ArrayList<Integer> factors = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                The following exercise will find the smallest perfect square,
                based on an integer value that you give.""");
        int m = in.nextInt();
        findAllFactors(m);
        for (int ele: factors) {
            System.out.println(ele);
        }
    }

    public static ArrayList<Integer> findAllFactors(int i) {
        int temp = 2;
        int temp2 = 2;
        int temp3 = 2;
        if (i % 2 == 0) {
            factors.add(2);
            temp = temp /2;
            findAllFactors(temp);
        } else if (i % 3 == 0) {
            factors.add(3);
            temp = temp /3;
            findAllFactors(temp);
        } else if (i % 5 == 0) {
            factors.add(5);
            temp = temp /5;
            findAllFactors(temp);
        } else if (i % 7 == 0) {
            factors.add(7);
            temp = temp /7;
            findAllFactors(temp);
        } else if (i % 11 == 0) {
            factors.add(11);
            temp = temp /11;
            findAllFactors(temp);
        } else if (i % 13 == 0) {
            factors.add(13);
            temp = temp /13;
            findAllFactors(temp);
        } else if (i % 17 == 0) {
            factors.add(17);
            findAllFactors(temp);
        } else if (i % 19 == 0) {
            factors.add(19);
            temp = temp /19;
            findAllFactors(temp);
        } else if (i % 23 == 0) {
            factors.add(23);
            temp = temp /23;
            findAllFactors(temp);
        } else if (i % 29 == 0) {
            factors.add(29);
            temp = temp /29;
            findAllFactors(temp);
        } else if (i % 31 == 0) {
            factors.add(31);
            temp = temp /31;
            findAllFactors(temp);
        } else if (i % 37 == 0) {
            factors.add(37);
            temp = temp /37;
            findAllFactors(temp);
        } else if (i % 43 == 0) {
            factors.add(43);
            temp = temp /43;
            findAllFactors(temp);
        } else if (i % 47 == 0) {
            factors.add(47);
            temp = temp /47;
            findAllFactors(temp);
        } else if (i % 53 == 0) {
            factors.add(53);
            temp = temp /53;
            findAllFactors(temp);
        } else if (i % 59 == 0) {
            factors.add(59);
            temp = temp /59;
            findAllFactors(temp);
        } else if (i % 61 == 0) {
            factors.add(61);
            temp = temp /61;
            findAllFactors(temp);
        } else if (i % 67 == 0) {
            factors.add(67);
            temp = temp /67;
            findAllFactors(temp);
        } else if (i % 71 == 0) {
            factors.add(71);
            temp = temp /71;
            findAllFactors(temp);
        } else if (i % 79 == 0) {
            factors.add(79);
            temp = temp /79;
            findAllFactors(temp);
        } else if (i % 83 == 0) {
            factors.add(83);
            temp = temp /83;
            findAllFactors(temp);
        } else if (i % 89 == 0) {
            factors.add(89);
            temp = temp /89;
            findAllFactors(temp);
        } else if (i % 91 == 0) {
            factors.add(91);
            temp = temp /91;
            findAllFactors(temp);
        } else if (i % 97 == 0) {
           factors.add(97);
           temp = temp /97;
            findAllFactors(temp);
        }
        return factors;
    }

}

