package com.demo.list;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[input];
        for (int i = 0; i < input; i++) {
           numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = input - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
       System.out.println(Arrays.toString(numbers));



//        int input = Integer.parseInt(scanner.nextLine());
//        int[] numbers = new int[input];
//        for (int i = input; i > 0; i--) {
//            numbers[input - i] = i;
//        }
//
//        System.out.println(Arrays.toString(numbers));




    }
}
