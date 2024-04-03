import java.util.Scanner;

public class Epsilon {
    static final double dblEPSILON = Math.pow(10, -14);
    static final float fltEPSILON = (float) Math.pow(10, -7);

    public boolean Epsilon(double x, double y) {
        return x - y > dblEPSILON ? true : false;
    }

    public boolean Epsilon(float x, float y) {
        return x - y > fltEPSILON ? true : false;
    }

    public static StringBuilder Epsilon() {
        int randNum = (int) (((int) (Math.random() * 100)) * Math.random());
        String randNum2 = String.valueOf(randNum);
        StringBuilder randNum3 = new StringBuilder(randNum2);
        if (randNum3.length() != 1) randNum3 = randNum3.delete(1, randNum3.length());
        return randNum3;
    }
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        String word = in.next();

        Double cardLimit = in.nextDouble();
        Double cardUsage = in.nextDouble();

        Double poor = 82.1;
        Double fair = 56.1;
        Double good = 35.2;
        Double veryGood = 14.7;
        Double exceptional = 6.5;

        Double result =cardUsage/cardLimit;

        int hp = 100;
        //this is a switch expression
        //a switch expression must cover all cases
        switch (hp) {
            case 90 -> System.out.println("bright green bar");
            case 80 -> System.out.println("green bar");
            case 70 -> System.out.println("yellow-green bar");
            case 60 -> System.out.println("yellow bar");
            case 50 -> System.out.println("yellow-orange bar");
            case 40 -> System.out.println("orange bar");
            case 30 -> System.out.println("orange-red bar");
            case 20 -> System.out.println("red bar");
            default -> System.out.println("red bar");
        }


        int digit1 = (int) (Math.random() * 1000);
        System.out.println(digit1);
        int lotteryDigit1 = digit1 / 100;
        int lotteryDigit2 = ((digit1 % 100) / 10);
        int lotteryDigit3 = ((digit1 % 1000) / 100);
        System.out.println(lotteryDigit1);
        System.out.println(lotteryDigit2);
        System.out.println(lotteryDigit3);
        System.out.println("-------------");

        String day ="";
        int studyHours;
        String dailyMessage;



        class yearOf {
            public yearOf(int year) {

                switch (year % 12) {
                    case 0:
                        System.out.println("monkey");
                        break;
                    case 1:
                        System.out.println("rooster");
                        break;
                    case 2:
                        System.out.println("dog");
                        break;
                    case 3:
                        System.out.println("v");
                        break;
                    case 4:
                        System.out.println("rat");
                        break;
                    case 5:
                        System.out.println("ox");
                        break;
                    case 6:
                        System.out.println("tiger");
                        break;
                    case 7:
                        System.out.println("rabbit");
                        break;
                    case 8:
                        System.out.println("dragon");
                        break;
                    case 9:
                        System.out.println("snake");
                        break;
                    case 10:
                        System.out.println("horse");
                        break;
                    case 11:
                        System.out.println("sheep");
                        break;
                    default:
                        System.out.println("invalid, not ranging 0 to 11");
                }
            }
        }

        int birthYear = 1984;
        int nineEleven = 2006;
        int highschoolGrad = 2002;
        int firstBach = 2021;
        int secondBach = 2024;


        System.out.println(Epsilon());
        System.out.println(Epsilon());
        System.out.println(Epsilon());
        System.out.println(Epsilon());


    /*
            int numberOfDaysInMonth = 29;
        System.out.println(28 <= numberOfDaysInMonth && numberOfDaysInMonth <= 32);

        int x = 5;
        System.out.println(x > 0 || x < 0);
        System.out.println(x != 0 || x == 0);
        boolean outcome = x != 0 ? true : false;
        boolean outcome2 = (!(x > 0) && (x > 0));
        System.out.println(true || false);
        System.out.println();

        int number = 6;
        System.out.println(number % 2 == 0 && number % 3 == 0);

        System.out.println(true^false);
        System.out.println(1 > 2 ^ 1 < 3);
        System.out.println(true !=  false);


        System.out.println((int)(Math.random() * 4));
        double val1 = Math.random() * 10;
        double val2 = (int) (Math.random() * 10);
        System.out.println(val1);
        System.out.println(val2);
        double x = 1 - .1 - .1 - .1 - .1 - .1;
        System.out.println(Math.abs(x - 0.5));
        System.out.println(x - 0.5);
        System.out.println();

        boolean even;
        if (number % 2 == 0)
            even = true;
        else
            even = false;

        even = number % 2 == 0;
     */
    }
}


