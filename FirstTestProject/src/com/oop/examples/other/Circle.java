package com.oop.examples.other;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * this.radius;
        System.out.println(perimeter);
    }

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(this.radius, 2);
        System.out.println(area);
    }
}
