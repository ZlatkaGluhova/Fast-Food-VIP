package com.methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println(printArea(width, length));

    }

    public static double printArea(double a, double b) {
        return a * b;
    }
}
