package myProjectFastFood.controller;

import myProjectFastFood.model.Pizza;
import myProjectFastFood.utils.enums.MenuType;

import java.util.HashMap;
import java.util.Scanner;

public class FastFoodVIPController {

    public static final String DASHES = "~~~~~~~~~~~~~~~~~~~~~~~~";

    public void initFastFoodVIP() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        boolean checkNumber = MenuType.checkNumber(inputNumber);
        if (checkNumber = false) {
            System.out.println("Not found in current list!");
        } else {
            switch (inputNumber) {
                case 1:
                    printPizzaMenu();
                    break;
                case 2:
                    printBurgerMenu();
                    break;
                case 3:
                    printDonerMenu();
                    break;
                case 4:
                    printTostsMenu();
                    break;
                case 5:
                    printHotDogMenu();
                    break;
                case 6:
                    printGarnishesAndSaucesMenu();
                    break;
                case 7:
                    printDrinksMenu();
                    break;
                case 8:
                    printDessertMenu();
                    break;
            }
        }
    }

    private void printMenu() {
        System.out.println(DASHES);
        System.out.println("Welcome in Fast Food VIP");
        System.out.println(DASHES);
        System.out.println("MENU:");
        System.out.println("1. " + MenuType.PIZZA.getTypeEN());
        System.out.println("2. " + MenuType.BUGREG.getTypeEN());
        System.out.println("3. " + MenuType.DONER.getTypeEN());
        System.out.println("4. " + MenuType.TOST.getTypeEN());
        System.out.println("5. " + MenuType.HOT_DOG.getTypeEN());
        System.out.println("6. " + MenuType.GARNISHES_AND_SAUCES.getTypeEN());
        System.out.println("7. " + MenuType.DRINKS.getTypeEN());
        System.out.println("8. " + MenuType.DESSERT.getTypeEN());
        System.out.println(DASHES);
    }


    private void printPizzaMenu() {
        Pizza pizzaOne = new Pizza();
        pizzaOne.setNumber(1);
        pizzaOne.setName("Pizza Margherita");
        pizzaOne.setPrice(16.90);
        Pizza pizzaTwo = new Pizza();
        pizzaTwo.setNumber(2);
        pizzaTwo.setName("Pizza Pepperoni");
        pizzaTwo.setPrice(16.80);
        Pizza pizzaThree = new Pizza();
        pizzaThree.setNumber(3);
        pizzaThree.setName("Pizza Vegetariana");
        pizzaThree.setPrice(15.60);
        Pizza pizzaFour = new Pizza();
        pizzaFour.setNumber(4);
        pizzaFour.setName("Pizza Carbonarra");
        pizzaFour.setPrice(16.50);
        Pizza pizzaFive = new Pizza();
        pizzaFive.setNumber(5);
        pizzaFive.setName("Pizza Bianka");
        pizzaFive.setPrice(18.20);
        Pizza pizzaSix = new Pizza();
        pizzaSix.setNumber(6);
        pizzaSix.setName("Pizza Cheese");
        pizzaSix.setPrice(16.40);

        HashMap<Integer, Pizza> pizzaType = new HashMap<>();
        pizzaType.put(1, pizzaOne);
        pizzaType.put(2, pizzaTwo);
        pizzaType.put(3, pizzaThree);
        pizzaType.put(4, pizzaFour);
        pizzaType.put(5, pizzaFive);
        pizzaType.put(6, pizzaSix);
        for (int i = 1; i <= pizzaType.size(); i++) {
            switch (i) {
                case 1:
                    System.out.printf("%d. %s - %.2flv.%n", pizzaOne.getNumber(), pizzaOne.getName(), pizzaOne.getPrice());
                    break;
                case 2:
                    System.out.printf("%d. %s - %.2flv.%n", pizzaTwo.getNumber(), pizzaTwo.getName(), pizzaTwo.getPrice());
                    break;
                case 3:
                    System.out.printf("%d. %s - %.2flv.%n", pizzaThree.getNumber(), pizzaThree.getName(), pizzaThree.getPrice());
                    break;
                case 4:
                    System.out.printf("%d. %s - %.2flv.%n", pizzaFour.getNumber(), pizzaFour.getName(), pizzaFour.getPrice());
                    break;
                case 5:
                    System.out.printf("%d. %s - %.2flv.%n", pizzaFive.getNumber(), pizzaFive.getName(), pizzaFive.getPrice());
                    break;
                case 6:
                    System.out.printf("%d. %s - %.2flv.%n", pizzaSix.getNumber(), pizzaSix.getName(), pizzaSix.getPrice());
                    break;
            }


        }

//        for (int i = 0; i < pizzaType.size(); i++) {
//            if (input == i) {
//                System.out.println(pizzaType.get(i));
//            }
//        }

//        System.out.println("1. Pizza Margherita - 16.90lv.");
//        System.out.println("2. Pizza Pepperoni - 16.80lv");
//        System.out.println("3. Pizza Vegetariana - 15.60lv.");
//        System.out.println("4. Pizza Carbonarra - 16.50lv.");
//        System.out.println("5. Pizza Bianka - 18.20lv.");
//        System.out.println("6. Pizza Cheese - 16.40lv.");
    }

    private void printBurgerMenu() {

    }

    private void printDonerMenu() {

    }

    private void printTostsMenu() {

    }

    private void printHotDogMenu() {

    }

    private void printGarnishesAndSaucesMenu() {

    }

    private void printDrinksMenu() {

    }

    private void printDessertMenu() {

    }
}
