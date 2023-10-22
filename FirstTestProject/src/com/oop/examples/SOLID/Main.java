package com.oop.examples.SOLID;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(); // -> 2.Open-close
        Shape noShape = new NoShape(); // -> 3.Liskov substitution
        Rectangle rectangle = new Rectangle(); // -> 2.Open-close
        ShapesPrinter printer = new ShapesPrinter();
//        List<Object> shapes = List.of(circle, square); -> before 2.Open-closed
        List<Shape> shapes = List.of(
                circle,
                square,
                cube,
                rectangle);
        int sum = areaCalculator.sum(shapes);
//        System.out.println(areaCalculator.json(shapes));  -> before 1.Single responsibility
//        System.out.println(areaCalculator.csv(shapes));   -> before 1.Single responsibility
        System.out.println(printer.json(sum)); // now we have Single responsibility
        System.out.println(printer.csv(sum));// now we have Single responsibility
    }
}
