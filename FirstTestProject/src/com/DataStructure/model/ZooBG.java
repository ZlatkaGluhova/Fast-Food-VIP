package com.DataStructure.model;

import com.DataStructure.enums.Town;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class ZooBG {
    private String name;
    private Town town;
    private double ticketPrice;
    private BigDecimal ticketPriceWithVAT;
    private Map<String, Monkey> monkeysMap;
    private Map<String, Parrot> parrotsMap;
    private Map<String, Tiger> tigersMap;
    private Map<String, Penguin> penguinsMap;

    public ZooBG() {
    }

    public ZooBG(String name, Town town, double ticketPrice) {
        this.name = name;
        this.town = town;
        this.ticketPrice = ticketPrice;
        this.ticketPriceWithVAT = BigDecimal.valueOf(ticketPrice * 1.2).setScale(2, RoundingMode.HALF_UP);
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

    public Map<String, Monkey> getMonkeysMap() {
        return monkeysMap;
    }

    public void setMonkeysMap(Map<String, Monkey> monkeysMap) {
        this.monkeysMap = monkeysMap;
    }

    public Map<String, Parrot> getParrotsMap() {
        return parrotsMap;
    }

    public void setParrotsMap(Map<String, Parrot> parrotsMap) {
        this.parrotsMap = parrotsMap;
    }

    public Map<String, Tiger> getTigersMap() {
        return tigersMap;
    }

    public void setTigersMap(Map<String, Tiger> tigersMap) {
        this.tigersMap = tigersMap;
    }

    public Map<String, Penguin> getPenguinsMap() {
        return penguinsMap;
    }

    public void setPenguinsMap(Map<String, Penguin> penguinsMap) {
        this.penguinsMap = penguinsMap;
    }

    @Override
    public String toString() {
        return "ZooBG{" +
                "name='" + name + '\'' +
                ", town=" + town +
                ", ticketPrice=" + ticketPrice +
                ", ticketPriceWithVAT=" + ticketPriceWithVAT +
                ", monkeysMap=" + monkeysMap +
                ", parrotsMap=" + parrotsMap +
                ", tigersMap=" + tigersMap +
                ", penguinsMap=" + penguinsMap +
                '}';
    }
}
