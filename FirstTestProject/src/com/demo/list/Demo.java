package com.demo.list;

import java.util.*;
import java.util.stream.IntStream;

public class Demo {


//    print(String[] args);
//
//    print(String s1,String s1,String s1,String s1,String s1,String s1,String s1,String s1,);


    public static void main(String[] args) {

//        List<String> names = new ArrayList<>();
//        names.add("Vasko");
//        names.add(1, "Zlati");
//        names.add("Radi");
//        names.add("Zlatin");
//        System.out.println(names);
//
//        for (String name : names) {
//            System.out.printf(" - %s", name);
//        }
//        System.out.println();
//
//        names.remove(2);
//        System.out.println(names);
//
//        names.remove(2);
//        System.out.println(names);
//
//        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
//        nums.remove(2);
//        nums.remove(Integer.valueOf(50));
//        nums.add(100);
//        nums.add(0, 150);
//
//        for (int i = 0; i < nums.size(); i++) {
//            System.out.print(nums.get(i) + " ");
//        }
//        System.out.println();
//
//        System.out.println(names.contains("Vasko"));
//
//        for (int i = 0; i < names.size(); i++) {
//            if (names.contains("Zlati")) {
//                System.out.println(names.get(i));
//            }
//        }
//
//        System.out.println("-------------------");
//
//        Scanner scanner = new Scanner(System.in);
////        int n = Integer.parseInt(scanner.nextLine());
////        List<Integer> list = new ArrayList<>();
////        for (int i = 0; i < n; i++) {
////            int number = Integer.parseInt(scanner.nextLine());
////            list.add(number);
////        }
////        System.out.println(list);

        Integer[] arr = new Integer[]{4, 4, 4, 2, 2, 6, 4, 3, 3, 2, 6, 5, 22, 33, 123};


        List<Integer> numbers = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(numbers);

        List<Integer> unicList = printGrades(numbers);
        System.out.println("---------------------------");
        printGradesReverse(unicList, numbers);
        System.out.println("---------------------------");

        int[] result = evenOrOdd(numbers);
        printEvenOrOdd(result);



    }


    //   System.out.printf("All Grades by %d is: %d", input, result);

    //    System.out.println("All Grades by 4 is:");
//        List<Integer> numberss = Arrays.asList(arr);
    // sumAdjacentEqualNumbers(numbers);


    private static void sumAdjacentEqualNumbers(List<Integer> numbers) {

        int index = 0;
        while (index < numbers.size() - 1) {
            int curr = numbers.get(index);
            int next = numbers.get(index + 1);

            if (curr == next) {
                int sum = curr + next;
                numbers.set(index, sum);
                numbers.remove(index + 1);
                index = 0;
            } else {
                index++;
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static List<Integer> printGrades(List<Integer> grades) {
        int result = 0;
        List<Integer> newList = new ArrayList<>();
        for (Integer num : grades) {
            if (newList.isEmpty() || !newList.contains(num)) {
                for (int i = 0; i <= grades.size() - 1; i++) {
                    if (grades.get(i) == num) {
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
            int resultOdd = 0;
            String evenOrOdd = "";
            int result = 0;
            for (int j = 0; j < grades.size(); j++) {
                if (unicList.get(i) == grades.get(j)) {
                    result += 1;
                    if (unicList.get(i) % 2 == 1) {
                        resultOdd += 1;
//                        evenOrOdd = "is odd";
                    } else {
//                        evenOrOdd = "is even";
                    }
                }
            }

            System.out.printf("Grades by %d is: %d - %s%n", unicList.get(i), result, evenOrOdd);
//            System.out.printf("Grades by %d is: %d - %s%n", unicList.get(i), result, evenOrOdd);
        }
    }

    public static int[] evenOrOdd(List<Integer> grades) {
        int[] resultEvenOrOdd = new int[]{0, 1};
        int resultOdd = 0;
        int resultEven = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) % 2 == 1) {
                resultOdd += 1;
            } else {
                resultEven += 1;
            }
        }

        resultEvenOrOdd[0] = resultOdd;
        resultEvenOrOdd[1] = resultEven;

        return resultEvenOrOdd;
    }


    public static void printEvenOrOdd(int[] evenOrOdd) {
        System.out.printf("The even numbers is: %d%n The odd numbers is: %d%n", evenOrOdd[0], evenOrOdd[1]);
    }
}


//
//        int result = 0;
//        List<Integer> newList = new ArrayList<>();
//        for (Integer num : grades) {
//            if (newList.isEmpty() || !newList.contains(num)) {
//                for (int i = 0; i <= grades.size() - 1; i++) {
//                    if (grades.get(i) == num) {
//                        result += 1;
//                    }
//                }
//                newList.add(num);
//                for (int i = grades.size() - 1; i > 0; i--) {
//                    System.out.printf("Grades by %d is: %d%n", grades.get(i), result);
//
//            }
//                result = 0;
//        }

//        }





