package com.DataStructure.utils;

import com.DataStructure.enums.Color;
import com.DataStructure.enums.Town;
import com.DataStructure.model.Monkey;
import com.DataStructure.model.Parrot;
import com.DataStructure.model.Tiger;
import com.DataStructure.model.Zoo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVZooDataUtils {
    //четенето на логиката
    //в инпут да добавя файла който създадох
    //в аутпут - отговор в CSV формат на всяка заявка от конзолата

    private static final String PATH = "D:\\Projects\\Fast Food VIP\\Fast-Food-VIP\\FirstTestProject\\src\\com\\DataStructure\\resources\\input\\Animals.csv";

    // get header

    //reading data
    List<Zoo> zoos = getAnimalsFromCSV();

//    List<Person> animals = getAnimalsFromCSV(headers, readingPath);
//    //manipulating data
//    List<Person> personsNewAge = increaseAge(persons);
//        for (Person person : personsNewAge) {
//        //writing person to csv
//        creatingCSVFromPerson(headers, person);
//    }
//    //writing persons to csv
//    creatingCSVFromPersons(headers, personsNewAge);

    public static List<Zoo> getAnimalsFromCSV() {
        List<String> header = new ArrayList<>();
        String row;
        List<Zoo> zoos = new ArrayList<>();
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(PATH));

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
                zoos.addAll(addZoosDataFromCSV(data));
            }

        } catch (IOException ex) {
            System.out.println("IOException - addDataInList");
        }
        return zoos;
    }

    private static Zoo addAnimalsDataToZooFromCSV(String[] data, List<Zoo> allZoos) {
        Zoo zoo = new Zoo();
        zoo.setName(data[5]);
        zoo.setTown(Town.valueOf(data[6]));
        zoo.setTicketPrice(Double.parseDouble(data[7]));
        zoo.setTicketPriceWithVAT(Double.parseDouble(data[8]));


        if (allZoos.isEmpty()) {
            allZoos.add(zoo);
        } else {
            for (int i = 0; i < allZoos.size(); i++) {
                Zoo zooData = allZoos.get(i);
                if (zooData.getName().equals(zoo.getName())) {
                    zoo = zooData;
                } else {
                    allZoos.add(zoo);
                }

            }
        }

        switch (data[0]) {
            case "Monkey":
                Monkey monkey = new Monkey();
                monkey.setType(data[1]);
                monkey.setName(data[2]);
                monkey.setColor(Color.valueOf(data[3]));
                monkey.setAge(Integer.parseInt(data[4]));

                zoo.getMonkeys().add(monkey);
                break;
            case "Tiger":
                Tiger tiger = new Tiger();
                tiger.setType(data[1]);
                tiger.setName(data[2]);
                tiger.setAge(Integer.parseInt(data[4]));

                zoo.getTigers().add(tiger);
                break;
            case "Parrot":
                Parrot parrot = new Parrot();
                parrot.setName(data[2]);
                parrot.setColor(Color.valueOf(data[3]));
                parrot.setAge(Integer.parseInt(data[4]));

                zoo.getParrots().add(parrot);
                break;
            default:

                break;
        }

        return zoo;
    }

    private static List<Zoo> addZoosDataFromCSV(String[] data) {
        List<Zoo> allZoos = new ArrayList<>();
        addAnimalsDataToZooFromCSV(data, allZoos);

        return allZoos;
    }

}
