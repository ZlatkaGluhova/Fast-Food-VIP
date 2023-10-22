package myProjectLibrary;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int course;
    private String courseNumber;
    private int age;
    private int mobileNumber;
    List<Book> takenBooks = new ArrayList<>();

    public Student() {
    }

    public Student(String name, int course, String courseNumber, int age, int mobileNumber) {
        this.name = name;
        this.course = course;
        this.courseNumber = courseNumber;
        this.age = age;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<Book> getTakenBooks() {
        return takenBooks;
    }

    public void setTakenBooks(List<Book> takenBooks) {
        this.takenBooks = takenBooks;
    }

    public void setTakenBook(Book takenBooks) {
        this.takenBooks.add(takenBooks);
    }
    @Override
    public String toString() {
        return "Student {" +
                " name = '" + name + '\'' +
                ", course = " + course +
                ", courseNumber = '" + courseNumber + '\'' +
                ", age = " + age +
                ", mobileNumber = " + mobileNumber +
                ", takenBooks = " + takenBooks +
                '}';
    }
}

