/*
Michael Hall
Programming Project 1
5-23-24
Player class - contains fields name/Height/age, constructors and toString method for returning player details
 */
package project1;

public class Player {
    //The second class Player should contain three instance variables that include the player’s name,
    //the player’s height, which should be stored as the type Height, and the player’s age. The class
    //should be immutable, so it should have no setter methods
    final private String name;
    final private Height height;
    private int age;
    // A constructor that accepts a player’s name, height and age constructs a Player object
    public Player(final String name, int age, final Height height) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
    // Getter methods for each of the instance variables
    final public String getName() {
        return name;
    }
    final public int getAge() {
        return age;
    }
    final public Height getHeight() {
        return height;
    }

    //A method toString that returns the string representation of a player with each field
    //appropriately labeled
    @Override
    public String toString() {
        //The toString method of the Player class should call the toString method of the Height class.
        return "The player " + name + " is " + age + " years old. " + height.toString();
        //
    }
}
