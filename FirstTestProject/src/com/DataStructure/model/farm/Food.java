package com.DataStructure.model.farm;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Food {
    HAY("Hay", 12),
    GRANULES("Granules", 0.89),
    WATER("Water", 1),
    FODDER("Fodder", 2.45);

    private String name;
    private BigDecimal singlePrice;
    private BigDecimal priceWithVAT;

    Food(String name, double singlePrice) {
        this.name = name;
        this.singlePrice = BigDecimal.valueOf(singlePrice);
        this.priceWithVAT = BigDecimal.valueOf(singlePrice * 1.2).setScale(2, RoundingMode.HALF_UP);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(BigDecimal singlePrice) {
        this.singlePrice = singlePrice;
    }

    public BigDecimal getPriceWithVAT() {
        return priceWithVAT;
    }

    public void setPriceWithVAT(BigDecimal singlePrice) {
        this.priceWithVAT = BigDecimal.valueOf(singlePrice.doubleValue() * 1.2).setScale(2, RoundingMode.HALF_UP);
    }

}

