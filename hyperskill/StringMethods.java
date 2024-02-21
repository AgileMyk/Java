public class StringMethods {

    /*
    The String class has a set of built-in methods that you can use on strings.
    This is a list of those methods.
     */

    public static void returnTypeChar() {
        System.out.println("This method returns a char.");
    }

    public static void returnTypeBoolean() {
        System.out.println("This method returns a boolean value.");
    }

    public static void returnTypeInt() {
        System.out.println("This method returns a int.");
    }

    public static void returnTypeString() {
        System.out.println("This method returns a string.");
    }
    public static void main(String[] args) {

        String string = "This is a String!";
        System.out.println("The charAt() method returns the char at the given index; 'string.charAt(5)' gives: " + string.charAt(5));
        returnTypeChar();
        System.out.println("The codePointAt() method returns the unicode of the char at the given index; 'string.codePointAt(10) gives: " + string.codePointAt(10));
        returnTypeInt();
        System.out.println("The codePointBefore() method returns the unicode of the char at the given index - 1; 'string.codePointBefore(3)' gives: " + string.codePointBefore(3));
        returnTypeInt();
        System.out.println("The codePointCount() method returns the number of unicode values in a string with optional beginning and ending index locations; 'string.codePointCount(0, 5)' gives: " + string.codePointCount(0, 5));
        returnTypeInt();
        System.out.println("The compareTo() method compares two strings lexicographically; The comparison is based on the Unicode value of each character in the strings.");
        System.out.println("The method returns 0 if the string is equal to the other string. A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).");
        System.out.println("ie, Hellq is 2 greater than Hello; Hellq.compareTo(Hello) --> 2 / Hello.compareTo(Hellq) --> -2");
        System.out.println("Use the equals() method to compare two strings without consideration of Unicode values.");
        returnTypeInt();
        System.out.println("The compareToIgnoreCase() does the same as the above compareTo() while ignoring case differences.");
        System.out.println("The comparison is based on the Unicode value of each character in the string converted to lower case.");
        returnTypeInt();
        System.out.println("The concat() appends one string to the end of another.");
        returnTypeString();
        System.out.println("The contains() method checks whether a string contains a sequence of characters; string.contains(\"ing\") returns true.");
        returnTypeBoolean();
        System.out.println("The contentEquals() method checks whether a string contains the exact same char sequences as a given charSequence or StringBuffer; string.contentEquals(\"ing\") ");
        returnTypeBoolean();
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
        System.out.println();
        System.out.println();
    }
}
