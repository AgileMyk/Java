/*
Squirrels and nuts
N squirrels found K nuts and decided to divide them equally. Find how many nuts
will be left after each of the squirrels takes the equal amount of nuts.

Input data format

There are two positive integers N and K, each of them is not greater than 10000.

Sample Input 1:
3
14

Sample Output 1:
2
 */

public class SquirrelsAndNuts {

    public static int sNQ(int n, int k) {
        int d = k / n;
        int n2 = n;
        int k2 = k;
        return (k - (d * n));
    }

    public static long sNQ(long n, long k) {
        long d = k / n;
        return k - (d * n);
    }

    public static void main(String[] args) {
        long n1 = 213_234_345;
        long k1 = 104_567_678;

        int squirrels = 14;
        int nuts = 3;

        System.out.print(snQ(nuts, squirrels));
    }

}
