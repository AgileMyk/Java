public class wk4_notes {

    public static int last(String s) {
        return s.length();
    }
    public static void main(String[] args) {

        String b = """
                Java
                \tPython\n
                C++""";
        System.out.println(b);
        /*
        String s = "is Java";
        System.out.println(s.substring(s.length() - 5).equals("Java"));
        System.out.println("***");
        if (s.lastIndexOf("Java") >= 0) { System.out.println(true); } else { System.out.println("false"); }
        System.out.println("---");
        if (s.indexOf("Java") == 0) { System.out.println(true); }
        if (s.startsWith("Java")) { System.out.println(true); }
        if (s.substring(0, 4) == "Java") { System.out.println(true); }
        System.out.println("------------------------------");
        String s2 = "yes";
        System.out.println('a' >= 'b');
        System.out.println("abc".compareTo("aba"));
        try {
            System.out.println(Integer.parseInt("abc"));
        } catch (NumberFormatException nfe) {
            System.out.println("The arguments passed are not convertable String numbers");
        }

        Double dbl1 = 132.045;

        Integer intgr1 = 1;
        Integer i = 32141;
        System.out.printf("%5d%n",123456);
        System.out.println("--------------");
        System.out.printf("%4c%n",'c');
        System.out.printf("%6d%n",342);
        System.out.printf("%10b%n",false);
        System.out.printf("%10.2e%n",45.5);
        //System.out.printf("%8.2d%n",67);
        System.out.println("--------------");

        System.out.printf("%4.2f%n",2.34);
        System.out.printf("%5.2f%%%n", 75.324);
        int single = 1;
        System.out.printf("So much extra space!... %08d%n", single);
        //System.out.printf("The format is too big, creating 4 spaces: %5c%n");
        System.out.printf("Way too many spaces surround this boolean: ->%10b<-%n", b);
        System.out.printf("This: $%.2f %n",dbl1);
        Integer intgr2 = Integer.parseInt("2");
        System.out.println("integer gooooooo ");
        System.out.println(intgr1.intValue());
        System.out.println(intgr1.doubleValue());
        System.out.println(Integer.parseInt("55"));
        System.out.println(Double.parseDouble("5"));
        System.out.println((i + "").length());
        System.out.println((dbl1 + "").length());
        System.out.println((dbl1 + "").contains(".") ? (dbl1 + "").length() - 1 : (dbl1 + "").length());
        System.out.println();
        String s1 = "String";
        char c = s1.charAt(s1.length() - 1);
        System.out.println();
        System.out.println();
        System.out.println();
         */
        /*
        String tester = "This is a test";
        System.out.println(tester.substring(6, last(tester)));

        char char1 = s1.charAt(s1.length() -1);
        String word1 = "A";
        String word2 = "a";
        char word3 = 'A';
        char word4 = 'a';
        String word5 = "ape";
        String word6 = "apes";
        String string1 = "hi";
        String string2 = "hi";
        System.out.println(tester.indexOf('a'));
        System.out.println(tester.indexOf('i',3));
        System.out.println(tester.indexOf("is"));
        System.out.println(tester.indexOf("is",3));
        System.out.println(tester.lastIndexOf('t'));
        System.out.println(tester.lastIndexOf('t', last(tester) - 2));
        String name = "Michael Hall";
        int m = name.indexOf(" ");
        String lastName = name.substring(m);
        String firstName = name.substring(0, m);
        System.out.println(firstName + " " + lastName);
        String hi = "Welcome";
        int x = hi.indexOf("e");
        int x2 = hi.lastIndexOf("abc");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println(string1 == string2);
        String string3 = new String (string1);
        String string5 = string3;
        System.out.println(string5 == string3);
        String string4 = new String("hi");
        System.out.println(string3 == string1);
        System.out.println(string4.equals(string1));
        System.out.println(string1 == string3);
        System.out.println(string1 == string2);
        System.out.println(string2 == string3);
        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));


        Scanner in = new Scanner(System.in);
        String eleven = Character.toString('1') + 1;
        System.out.println('1' + 1);
        System.out.println(Math.random() * 's');
        System.out.println('1' + 'z' * '3');
        System.out.println('A' + 1);
        int counter = 0;
        while (in.hasNext() && counter != 6) {
            counter++;
            System.out.println("You typed " + in.next());
        }


        System.out.println(word1.compareTo(Character.toString(word4)));
        System.out.println(word1.compareTo(word2));
        System.out.println(word2.compareTo(word1));
        System.out.println(word6.compareTo(word5));
        String one = "aString";
        char [] charOne = {'S','t','r'};

        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("after:");
        System.out.println(s1);
        System.out.println(s2);


        double angle1 = 180;
        double angle2 = 360;
        double angle3 = 45;
        double angle4 = 111;
        double radiansOne = Math.toRadians(angle1);

        //System.out.println('A' + '#');
        //System.out.println((byte) 'A' + '#');
        //System.out.println( ('ሜ' * (90 - 645)) + 'ሜ' * (90 - 645));
        //System.out.println( (byte) ('ሜ' * (90 - 645)) + 'ሜ' * (90 - 645));

        /*
        System.out.println('1');
        System.out.println('4' - '3');
        System.out.println('b' - 'a');
        System.out.println((int) 'b');
        System.out.println((int) 'A');

        char x2 = 'a';
        char y2 = 'c';
        System.out.println(x2++);
        System.out.println(++x2);
        System.out.println('a' - 'c');
         */

       /*
        char test1 = 'b';
        System.out.println(122-97);
        System.out.println('z' - 'a');
        System.out.println('a'-'z');
        System.out.println((char) ('a' + Math.random() * (90 - 64)));
        System.out.println();
        int y = 6;
        double z = 5.5;
        */

        /*
        System.out.println(Math.sin(Math.toRadians(angle1)));
        System.out.println(Math.cos(Math.toRadians(angle2)));
        System.out.println(Math.toRadians(radiansOne));
        System.out.println(Math.toDegrees(radiansOne));
        System.out.println(Math.toDegrees(angle1));
        System.out.println(Math.rint(Math.random() * 1000));
        System.out.println(Math.rint(Math.random() * 555));
        System.out.println(Math.max(2.1, 4));
        System.out.println(Math.min(Math.min(x, y), z));
        System.out.println(Math.min(x, Math.min(y, z)));
        System.out.println(Math.min(Math.min(y, z), x));
        System.out.println(Math.min(z, Math.min(x, y)));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println(28 + (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
        System.out.println( 28 + (int) (Math.random() * 50));
         */

        /*
        char l1 = '\u1212';
        char l2 = '\u1213';
        char l3 = '\u1214';
        char l4 = '\u1215';
        char l5 = '\u1216';
        char l6 = '\uaf55';
        char l7 = '\uE33e';
        for (int i = 0; i < 50; i++) {
            System.out.println(l2++);
        }

        char check1 = (char) 'ሕ';
        System.out.println("char cast of symbol: " + (double)'ሕ');
        int c = 'ሕ';
        int a = 'ቅ';
        System.out.println("converted char addition: " + c + a);

        byte b = 127;
        int wasHex = (int) 0X0124;
        int wasChar = (int) 'Z';
        double test = 79.13;
        char chTest = (char) test;
        double ch = 0X0a511;
        char ch2 = (char) ch;
        char ch3 = (char) 455.241;
        char ch4 = (char) 0x423;
        System.out.println("They said \"Java is fun\"");
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(l5);
        System.out.println(l6);
        System.out.println(l7);
        System.out.println(l1+l2+l3+l4+l5+l6);
        System.out.println(wasHex);
        System.out.println(wasChar);
         */

    }
}
