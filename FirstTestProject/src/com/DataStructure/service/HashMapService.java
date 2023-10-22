package com.DataStructure.service;

import com.DataStructure.enums.Color;
import com.DataStructure.enums.Town;
import com.DataStructure.model.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.TreeMap;

public class HashMapService {
    public static final String ZOO = "Zoo ";

    public void manipulationWithHashMap() {
        System.out.println("--------------------- manipulation with HashMap - CRUD");
        Map<String, ZooBG> zoosMap = addZooMapDate();
       printWithLoops(zoosMap);
//        printCheck(zoosMap);
        printAnimalsCountAllZoos(zoosMap);
        printTickets(zoosMap);

    }

    public Map<String, Monkey> addMonkeysMap(int i) {

        Map<String, Monkey> monkeysMap = new TreeMap<>();

        monkeysMap.put("1M", new Monkey("gibbon", "Gogo" + i, Color.BROWN, 7));
        monkeysMap.put("2M", new Monkey("orangutan", "Ogy" + i, Color.BLACK, 8));
        monkeysMap.put("3M", new Monkey("chimpanzee", "Shinka" + i, Color.WHITE, 5));
        monkeysMap.put("4M", new Monkey("gibbon", "George" + i, Color.BLACK, 3));
        monkeysMap.put("5M", new Monkey("orangutan", "Ognyan" + i, Color.BROWN, 2));
        monkeysMap.put("6M", new Monkey("chimpanzee", "Shana" + i, Color.WHITE, 8));

        return monkeysMap;
    }

    public Map<String, Parrot> addParrotsMap(int i) {

        Map<String, Parrot> parrotMap = new TreeMap<>();

        parrotMap.put("1P", new Parrot("Yoli" + i, Color.YELLOW, 1));
        parrotMap.put("2P", new Parrot("Gabby" + i, Color.GREEN, 3));
        parrotMap.put("3P", new Parrot("Roni" + i, Color.RED, 8));
        parrotMap.put("4P", new Parrot("Greg" + i, Color.BROWN, 6));
        parrotMap.put("5P", new Parrot("Britney" + i, Color.WHITE, 2));

        return parrotMap;
    }

    public Map<String, Tiger> addTigersMap(int i) {

        Map<String, Tiger> tigersMap = new TreeMap<>();

        tigersMap.put("1T", new Tiger("bengalski", "Willie" + i, 2));
        tigersMap.put("2T", new Tiger("afrikanski", "Orhan" + i, 5));
        tigersMap.put("3T", new Tiger("maloaziiski", "Bobby" + i, 1));

        return tigersMap;
    }

    public Map<String, Penguin> addPenguinsMap(int i) {
        Map<String, Penguin> penguinsMap = new TreeMap<>();

        penguinsMap.put("1PG", new Penguin("imperatorski", "Vasko" + i, Color.WHITE, 34));
        penguinsMap.put("2PG", new Penguin("otshelnik", "Zlati" + i, Color.GREEN, 27));

        return penguinsMap;
    }

