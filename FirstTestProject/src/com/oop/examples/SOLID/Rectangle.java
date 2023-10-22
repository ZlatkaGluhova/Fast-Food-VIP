package com.oop.examples.SOLID;

public class Rectangle implements Shape {
// 2. We create a new class Cube.

    @Override // 2.3.
    public double area() {
        return 20;
    }

    @Override //4. We can't implement this method, because circle is not 3d object.
    public double volume() {
        return 0;
    }


}
