package com.oop.examples.SOLID;

public class Circle implements Shape{
    //2.3. Implements the Shape interface
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override //2.3.
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override //4. We can't implement this method, because circle is not 3d object.
    public double volume() {
        return 0;
    }
}
