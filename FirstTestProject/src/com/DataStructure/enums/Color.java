package com.DataStructure.enums;

public enum Color {
    WHITE("White"),
    BROWN("Brown"),
    BLACK("Black"),
    YELLOW("Yellow"),
    GREEN("Green"),
    RED("Red"),
    TEAL("Teal");
//    GRAY("Gray"),
//    BLUE("Blue");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
