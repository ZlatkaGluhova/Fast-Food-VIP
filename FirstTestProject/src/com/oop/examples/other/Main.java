package com.oop.examples.other;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.calculatePerimeter();
        rectangle.calculateArea();


        Circle circle = new Circle(3);
        circle.calculatePerimeter();
        circle.calculateArea();


        Square square = new Square(5);
        square.calculatePerimeter();
        square.calculateArea();


    }
}
