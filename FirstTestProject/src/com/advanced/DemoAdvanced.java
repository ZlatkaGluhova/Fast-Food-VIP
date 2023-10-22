package com.advanced;

import java.util.*;

public class DemoAdvanced {
    public static void main(String[] args) {
//        int [][] arr = new int[3][];
//        System.out.println(118%15);
//        Set<Integer> set = new HashSet<>();
//        set.add(5);
//        set.add(3);
//        set.add(6);
//        set.add(2);
//        set.add(7);
//        set.add(1);
//        set.add(15);
//        set.add(11);
//        set.add(28);
//        set.add(24);
//        set.add(76);
//        set.add(10);
//        System.out.println(set);
//        set.forEach(System.out::println);


        List<String> headers = new ArrayList<>();
        headers.add("Pesho1");
        headers.add("Pesho2");
        headers.add("Pesho3");

//        String[] headersFromList = new String[headers.size()];
//        for (int i = 0; i < headers.size(); i++) {
//            headersFromList[i] = headers.get(i);
//        }
        ;

//        Names.ge
        //print(headers.toArray(new String[headers.size()]));
//        print(addAllEnumsToArray());
//        print(addAllEnumsToArray());
//        print(addAllEnumsToArray());
//        print(addAllEnumsToArray());
//
//        System.out.println("------------------");
//        print(addEnumsWithoutTheLastOneToArray());
//        String[] names = new String[]{};
//        names = Names.getAllEnumsToArray(names);


        print(Names.getValuesWithoutTheLastOne());
        System.out.println("-------------");
        print(Names.getValues());
        System.out.println("-------------");
        print(Names.getValues());
        System.out.println("-------------");
        print(Names.getValues());
        System.out.println("-------------");
        print(Names.getValuesWithoutTheLastOne());
    }

    private static void print(String[] headers) {
        for (int i = 0; i < headers.length; i++) {
            System.out.println(headers[i]);
        }
    }


}
