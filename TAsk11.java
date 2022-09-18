package exercises2;
public class TAsk11 {
    private static final String REPLACEMENT = "-STOP-";
    private static final String REGEX = "[.,]";

    public static void main(String[] args) {
        String input = "Ala, ma kota. Kot, ma ale.";
        System.out.println(replaceDotsAndCommas(input));
    }

    private static String replaceDotsAndCommas(String input) {
        if(StringValidator.isValid(input)) {
//            return input
//                    .replace(".", REPLACEMENT)
//                    .replace(",", REPLACEMENT);
            return input.replaceAll(REGEX, REPLACEMENT);
        }
        return input;
    }
}