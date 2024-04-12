public class GreatestCommonDenominator {

    /*
    for (int k = 2; k <= n1 && k <= n2; k++) {
        if (n1 % k == 0 && n2 %k ==0)
            gcd = k;
    }
     */

    public int GreatestCommonDenominator(int a, int b) {
        if (a > b) {
            a = a;
            b = b;
        } else {
            int temp = a;
            a = b;
            b = temp;
        }

        int result = 0;
        int val = 1;
        while  (val <= b) {
            if (a % val == 0 && b % val == 0) {
                result = val;
                val++;
            }
        }
        return result;
    }


    public int GreatestCommonDenominator( double a, double b){

        return 0;
    }

    public int GreatestCommonDenominator( float a, float b){

        return 0;
    }
    public static void main (String[]args){

    }
}