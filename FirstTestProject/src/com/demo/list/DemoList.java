package com.demo.list;

import jdk.jfr.ValueDescriptor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Vasko");
//        names.add("Zlati");
//        names.add("Radi");
//        names.add("Venika");
//        names.add("Bistra");
//        names.add("Koko");
//        names.add("Kami");
//        names.add("Stilian");
//        int num = 1;
//        for (String name : names) {
//            System.out.println(num + ". " + name);
//            num ++;
//        }

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        print(numbers);

        for (int i = numbers.size() - 1; i >= 0 ; i--) {
            System.out.print(numbers.get(i));
            System.out.print("ПИСХЛЕМЕЕЕ");
            if (numbers.get(i) > 1){
                System.out.print(", ");
            }
        }
//        print(numbers);
//        numbers.remove(5);
//        print(numbers);
//        numbers.add(5, 100);
//        print(numbers);
//        numbers.remove(Integer.valueOf(100));
//        print(numbers);


    }
    private static void print(List<Integer> numbers) {
        System.out.println(numbers);
    }
}

