package com.advanced.fileManipulations;

public class Test {
    public static void main(String[] args) {
        String text = "adjaj;bcaish;\"jvoasj\"";
        String[] newText = new String[]{};

        text = text.replaceAll("\"", "");
        System.out.println();
    }
}
