package com.oop.examples.other;

public abstract class Shape {
    protected double perimeter;
    protected double area;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract void calculatePerimeter();

    public abstract void calculateArea();

}
