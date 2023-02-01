package objectAndClasses;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        String line = scanner.nextLine();

        while (!line.equals("end")) {
            String[] dateStudent = line.split(" ");
            String firstName = dateStudent[0];
            String lastName = dateStudent[1];
            int age = Integer.parseInt(dateStudent[2]);
            String hometown = dateStudent[3];

            Student student = new Student(firstName, lastName, age, hometown);

            students.add(student);
            line = scanner.nextLine();
        }

        String filterHometown = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(filterHometown)) {
                System.out.printf("%s %s is %d years old from %s.%n", student.getFirstName(), student.getLastName(), student.getAge(), student.getHometown());
            }
        }

    }
}
