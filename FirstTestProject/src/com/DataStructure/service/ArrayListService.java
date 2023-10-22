package com.DataStructure.service;

import com.DataStructure.enums.Color;
import com.DataStructure.enums.Header;
import com.DataStructure.enums.Town;
import com.DataStructure.enums.ZooAnimals;
import com.DataStructure.model.Monkey;
import com.DataStructure.model.Parrot;
import com.DataStructure.model.Tiger;
import com.DataStructure.model.Zoo;
import com.DataStructure.utils.CSVZooDataUtils;
import com.DataStructure.utils.ZooDataUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.DataStructure.utils.ZooDataUtils.addZooListDate;

public class ArrayListService {


    public void manipulationWithArrayList() {
        System.out.println("--------------------- manipulation with ArrayList");
        System.out.println("---------------------------------------------- methods with Variables");
//        nameList();
//        System.out.println("---------------------------------------------- methods with Objects");

//        addZooListDate();
//        ZooDataUtils.addZooListToCSV();
//        printWithLoops();
//        printCheck();

        CSVZooDataUtils.getAnimalsFromCSV();


    }


    public void nameList() {
        List<String> demoList = new ArrayList<>();
        demoList.add("Peter");
        demoList.add(1, "Maria");
        demoList.set(1, "Vasil");
        demoList.add("Koko");
        demoList.add("Stefan");
        demoList.add("Ani");
        printAscendingNameList(demoList);
        System.out.println();
        printDescendingNameList(demoList);

    }

    public void printAscendingNameList(List<String> demoList) {
        Collections.sort(demoList);  //сортиране и принтиране на листа във възходящ ред
        for (String name : demoList) {
            System.out.print(name + " ");
        }
    }

    public void printDescendingNameList(List<String> demoList) {
        Collections.reverse(demoList);  //сортиране и принтиране на листа в низходящ ред
        for (String name : demoList) {
            System.out.print(name + " ");
        }
        System.out.println();
    }


    public void addData(String i, List<Zoo> zoos, Zoo zoo) {

        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(new Monkey("gibbonZ", "Gogo" + i, Color.BLACK, 7));
        monkeys.add(new Monkey("orangutanZ", "Ogy" + i, Color.BROWN, 8));
        monkeys.add(new Monkey("chimpanzeeZ", "Shinka" + i, Color.WHITE, 5));
//        zoo.setMonkeys(monkeys);
        zoo.setMonkey(new Monkey("gibbon", "Gogo" + i, Color.BLACK, 7));
        zoo.setMonkey(new Monkey("orangutan", "Ogy" + i, Color.BROWN, 8));
        zoo.setMonkey(new Monkey("chimpanzee", "Shinka" + i, Color.WHITE, 5));

        List<Parrot> parrots = new ArrayList<>();
        parrots.add(new Parrot("Yoli" + i, Color.YELLOW, 1));
        parrots.add(new Parrot("Gabby" + i, Color.GREEN, 3));
        parrots.add(new Parrot("Roni" + i, Color.RED, 8));
        parrots.add(new Parrot("Greg" + i, Color.BROWN, 6));
        parrots.add(new Parrot("Britney" + i, Color.WHITE, 2));

        List<Tiger> tigers = new ArrayList<>();
        tigers.add(new Tiger("bengalski", "Willie" + i, 2));
        tigers.add(new Tiger("afrikanski", "Orhan" + i, 5));
        tigers.add(new Tiger("maloaziiski", "Bobby" + i, 1));

//        zoo.setParrots(parrots);
//        zoo.setTigers(tigers);
//        zoos.add(zoo);
//        System.out.println(zoo);
//        System.out.println("---------------------");
    }


    public void printWithLoops() {
        List<Zoo> zoos = addZooListDate(); //ot ZOO... from CSV

        printWithForLoop(zoos);
//        printWithForEachLoop(zoos);
//        printWithWhileLoop(zoos);
//        printWithDoWhileLoop(zoos);
    }

    public void printWithForLoop(List<Zoo> zoos) {
        System.out.println("-------- For Loop --------");

        for (int i = 0; i < zoos.size(); i++) {
            String monkeys;
            String parrots;
            String tigers;

            if (zoos.get(i).getMonkeys() == null || zoos.get(i).getMonkeys().isEmpty()) {
                monkeys = "Not found monkeys!";
            } else {
                monkeys = zoos.get(i).getMonkeys().toString();
            }

            if (zoos.get(i).getParrots() == null || zoos.get(i).getParrots().isEmpty()) {
                parrots = "Not found parrots!";
            } else {
                parrots = zoos.get(i).getParrots().toString();
            }
            if (zoos.get(i).getTigers() == null || zoos.get(i).getTigers().isEmpty()) {
                tigers = "Not found tigers!";
            } else {
                tigers = zoos.get(i).getTigers().toString();
            }

            System.out.printf("%s%n town: %s%n ticket: %.2flv.%n Monkeys:%n %s%n Parrots:%n %s%n Tigers:%n %s%n", zoos.get(i).getName(), zoos.get(i).getTown(),
                    zoos.get(i).getTicketPrice(), monkeys, parrots, tigers);

            System.out.println("-----------------");
        }
    }

