public class JavaLangInt {
    private int value;
    public static final int MAX = 2147483647;
    public static final int MIN = -2147483648;

    public JavaLangInt(int val) {
        value = val;
    }

    public JavaLangInt(Integer val) {
        value = (int) val;
    }

    public JavaLangInt(String val) {
        value = Integer.parseInt(val);
    }

    public void byteVal(int val) {
        value = (byte) val;
    }

    public void byteVal(String val) {
        value = Byte.parseByte(val);
    }

    public void shortVal(int val) {
        value = (short) val;
    }

    public void shortVal(String val) {
        value = Short.parseShort(val);
    }

    public int intVal() {
        return value;
    }

    public long longVal() {
        return (long) value;
    }

    public float floatVal() {
        return (float) value;
    }

    public double doubleVal() {
        return (double) value;
    }

    public boolean compareTo(int i) {
        return value == i;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static JavaLangInt valueOf(String s) {
        return new JavaLangInt(Integer.parseInt(s));
    }

    public static JavaLangInt valueOf(String s, int radix) {
        return new JavaLangInt(Integer.parseInt(s, radix));
    }

    public static JavaLangInt valueOf(int i) {
        return new JavaLangInt(i);
    }

    public static JavaLangInt parseJavaLangInt(String s)   {
        return new JavaLangInt(Integer.parseInt(s));
    }

    public static JavaLangInt parseJavaLangInt(Integer i) {
        return new JavaLangInt(i);
    }

}
