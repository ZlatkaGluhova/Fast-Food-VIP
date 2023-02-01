package com.methods;

import com.methods.utils.MathematicalOperation;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        // "add", "multiply", "subtract", "divide
        MathematicalOperation type = MathematicalOperation.getOperation(calculation.toUpperCase());
        switch (type) {
            case ADD:
                add(firstNumber, secondNumber);
                break;
            case MULTIPLY:
                multiply(firstNumber, secondNumber);
                break;
            case SUBTRACT:
                subtract(firstNumber, secondNumber);
                break;
            case DIVIDE:
                divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Not a Mathematical Operation!");
                break;
        }
    }

    public static void add(int first, int second) {
        System.out.println(first + second);
    }

    public static void multiply(int first, int second) {
        System.out.println(first * second);
    }

    public static void subtract(int first, int second) {
        System.out.println(first - second);
    }

    public static void divide(int first, int second) {
        System.out.println(first / second);
    }
}
