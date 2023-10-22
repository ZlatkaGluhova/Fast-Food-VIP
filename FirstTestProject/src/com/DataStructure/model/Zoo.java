package com.DataStructure.model;

import com.DataStructure.enums.Town;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Zoo {
    private String name;
    private Town town;
    private double ticketPrice;
    private BigDecimal ticketPriceWithVAT;
    private List<Monkey> monkeys = new ArrayList<>();
    private List<Parrot> parrots = new ArrayList<>();
    private List<Tiger> tigers = new ArrayList<>();


    public Zoo() {
    }

    public Zoo(String name, Town town, double ticketPrice) {
        this.name = name;
        this.town = town;
        this.ticketPrice = ticketPrice;
    }

    public Zoo(String name, Town town, double ticketPrice, List<Monkey> monkeys,
               List<Parrot> parrots, List<Tiger> tigers) {
        this.name = name;
        this.town = town;
        this.ticketPrice = ticketPrice;
        this.monkeys = monkeys;
        this.parrots = parrots;
        this.tigers = tigers;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public BigDecimal getTicketPriceWithVAT() {
        return ticketPriceWithVAT;
    }

    public void setTicketPriceWithVAT(double ticketPrice) {
        this.ticketPriceWithVAT = BigDecimal.valueOf(ticketPrice * 1.2).setScale(2, RoundingMode.HALF_UP);
    }

    public List<Monkey> getMonkeys() {
        return monkeys;
    }

    public void setMonkeys(List<Monkey> monkeys) {
        this.monkeys = monkeys;
    }

    public void setMonkey(Monkey monkeys) {
        this.monkeys.add(monkeys);
    }

    public List<Parrot> getParrots() {
        return parrots;
    }

    public void setParrots(List<Parrot> parrots) {
        this.parrots = parrots;
    }

    public List<Tiger> getTigers() {
        return tigers;
    }

    public void setTigers(List<Tiger> tigers) {
        this.tigers = tigers;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", town=" + town +
                ", ticketPrice=" + ticketPrice +
                ", ticketPriceWithVAT=" + ticketPriceWithVAT +
                ", monkeys=" + monkeys +
                ", parrots=" + parrots +
                ", tigers=" + tigers +
                '}';
    }
}
