package myProjectFastFood.controller;

import myProjectFastFood.model.Burger;
import myProjectFastFood.model.Order;
import myProjectFastFood.model.Pizza;
import myProjectFastFood.utils.enums.MenuType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FastFoodVIPController {

    public static final String DASHES = "~~~~~~~~~~~~~~~~~~~~~~~~";
    private Map<Integer, Pizza> pizzaMap = new HashMap<>();
    private Map<Integer, Burger> burgerMap = new HashMap<>();
    private Order order = new Order();
    double subtotal = 0;


    public void initFastFoodVIP() {
        printText("Welcome in Fast Food VIP");
        startMenu();
//        printText("Choose a number of product from the list!");
//        createSubtotal();
    }

    private void startMenu() {
        printMenu();
        printText("Choose a number of product from the list !");
        checkInputMenu();
    }

    private void printMenu() {
        System.out.println("MENU:");
        System.out.println("1. " + MenuType.PIZZA.getTypeEN());
        System.out.println("2. " + MenuType.BUGREG.getTypeEN());
        System.out.println("3. " + MenuType.DONER.getTypeEN());
        System.out.println("4. " + MenuType.TOST.getTypeEN());
        System.out.println("5. " + MenuType.HOT_DOG.getTypeEN());
        System.out.println("6. " + MenuType.GARNISHES_AND_SAUCES.getTypeEN());
        System.out.println("7. " + MenuType.DRINKS.getTypeEN());
        System.out.println("8. " + MenuType.DESSERT.getTypeEN());
        System.out.println("0. " + MenuType.EXIT.getTypeEN());
    }

    private void printText(String text) {
        System.out.println(DASHES);
        System.out.println(text);
        System.out.println(DASHES);

        /* 1. samo vida
         * 2. kolichestvo
         * 3. - mejdinna smetka
         * 4. 1 for continue, 2 for finish or 0 for cancel
         * 1 - vrushtane w menu
         * 2 - poruchkata sus kraina suma i nomer na poruchka (random)
         * 3 - text
         * */
    }

    private void checkInputMenu() {
        int inputNumber = inputNumber();
        boolean isValid = MenuType.checkValidNumMenu(inputNumber);
        if (!isValid) {
            printText("Not found in current list !");
        } else {
            switch (inputNumber) {
                case 1:
                    addAllPizzaInMap();
                    printPizzaMenu();
                    printText("Choose a number for pizza !");
                    int input = inputNumber();
                    Pizza pizza = pizzaMap.get(input);
                    printText("Choose a quantity for pizza !");
                    pizza.setQuantity(inputNumber());
                    pizza.setSum(pizza.getPrice() * pizza.getQuantity());
                    //int count = chooseQuantity(inputCount);
                    order.setPizza(pizza);
//                    if is not null
                    // double subtotal = pizza.getSum() + order.getPizza().getSum();
                    subtotal += pizza.getSum();
                    //  subtotal = pizza.getSum() + order.getPizzas().get(0).getSum();

                    createSubtotalPizza(pizza, subtotal);
                    startMenu();
                    break;

                case 2:
                    addAllBurgerInMap();
                    printBurgerMenu();
                    printText("Choose a number for burger !");
                    int inputBurger = inputNumber();
                    Burger burger = burgerMap.get(inputBurger);
                    printText("Choose a quantity for burger !");
                    int burgerQuantity = inputNumber();
                    burger.setQuantity(burgerQuantity);
                    burger.setSum(burger.getPrice() * burger.getQuantity());
                    order.setBurger(burger);
                    subtotal += burger.getSum();
                    createSubtotalBurger(burger, subtotal);
                    startMenu();
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

//    private int chooseQuantity(int input) {
//        printText("Choose a quantity for pizza !");
//        return input;
//    }

    private int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        boolean isNumeric = isNumeric(line);
        int inputNumber = 100;
        if (isNumeric) {
            inputNumber = Integer.parseInt(line);
        }

        return inputNumber;
    }

    //    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private Pattern pattern = Pattern.compile("(\\d+)?");

    public boolean isNumeric(String strNum) {
        if (strNum == null || strNum.equals("")) {
            return false;
        }

        try {
            Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

//    public boolean isNumeric2(String strNum) {
//        if (strNum == null || strNum.equals("")) {
//            return false;
//        }
//
//        return pattern.matcher(strNum).matches();
//    }

    private void printPizzaMenu() {
        System.out.println("PIZZA MENU:");
        for (int i = 1; i <= pizzaMap.size(); i++) {
            Pizza pizza = pizzaMap.get(i);
            System.out.printf("%d. %s - %.2flv.%n", i, pizza.getName(), pizza.getPrice());
        }
    }

    private void addAllPizzaInMap() {
        pizzaMap.put(1, new Pizza(1, "Pizza Margherita", 16.90));
        pizzaMap.put(2, new Pizza(2, "Pizza Pepperoni", 16.80));
        pizzaMap.put(3, new Pizza(3, "Pizza Vegetariana", 15.60));
        pizzaMap.put(4, new Pizza(4, "Pizza Carbonarra", 16.50));
        pizzaMap.put(5, new Pizza(5, "Pizza Bianka", 18.20));
        pizzaMap.put(6, new Pizza(6, "Pizza Cheese", 16.40));

//        return pizzaMap;
    }

//    private Pizza checkPizza() {
//        int inputNumber = inputNumber();
//        boolean isValid = addAllPizzaInMap().containsKey(inputNumber);
//        if (!isValid) {
//            printText("Not found in current list!");
//
//        } else {
//            return addAllPizzaInMap().get(inputNumber);
//        }
//        return null;
//    }

//    private int pizzaCount() {
//        int inputNumber = inputNumber();
//
//        if (inputNumber > 0) {
//            return inputNumber;
//
//        } else {
//            printText("Not a number");
//        }
//        return 0;
//    }

    private void printBurgerMenu() {
        System.out.println("BURGER MENU:");
        for (int i = 1; i <= burgerMap.size(); i++) {
            Burger burger = burgerMap.get(i);
            System.out.printf("%d. %s - %.2flv.%n", i, burger.getName(), burger.getPrice());
        }
    }

    private void addAllBurgerInMap() {
        burgerMap.put(1, new Burger(1, "Chicken Burger Classic", 5.80));
        burgerMap.put(2, new Burger(2, "Vegetarian Burger ", 4.30));
        burgerMap.put(3, new Burger(2, "Cryspy Chicken Burger", 6.20));

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

    private void createSubtotalPizza(Pizza pizza, double sumSubtotal) {
        System.out.println(DASHES);
        System.out.printf("You choose: %s - %d x %.2flv. - %.2flv.%n", pizza.getName(), pizza.getQuantity(), pizza.getPrice(), pizza.getSum());
        System.out.printf("Subtotal is: %.2flv.%n", sumSubtotal);
        System.out.println(DASHES);
    }

    private void createSubtotalBurger(Burger burger, double sumSubtotal) {
        System.out.println(DASHES);
        System.out.printf("You choose: %s - %d x %.2flv. - %.2flv.%n", burger.getName(), burger.getQuantity(), burger.getPrice(), burger.getSum());
        System.out.printf("Subtotal is: %.2flv.%n", sumSubtotal);
        System.out.println(DASHES);
    }

    private void createTotal() {

    }
}
