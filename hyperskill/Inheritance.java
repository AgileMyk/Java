import jdk.jshell.spi.ExecutionControl;

import javax.crypto.ExemptionMechanismException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
Creating and displaying details of Animal and Dog objects
Hey there! This problem might be a bit unpredictable, but give it a go and let us know how you do!
Create three classes. The first class is 'Animal' class with the attributes 'name' and 'type'. It should
have constructors, getters and setters for those attributes. The second class is 'Dog' class that extends
'Animal' class and has an additional attribute 'breed'. It should also have constructors, getters and
setters for it. The third class is 'Main' with the main method in which you initialize an 'Animal' object
and a 'Dog' object with the scanned inputs. The type of the animal should be set to 'Animal' and 'Dog'
respectively. The name and breed are scanned as inputs in separate lines (breed is only for the Dog object).
The program should print the details of the Animal and Dog objects, i.e., their types, names and breed (for Dog),
each detail printed on a new line. The first input line is the name of the Animal object, the second line is
the name of the Dog object and the third line is the breed of the Dog.
 */

class Animal {

    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
            this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}

class Dog extends Animal {
    private String breed;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public Dog (String name, String type, String breed) {
        super(name, type);
        this.breed = breed;
    }




class Main {

    public static int arrayIOBCustom1(int loc, int[] arr) {
        try {
            return arr[loc];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return arr[loc];
    }

    public static double arrayIOBCustom2 (int loc, double[] arr) {
        try {
            return arr[loc];
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        return arr[loc];
    }

    public static int getSize(String s) {
        return s.length();
    }

    public static boolean customFNFexc(File f) throws FileNotFoundException {
        boolean result = false;
        try {
            Scanner newFile = new Scanner(f);
        } catch (FileNotFoundException fnf) {
            result = false;
        }
        return result;
    }

    public static void ifExists(boolean val, File f, File f2) {
        if (val == true) {
            try {
                Scanner thisFile = new Scanner(f);
                while (thisFile.hasNext()) {
                    System.out.println(thisFile.next());
                }
            } catch (FileNotFoundException fnf) {

            }

        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(File.separator);
        File thisFile = new File(".\\2DGames\\tiles\\bricks.png");
        String none = null;
        System.out.println(thisFile.canRead());

        try {
            Scanner fileScan1 = new Scanner(thisFile);
        } catch (FileNotFoundException fnf) {

        }
        try {
            System.out.println(getSize(none));
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
            System.out.print("\t\t oops");
        }


        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("mutable");
        StringBuilder emptySB = new StringBuilder();
        sb.setCharAt(0, 'i');
        sb.setCharAt(1,'m');
        System.out.println(sb.length());
        System.out.println(sb.charAt(5));
        System.out.println(sb);
        sb.deleteCharAt(0);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.append(" 1").append(" 2").append(" 3");
        System.out.println(sb);
        sb.insert(5, "'s");
        sb.insert(sb.length(), " are ready");
        System.out.println(sb);
        sb.replace(8, 13, "4 5 6");
        System.out.println(sb);
        sb.insert(11, " and");
        System.out.println(sb);
        sb.delete(0, 8);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append("test bleepbloopdasasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasda");
        System.out.println(sb.capacity());









        String animalName = scanner.nextLine();
        String dogName = scanner.nextLine();
        String breed = scanner.nextLine();

        //Initialize Animal object
        //TODO Your code here
        Animal Animal = new Animal(animalName, "Animal");

        //Print details of Animal
        System.out.println(Animal.getType());
        System.out.println(Animal.getName());

        //Initialize Dog object
        //TODO Your code here
        Dog Dog = new Dog(dogName, "Dog", breed);

        //Print details of Dog
        System.out.println(Dog.getType());
        System.out.println(Dog.getName());
        System.out.println(Dog.getBreed());
    }
}
}

