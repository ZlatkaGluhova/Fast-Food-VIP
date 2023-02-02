package myProjectFastFood;

import myProjectFastFood.controller.FastFoodVIPController;
import myProjectFastFood.utils.enums.MenuType;

import java.util.Scanner;

public class MallVIPMain {

    public static void main(String[] args) {
        FastFoodVIPController fastFoodVIP = new FastFoodVIPController();
        fastFoodVIP.initFastFoodVIP();
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        MenuType.checkNumber(inputNumber);


    }
}
