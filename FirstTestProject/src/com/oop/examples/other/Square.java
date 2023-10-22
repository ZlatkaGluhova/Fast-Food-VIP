package com.oop.examples.other;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * side;
        System.out.println(perimeter);
    }

    @Override
    public void calculateArea() {
        area = Math.pow(side, 2);
        System.out.println(area);
    }
}
