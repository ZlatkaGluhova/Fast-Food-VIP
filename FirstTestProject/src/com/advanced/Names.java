package com.advanced;

import com.sun.source.tree.IfTree;

public enum Names {
    PESHO_1("Pesho1"),
    PESHO_2("Pesho2"),
    PESHO_3("Pesho3");


    private String name;
    private static String[] names;

    Names(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getNames() {
        return names;
    }

    public static String[] getValues() {
        if (names == null) {
            Names[] namesFromEnums = Names.values();
            int length = namesFromEnums.length;
            names = new String[length];

            for (int i = 0; i < length; i++) {
                names[i] = namesFromEnums[i].getName();
            }
        }
        return names;
    }

    public static String[] getValuesWithoutTheLastOne() {
//        if (names == null || names.length > 2) {
            Names[] namesFromEnums = Names.values();
            int length = namesFromEnums.length - 1;
            String[] names = new String[length];

            for (int i = 0; i < length; i++) {
                names[i] = namesFromEnums[i].getName();
            }
            return names;
//        }
//        return names;
    }
}
