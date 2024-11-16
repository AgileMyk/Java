public class Class {
    private String name;
    private final String[] students = new String[100];
    private int numStudents;

    public void course(String name) {
        this.name = name;
    }

    public void addStudent(String name) {
        students[numStudents] = name;
        numStudents++;
    }

    public void dropStudentNonReplace(String name) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].equals(name)) {
                students[i] = students[i+1];
                for (int j = i+1; j < numStudents; j++) {
                    students[j] = students[j+1];
                }
            }
        }
    }

    public void dropStudentReplace(String name) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].equals(name)) {
                students[i] = "";
            }
        }
    }


    public String[] getStudents() {
        return students;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getCoursName() {
        return name;
    }

    public static void main(String[] args) {
        Integer int1 = new Integer(5); //deprecated
        Integer int2 = Integer.valueOf(5);
        Double thisDouble = Double.valueOf("5.2");
        Long thatLong = Long.valueOf("4121241234124");
        String s = "27";
        Integer thisInteger = Integer.parseInt(s, 8);

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int1.compareTo(int2));
        System.out.println(thisInteger);

        String name = "Michael";
        String fullName = "Michael Thomas Hall";
        char[] fullName2 = fullName.toCharArray();
        String fullName3 = String.valueOf(fullName2);
        System.out.println("string 3: " + fullName3);
        System.out.println("--------------------");
        double weight = Double.parseDouble("165.7");
        String age2 = String.valueOf(40);
        int age = Integer.parseInt("40");
        System.out.println(String.valueOf("5.4"));
        char[] firstName = new char[7];
        fullName.getChars(0,7,firstName, 0);
        System.out.print("first name: ");
        for (int i = 0; i < firstName.length; i++) {
            System.out.print(firstName[i]);
        }
        System.out.println("\n");
        char[] name2 = name.toCharArray();
        String altName1 = name.replace("M","N");
        String altName2 = name.replace("chael","ke");
        System.out.println(altName2);
        System.out.println(altName2.length());
        name = name.replace("ael", "elle");
        System.out.println(name);
        System.out.println(name.length());
        char lastLetter = name.charAt(name.length()-1);
        int int3 = Integer.valueOf(int1);
        int int4 = int1;
        Integer int5 = int4;

        String[] tokens = "java#C++#python".split("#");
        //System.out.println(tokens);
        //tokens.split("#");
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

        String alsoTokens = "java#C++#python";
        String[] alsoTokens2 = alsoTokens.split("#");
        System.out.println(alsoTokens2.length);
        for (int i = 0; i < alsoTokens2.length; i++) {
            System.out.println(alsoTokens2[i]);
        }

        String s2 = String.format("%5.2f%6d%-4s",45.556, 14, "AB");
        System.out.println(s2);

        StringBuilder SB1 = new StringBuilder("Welcome to Java!");
        SB1.append(" " + 5);
        System.out.println(SB1);
        SB1.append(" " + 'c');
        System.out.println(SB1);
        SB1.insert(6, 123);
        System.out.println(SB1);
        StringBuilder SB2 = SB1.append(123);
        System.out.println("*****");
        System.out.println(SB1);
        System.out.println(SB2);
        System.out.println(SB2.capacity());
        SB2.setLength(3);
        StringBuilder SB3 = new StringBuilder("");
        System.out.println("SB3 cap: " + SB3.capacity());
        System.out.println("setlength -> 3 " + SB1);
        System.out.println(SB2.capacity());
        SB2.append(SB1);
        SB2.append(SB2);
        System.out.println(SB2);
        System.out.println(SB2.capacity());


    }
}
