package com.methods;

import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        printTriangle(input);
    }

    public static void printTriangle(int num) {
        for (int i = 1; i < num; i++) {
            printResult(i);
            System.out.println();
        }

        for (int i = num; i >= 0; i--) {
            printResult(i);
            System.out.println();
        }
    }


    private static void printResult(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
    }
}
