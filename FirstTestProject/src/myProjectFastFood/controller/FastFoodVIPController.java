package myProjectFastFood.controller;

import myProjectFastFood.utils.enums.MenuType;

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
        System.out.println("1. Pizza Margherita - 16.90lv.");
        System.out.println("2. Pizza Pepperoni - 16.80lv");
        System.out.println("3. Pizza Vegetariana - 15.60lv.");
        System.out.println("4. Pizza Carbonarra - 16.50lv.");
        System.out.println("5. Pizza Bianka - 18.20lv.");
        System.out.println("6. Pizza Cheese - 16.40lv.");
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