    public void printWithForEachLoop(List<Zoo> zoos) {
        System.out.println("-------- For-each Loop --------");

        for (Zoo zoo : zoos) {
            String monkeys;
            String parrots;
            String tigers;

            if (zoo.getMonkeys() == null || zoo.getMonkeys().isEmpty()) {
                monkeys = "Not found monkeys!";
            } else {
                monkeys = zoo.getMonkeys().toString();
            }

            if (zoo.getParrots() == null || zoo.getParrots().isEmpty()) {
                parrots = "Not found parrots!";
            } else {
                parrots = zoo.getParrots().toString();
            }

            if (zoo.getTigers() == null || zoo.getTigers().isEmpty()) {
                tigers = "Not found tigers!";
            } else {
                tigers = zoo.getTigers().toString();
            }

            System.out.printf("%s%n town: %s%n ticket: %.2flv.%n Monkeys:%n %s%n Parrots:%n %s%n Tigers:%n %s%n", zoo.getName(), zoo.getTown(),
                    zoo.getTicketPrice(), monkeys, parrots, tigers);

        }
        System.out.println("-----------------");
    }

    public void printWithWhileLoop(List<Zoo> zoos) {
        System.out.println("-------- While Loop --------");

        int i = 0;
        while (i < zoos.size()) {
            String monkeys;
            String parrots;
            String tigers;

            if (zoos.get(i).getMonkeys() == null || zoos.get(i).getMonkeys().isEmpty()) {
                monkeys = "Not found monkeys!";
            } else {
                monkeys = zoos.get(i).getMonkeys().toString();
            }

            if (zoos.get(i).getParrots() == null || zoos.get(i).getParrots().isEmpty()) {
                parrots = "Not found parrots!";
            } else {
                parrots = zoos.get(i).getParrots().toString();
            }
            if (zoos.get(i).getTigers() == null || zoos.get(i).getTigers().isEmpty()) {
                tigers = "Not found tigers!";
            } else {
                tigers = zoos.get(i).getTigers().toString();
            }

            System.out.printf("%s%n town: %s%n ticket: %.2flv.%n Monkeys:%n %s%n Parrots:%n %s%n Tigers:%n %s%n", zoos.get(i).getName(), zoos.get(i).getTown(),
                    zoos.get(i).getTicketPrice(), monkeys, parrots, tigers);

            System.out.println("-----------------");
            i++;
        }

    }

    public void printWithDoWhileLoop(List<Zoo> zoos) {
        System.out.println("-------- Do While Loop --------");
        int i = 0;
        do {
            String monkeys;
            String parrots;
            String tigers;

            if (zoos.get(i).getMonkeys() == null || zoos.get(i).getMonkeys().isEmpty()) {
                monkeys = "Not found monkeys!";
            } else {
                monkeys = zoos.get(i).getMonkeys().toString();
            }

            if (zoos.get(i).getParrots() == null || zoos.get(i).getParrots().isEmpty()) {
                parrots = "Not found parrots!";
            } else {
                parrots = zoos.get(i).getParrots().toString();
            }
            if (zoos.get(i).getTigers() == null || zoos.get(i).getTigers().isEmpty()) {
                tigers = "Not found tigers!";
            } else {
                tigers = zoos.get(i).getTigers().toString();
            }

            System.out.printf("%s%n town: %s%n ticket: %.2flv.%n Monkeys:%n %s%n Parrots:%n %s%n Tigers:%n %s%n", zoos.get(i).getName(), zoos.get(i).getTown(),
                    zoos.get(i).getTicketPrice(), monkeys, parrots, tigers);

            System.out.println("-----------------");
            i++;
        } while (i < zoos.size());


    }

    public void printCheck() {
        List<Zoo> zoos = addZooListDate();
//        checkColor(zoos, Color.WHITE);
//        checkAge(zoos, 2);
//        printAnimalsCountAllZoos(zoos);
//        printTickets(zoos);
    }

    public void checkColor(List<Zoo> zoos, Color color) {
        System.out.printf("---------- Check color - %s ----------%n", color);
        for (Zoo zoo : zoos) {
            if (!(zoo.getMonkeys() == null) && !(zoo.getMonkeys().isEmpty())) {
                for (int i = 0; i < zoo.getMonkeys().size(); i++) {
                    if (zoo.getMonkeys().get(i).getColor().equals(color)) {
                        System.out.printf("%s Monkeys: %s%n", zoo.getName(), zoo.getMonkeys().get(i));
                    }
                }
            }
            if (!(zoo.getParrots() == null) && !(zoo.getParrots().isEmpty())) {
                for (int i = 0; i < zoo.getParrots().size(); i++) {
                    if (zoo.getParrots().get(i).getColor().equals(color)) {
                        System.out.printf("%s Parrots: %s%n", zoo.getName(), zoo.getParrots().get(i));
                    }
                }
            }
        }
        System.out.println("----------------- End -----------------");
    }

