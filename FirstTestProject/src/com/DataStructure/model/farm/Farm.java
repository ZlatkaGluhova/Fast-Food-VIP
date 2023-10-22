package com.DataStructure.model.farm;

import com.DataStructure.model.farmAnimals.*;

import java.util.List;
import java.util.Map;

public class Farm {
    private long id;
    private String name;
    private City city;
    private Map<Long, Dog> dogs;
    private Map<Long, Cat> cats;
    private Map<Long, Chicken> chickens;
    private List<Caw> caws;
    private List<Horse> horses;


    public Farm() {
    }

    public Farm(long id, String name, City city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Map<Long, Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Map<Long, Dog> dogs) {
        this.dogs = dogs;
    }

    public Map<Long, Cat> getCats() {
        return cats;
    }

    public void setCats(Map<Long, Cat> cats) {
        this.cats = cats;
    }

    public List<Caw> getCaws() {
        return caws;
    }

    public void setCaws(List<Caw> caws) {
        this.caws = caws;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public Map<Long, Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(Map<Long, Chicken> chickens) {
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                ", dogs=" + dogs +
                ", cats=" + cats +
                ", chickens=" + chickens +
                ", caws=" + caws +
                ", horses=" + horses +
                '}';
    }
}
