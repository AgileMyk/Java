package Exercise_12_3;

public class invalidValueException extends Exception {
    public invalidValueException(int val) {
                super("Invalid value: " + val);
        }

}
