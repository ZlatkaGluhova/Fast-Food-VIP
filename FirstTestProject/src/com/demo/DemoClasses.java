package com.demo;

import com.demo.animal.Animal;
import com.demo.animal.SuperSnimal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoClasses {

    public static void main(String[] args) {
        InputStream in = System.in;

        Scanner scanner = new Scanner(System.in);
//
//        String nameScan = scanner.nextLine();
//        int i = Integer.parseInt(nameScan);



        Animal animal = new Animal("Pesho", 5, 22, "Yellow");
        Animal animal2 = new Animal("Pesho2", 7, 22, "Yellow");
        Animal animal3 = new Animal("Pesho3", 9, 22, "Yellow");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);
        animals.add(animal3);


        List<Animal> animals2 = new ArrayList<>();
        animals2.add(animal);
        animals2.addAll(animals);
        Animal animal1 = animals2.get(2);

        Animal animal12 = new Animal();

        animal12.setName("Penkaaaaaa");
        animal12.setLegs(animal1.getLegs());
        animal12.setAge(animal1.getAge());
        animal12.setColor(animal1.getColor());

        System.out.println(animals);
        System.out.println("-----------------");
        System.out.println(animals2);
        System.out.println("-----------------");
        System.out.println(animal12);
        System.out.println("-----------------");


        animals.add(animal);
        SuperSnimal s = new SuperSnimal(animal);



//        Animal animal = superSnimal.getAnimal2();
//        Animal animal = new Animal();

        animal.setName("Pepi");
        String name = animal.getName();

        System.out.println("-----------------");
        System.out.println(name);
        System.out.println(animal);
s.addAnimal2(animal);
        System.out.println(s);
        System.out.println("-----------------");
//
//            System.out.println(animal.age);
//        System.out.println(animal.color);














    }

}
