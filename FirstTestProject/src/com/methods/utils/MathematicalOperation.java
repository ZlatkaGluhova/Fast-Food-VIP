package com.methods.utils;

public enum MathematicalOperation {
    ADD("add"),
    MULTIPLY("multiply"),
    SUBTRACT("subtract"),
    DIVIDE("divide"),
    DEFAULT("default");

    private String operation;

    MathematicalOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return "MathematicalOperation{" +
                "operation='" + operation + '\'' +
                '}';
    }

    public static MathematicalOperation getOperation(String value) {
        for(MathematicalOperation v : values()) {
            if(v.getOperation().equalsIgnoreCase(value)) return v;
        }

        return MathematicalOperation.DEFAULT;
    }

}
