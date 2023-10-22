package com.advanced.fileManipulations;

import java.io.*;

public class PersonData {
    public static void main(String[] args) {
        String readingPath = "C:\\Users\\Lenovo W530\\Desktop\\Persons\\INPUT\\Persons_2022_INPUT.csv";
        Person person = addDataInPerson(readingPath);
        if (person != null) {
            Person personNewAge = increaseAge(person);
            writingAFile(personNewAge);
        }
    }



    public static Person addDataInPerson(String readingPath) {

        /* TODO: РЕДАКТИРАНЕ !!!!!!!!!!! */

        String row;
        Person person = null;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(readingPath));
            row = csvReader.readLine();
            String[] data = row.split(";");
            while (row != null) {
                if (data[0].equals("ID")) {
                    row = csvReader.readLine();
                    data = row.split(";");
                    person = new Person(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), data[4]);
                } else {
                    data = row.split(";");
                    person = new Person(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]), data[4]);
                }
                row = csvReader.readLine();
            }
        } catch (IOException ex) {
            System.out.println("IOException - addDataInList");
        }
        return person;
    }

    public static Person increaseAge(Person person) {
        person.setAge(person.getAge() + 1);
        return person;
    }

    public static void writingAFile(Person personNewAge) {
        String name = personNewAge.getFirstName();
        String writingPath = String.format("C:\\Users\\Lenovo W530\\Desktop\\Persons\\OUTPUT\\%s_2023_OUTPUT.csv", name);
        File file = new File(writingPath);
        try {
            BufferedWriter csvWriter = new BufferedWriter(new FileWriter(file));
            String line = String.valueOf(personNewAge);
            csvWriter.write(line);
            csvWriter.close();
        } catch (IOException ex) {
            System.out.println("IOException - writingAFile");
        }

    }
}


//Клас Person
//метод за четене - на 1 ред от файла
//метод за писане - да променя годините с +1 на 1 обект от файла
//да пълня в обект - да има по 1 файл за всеки обект
