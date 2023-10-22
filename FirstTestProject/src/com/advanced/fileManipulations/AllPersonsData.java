package com.advanced.fileManipulations;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AllPersonsData {

    private static final String CSV_SEPARATOR = ";";

    public static void main(String[] args) {
        String readingPath = "C:\\Users\\Lenovo W530\\Desktop\\Persons\\INPUT\\Persons_2022.csv";

        // get header
        List<String> headers = new ArrayList<>();
        //reading data
        List<Person> persons = getPersonsFromCSV(headers, readingPath);
        //manipulating data
        List<Person> personsNewAge = increaseAge(persons);
        for (Person person : personsNewAge) {
            //writing person to csv
            creatingCSVFromPerson(headers, person);
        }
        //writing persons to csv
        creatingCSVFromPersons(headers, personsNewAge);
    }

    public static String[] getFirstLine(String readingPath) {
        String row;
        String[] dataFirstLine = new String[]{};
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(readingPath));
            row = csvReader.readLine();
            dataFirstLine = row.split(";");
        } catch (IOException ex) {
            System.out.println("IOException - addDataInList");
        }
        return dataFirstLine;
    }

    public static List<Person> getPersonsFromCSV(List<String> header, String readingPath) {
        String row;
        List<Person> persons = new ArrayList<>();
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(readingPath));

            boolean isFirstRow = true;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(";");
                if (isFirstRow) {
                    for (int i = 0; i < data.length; i++) {
                        header.add(data[i]);
                    }
                    isFirstRow = false;
                    continue;
                }
                persons.add(createPerson(data));
            }
        } catch (IOException ex) {
            System.out.println("IOException - addDataInList");
        }
        return persons;
    }

    private static Person createPerson(String[] data) {
        Person person = new Person();
        person.setId(Integer.parseInt(data[0]));
        person.setFirstName(data[1]);
        person.setLastName(data[2]);
        person.setAge(Integer.parseInt(data[3]));
        person.setTown(data[4]);

        return person;
    }

    public static List<Person> increaseAge(List<Person> persons) {
        List<Person> personsNewAge = new ArrayList<>();
        for (Person person : persons) {
            personsNewAge.add(new Person(person.getId(), person.getFirstName(), person.getLastName(), person.getAge() + 1, person.getTown()));
        }

        return personsNewAge;
    }

    public static void creatingCSVFromPersons(List<String> header, List<Person> personsNewAge) {
        String writingPath = "C:\\Users\\Lenovo W530\\Desktop\\Persons\\OUTPUT\\AllPersons_2023.csv";
        File file = new File(writingPath);

        try {
            BufferedWriter csvWriter = new BufferedWriter(new FileWriter(file));
            String line = createHeader(header);
            csvWriter.write(line);
            csvWriter.newLine();

            for (Person person : personsNewAge) {
                String mappedPersonToString = mappedPersonToString(person);
                csvWriter.write(mappedPersonToString);
                csvWriter.newLine();
            }

            csvWriter.close();
        } catch (IOException ex) {
            System.out.println("IOException - writingAFile");
        }

    }

    public static void creatingCSVFromPerson(List<String> header, Person person) {
        try {
            String writingPath = String.format("C:\\Users\\Lenovo W530\\Desktop\\Persons\\OUTPUT\\%s_2023.csv", person.getFirstName());
            File file = new File(writingPath);
            BufferedWriter csvWriter = new BufferedWriter(new FileWriter(file));
            csvWriter.write(createHeader(header));
            csvWriter.newLine();
            String mappedPersonToString = mappedPersonToString(person);
            csvWriter.write(mappedPersonToString);
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException ex) {
            System.out.println("IOException - writingAFile");
        }
    }

    private static String mappedPersonToString(Person person) {
        StringBuilder sb = new StringBuilder();
        sb.append(person.getId())
                .append(CSV_SEPARATOR)
                .append(person.getFirstName())
                .append(CSV_SEPARATOR)
                .append(person.getLastName())
                .append(CSV_SEPARATOR)
                .append(person.getAge())
                .append(CSV_SEPARATOR)
                .append(person.getTown());
        return sb.toString();
    }

    private static String createHeader(List<String> header) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < header.size(); i++) {
            if (i < header.size() -1){
                sb.append(header.get(i)).append(CSV_SEPARATOR);
            } else {
                sb.append(header.get(i));
            }
        }

        return sb.toString();
    }
}


//Клас Person
//метод за четене - на 1 ред от файла
//метод за писане - да променя годините с +1 на 1 обект от файла
//да пълня в обект - да има по 1 файл за всеки обект