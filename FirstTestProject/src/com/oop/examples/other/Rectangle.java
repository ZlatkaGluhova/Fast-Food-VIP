package com.oop.examples.other;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * this.height + 2 * this.width;
        System.out.println(perimeter);
    }

    @Override
    public void calculateArea() {
        area = this.height * this.width;
        System.out.println(area);
    }
}
