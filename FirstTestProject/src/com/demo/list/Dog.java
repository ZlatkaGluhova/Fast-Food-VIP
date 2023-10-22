package com.demo.list;

public class Dog extends Animall implements AnimalBehavior, AnimalFeeding {

    private int leg;

    public Dog(){}

    public Dog(int leg) {
        this.leg = leg;
    }

    public Dog(String name, int age, int leg) {
        super(name, age);
        this.leg = leg;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Dog{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                "leg=" + leg +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }

    @Override
    public void eat() {

    }

    @Override
    public void fastRun() {

    }
}
