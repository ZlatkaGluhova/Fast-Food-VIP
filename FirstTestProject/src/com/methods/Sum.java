package com.methods;

import java.util.Scanner;

public class Sum {

    public static int SumNumbers(int a, int b) {
        return a + b;
    }

    public static int maxNumber(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.next());
        int num2 = Integer.parseInt(scanner.next());

        int multiply = SumNumbers(num1, num2) * 2;
        System.out.println(multiply);

        System.out.println(multiply + (multiply / 8.5));
        String print = String.format("The max number is: %d", maxNumber(num1, num2));
        System.out.println(print);

    }
}
