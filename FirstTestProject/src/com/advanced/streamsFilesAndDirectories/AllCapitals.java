package com.advanced.streamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AllCapitals {
    public static void main(String[] args) {
        String path = "src/files/inputFiles/input.txt";
        File file = new File("src/files/outputFiles/output.txt");
        // прочитаме файла
        // обхождаме всеки ред -> правим всички букви главни -> записваме реда в нов файл
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
           /* List<String> allLines = Files.readAllLines(Path.of(path));
            for (String line : allLines) {
                bw.write(line.toUpperCase());
                bw.newLine();
            }
            bw.close(); */

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null) {
                bw.write(line.toUpperCase());
                bw.newLine();
                line = br.readLine();
            }
            bw.close();

        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
