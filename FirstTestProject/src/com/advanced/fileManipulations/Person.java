package com.advanced.fileManipulations;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String town;
    private Date createdOn;
    private boolean isTeacher;
    private Enum type;
    private double rating;


    public Person() {
    }

    public Person(int ID, String firstName, String lastName, int age, String town) {
        this.id = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
    }

    public Person(int id, String firstName, String lastName, int age, String town, Date createdOn, boolean isTeacher, Enum type, double rating) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
        this.createdOn = createdOn;
        this.isTeacher = isTeacher;
        this.type = type;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public String getCreatedOnToString(String dataFormatPattern){
        DateFormat df = new SimpleDateFormat(dataFormatPattern);
        String dateAsString = df.format(this.createdOn);
        dateAsString = String.format("\"%s\"", dateAsString);
        return dateAsString;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public void setTeacher(boolean teacher) {
        isTeacher = teacher;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getUpdatedOnToString(String dataFormatPattern) {
        DateFormat df = new SimpleDateFormat(dataFormatPattern);

        Date today = Calendar.getInstance().getTime();
        String dateAsString = df.format(today);
        dateAsString = String.format("\"%s\"", dateAsString);
        return dateAsString;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", town='" + town + '\'' +
                '}';
    }
}
