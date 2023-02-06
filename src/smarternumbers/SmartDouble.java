package smarternumbers;

import java.util.Scanner;

public class SmartDouble extends SmartNumber {

    private static final Scanner scanner = new Scanner(System.in);

    public SmartDouble(Number value) {
        super(value);
    }

    public SmartDouble(double value) {
        super(value);
    }

    public boolean isInteger() {
        return intValue() == doubleValue();
    }

    public double fraction() {
        return doubleValue() - intValue();
    }

    public double roundToNearest() {
        double resultAsDouble = doubleValue();
        int resultAsInteger = (int) resultAsDouble;

        if ((resultAsDouble-resultAsInteger) >= 0.5) {
            return roundUp();
        } else {
            return roundDown();
        }
    }

    public int roundUp() {
        return intValue() + 1;
    }

    public int roundDown() {
        return intValue();
    }

    private static double promptForNumber() {
        System.out.println("Enter a Double: ");
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        SmartDouble smartDouble = new SmartDouble(promptForNumber());
        System.out.println("Value: " + smartDouble.doubleValue());
        System.out.println("Integer Value: " + smartDouble.intValue());
        System.out.println("Fraction: " + smartDouble.fraction());

        System.out.println("Rounded result: " + smartDouble.roundToNearest());
        System.out.println("Rounded up: " + smartDouble.roundUp());
        System.out.println("Rounded down: " + smartDouble.roundDown());
    }
}
