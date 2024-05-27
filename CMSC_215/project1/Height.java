/*
Michael Hall
Programming Project 1
5-23-24
Height class - contains fields feet/inches, constructors and conversion for converting inches-only to feet + inches
 */

package project1;

final public class Height {
        private int feet;
    private int inches;

    //A constructor that accepts a single value and determines if that value represents
    //a height of even feet or a height of represented only in total inches with no feet value
    public Height(int value) {
        //allows for a single value representing even feet or total inches; converts based on input value's length
        //fortunately, the tallest players have not ever passed 7'7" (no issues with 10'+ entries)
        String val = String.valueOf(value);
        if (val.length() > 1) {
            inches = value;
        } else {
            feet = value;
        }
        //convert a Height object that results from an inches-only constructor
        //to a feet and inches Height object
        if (value == inches) {
            this.feet = inches / 12;
            this.inches = inches % 12;
        }
    }

    //A constructor that accepts feet and inches; constructs a Height object
    public Height(final int feet, final int inches) {
        this.feet = feet;
        this.inches = inches;
    }
    //A method toInches that returns the height in total inches
    public int toInches() {
        if (feet > 0) {
            return feet * 12 + inches;
        }
        return inches;
    }
    //A method toString that returns the string representation of the height with a single
    //quote following the feet and a double quote following the inches
    @Override
    public String toString() {
        //Regardless of what value for inches was supplied to the constructor the toString method should
        //display the height normalized so the inches are less than 12.
        if (feet <= 0) {
            feet = (inches / 12);
            int inchesAdjust = inches % 12;
            return "The player's height is " + feet + "' " + inchesAdjust + "\" inches";
        }
            return "The player's height is " + feet + "'.";
    }

}
