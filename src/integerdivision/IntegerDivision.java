package integerdivision;

import java.util.Scanner;

public class IntegerDivision {
    private final int firstNum;
    private final int secondNum;

    public IntegerDivision() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNum = scanner.nextInt();

        printAll();
    }

    private void printAll() {
        printResult();
        printRoundedResult();
        printRemainder();
        printPercentage();
    }

    private void printResult() {
        System.out.println("Result: " + (double) firstNum/secondNum);
    }

    private void printRoundedResult() {
        double resultAsDouble = (double) firstNum/secondNum;
        int resultAsInteger = (int) resultAsDouble;

        if ((resultAsDouble-resultAsInteger) >= 0.5) {
            System.out.println("Rounded result: " + (resultAsInteger+1));
        } else {
            System.out.println("Rounded result: " + resultAsInteger);
        }
    }

    private void printRemainder() {
        System.out.println("Remainder: " + firstNum%secondNum);
    }

    private void printPercentage() {
        System.out.println("Percentage: " + (int) (firstNum * 100.0/secondNum) + "%");
    }

    public static void main(String[] args) {
        new IntegerDivision();
    }
}
