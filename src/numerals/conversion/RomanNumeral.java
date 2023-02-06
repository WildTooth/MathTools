package numerals.conversion;

public class RomanNumeral implements Convertable {

    private final String romanNumeral;

    public RomanNumeral(String romanNumeral) {
        this.romanNumeral = romanNumeral.toUpperCase();
    }

    public static RomanNumeral[] values() {
        return new RomanNumeral[] {
                new RomanNumeral("I"),
                new RomanNumeral("V"),
                new RomanNumeral("X"),
                new RomanNumeral("L"),
                new RomanNumeral("C"),
                new RomanNumeral("D"),
                new RomanNumeral("M")
        };
    }

    @Override
    public Integer convert() {
        String romanNumeral = this.romanNumeral + " ";
        int result = 0;
        for (int i = 0; i < this.romanNumeral.length(); i++) {
            char currentChar = romanNumeral.charAt(i);
            char nextChar = romanNumeral.charAt(i + 1);
            if(currentChar == 'M') {
                result += 1000;
            } else if (currentChar == 'C') {
                if (nextChar == 'M') {
                    result += 900;
                    i++;
                } else if (nextChar == 'D') {
                    result += 400;
                    i++;
                } else {
                    result += 100;
                }
            } else if (currentChar == 'D') {
                result += 500;
            } else if (currentChar == 'X') {
                if (nextChar == 'C') {
                    result += 90;
                    i++;
                } else if (nextChar == 'L') {
                    result += 40;
                    i++;
                } else {
                    result += 10;
                }
            } else if (currentChar == 'L') {
                result += 50;
            } else if (currentChar == 'I') {
                if (nextChar == 'X') {
                    result += 9;
                    i++;
                } else if (nextChar == 'V') {
                    result += 4;
                    i++;
                } else {
                    result++;
                }
            } else if (currentChar == 'V') {
                result += 5;
            }
        }
        return result;
    }

    public int getArabicNumeral() {
        return convert();
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }
}
