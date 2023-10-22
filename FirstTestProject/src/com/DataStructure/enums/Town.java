package com.DataStructure.enums;

public enum Town {
    SOFIA("Sofia"),
    SMOLYAN("Smolyan"),
    SLIVEN("Sliven"),
    RILA("Rila");

    private String town;

    Town(String town) {
        this.town = town;
    }

    public String getTown() {
        return town;
    }
}
