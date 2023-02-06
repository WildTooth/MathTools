package numerals.conversion;

public class ArabicNumeral extends Numeral implements Convertable {

    private static final int MAX_ROMAN_NUMERAL = 3999;

    private final int arabicNumeral;

    public ArabicNumeral(int arabicNumeral) {
        if (arabicNumeral > MAX_ROMAN_NUMERAL) {
            throw new IllegalArgumentException("Arabic numeral must be less than 4000");
        }
        this.arabicNumeral = arabicNumeral;
    }

    @Override
    public String convert() {
        StringBuilder result = new StringBuilder();
        int remaining = arabicNumeral;
        while (remaining >= 1) {
            if (remaining >= 1000) {
                result.append("M");
                remaining -= 1000;
            } else if (remaining >= 900) {
                result.append("CM");
                remaining -= 900;
            } else if (remaining >= 500) {
                result.append("D");
                remaining -= 500;
            } else if (remaining >= 400) {
                result.append("CD");
                remaining -= 400;
            } else if (remaining >= 100) {
                result.append("C");
                remaining -= 100;
            } else if (remaining >= 90) {
                result.append("XC");
                remaining -= 90;
            } else if (remaining >= 50) {
                result.append("L");
                remaining -= 50;
            } else if (remaining >= 40) {
                result.append("XL");
                remaining -= 40;
            } else if (remaining >= 10) {
                result.append("X");
                remaining -= 10;
            } else if (remaining == 9) {
                result.append("IX");
                remaining -= 9;
            } else if (remaining >= 5) {
                result.append("V");
                remaining -= 5;
            } else if (remaining == 4) {
                result.append("IV");
                remaining -= 4;
            } else {
                result.append("I");
                remaining -= 1;
            }
        }
        return result.toString();
    }

    @Override
    public int getArabicNumeral() {
        return arabicNumeral;
    }

    public String getRomanNumeral() {
        return convert();
    }

    @Override
    public Numerals getNumeralType() {
        return Numerals.ARABIC;
    }
}
