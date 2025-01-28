package Chapter_13;
/*
*13.15 (Use BigInteger for the Rational class) Redesign and implement the
Rational class in Listing 13.13 using BigInteger for the numerator and
denominator. Write a test program that prompts the user to enter two rational -
numbers and display the results as shown in the following sample run:
Enter the first rational number: 3
Enter the second second number:23 +2=50
3 –2= 30
3 *2= 210
3 /2=32is 0.0020025 */

import java.math.BigInteger;

public class Ex15 {
    public static final int MAX_VALUE = 2147483647;
    public static final int MIN_VALUE = -2147483648;
    public class Rational extends Number implements Comparable<Rational> {
    private BigInteger numerator = new BigInteger("0");
    private BigInteger denominator = new BigInteger("1");

    public Rational() {
            this(new BigInteger("0"), new BigInteger("1"));
            }
    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
             this.numerator = BigInteger.valueOf((denominator.compareTo(BigInteger.ZERO) >  0 ? 1 : -1)).multiply( numerator).divide(gcd);
             this.denominator = (denominator).divide(gcd).abs();
            }
 /** Find GCD of two numbers */
         private static BigInteger gcd(BigInteger n, BigInteger d) {
             BigInteger n1 = n.abs();
             BigInteger n2 = d.abs();
             BigInteger gcd = BigInteger.ONE;


             for (BigInteger k = BigInteger.ONE; k.compareTo(n1) < 0 || k.compareTo(n1) == 0
                                             &&  k.compareTo(n2) < 0 || k.compareTo(n2) == 0;) {
                 if (n1.mod(k).equals(BigInteger.ZERO) && n2.mod(k).equals(BigInteger.ZERO))
                     gcd = k;
             }
            return gcd;
             }
             /** Return numerator */
         public BigInteger getNumerator() {
             return numerator;
             }
         /** Return denominator */
        public BigInteger getDenominator() {return denominator; }
        public Rational add(Rational secondRational) {
            BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
            BigInteger d = denominator.multiply(secondRational.getDenominator());
              return new Rational(n, d);
        } /** Subtract a
  rational number from this rational */
          public Rational subtract(Rational secondRational) {
              BigInteger n = denominator.subtract(secondRational.getNumerator());
              BigInteger d = denominator.subtract(secondRational.getDenominator());
            return new Rational(n, d);
            }
 /** Multiply a
  rational number by this rational */
    public Rational multiply(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
             return new Rational(n, d);
             }

          /** Divide a
  rational number by this rational */
          public Rational divide(Rational secondRational) {
              BigInteger n = numerator.multiply(secondRational.getDenominator());
              BigInteger d = denominator.multiply(secondRational.getNumerator());

            return new Rational(n, d);
         }
         @Override public String
        toString() {
             if (BigInteger.valueOf(1)) return
                     numerator + "";
             else return
                     numerator + "/" + denominator;
         }
        @Override
             public boolean equals(Object other) {
            if ((this.subtract((Rational)(other))).getNumerator() == 0)
             return true;
             else
                 return false; }
             @Override //
 public int intValue() {
             return (int)doubleValue();
             }

          @Override //
  public float floatValue() {
             return (float)doubleValue();
             }

          @Override //
 public double doubleValue() {
              double tempDouble = numerator.divide(denominator).doubleValue();
             return numerator.divide(denominator);
             }

          @Override //
  public long longValue() {
             return (long)doubleValue();
             }

          @Override //
  public int compareTo(Rational o) {
             if (this.subtract(o).getNumerator() > 0) {
                 return 1;
             } else if (this.subtract(o).getNumerator() < 0) {
                 return - 1;
             } else
             return 0;
         }
  }

}
