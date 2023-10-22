package com.oop.examples.SOLID;

public interface Shape {
    // 2.2. We create interface for shapes
    double area();
    // 4. Interface Segregation - we broke the rule! We cannot use the method to calculate the volume on every class
    // that implements the interface, because not every of them is 3d object (cannot implement something that it can't do)
    double volume();
}
