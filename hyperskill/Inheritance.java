import java.util.Scanner;

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
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

