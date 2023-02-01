package com.demo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoVasko {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{4, 4, 4, 2, 2, 6, 4, 3, 3, 2, 6, 5, 22, 33, 123};


        List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(numbers);

        List<Integer> unicList = printGrades(numbers);
        System.out.println("---------------------------");
        printGradesReverse(unicList, numbers);
        System.out.println("---------------------------");
        printEvenOrOdd(unicList);
        System.out.println("---------------------------");
        evenAndOdd(numbers);
    }

    public static List<Integer> printGrades(List<Integer> grades) {
        int result = 0;
        List<Integer> newList = new ArrayList<>();
        for (Integer num : grades) {
            if (newList.isEmpty() || !newList.contains(num)) {
                for (int i = 0; i <= grades.size() - 1; i++) {
                    if (grades.get(i).equals(num)) {
                        result += 1;
                    }
                }
                newList.add(num);
                System.out.printf("Grades by %d is: %d%n", num, result);
                result = 0;
            }
        }
        return newList;
    }

    public static void printGradesReverse(List<Integer> unicList, List<Integer> grades) {

        for (int i = unicList.size() - 1; i >= 0; i--) {
            int result = 0;
            for (Integer grade : grades) {
                if (unicList.get(i).equals(grade)) {
                    result += 1;
                }
            }
            System.out.printf("Grades by %d is: %d%n", unicList.get(i), result);
        }
    }

    public static void evenAndOdd(List<Integer> grades) {
        int resultOdd = 0;
        int resultEven = 0;
        for (Integer grade : grades) {
            if (grade % 2 == 1) {
                resultOdd += 1;
            } else {
                resultEven += 1;
            }
        }
        System.out.printf("The odd numbers is: %d%n", resultOdd);
        System.out.printf("The even numbers is: %d%n", resultEven);
    }

    public static void printEvenOrOdd(List<Integer> unicList) {
        for (Integer integer : unicList) {
            if (integer % 2 == 1) {
                System.out.printf("%d - is odd%n", integer);
            } else {
                System.out.printf("%d - is even%n", integer);
            }
        }
    }
}
