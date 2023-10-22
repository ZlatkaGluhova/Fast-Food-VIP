package com.DataStructure.enums;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Food {
    HAY("Hay", 12.00),
    GRANULES("Granules", 0.89),
    FODDER("Fodder", 2.45),
    WATER("Water", 1.00);

    private String name;
    private double price;
    private BigDecimal priceWithVAT;

    Food(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BigDecimal getPriceWithVAT() {
        return priceWithVAT;
    }

    public void setPriceWithVAT(double price) {
        this.priceWithVAT = BigDecimal.valueOf(price * 1.2).setScale(2, RoundingMode.HALF_UP);
    }
}
