package com.DataStructure.model;

import com.DataStructure.enums.Color;

public class Penguin {
    private String type;
    private String name;
    private Color color;
    private int age;

    public Penguin() {
    }

    public Penguin(String type, String name, Color color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", age=" + age +
                '}';
    }
}
