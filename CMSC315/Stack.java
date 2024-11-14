public class Stack {
    int length;
    private String[] values = new String[length];

    public Stack() {};

    public Stack(int length) {
        this.length = length;
    }

    public void push(String val)  {
        for (int i  = 0; i < length; i++) {
            if (values[i] == null) {
                values[i] = val;
            }
        }
    }

    public String pop() {
        String temp = "";
        for (int i = length - 1; i >= 0; i--) {
            if (values[i] != null) {
                temp = values[i];
                values[i] = null;
            }
        }
        return temp;
    }

    public String peek(int i) {
        return values[i];
    }

    boolean isEmpty() {
        if (values[0] == null) {
            return true;
        }
        return false;
    }

}
