package com.DataStructure.model.farmAnimals;

import com.DataStructure.enums.Food;

import java.util.Map;

public class Dog {
    private long id;
    private String name;
    private int age;
    private Map<String, Food> food;
    private double foodPrice;

    public Dog() {
    }

    public Dog(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Map<String, Food> getFood() {
        return food;
    }

    public void setFood(Map<String, Food> food) {
        this.food = food;
    }

    public double getPrice() {
        return foodPrice;
    }

    public void setPrice(double price) {
        this.foodPrice = price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", food=" + food +
                ", foodPrice=" + foodPrice +
                '}';
    }
}
