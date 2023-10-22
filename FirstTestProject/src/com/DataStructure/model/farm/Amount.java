package com.DataStructure.model.farm;

import com.DataStructure.enums.Food;

import java.math.BigDecimal;
import java.util.Map;

public class Amount {
    private long id;
    private Map<String, Food> foodType;
    private BigDecimal singlePrice;
    private BigDecimal priceWithVAT;
    private double quantity;

    public Amount() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<String, Food> getFoodType() {
        return foodType;
    }

    public void setFoodType(Map<String, Food> foodType) {
        this.foodType = foodType;
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

    public void setPriceWithVAT(BigDecimal priceWithVAT) {
        this.priceWithVAT = priceWithVAT;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
