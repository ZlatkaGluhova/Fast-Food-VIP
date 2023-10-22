package com.bankAccount;

import java.util.*;

public class Main {
    private static String[] lineArguments;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = commands(scanner);
        Map<Integer, BankAccount> accounts = new HashMap<>();
        BankAccount bankAccount;
        String result = "";


        while (!command.equalsIgnoreCase("End")) {
            result = "";

            switch (command.toUpperCase()) {
                case "CREATE":
                    String name = lineArguments[1];

                    bankAccount = new BankAccount();
                    bankAccount.setName(name);
                    accounts.put(bankAccount.getId(), bankAccount);
                    result = String.format("Account ID%d - %s - created", bankAccount.getId(), bankAccount.getName());
                    break;
                case "DEPOSIT":
                    int accountID = Integer.parseInt(lineArguments[1]);
                    double money = Double.parseDouble(lineArguments[2]);

                    if (accounts.containsKey(accountID)) {
                        bankAccount = accounts.get(accountID);
                        bankAccount.deposit(money);
                        accounts.put(accountID, bankAccount);
                        result = String.format("Deposited %.2f to ID%d", money, bankAccount.getId());
                    } else {
                        result = "Account does not exist!";
                    }
                    break;
                case "SETINTEREST":
                    double interestRate = Double.parseDouble(lineArguments[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;
                case "GETINTEREST":
                    int accountId = Integer.parseInt(lineArguments[1]);
                    int years = Integer.parseInt(lineArguments[2]);

                    if (accounts.containsKey(accountId)) {
                        bankAccount = accounts.get(accountId);
                        double totalInterest = bankAccount.getInterest(years);
                        result = String.format("%.2f", totalInterest);
                    } else {
                        result = "Account does not exist!";
                    }

                    break;
            }
            if (!result.isEmpty()) {
                System.out.println(result);
            }
            command = commands(scanner);
        }

        if (accounts.isEmpty()) {
            System.out.println("No any accounts found!");
        } else {
            System.out.println(accounts);
        }
        sortAccountsByBalance(accounts);

    }

    private static String commands(Scanner scanner) {
        lineArguments = scanner.nextLine().split("\\s+");
        return lineArguments[0];
    }

    public static void sortAccountsByBalance(Map<Integer, BankAccount> accounts) {
        List<BankAccount> accountsList = new ArrayList<>(accounts.values());

        Collections.sort(accountsList,
                Comparator.comparingDouble(BankAccount::getBalance).reversed());
        System.out.println(accountsList);
    }
}
