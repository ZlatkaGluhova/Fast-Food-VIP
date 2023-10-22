package Tests;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.speak();
        Cat cat = new Cat();
        cat.speak();

        Animal cat2 = new Cat();
        cat2.speak();

        Main main = new Main();
        main.type(animal);
        main.type(cat);
        main.type(cat2);

        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.printf("Cannot write file: %s, %s%n", "Vasko", e);
        }

        System.out.println("Pesho");

    }

    public void type(Animal animal) {
        System.out.println(animal);
    }
}