    public void checkAge(List<Zoo> zoos, int age) {
        System.out.printf("------------ Check age - %d ------------%n", age);
        for (Zoo zoo : zoos) {
            if (!(zoo.getMonkeys() == null) && !(zoo.getMonkeys().isEmpty())) {
                for (int i = 0; i < zoo.getMonkeys().size(); i++) {
                    if (zoo.getMonkeys().get(i).getAge() == age) {
                        System.out.printf("%s Monkeys: %s%n", zoo.getName(), zoo.getMonkeys().get(i));
                    }
                }
            }
            if (!(zoo.getParrots() == null) && !(zoo.getParrots().isEmpty())) {
                for (int i = 0; i < zoo.getParrots().size(); i++) {
                    if (zoo.getParrots().get(i).getAge() == age) {
                        System.out.printf("%s Parrots: %s%n", zoo.getName(), zoo.getParrots().get(i));
                    }
                }
            }
            if (!(zoo.getTigers() == null) && !(zoo.getTigers().isEmpty())) {
                for (int i = 0; i < zoo.getTigers().size(); i++) {
                    if (zoo.getTigers().get(i).getAge() == age) {
                        System.out.printf("%s Tigers: %s%n", zoo.getName(), zoo.getTigers().get(i));
                    }
                }
            }
        }
        System.out.println("----------------- End -----------------");
    }

    public void printAnimalsCountAllZoos(List<Zoo> zoos) {
        System.out.println("---------- Animals count ----------");
        int monkeysCount;
        int parrotsCount;
        int tigersCount;
        int allMonkeysCount = 0;
        int allParrotsCount = 0;
        int allTigersCount = 0;

        for (Zoo zoo : zoos) {

            //ОПТИМИЗИРАНЕ

            if (!(zoo.getMonkeys() == null) && !(zoo.getMonkeys().isEmpty())) {
                monkeysCount = zoo.getMonkeys().size();
                allMonkeysCount += monkeysCount;
                System.out.printf("%s Monkeys: %d%n", zoo.getName(), monkeysCount);
            }

            if (!(zoo.getParrots() == null) && !(zoo.getParrots().isEmpty())) {
                parrotsCount = zoo.getParrots().size();
                allParrotsCount += parrotsCount;
                System.out.printf("%s Parrots: %d%n", zoo.getName(), parrotsCount);
            }
            if (!(zoo.getTigers() == null) && !(zoo.getTigers().isEmpty())) {
                tigersCount = zoo.getTigers().size();
                allTigersCount += tigersCount;
                System.out.printf("%s Tigers: %d%n", zoo.getName(), tigersCount);
            }
            System.out.println("-------------");
        }
        System.out.println("All Zoos animals count:");
        System.out.printf("Monkeys: %d%n", allMonkeysCount);
        System.out.printf("Parrots: %d%n", allParrotsCount);
        System.out.printf("Tigers: %d%n", allTigersCount);
    }

    public void printTickets(List<Zoo> zoos) {
        double ticketPriceAllZoo = printTicketPrices(zoos);
        BigDecimal ticketPriceWithVATAllZoo = printTicketPricesWithVAT(zoos);
        printTicketPricesForZoos(ticketPriceAllZoo, ticketPriceWithVATAllZoo);
    }

    public double printTicketPrices(List<Zoo> zoos) {
        System.out.println("---------- Ticket prices ----------");
        double ticketPrice;
        double ticketPriceAllZoo = 0;
        for (Zoo zoo : zoos) {
            ticketPrice = zoo.getTicketPrice();
            System.out.printf("%s: ticketPrice: %.2flv.%n", zoo.getName(), ticketPrice);
            ticketPriceAllZoo += ticketPrice;
        }
        return ticketPriceAllZoo;
    }

    public BigDecimal printTicketPricesWithVAT(List<Zoo> zoos) {
        System.out.println("---------- Ticket prices with VAT ----------");
        double ticketPrice;
        BigDecimal ticketPriceWithVAT;
        BigDecimal ticketPriceWithVATAllZoo = new BigDecimal(0);
        for (Zoo zoo : zoos) {
            ticketPrice = zoo.getTicketPrice();
            ticketPriceWithVAT = zoo.getTicketPriceWithVAT();

            System.out.printf("%s:%n ticketPrice: %.2flv.%n ticketPriceWithVAT: %slv.%n",
                    zoo.getName(), ticketPrice, ticketPriceWithVAT.setScale(2, RoundingMode.HALF_UP));  // Защо не мога да сложа ticketPriceWithVAT на този ред?
            ticketPriceWithVATAllZoo = BigDecimal.valueOf(ticketPriceWithVAT.doubleValue() + ticketPriceWithVATAllZoo.doubleValue());
        }
        return ticketPriceWithVATAllZoo;
    }

    public void printTicketPricesForZoos(double ticketPriceAllZoo, BigDecimal ticketPriceWithVATAllZoo) {
        System.out.println("---------- Ticket prices for all Zoos ----------");
        System.out.printf(" ticketPrices: %.2flv.%n ticketPriceWithVAT: %slv.%n",
                ticketPriceAllZoo, ticketPriceWithVATAllZoo.setScale(2, RoundingMode.HALF_UP));
    }
}
