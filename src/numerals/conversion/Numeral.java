package numerals.conversion;

import numerals.calculations.Calculable;

public abstract class Numeral implements Calculable {

    public abstract int getArabicNumeral();

    public abstract String getRomanNumeral();

    public Numeral add(Numeral numeral) {
        return new ArabicNumeral(getArabicNumeral() + numeral.getArabicNumeral());
    }

    public Numeral subtract(Numeral numeral) {
        return new ArabicNumeral(getArabicNumeral() - numeral.getArabicNumeral());
    }

    public Numeral multiply(Numeral numeral) {
        return new ArabicNumeral(getArabicNumeral() * numeral.getArabicNumeral());
    }

    public Numeral divide(Numeral numeral) {
        return new ArabicNumeral(getArabicNumeral() / numeral.getArabicNumeral());
    }

    public Numeral modulo(Numeral numeral) {
        return new ArabicNumeral(getArabicNumeral() % numeral.getArabicNumeral());
    }

    public Numeral power(Numeral numeral) {
        return new ArabicNumeral((int) Math.pow(getArabicNumeral(), numeral.getArabicNumeral()));
    }

    public Numeral factorial() {
        int result = 1;
        for (int i = 1; i <= getArabicNumeral(); i++) {
            result *= i;
        }
        return new ArabicNumeral(result);
    }

    public Numeral increment() {
        return new ArabicNumeral(getArabicNumeral() + 1);
    }

    public Numeral decrement() {
        return new ArabicNumeral(getArabicNumeral() - 1);
    }

    public ArabicNumeral asArabicNumeral() {
        return new ArabicNumeral(getArabicNumeral());
    }

    public RomanNumeral asRomanNumeral() {
        return new RomanNumeral(getRomanNumeral());
    }

    @Override
    public String toString() {
        return '{' +
                "arabicNumeral=" + getArabicNumeral() +
                ", romanNumeral='" + getRomanNumeral() + '\'' +
                '}';
    }
}