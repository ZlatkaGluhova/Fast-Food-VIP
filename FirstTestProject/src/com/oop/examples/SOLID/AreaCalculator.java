package com.oop.examples.SOLID;

import java.util.List;

public class AreaCalculator {
// This class now have a Single responsibility

    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum += shapes.get(i).area();
        }
        return sum;
    }

//    public int sum(List<Object> shapes) {   -> before 2. Open-closed
//        int sum = 0;
//        for (int i = 0; i < shapes.size(); i++) {
//            Object shape = shapes.get(i);
//            if (shape instanceof Square) {
//                sum += Math.pow(((Square) shape).getLength(), 2);
//            }
//            if (shape instanceof Circle) {
//                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
//            }
//            // 2.1. After we create new class Cube - we have to add new if-statement, but with that
//            // we broke the rule of Open-closed. We have to create new interface - Shape
//            if (shape instanceof Cube){
//
//            }
//        }
//        return sum;
//    }

//    S - Single Responsibility - we broke the rule - these methods don't belong here!!!
//        They have to be in other class -> ShapesPrinter
//
//    public String json(List<Object> shapes){
//        return String.format("{sum: %s}", sum(shapes));
//    }
//
//    public String csv(List<Object> shapes){
//        return String.format("sum,%s", sum(shapes));
//    }
}
