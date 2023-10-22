package com.DataStructure.model.farm;

public enum City {
    PLOVDIV("Plovdiv"),
    BLAGOEVGRAD("Blagoevgrad"),
    SILISTRA("Silistra"),
    BURGAS("Burgas");

    private String name;

    City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
