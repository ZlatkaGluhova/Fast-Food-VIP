package com.demo.animal;

public class SuperSnimal {

    private Animal animal;

    public SuperSnimal(Animal animal) {
        this.animal = animal;
    }

    public SuperSnimal() {

    }

    public Animal getAnimal2() {
        return animal;
    }

    public void addAnimal2(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "SuperSnimal{" +
                "animal=" + animal +
                '}';
    }
}
