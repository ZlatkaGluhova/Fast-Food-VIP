package com.oop.examples.SOLID;

public class NoShape implements Shape {
    //3. Create new class NoShape implements Shape - here we broke the rule - Liskov substitution
    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }

    @Override
    public double volume() {
        return 0;
    }
}
