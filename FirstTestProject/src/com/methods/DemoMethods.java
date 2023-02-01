package com.methods;

import java.util.Scanner;


public class DemoMethods {
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printRowOfNumbers(i);
        }
        for (int i = size - 1; i >= 1; i--) {
            printRowOfNumbers(i);
        }
    }

    static void printRowOfNumbers(int lastNumber) {

        for (int i = 1; i <= lastNumber; i++) {
            System.out.print(i + " * ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        printTriangle(size);

        String a = "Vasko";
        System.out.println(a);
        a = "Pesho";
        System.out.println(a);

        int b = 5;
        System.out.println(b);
        b = 8;
        System.out.println(b);
    }
}
