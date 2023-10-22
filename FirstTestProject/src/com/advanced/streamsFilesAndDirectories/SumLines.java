package com.advanced.streamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Да прочетем всички редове от файла
        //2. да обходим всеки ред и да намерим сумата от ascii -> да принтираме сумата
        // Да използваме BufferedReader, в комбинация с FileReader

        String path = "C:\\Users\\Lenovo W530\\Desktop\\Files Examples\\input.txt";
        try{
            List<String> allLines = Files.readAllLines(Path.of(path));
            // начин 1
            /*for (String line : allLines){
                int sum = 0;
                for (int index = 0; index < line.length(); index++) {
                    char currentSymbol = line.charAt(index);
                    sum += currentSymbol;
                }
                System.out.println(sum);
            } */

            // начин 2
            allLines.stream() //обхождаме всички редове
                    .map(line -> line.toCharArray())  // всеки ред го правим на масив от String-ове -> "Ivan" -> ['I', 'v', 'a', 'n']
                    .forEach(arr -> { // обхождаме всеки един масив
                        int sum = 0;
                        for (char symbol : arr) {
                            sum += symbol;
                        }
                        System.out.println(sum);
                    });


        } catch (IOException exception){
            System.out.println("Error while reading file!");
        }



    }
}
