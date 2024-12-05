public class Decimal {

    public static boolean isDecimal(String token) {
        return token.matches("[0-9*]+\\.[0-9]+");
    }
}
