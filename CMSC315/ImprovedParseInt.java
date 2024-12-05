public class ImprovedParseInt {

    static int improvedParseInt(String s) {
        int i = 0;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return switch (s.toUpperCase()) {
                case "ZERO" -> 0;
                case "ONE" -> 1;
                case "TWO" -> 2;
                case "THREE" -> 3;
                case "FOUR" -> 4;
                case "FIVE" -> 5;
                case "SIX" -> 6;
                case "SEVEN" -> 7;
                case "EIGHT" -> 8;
                case "NINE" -> 9;
                default -> throw e;
            };
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(improvedParseInt("2"));
        System.out.println(improvedParseInt("THREE"));
        System.out.println(improvedParseInt("FoUr"));
        System.out.println(improvedParseInt("five"));

    }

    static void displayOurInt(String parseInt) {
        int i = 0;
        try {
            i = improvedParseInt(parseInt);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Can't convert " + parseInt + " to primitive int");
        }
    }

}
