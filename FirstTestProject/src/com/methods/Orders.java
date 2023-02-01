package com.methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        printResult(product, quantity);
    }

    private static void printResult(String nameOfProduct, int quantityOfProduct) {
        double price;
        switch (nameOfProduct) {
            case "coffee":
                price = 1.5;
                System.out.println(quantityOfProduct * price);
                break;
            case "water":
                price = 1.0;
                System.out.println(quantityOfProduct * price);
                break;
            case "coke":
                price = 1.4;
                System.out.println(quantityOfProduct * price);
                break;
            case "snacks":
                price = 2.0;
                System.out.println(quantityOfProduct * price);
                break;
        }
    }
}
