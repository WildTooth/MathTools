package numerals.calculations;

import numerals.conversion.Numeral;
import numerals.conversion.RomanNumeral;

public class Calculation {
    public static void main(String[] args) {
        System.out.println(calculate(new RomanNumeral("VI"), new RomanNumeral("IV"), "++").toString());
    }

    public static Numeral calculate(Numeral left, Numeral right, String operator) {
        switch (operator) {
            case "+" -> {
                return left.add(right);
            }
            case "-" -> {
                return left.subtract(right);
            }
            case "*" -> {
                return left.multiply(right);
            }
            case "/" -> {
                return left.divide(right);
            }
            case "%" -> {
                return left.modulo(right);
            }
            case "^" -> {
                return left.power(right);
            }
            case "!" -> {
                return left.factorial();
            }
            case "++" -> {
                return left.increment();
            }
            case "--" -> {
                return left.decrement();
            }
            default -> {
                return new RomanNumeral("Invalid operator");
            }
        }
    }

    public static void print() {
        RomanNumeral firstNumeral = new RomanNumeral("VI");
        RomanNumeral secondNumeral = new RomanNumeral("IV");

        System.out.println("ROMAN: " + firstNumeral.getRomanNumeral());
        System.out.println("ROMAN: PARAMETER: " + secondNumeral.getRomanNumeral());
        Numeral result = firstNumeral.add(secondNumeral);
        System.out.println("ROMAN: ADDITION: " + result.getRomanNumeral());
        result = firstNumeral.subtract(secondNumeral);
        System.out.println("ROMAN: SUBTRACTION: " + result.getRomanNumeral());
        result = firstNumeral.multiply(secondNumeral);
        System.out.println("ROMAN: MULTIPLY: " + result.getRomanNumeral());
        result = firstNumeral.divide(secondNumeral);
        System.out.println("ROMAN: DIVISION: " + result.getRomanNumeral());
        result = firstNumeral.modulo(secondNumeral);
        System.out.println("ROMAN: MODULUS: " + result.getRomanNumeral());
        result = firstNumeral.power(secondNumeral);
        System.out.println("ROMAN: POWER: " + result.getRomanNumeral());

        result = firstNumeral.asArabicNumeral();
        System.out.println("ARABIC: " + result.getArabicNumeral());
        System.out.println("ARABIC: PARAMETER: " + secondNumeral.getArabicNumeral());
        result = firstNumeral.add(secondNumeral);
        System.out.println("ARABIC: ADDITION: " + result.getArabicNumeral());
        result = firstNumeral.subtract(secondNumeral);
        System.out.println("ARABIC: SUBTRACTION: " + result.getArabicNumeral());
        result = firstNumeral.multiply(secondNumeral);
        System.out.println("ARABIC: MULTIPLY: " + result.getArabicNumeral());
        result = firstNumeral.divide(secondNumeral);
        System.out.println("ARABIC: DIVISION: " + result.getArabicNumeral());
        result = firstNumeral.modulo(secondNumeral);
        System.out.println("ARABIC: MODULUS: " + result.getArabicNumeral());
        result = firstNumeral.power(secondNumeral);
        System.out.println("ARABIC: POWER: " + result.getArabicNumeral());

        result = firstNumeral.asRomanNumeral();
        System.out.println("ROMAN: " + result.getRomanNumeral());
    }
}
