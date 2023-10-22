package com.advanced.fileManipulations;

public enum Type {
    TEACHER("TEACHER"),
    STUDENT("STUDENT");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
