package com.bankAccount;

import java.util.Comparator;

public class BankAccount {
    private static double interestRate = 0.02;
    private static int accountsCount = 0;

    private int id;
    private String name;
    private double balance;

    public BankAccount() {
        accountsCount++;
        id = accountsCount;
    }

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void deposit(double money) {
        balance += money;
    }

    public double getInterest(int years){
        return years * interestRate * balance;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " id = " + id +
                ", name = '" + name + '\'' +
                ", balance = " + balance +
                '}' + '\n';
    }
}
