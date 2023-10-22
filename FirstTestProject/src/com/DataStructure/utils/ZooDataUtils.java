package com.DataStructure.utils;

import com.DataStructure.enums.Color;
import com.DataStructure.enums.Header;
import com.DataStructure.enums.Town;
import com.DataStructure.enums.ZooAnimals;
import com.DataStructure.model.Monkey;
import com.DataStructure.model.Parrot;
import com.DataStructure.model.Tiger;
import com.DataStructure.model.Zoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ZooDataUtils {
    public static final String ZOO = "Zoo ";
    public static final String SEPARATOR = ";";

    //цялата логика за създаванвто на обектите + зоологическата градина

    public static List<Monkey> addMonkeys(String i) { /////ZOO
        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(new Monkey("gibbon", "Gogo" + i, Color.BROWN, 7));
        monkeys.add(new Monkey("orangutan", "Ogy" + i, Color.BLACK, 8));
        monkeys.add(new Monkey("chimpanzee", "Shinka" + i, Color.WHITE, 5));
        monkeys.add(new Monkey("gibbon", "George" + i, Color.BLACK, 3));
        monkeys.add(new Monkey("orangutan", "Ognyan" + i, Color.BROWN, 2));
        monkeys.add(new Monkey("chimpanzee", "Shana" + i, Color.WHITE, 8));
        return monkeys;
    }

    public static List<Parrot> addParrots(String i) { /////ZOO
        List<Parrot> parrots = new ArrayList<>();
        parrots.add(new Parrot("Yoli" + i, Color.YELLOW, 1));
        parrots.add(new Parrot("Gabby" + i, Color.GREEN, 3));
        parrots.add(new Parrot("Roni" + i, Color.RED, 8));
        parrots.add(new Parrot("Greg" + i, Color.BROWN, 6));
        parrots.add(new Parrot("Britney" + i, Color.WHITE, 2));
        parrots.add(new Parrot("Gencho" + i, Color.GREEN, 5));
        parrots.add(new Parrot("Yoana" + i, Color.YELLOW, 5));
        return parrots;
    }/////ZOO

    public static List<Tiger> addTigers(String i) { /////ZOO
        List<Tiger> tigers = new ArrayList<>();
        tigers.add(new Tiger("bengalski", "Willie" + i, 2));
        tigers.add(new Tiger("afrikanski", "Orhan" + i, 5));
        tigers.add(new Tiger("maloaziiski", "Bobby" + i, 1));
        return tigers;
    }

    public static List<Zoo> addZooListDate() { ////// ZOO

        List<Zoo> zoos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Zoo zoo;

            switch (i) {
                case 0:
                    zoo = new Zoo(ZOO + Town.SOFIA.getTown(), Town.SOFIA, 12.23);
                    zoo.setTicketPriceWithVAT(zoo.getTicketPrice());
                    zoo.setMonkeys(addMonkeys(String.valueOf(i)));
                    zoo.setParrots(addParrots(String.valueOf(i)));
                    zoo.setTigers(addTigers(String.valueOf(i)));
                    zoos.add(zoo);
                    break;
                case 1:
                    zoo = new Zoo(ZOO + Town.SMOLYAN.getTown(), Town.SMOLYAN, 15.66);
                    zoo.setTicketPriceWithVAT(zoo.getTicketPrice());
                    zoo.setParrots(addParrots(String.valueOf(i)));
                    zoo.setTigers(addTigers(String.valueOf(i)));
                    zoos.add(zoo);
                    break;
                case 2:
                    zoo = new Zoo(ZOO + Town.RILA.getTown(), Town.RILA, 12.78, addMonkeys(String.valueOf(i)), addParrots(String.valueOf(i)), null);
                    zoo.setTicketPriceWithVAT(zoo.getTicketPrice());
                    zoos.add(zoo);
                    break;
                default:
                    zoo = new Zoo(ZOO + Town.SLIVEN.getTown(), Town.SLIVEN, 11.82, addMonkeys(String.valueOf(i)), addParrots(String.valueOf(i)), addTigers(String.valueOf(i)));
                    zoo.setTicketPriceWithVAT(zoo.getTicketPrice());
                    zoos.add(zoo);
                    break;
            }
        }
        return zoos;
    }

    public static void addZooListToCSV() { /////ZOO
        List<Zoo> zoos = addZooListDate();
        String writingPath = "D:\\Projects\\Fast Food VIP\\Fast-Food-VIP\\FirstTestProject\\src\\com\\DataStructure\\resources\\input\\Animals.csv";
        File file = new File(writingPath);

        try {
            BufferedWriter csvWriter = new BufferedWriter(new FileWriter(file));
            StringBuilder header = new StringBuilder();
            header.append(Header.ANIMAL).append(SEPARATOR).append(Header.ANIMAL_TYPE).append(SEPARATOR)
                    .append(Header.ANIMAL_NAME).append(SEPARATOR).append(Header.ANIMAL_COLOR).append(SEPARATOR)
                    .append(Header.ANIMAL_AGE).append(SEPARATOR).append(Header.ZOO_NAME).append(SEPARATOR)
                    .append(Header.ZOO_TOWN).append(SEPARATOR).append(Header.TICKET_PRICE).append(SEPARATOR)
                    .append(Header.TICKET_PRICE_WITH_VAT).append(SEPARATOR);

            csvWriter.write(String.valueOf(header));
            csvWriter.newLine();

            for (Zoo zoo : zoos) {

                StringBuilder line = new StringBuilder();
                line
                        .append(zoo.getName()).append(SEPARATOR)
                        .append(zoo.getTown()).append(SEPARATOR)
                        .append(zoo.getTicketPrice()).append(SEPARATOR)
                        .append(zoo.getTicketPriceWithVAT()).append(SEPARATOR);
                StringBuilder linePlus;

                if (zoo.getTigers() != null) {
                    for (Monkey monkey : zoo.getMonkeys()) {
                        linePlus = new StringBuilder();
                        linePlus.append(ZooAnimals.MONKEY.getType()).append(SEPARATOR)
                                .append(monkey.getType()).append(SEPARATOR)
                                .append(monkey.getName()).append(SEPARATOR)
                                .append(monkey.getColor()).append(SEPARATOR)
                                .append(monkey.getAge()).append(SEPARATOR);

                        csvWriter.write(String.valueOf(linePlus));
                        csvWriter.write(String.valueOf(line));
                        csvWriter.newLine();
                    }
                }

                if (zoo.getTigers() != null) {
                    for (Tiger tiger : zoo.getTigers()) {
                        linePlus = new StringBuilder();
                        linePlus.append(ZooAnimals.TIGER.getType()).append(SEPARATOR)
                                .append(tiger.getType()).append(SEPARATOR)
                                .append(tiger.getName()).append(SEPARATOR)
                                .append("none").append(SEPARATOR)
                                .append(tiger.getAge()).append(SEPARATOR);

                        csvWriter.write(String.valueOf(linePlus));
                        csvWriter.write(String.valueOf(line));
                        csvWriter.newLine();
                    }
                }

                if (zoo.getParrots() != null) {
                    for (Parrot parrot : zoo.getParrots()) {
                        linePlus = new StringBuilder();
                        linePlus.append(ZooAnimals.PARROT.getType()).append(SEPARATOR)
                                .append("none").append(SEPARATOR)
                                .append(parrot.getName()).append(SEPARATOR)
                                .append(parrot.getColor()).append(SEPARATOR)
                                .append(parrot.getAge()).append(SEPARATOR);

                        csvWriter.write(String.valueOf(linePlus));
                        csvWriter.write(String.valueOf(line));
                        csvWriter.newLine();
                    }
                }
            }
            csvWriter.close();
        } catch (IOException ex) {
            System.out.format("Cannot create csv: %s", ex);
        }
    }

}
