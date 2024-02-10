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
    static char ch = '/';
    static int num = ch;

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

        char ch2 = '>';
        double chTwo = ch2;

        long bigLong = 1_200_000_000_000_000_000L;
        double bigDouble = bigLong;

        int smaller = 1;
        float medium = smaller;
        long bigger = smaller;
        long alsoBigger = (long)medium;

        int squirrels = 14;
        int nuts = 3;
        int result = sNQ(3, 14);
        System.out.println(result);
        System.out.println(sNQ(nuts, squirrels));
        System.out.println("        -----------------------");
        System.out.println(chTwo + " ?");
        System.out.print(bigDouble);
    }
}
