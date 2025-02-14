package Chapter_13;
/*
*13.15 (Use BigInteger for the Rational class) Redesign and implement the
Rational class in Listing 13.13 using BigInteger for the numerator and
denominator. Write a test program that prompts the user to enter two rational -
numbers and display the results as shown in the following sample run:
Enter the first rational number: 3 354 <-ENTER
Enter the second number: 7 2389 <-ENTER
3/454 + 7/2389 = 10345/1084606
3/454 – 7/2389 = 3989/1084606
3/454 * 7/2389 = 21/1084606
3/454 / 7/2389 = 7167/3178
7/2389 is 0.0029300962745918793 */

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.StreamSupport;


public class Ex15 {
    public static final int MAX_VALUE = 2147483647;
    public static final int MIN_VALUE = -2147483648;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first rational number: ");
        BigInteger n1 = new BigInteger("1");
        BigInteger n2 = new BigInteger("1");
        BigInteger n3 = new BigInteger("1");
        BigInteger n4 = new BigInteger("1");
        int count = 0;
        while (in.hasNextLine() && count != 2) {
            n1 = in.nextBigInteger();
            count++;
            n2 = in.nextBigInteger();
            count++;
        }
        Rational r1 = new Rational(n1, n2);
        System.out.print("Enter the second rational number: ");
        while (in.hasNextLine() && count != 4) {
            n3 = in.nextBigInteger();
            count++;
            n4 = in.nextBigInteger();
            count++;
        }
        Rational r2 = new Rational(n3, n4);
        //outputs
        printIntro(r1, r2, "+");
        System.out.print(" ");
        printResult(r1, r2, "+");
        System.out.print("\n");
        printIntro(r1, r2, "-");
        System.out.print(" ");
        printResult(r1, r2, "-");
        System.out.print("\n");
        printIntro(r1, r2, "*");
        System.out.print(" ");
        printResult(r1, r2, "*");
        System.out.print("\n");
        printIntro(r1, r2, "/");
        System.out.print(" ");
        printResult(r1, r2, "/");
        System.out.print("\n" + r2.getNumerator() + "/" + r2.getDenominator() + " is " + r2.doubleValue() + "\n");
    }

    public static void printIntro(Rational first, Rational second, String symbol) {
        System.out.printf("%s  %s  %s", first.toString(),symbol, second.toString());
    }
    public static void printResult(Rational first, Rational second, String symbol) {
        if (symbol.equals("+".trim())) {
            System.out.print("= " + first.add(second));
        } else if (symbol.equals("-".trim())) {
            System.out.print("= " + first.subtract(second));
        } else if (symbol.equals("*".trim())) {
            System.out.print("= " + first.multiply(second));
        } else if (symbol.equals("/".trim())) {
            System.out.print("= " + first.divide(second));
        } else {
            System.out.println("There was an invalid value entry");
        }
    }



    public static class Rational extends Number implements Comparable<Rational> { //make static?
    private BigInteger numerator; //make final?
    private BigInteger denominator; //make final?

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
                     &&  k.compareTo(n2) < 0 || k.compareTo(n2) == 0; k = k.add(BigInteger.ONE)) {
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
              BigInteger n = numerator.subtract(secondRational.getNumerator());
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
             if (this.denominator.equals(BigInteger.ONE)) return
                     numerator + "";
             else return
                     numerator + "/" + denominator;
         }
        @Override
             public boolean equals(Object other) {
            if (other instanceof Rational) {
                return (this.subtract((Rational) (other))).getNumerator().equals(BigInteger.ZERO);
            } else
                System.out.println("ERROR: Rational object is not a Rational object");
            return false;
          }
             @Override //
 public int intValue() {
             return (int)doubleValue();
             }

          @Override //
  public float floatValue() {
              return Float.parseFloat(String.valueOf(numerator)) / Float.parseFloat(String.valueOf(denominator));
             }

          @Override //
 public double doubleValue() {
              return Double.parseDouble(String.valueOf(numerator)) / Double.parseDouble(String.valueOf(denominator));
             }

          @Override //
  public long longValue() {
              return Long.parseLong(String.valueOf(numerator)) / Long.parseLong(String.valueOf(denominator));
             }

          @Override //
  public int compareTo(Rational o) {
              BigInteger temp = this.subtract(o).getNumerator();
              if (temp.compareTo(BigInteger.ZERO) > 0) {
                  return 1;
              } else if (temp.compareTo(BigInteger.ONE) < 0) {
                  return -1;
              } else
             return 0;
         }
  }



}
