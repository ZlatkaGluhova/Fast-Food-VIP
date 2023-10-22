package com.oop.examples.SOLID;

public class Square implements Shape{
    //2.3. Implements the Shape interface
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
       return Math.pow(getLength(), 2);
    }

    @Override //4. We can't implement this method, because circle is not 3d object.
    public double volume() {
        return 0;
    }
}
