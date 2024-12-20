package Exercise_12_7_12_9;

public class BinaryFormatException extends Exception {

    public BinaryFormatException(String binary) {
        super("Invalid binary input value: " + binary);
    }
}
