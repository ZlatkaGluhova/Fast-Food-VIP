package com.advanced.streamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) {
        // гласни букви - a, e, i, o, u
        //пунктуационни знаци - ! , . ?
        // съгласни букви - всичко останало
        int vowelsCount = 0;
        int punctCount = 0;
        int consonantsCount = 0;
        String path = "C:\\Users\\Lenovo W530\\Desktop\\Files Examples\\input.txt";
        try {
            List<String> allLines = Files.readAllLines(Path.of(path));
            // начин 1
            for (String line : allLines) {
                int sum = 0;
                for (int index = 0; index < line.length(); index++) {
                    char currentSymbol = line.charAt(index);

                }
            }
        } catch (IOException ex){
            System.out.println("IOException");
        }
    }
}
