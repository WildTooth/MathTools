package numerals.conversion;

import utils.StringUtils;

public class Converter {

    private enum HowToConvert {
        ROMAN_TO_ARABIC,
        ARABIC_TO_ROMAN
    }

    public static void process(String input) {
        Convertable convertable = null;

        HowToConvert how;

        if (StringUtils.isInteger(input)) {
            how = HowToConvert.ARABIC_TO_ROMAN;
        } else {
            how = HowToConvert.ROMAN_TO_ARABIC;
        }
        switch (how) {
            case ROMAN_TO_ARABIC -> {
                convertable = new RomanNumeral(input);
                System.out.println(convertable.convert());
            }
            case ARABIC_TO_ROMAN -> {
                convertable = new ArabicNumeral(Integer.parseInt(input));
                System.out.println(convertable.convert());
            }
        }
    }

    public static String promptStringInput() {
        System.out.print("Enter an Arabic or Roman numeral: ");
        return new java.util.Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        process(promptStringInput());
    }
}