    public Map<String, ZooBG> addZooMapDate() {

        ZooBG zooBG = new ZooBG();
        BigDecimal ticketPriceWithVAT;

        Map<String, ZooBG> zoosBGMap = new TreeMap<>();
        for (int i = 1; i <= 4; i++) {

            switch (i) {
                case 1:
                    zooBG = new ZooBG(ZOO + Town.SOFIA.getTown(), Town.SOFIA, 12.23);
                    addAnimals(zooBG, addMonkeysMap(i), addParrotsMap(i), addTigersMap(i), null);
                    zoosBGMap.put(ZOO + i, zooBG);
                    break;
                case 2:
                    zooBG = new ZooBG(ZOO + Town.SMOLYAN.getTown(), Town.SMOLYAN, 15.66);
                    addAnimals(zooBG, null, addParrotsMap(i), addTigersMap(i), null);
                    zoosBGMap.put(ZOO + i, zooBG);
//                    zooBG = new ZooBG(ZOO + Town.SMOLYAN.getTown(), Town.SMOLYAN, 15.66);
//                    ticketPriceWithVAT = BigDecimal.valueOf(zooBG.getTicketPrice() * 1.2);
//                    zooBG.setTicketPriceWithVAT(ticketPriceWithVAT);
//
//                    //zooBG.setMonkeysMap(addMonkeysMap(String.valueOf(i)));
//                    zooBG.setParrotsMap(addParrotsMap(String.valueOf(i)));
//                    zooBG.setTigersMap(addTigersMap(String.valueOf(i)));
//
//                    zoosBGMap.put("2Z", zooBG);
//
////                    for( Map.Entry<String, ZooBG> entry : zoosBGMap.entrySet() ) {
////                        System.out.println(entry.getKey() + " = " + entry.getValue());
////                    }
                    break;
                case 3:
                    zooBG = new ZooBG(ZOO + Town.RILA.getTown(), Town.RILA, 12.78);
                    addAnimals(zooBG, addMonkeysMap(i), addParrotsMap(i), null, null);
                    zoosBGMap.put(ZOO + i, zooBG);
//                    zooBG = new ZooBG(ZOO + Town.RILA.getTown(), Town.RILA, 12.78,
//                            addMonkeysMap(String.valueOf(i)), addParrotsMap(String.valueOf(i)), null);
//                    ticketPriceWithVAT = BigDecimal.valueOf(zooBG.getTicketPrice() * 1.2);
//                    zooBG.setTicketPriceWithVAT(ticketPriceWithVAT);
//
////                    zooBG.setMonkeysMap(addMonkeysMap(String.valueOf(i)));
////                    zooBG.setParrotsMap(addParrotsMap(String.valueOf(i)));
////                    zooBG.setTigersMap(addTigersMap(String.valueOf(i)));
//
//                    zoosBGMap.put("3Z", zooBG);

//                    for( Map.Entry<String, ZooBG> entry : zoosBGMap.entrySet() ) {
//                        System.out.println(entry.getKey() + " = " + entry.getValue());
//                    }
                    break;
                default:
                    zooBG = new ZooBG(ZOO + Town.SLIVEN.getTown(), Town.SLIVEN, 122.88);
                    addAnimals(zooBG, null, null, null, addPenguinsMap(i));
                    zoosBGMap.put(ZOO + i, zooBG);
//                    zooBG = new ZooBG(ZOO + Town.SLIVEN.getTown(), Town.SLIVEN, 11.82,
//                            addMonkeysMap(String.valueOf(i)), addParrotsMap(String.valueOf(i)), addTigersMap(String.valueOf(i)));
//                    ticketPriceWithVAT = BigDecimal.valueOf(zooBG.getTicketPrice() * 1.2);
//                    zooBG.setTicketPriceWithVAT(ticketPriceWithVAT);
//
////                    zooBG.setMonkeysMap(addMonkeysMap(String.valueOf(i)));
////                    zooBG.setParrotsMap(addParrotsMap(String.valueOf(i)));
////                    zooBG.setTigersMap(addTigersMap(String.valueOf(i)));
//
//                    zoosBGMap.put("4Z", zooBG);

//                    for( Map.Entry<String, ZooBG> entry : zoosBGMap.entrySet() ) {
//                        System.out.println(entry.getKey() + " = " + entry.getValue());
//                    }
                    break;
            }
        }
        for (Map.Entry<String, ZooBG> entry : zoosBGMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        return zoosBGMap;
    }

    public void addAnimals(ZooBG zooBG, Map<String, Monkey> monkeys, Map<String, Parrot> parrots, Map<String, Tiger> tigers, Map<String, Penguin> penguins) {

//        if (!(monkeys == null)){
//            monkeys = addMonkeysMap(String.valueOf(i));
//        }
//        if (!(parrots == null)){
//            parrots = addParrotsMap(String.valueOf(i));
//        }
//        if (!(tigers == null)){
//            tigers = addTigersMap(String.valueOf(i));
//        }
//        if (!(penguins == null)){
//            penguins = addPenguinsMap(String.valueOf(i));
//        }
//
        zooBG.setMonkeysMap(monkeys);
        zooBG.setParrotsMap(parrots);
        zooBG.setTigersMap(tigers);
        zooBG.setPenguinsMap(penguins);

    }

    public void printWithForLoop(Map<String, ZooBG> zoosMap) {
        System.out.println("-------- For Loop --------");

        for (int i = 1; i <= zoosMap.size(); i++) {

            String parrots;
            String tigers;


            Map<String, Parrot> parrotsMap = zoosMap.get(ZOO + i).getParrotsMap();
            Map<String, Tiger> tigersMap = zoosMap.get(ZOO + i).getTigersMap();
            Map<String, Penguin> penguinsMap = zoosMap.get(ZOO + i).getPenguinsMap();

            Map<String, Monkey> monkeysMap = zoosMap.get(ZOO + i).getMonkeysMap();
            String monkeys;
            if (monkeysMap == null || monkeysMap.isEmpty()) {
                monkeys = "Not found monkeys!";
            } else {
                monkeys = monkeysMap.toString();
            }

            if (parrotsMap == null || parrotsMap.isEmpty()) {
                parrots = "Not found parrots!";
            } else {
                parrots = parrotsMap.toString();
            }

            if (tigersMap == null || tigersMap.isEmpty()) {
                tigers = "Not found tigers!";
            } else {
                tigers = tigersMap.toString();
            }

            String penguins;
            if (penguinsMap == null || penguinsMap.isEmpty()) {
                penguins = "Not found penguins!";
            } else {
                penguins = penguinsMap.toString();
            }

            System.out.printf("%s%n town: %s%n ticket: %.2flv.%n ticketWithVAT: %.2flv.%n Monkeys:%n %s%n Parrots:%n %s%n Tigers:%n %s%n Penguins:%n %s%n", zoosMap.get(ZOO + i).getName(),
                    zoosMap.get(ZOO + i).getTown(), zoosMap.get(ZOO + i).getTicketPrice(), zoosMap.get(ZOO + i).getTicketPriceWithVAT(), monkeys, parrots, tigers, penguins);
            System.out.println("-----------------");
        }
    }

    public void printWithForEachLoop(Map<String, ZooBG> zoosMap) {
        System.out.println("-------- For-each Loop --------");

        for (Map.Entry<String, ZooBG> entry : zoosMap.entrySet()) {

            String parrots;
            String tigers;
            String penguins;
            Map<String, Parrot> parrotsMap = entry.getValue().getParrotsMap();
            Map<String, Tiger> tigersMap = entry.getValue().getTigersMap();
            Map<String, Penguin> penguinsMap = entry.getValue().getPenguinsMap();

            Map<String, Monkey> monkeysMap = entry.getValue().getMonkeysMap();
            String monkeys;
            if (monkeysMap == null || monkeysMap.isEmpty()) {
                monkeys = "Not found monkeys!";
            } else {
                monkeys = monkeysMap.toString();
            }

            if (parrotsMap == null || parrotsMap.isEmpty()) {
                parrots = "Not found parrots!";
            } else {
                parrots = parrotsMap.toString();
            }

            if (tigersMap == null || tigersMap.isEmpty()) {
                tigers = "Not found tigers!";
            } else {
                tigers = tigersMap.toString();
            }
            if (penguinsMap == null || penguinsMap.isEmpty()) {
                penguins = "Not found penguins!";
            } else {
                penguins = penguinsMap.toString();
            }

            System.out.printf("%s%n town: %s%n ticket: %.2flv.%n ticketWithVAT: %.2flv.%n Monkeys:%n %s%n Parrots:%n %s%n Tigers:%n %s%n Penguins:%n %s%n", entry.getValue().getName(),
                    entry.getValue().getTown(), entry.getValue().getTicketPrice(), entry.getValue().getTicketPriceWithVAT(), monkeys, parrots, tigers, penguins);
            System.out.println("-----------------");
        }
    }

    public void printWithWhileLoop(Map<String, ZooBG> zoosMap) {
        System.out.println("-------- While Loop --------");
        int i = 1;
        while (i <= zoosMap.size()) {
            String monkeys;
            String parrots;
            String tigers;
            String penguins;
            Map<String, Monkey> monkeysMap = zoosMap.get(ZOO + i).getMonkeysMap();
            Map<String, Parrot> parrotsMap = zoosMap.get(ZOO + i).getParrotsMap();
            Map<String, Tiger> tigersMap = zoosMap.get(ZOO + i).getTigersMap();
            Map<String, Penguin> penguinsMap = zoosMap.get(ZOO + i).getPenguinsMap();

            if (monkeysMap == null || monkeysMap.isEmpty()) {
                monkeys = "Not found monkeys!";
            } else {
                monkeys = monkeysMap.toString();
            }

            if (parrotsMap == null || parrotsMap.isEmpty()) {
                parrots = "Not found parrots!";
            } else {
                parrots = parrotsMap.toString();
            }

            if (tigersMap == null || tigersMap.isEmpty()) {
                tigers = "Not found tigers!";
            } else {
                tigers = tigersMap.toString();
            }
            if (penguinsMap == null || penguinsMap.isEmpty()) {
                penguins = "Not found penguins!";
            } else {
                penguins = penguinsMap.toString();
            }

            System.out.printf("%s%n town: %s%n ticket: %.2flv.%n ticketWithVAT: %.2flv.%n Monkeys:%n %s%n Parrots:%n %s%n Tigers:%n %s%n Penguins:%n %s%n", zoosMap.get(ZOO + i).getName(),
                    zoosMap.get(ZOO + i).getTown(), zoosMap.get(ZOO + i).getTicketPrice(), zoosMap.get(ZOO + i).getTicketPriceWithVAT(), monkeys, parrots, tigers, penguins);
            System.out.println("-----------------");
            i++;
        }

    }

    public void printWithDoWhileLoop(Map<String, ZooBG> zoosMap) {
        System.out.println("-------- Do While Loop --------");
        int i = 1;
        do {
            String monkeys;
            String parrots;
            String tigers;
            String penguins;
            Map<String, Monkey> monkeysMap = zoosMap.get(ZOO + i).getMonkeysMap();
            Map<String, Parrot> parrotsMap = zoosMap.get(ZOO + i).getParrotsMap();
            Map<String, Tiger> tigersMap = zoosMap.get(ZOO + i).getTigersMap();
            Map<String, Penguin> penguinsMap = zoosMap.get(ZOO + i).getPenguinsMap();

            if (monkeysMap == null || monkeysMap.isEmpty()) {
                monkeys = "Not found monkeys!";
            } else {
                monkeys = monkeysMap.toString();
            }

            if (parrotsMap == null || parrotsMap.isEmpty()) {
                parrots = "Not found parrots!";
            } else {
                parrots = parrotsMap.toString();
            }

            if (tigersMap == null || tigersMap.isEmpty()) {
                tigers = "Not found tigers!";
            } else {
                tigers = tigersMap.toString();
            }

            if (penguinsMap == null || penguinsMap.isEmpty()) {
                penguins = "Not found penguins!";
            } else {
                penguins = penguinsMap.toString();
            }

            System.out.printf("%s%n town: %s%n ticket: %.2flv.%n ticketWithVAT: %.2flv.%n Monkeys:%n %s%n Parrots:%n %s%n Tigers:%n %s%n Penguins:%n %s%n", zoosMap.get(ZOO + i).getName(),
                    zoosMap.get(ZOO + i).getTown(), zoosMap.get(ZOO + i).getTicketPrice(), zoosMap.get(ZOO + i).getTicketPriceWithVAT(), monkeys, parrots, tigers, penguins);
            System.out.println("-----------------");

            i++;
        } while (i <= zoosMap.size());

    }

    public void printWithLoops(Map<String, ZooBG> zoosMap) {
        printWithForLoop(zoosMap);
        printWithForEachLoop(zoosMap);
        printWithWhileLoop(zoosMap);
        printWithDoWhileLoop(zoosMap);
    }

    public void printCheck(Map<String, ZooBG> zoosMap) {
        checkColor(zoosMap, Color.WHITE);
        checkAge(zoosMap, 15);
    }

    public void checkColor(Map<String, ZooBG> zoosMap, Color color) {
        System.out.printf("---------- Check color - %s ----------%n", color);
        for (Map.Entry<String, ZooBG> entry : zoosMap.entrySet()) {
            Map<String, Monkey> monkeysMap = entry.getValue().getMonkeysMap();
            Map<String, Parrot> parrotMap = entry.getValue().getParrotsMap();
            Map<String, Penguin> penguinMap = entry.getValue().getPenguinsMap();

            if (!(monkeysMap == null) && !(monkeysMap.isEmpty())) {
                for (Map.Entry<String, Monkey> monkeyEntry : monkeysMap.entrySet()) {
                    Monkey monkeys = monkeyEntry.getValue();
                    if (monkeys.getColor().equals(color)) {
                        System.out.printf("%s key: {%s} value: {%s}%n", entry.getValue().getName(), monkeyEntry.getKey(), monkeys);
                    }
                }
            }

            if (!(parrotMap == null) && !(parrotMap.isEmpty())) {
                for (Map.Entry<String, Parrot> parrotEntry : parrotMap.entrySet()) {
                    Parrot parrots = parrotEntry.getValue();
                    if (parrots.getColor().equals(color)) {
                        System.out.printf("%s key: {%s} value: {%s}%n", entry.getValue().getName(), parrotEntry.getKey(), parrots);
                    }
                }
            }
            if (!(penguinMap == null) && !(penguinMap.isEmpty())) {
                for (Map.Entry<String, Penguin> penguinEntry : penguinMap.entrySet()) {
                    Penguin penguins = penguinEntry.getValue();
                    if (penguins.getColor().equals(color)) {
                        System.out.printf("%s key: {%s} value: {%s}%n", entry.getValue().getName(), penguinEntry.getKey(), penguins);
                    }
                }
            }


        }
        System.out.println("----------------- End -----------------");
    }

    public void checkAge(Map<String, ZooBG> zoosMap, int age) {
        System.out.printf("---------- Check age - %d ----------%n", age);

        if (age < 0) {
            System.out.println("Invalid age");
        } else {

            for (Map.Entry<String, ZooBG> entry : zoosMap.entrySet()) {
                Map<String, Monkey> monkeysMap = entry.getValue().getMonkeysMap();
                Map<String, Parrot> parrotMap = entry.getValue().getParrotsMap();
                Map<String, Tiger> tigerMap = entry.getValue().getTigersMap();
                Map<String, Penguin> penguinMap = entry.getValue().getPenguinsMap();


                if (!(monkeysMap == null) && !(monkeysMap.isEmpty())) {
                    for (Map.Entry<String, Monkey> monkeyEntry : monkeysMap.entrySet()) {
                        Monkey monkeys = monkeyEntry.getValue();
                        if (monkeys.getAge() <= age) {
                            System.out.printf("%s key: {%s} value: {%s}%n", entry.getValue().getName(), monkeyEntry.getKey(), monkeys);
                        }
                    }
                }

                if (!(parrotMap == null) && !(parrotMap.isEmpty())) {
                    for (Map.Entry<String, Parrot> parrotEntry : parrotMap.entrySet()) {
                        Parrot parrots = parrotEntry.getValue();
                        if (parrots.getAge() <= age) {
                            System.out.printf("%s key: {%s} value: {%s}%n", entry.getValue().getName(), parrotEntry.getKey(), parrots);
                        }
                    }
                }

                if (!(tigerMap == null) && !(tigerMap.isEmpty())) {
                    for (Map.Entry<String, Tiger> tigerEntry : tigerMap.entrySet()) {
                        Tiger tigers = tigerEntry.getValue();
                        if (tigers.getAge() <= age) {
                            System.out.printf("%s key: {%s} value: {%s}%n", entry.getValue().getName(), tigerEntry.getKey(), tigers);
                        }
                    }
                }

                if (!(penguinMap == null) && !(penguinMap.isEmpty())) {
                    for (Map.Entry<String, Penguin> penguinEntry : penguinMap.entrySet()) {
                        Penguin penguin = penguinEntry.getValue();
                        if (penguin.getAge() <= age) {
                            System.out.printf("%s key: {%s} value: {%s}%n", entry.getValue().getName(), penguinEntry.getKey(), penguin);
                        }
                    }
                }
            }
        }
        System.out.println("----------------- End -----------------");
    }

    public void printAnimalsCountAllZoos(Map<String, ZooBG> zoosMap) {
        System.out.println("---------- Animals count for All Zoos ----------");
        int monkeysCount;
        int parrotsCount;
        int tigersCount;
        int penguinsCount;
        int allMonkeysCount = 0;
        int allParrotsCount = 0;
        int allTigersCount = 0;
        int allPenguinsCount = 0;


        for (Map.Entry<String, ZooBG> entry : zoosMap.entrySet()) {
            Map<String, Monkey> monkeysMap = entry.getValue().getMonkeysMap();
            Map<String, Parrot> parrotsMap = entry.getValue().getParrotsMap();
            Map<String, Tiger> tigersMap = entry.getValue().getTigersMap();
            Map<String, Penguin> penguinsMap = entry.getValue().getPenguinsMap();

            if (!(monkeysMap == null) && !(monkeysMap.isEmpty())) {
                monkeysCount = monkeysMap.size();
                allMonkeysCount += monkeysCount;
                System.out.printf("%s Monkeys: %d%n", entry.getValue().getName(), monkeysCount);
            }

            if (!(parrotsMap == null) && !(parrotsMap.isEmpty())) {
                parrotsCount = parrotsMap.size();
                allParrotsCount += parrotsCount;
                System.out.printf("%s Parrots: %d%n", entry.getValue().getName(), parrotsCount);
            }

            if (!(tigersMap == null) && !(tigersMap.isEmpty())) {
                tigersCount = tigersMap.size();
                allTigersCount += tigersCount;
                System.out.printf("%s Tigers: %d%n", entry.getValue().getName(), tigersCount);
            }

            if (!(penguinsMap == null) && !(penguinsMap.isEmpty())) {
                penguinsCount = penguinsMap.size();
                allPenguinsCount += penguinsCount;
                System.out.printf("%s Penguins: %d%n", entry.getValue().getName(), penguinsCount);
            }
            System.out.println("-------------");
        }
        System.out.println("All Zoos animals count:");
        System.out.printf("Monkeys: %d%n", allMonkeysCount);
        System.out.printf("Parrots: %d%n", allParrotsCount);
        System.out.printf("Tigers: %d%n", allTigersCount);
        System.out.printf("Penguins: %d%n", allPenguinsCount);
    }

    public double printTicketPrices(Map<String, ZooBG> zoosMap) {
        System.out.println("---------- Ticket prices ----------");
        double ticketPrice;
        double ticketPriceAllZoo = 0;
        for (Map.Entry<String, ZooBG> entry : zoosMap.entrySet()) {
            ticketPrice = entry.getValue().getTicketPrice();
            System.out.printf("%s: ticketPrice: %.2flv.%n", entry.getValue().getName(), ticketPrice);
            ticketPriceAllZoo += ticketPrice;
        }
        return ticketPriceAllZoo;
    }

    public void printTicketPricesForZoos(double ticketPriceAllZoo, BigDecimal ticketPriceWithVATAllZoo) {
        System.out.println("---------- Ticket prices for all Zoos ----------");
        System.out.printf(" ticketPrices: %.2flv.%n ticketPriceWithVAT: %slv.%n",
                ticketPriceAllZoo, ticketPriceWithVATAllZoo.setScale(2, RoundingMode.HALF_UP));
    }

    public BigDecimal printTicketPricesWithVAT(Map<String, ZooBG> zoosMap) {
        System.out.println("---------- Ticket prices with VAT ----------");
        double ticketPrice;
        BigDecimal ticketPriceWithVAT;
        BigDecimal ticketPriceWithVATAllZoo = new BigDecimal(0);
        for (Map.Entry<String, ZooBG> entry : zoosMap.entrySet()) {
            ticketPrice = entry.getValue().getTicketPrice();
            ticketPriceWithVAT = entry.getValue().getTicketPriceWithVAT();
            System.out.printf("%s:%n ticketPrice: %.2flv.%n ticketPriceWithVAT: %slv.%n",
                    entry.getValue().getName(), ticketPrice, ticketPriceWithVAT);
            ticketPriceWithVATAllZoo = BigDecimal.valueOf(ticketPriceWithVAT.doubleValue() + ticketPriceWithVATAllZoo.doubleValue());
        }

        return ticketPriceWithVATAllZoo;
    }

    public void printTickets(Map<String, ZooBG> zoosMap) {
        double ticketPriceAllZoo = printTicketPrices(zoosMap);
        BigDecimal ticketPriceWithVATAllZoos = printTicketPricesWithVAT(zoosMap);
        printTicketPricesForZoos(ticketPriceAllZoo, ticketPriceWithVATAllZoos);
    }
}


