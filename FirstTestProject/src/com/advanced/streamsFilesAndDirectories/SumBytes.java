package com.advanced.streamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\Lenovo W530\\Desktop\\Files Examples\\input.txt";
        try {
            long sum = 0; //сумата от всички ascii символи във файла

            //начин 1
            /*BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();

            while (line != null) {
                for (int index = 0; index < line.length(); index++) {
                    char currentSymbol = line.charAt(index);
                    sum += currentSymbol;
                }
                line = br.readLine();
            }
            System.out.println(sum); */

            //начин 2
            byte[] allBytes = Files.readAllBytes(Path.of(path));
            for (byte value : allBytes) {
                if (value != 10 && value != 13) {
                    sum += value;
                }
            }

            System.out.println(sum);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException exception) {
            System.out.println("IOException");
        }

    }
}
