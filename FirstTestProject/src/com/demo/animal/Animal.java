package com.demo.animal;

public class Animal {

    private String name;
    private int legs;
    private Integer age;
    private String color;

    public Animal() {
    }

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public Animal(String name, int legs, Integer age, String color) {
        this.name = name;
        this.legs = legs;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "name = '" + name + '\'' +
                ", legs =" + legs +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

