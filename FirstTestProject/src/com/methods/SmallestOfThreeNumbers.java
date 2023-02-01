package com.methods;

import javax.security.sasl.SaslClient;
import java.util.*;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int result = findSmallestNumber(first, second, third);
        System.out.println(result);

    }

    public static int findSmallestNumber(int a, int b, int c) {
List<Integer> sort = Arrays.asList(2,8,1,3,10,55,2,5,3,99,6,8) ;
       Collections.sort(sort);

        System.out.println(sort);
        int smallestNumber;
        if (a < b && a < c) {
            smallestNumber = a;
        } else if (b < a && b < c) {
            smallestNumber = b;
        } else {
            smallestNumber = c;
        }
        return smallestNumber;
    }
}
