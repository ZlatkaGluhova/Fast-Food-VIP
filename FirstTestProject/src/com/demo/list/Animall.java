package com.demo.list;

public class Animall {

    protected String name;
    protected int age;

    public Animall() {
    }

    public Animall(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animall{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
