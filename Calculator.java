package alex.homework3;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        startCalculator();
    }

    private static void startCalculator() {
        int num1 = getInt();
        char operation = getOperation();
        int num2 = getInt();
        int result = calc(num1, num2, operation);
        System.out.println("Result: " + result);
        exitCalculator();
    }

    private static int getInt() {
        System.out.println("Enter the number:");
        int num;
        if (!SCANNER.hasNextInt()) {
            System.out.println("You made a mistake when entering a number. Try again.");
            SCANNER.next();
            num = getInt();
        } else {
            num = SCANNER.nextInt();
        }
        return num;
    }

    private static char getOperation() {
        System.out.println("Enter an operation:");
        char operation;
        if (SCANNER.hasNext()) {
            operation = SCANNER.next().charAt(0);
        } else {
            System.out.println("You made a mistake while entering the transaction. Try again.");
            SCANNER.next();
            operation = getOperation();
        }
        return operation;
    }

    private static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operation not recognized. Re-enter.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }

    private static void exitCalculator() {
        System.out.println("If you want to perform more operation please press any key");
        System.out.println("If you want close calculator please write (exit)");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        if (!Objects.equals(key, "exit")) {
            startCalculator();
        } else {
            System.out.println("Calculator closed");
        }
    }
}

