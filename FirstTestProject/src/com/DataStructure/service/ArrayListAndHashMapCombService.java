package com.DataStructure.service;

import com.DataStructure.model.ZooBG;
import com.DataStructure.model.farm.City;
import com.DataStructure.model.farm.Farm;
import com.DataStructure.model.farm.Food;
import com.DataStructure.model.farmAnimals.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static com.DataStructure.model.farm.Food.*;

public class ArrayListAndHashMapCombService {
    public static final String FARM = "Farm ";

    public void manipulationWithArrayListAndHashMap() {
        Map<Long, Farm> farmMap = addFarmData();
        printCountOfAnimals(farmMap);
    }

    public Map<Long, Dog> addDogsInMap(int i) {
        Map<Long, Dog> dogsMap = new TreeMap<>();
        dogsMap.put(1L + i, new Dog(1 + i, "Jack" + i, 3));
        dogsMap.put(2L + i, new Dog(2 + i, "Roni" + i, 8));
        dogsMap.put(3L + i, new Dog(3 + i, "Bari" + i, 5));

        return dogsMap;
    }

    public Map<Long, Cat> addCatsInMap(int i) {
        Map<Long, Cat> catsMap = new TreeMap<>();
        catsMap.put(10L + i, new Cat(10 + i, "Pisi" + i, 15));
        catsMap.put(20L + i, new Cat(20 + i, "Nasi" + i, 10));
        catsMap.put(30L + i, new Cat(30 + i, "Asen" + i, 5));
        catsMap.put(40L + i, new Cat(40 + i, "Martinka" + i, 12));
        catsMap.put(50L + i, new Cat(50 + i, "Pancho" + i, 7));
        catsMap.put(60L + i, new Cat(60 + i, "Dancho" + i, 6));

        return catsMap;
    }

    public Map<Long, Chicken> addChickensInMap(int i) {
        Map<Long, Chicken> chickensMap = new TreeMap<>();
        chickensMap.put(100L + i, new Chicken(100 + i, "Koko" + i, 15));
        chickensMap.put(200L + i, new Chicken(200 + i, "Rako" + i, 10));
        chickensMap.put(300L + i, new Chicken(300 + i, "Miko" + i, 5));
        chickensMap.put(400L + i, new Chicken(400 + i, "Misi" + i, 12));
        chickensMap.put(500L + i, new Chicken(500 + i, "Lisa" + i, 7));
        chickensMap.put(600L + i, new Chicken(600 + i, "Chiki" + i, 6));
        chickensMap.put(700L + i, new Chicken(700 + i, "Riki" + i, 1));
        chickensMap.put(800L + i, new Chicken(800 + i, "Peter" + i, 3));
        chickensMap.put(900L + i, new Chicken(900 + i, "Koki" + i, 5));
        chickensMap.put(1000L + i, new Chicken(1000 + i, "Roko" + i, 8));
        chickensMap.put(1100L + i, new Chicken(1100 + i, "Moko" + i, 2));

        return chickensMap;
    }

    public List<Caw> addCawsInList(int i) {
        List<Caw> cawsList = new ArrayList<>();
        cawsList.add(new Caw(10000 + i, "Penka" + i, 5));
        cawsList.add(new Caw(20000 + i, "Lenka" + i, 7));
        return cawsList;
    }

    public List<Horse> addHorsesInList(int i) {
        List<Horse> horsesList = new ArrayList<>();
        horsesList.add(new Horse(100000 + i, "Orinoko" + i, 10));
        horsesList.add(new Horse(200000 + i, "Kondyo" + i, 8));
        return horsesList;
    }

    public void addAnimals(Farm farm, Map<Long, Dog> dogs, Map<Long, Cat> cats,
                           Map<Long, Chicken> chickens, List<Caw> caws, List<Horse> horses) {
        farm.setDogs(dogs);
        farm.setCats(cats);
        farm.setChickens(chickens);
        farm.setCaws(caws);
        farm.setHorses(horses);
    }

