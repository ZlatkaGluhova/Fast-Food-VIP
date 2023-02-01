package com.demo.list;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (input <= 7 && input > 0) {
            System.out.println(days[input - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}

