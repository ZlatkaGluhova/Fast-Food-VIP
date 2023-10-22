package com.bankAccount;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, BankAccount> accounts = new HashMap<>();

        accounts.put(1, new BankAccount(1, "Vasil", 150));
        accounts.put(2, new BankAccount(2, "Peter", 120));
        accounts.put(3, new BankAccount(3, "Ivan", 100));
        accounts.put(4, new BankAccount(4, "Peter2", 130));
        accounts.put(5, new BankAccount(5, "Peter3", 130));
        accounts.put(6, new BankAccount(6, "Peter4", 130));
        accounts.put(7, new BankAccount(7, "Peter1", 130));
        sortAccountsByBalance(accounts);
    }


    public static void sortAccountsByBalance(Map<Integer, BankAccount> accounts) {
        List<BankAccount> accountsList = new ArrayList<>(accounts.values());

        Collections.sort(accountsList,
                Comparator.comparingDouble(BankAccount::getBalance).reversed());
        System.out.println(accountsList);
    }
}