    public Map<Long, Farm> addFarmData() {
        Farm farm = new Farm();

        Map<Long, Farm> farmsMap = new TreeMap<>();
        for (int i = 1; i <= 6; i++) {
            Map<Long, Chicken> chickens = addChickensInMap(i);
            Map<Long, Cat> cats = addCatsInMap(i);
            Map<Long, Dog> dogs = addDogsInMap(i);
            List<Caw> caws = addCawsInList(i);
            List<Horse> horses = addHorsesInList(i);
            switch (i) {
                case 1:
                    farm = new Farm(i, FARM + City.PLOVDIV.getName(), City.PLOVDIV);
                    addAnimals(farm, addDogsInMap(i), addCatsInMap(i), addChickensInMap(i), addCawsInList(i), addHorsesInList(i));
                    farmsMap.put(1L, farm);
                    break;
                case 2:
                    dogs.remove(1L + i);
                    chickens.remove(1100L + i);
                    chickens.remove(1000L + i);
                    chickens.remove(900L + i);
                    chickens.remove(800L + i);
                    chickens.remove(100L + i);
                    farm = new Farm(i, FARM + City.PLOVDIV.getName(), City.PLOVDIV);
                    addAnimals(farm, addDogsInMap(i), addCatsInMap(i), chickens, addCawsInList(i), addHorsesInList(i));
                    farmsMap.put(2L, farm);
                    break;
                case 3:
                    caws.remove(1);
                    chickens.remove(800L + i);
                    chickens.remove(500L + i);
                    farm = new Farm(i, FARM + City.SILISTRA.getName(), City.SILISTRA);
                    addAnimals(farm, addDogsInMap(i), addCatsInMap(i), chickens, caws, addHorsesInList(i));
                    farmsMap.put(3L, farm);
                    break;
                case 4:
                    dogs.remove(2L + i);
                    cats.remove(40L + i);
                    cats.remove(50L + i);
                    chickens.remove(700L + i);
                    chickens.remove(600L + i);
                    chickens.remove(200L + i);
                    chickens.remove(100L + i);
                    farm = new Farm(i, FARM + City.SILISTRA.getName(), City.SILISTRA);
                    addAnimals(farm, addDogsInMap(i), cats, chickens, addCawsInList(i), addHorsesInList(i));
                    farmsMap.put(4L, farm);
                    break;
                case 5:
                    dogs.remove(1L + i);
                    cats.remove(20L + i);
                    cats.remove(10L + i);
                    chickens.remove(200L + i);
                    chickens.remove(900L + i);
                    chickens.remove(600L + i);
                    farm = new Farm(i, FARM + City.BLAGOEVGRAD.getName(), City.BLAGOEVGRAD);
                    addAnimals(farm, dogs, cats, chickens, addCawsInList(i), addHorsesInList(i));
                    farmsMap.put(5L, farm);
                    break;
                default:
                    dogs.remove(1L + i);
                    dogs.remove(2L + i);
                    cats.remove(30L + i);
                    chickens.remove(700L + i);
                    horses.remove(1);
                    farm = new Farm(i, FARM + City.BURGAS.getName(), City.BURGAS);
                    addAnimals(farm, dogs, cats, chickens, addCawsInList(i), horses);
                    farmsMap.put(6L, farm);
                    break;
            }

        }

        for (Map.Entry<Long, Farm> entry : farmsMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }
        return farmsMap;
    }

    public void printCountOfAnimals(Map<Long, Farm> farmMap) {
        System.out.println("---------- Animals count for All Farms ----------");

        int allDogsCount = 0;
        int allCatsCount = 0;
        int allChickensCount = 0;
        int allCawsCount = 0;
        int allHorsesCount = 0;

        for (Map.Entry<Long, Farm> entry : farmMap.entrySet()) {
            Map<Long, Dog> dogsMap = entry.getValue().getDogs();
            Map<Long, Cat> catsMap = entry.getValue().getCats();
            Map<Long, Chicken> chickensMap = entry.getValue().getChickens();
            List<Caw> cawsList = entry.getValue().getCaws();
            List<Horse> horsesList = entry.getValue().getHorses();

            System.out.printf("id: %s%n farmName: %s%n", entry.getValue().getId(), entry.getValue().getName());

            int dogsCount;
            dogsCount = dogsMap.size();
            allDogsCount += dogsCount;
            System.out.printf("Dogs: %d%n", dogsCount);

            int catsCount;
            catsCount = catsMap.size();
            allCatsCount += catsCount;
            System.out.printf("Cats: %d%n", catsCount);

            int chickensCount;
            chickensCount = chickensMap.size();
            allChickensCount += chickensCount;
            System.out.printf("Chickens: %d%n", chickensCount);

            int cawsCount;
            cawsCount = cawsList.size();
            allCawsCount += cawsCount;
            System.out.printf("Caws: %d%n", cawsCount);

            int horsesCount;
            horsesCount = horsesList.size();
            allHorsesCount += horsesCount;
            System.out.printf("Horses: %d%n", horsesCount);


            System.out.println("-------------");
        }
        System.out.println("All Farms animals count:");
        System.out.printf("Dogs: %d%n", allDogsCount);
        System.out.printf("Cats: %d%n", allCatsCount);
        System.out.printf("Chickens: %d%n", allChickensCount);
        System.out.printf("Caws: %d%n", allCawsCount);
        System.out.printf("Horses: %d%n", allHorsesCount);

    }
}
