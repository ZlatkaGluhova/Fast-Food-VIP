package com.DataStructure.enums;

public enum Header {
    ANIMAL("animal"),
    ANIMAL_TYPE("animalType"),
    ANIMAL_NAME("animalName"),
    ANIMAL_COLOR("animalColor"),
    ANIMAL_AGE("animalAge"),
    ZOO_NAME("zooName"),
    ZOO_TOWN("zooTown"),
    TICKET_PRICE("ticketPrice"),
    TICKET_PRICE_WITH_VAT("ticketPriceWithVAT");

    private String text;

    Header(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
