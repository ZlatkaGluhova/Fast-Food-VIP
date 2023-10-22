package com.oop.examples.SOLID;

public class ShapesPrinter {

//1. We create new class for printing. This class have a Single responsibility
    public String json(int sum){
        return String.format("{shapesSum: %s}", sum);
    }

    public String csv(int sum){
        return String.format("shapes_sum,%s", sum);
    }
}
