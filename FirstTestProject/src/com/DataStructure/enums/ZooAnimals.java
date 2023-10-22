package com.DataStructure.enums;

public enum ZooAnimals {

    MONKEY("Monkey"),
    TIGER("Tiger"),
    PARROT("Parrot");


    private String type;

    ZooAnimals(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
