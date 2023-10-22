package com.DataStructure.model;

public class Tiger {
    private String type;
    private String name;
    private int age;

    public Tiger() {
    }

    public Tiger(String breed, String name, int age) {
        this.type = breed;
        this.name = name;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "Tiger{" +
                "breed='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
