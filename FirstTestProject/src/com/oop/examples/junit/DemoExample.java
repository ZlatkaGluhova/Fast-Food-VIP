package com.oop.examples.junit;

public class DemoExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sum = calculator.sum(5, 6);
        System.out.println(sum);

        double subtract = calculator.subtract(9,3);
        System.out.println(subtract);

        double multiply = calculator.multiply(2,3);
        System.out.println(multiply);

        double divide = calculator.divide(6,2);
        System.out.println(divide);
    }

}
