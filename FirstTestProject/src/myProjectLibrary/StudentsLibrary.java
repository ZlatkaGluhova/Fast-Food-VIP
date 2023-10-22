package myProjectLibrary;

import java.util.ArrayList;
import java.util.List;

public class StudentsLibrary {
    public static final String DASHES = "-----------------------------------------------------------";

    public static void main(String[] args) {
        List<Student> students = addStudentsToTheList();
        List<Book> books = addBooksToTheList();
        List<Book> takenBookForStudent = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(12);
        addBook(books, takenBookForStudent, number);
        Student student1 = students.get(0);
        getBooksForStudent(books, student1, takenBookForStudent);
        takenBookForStudent = new ArrayList<>();
        number.clear();

        number.add(11);
        number.add(13);
        addBook(books, takenBookForStudent, number);
        Student student2 = students.get(2);
        getBooksForStudent(books, student2, takenBookForStudent);

        Book firstBook = student1.getTakenBooks().get(0);
        books.add(firstBook);
        student1.getTakenBooks().remove(0);

        takenBookForStudent = new ArrayList<>();
        number.clear();

        number.add(10);
        number.add(14);
        addBook(books, takenBookForStudent, number);
        Student student3 = students.get(4);
        getBooksForStudent(books, student3, takenBookForStudent);

    }

    public static List<Student> addStudentsToTheList() {

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Mariya Kovacheva", 1, "A-100", 24, 898661006));
        listOfStudents.add(new Student("Daniel Chervenkov", 2, "A-200", 25, 877544699));
        listOfStudents.add(new Student("Vasilka Chervenkova", 3, "A-300", 27, 879487090));
        listOfStudents.add(new Student("Zlatka Gluhova", 4, "A-400", 28, 876855539));
        listOfStudents.add(new Student("Vangel Todorov", 5, "A-500", 33, 883324188));
        listOfStudents.add(new Student("Nadezhda Sokolova - Todorova", 5, "A-501", 33, 882435006));
        listOfStudents.add(new Student("Stefan Gluhov", 5, "A-502", 33, 888683436));
        listOfStudents.add(new Student("Vasil Sokolov", 6, "A-600", 35, 83421330));
        listOfStudents.add(new Student("Zlatin Karabaliev", 6, "A-601", 34, 988342363));
        listOfStudents.add(new Student("Radina Vulcheva", 6, "A-602", 34, 888408314));

//        for (int i = 0; i < listOfStudents.size(); i++) {
//
//            System.out.printf("%s %s - %d course - +389%d%n", listOfStudents.get(i).getCourseNumber(), listOfStudents.get(i).getName(), listOfStudents.get(i).getCourse(), listOfStudents.get(i).getMobileNumber());
//        }

        return listOfStudents;

    }

    public static List<Book> addBooksToTheList() {

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book(10, "English Grammar", "Steven Wolsh", 2010));
        listOfBooks.add(new Book(11, "French Grammar", "Lara Luc", 2008));
        listOfBooks.add(new Book(12, "Russian Grammar", "Fedor Nikolov", 2001));
        listOfBooks.add(new Book(13, "Bulgarian Grammar", "Peter Dimitrov", 2000));
        listOfBooks.add(new Book(14, "Spanish Grammar", "Lucia Mayte", 2006));

        return listOfBooks;
    }

    public static void printStudentsList() {
        List<Student> listOfStudents = addStudentsToTheList();
        System.out.println(DASHES);
        for (Student student : listOfStudents) {
            System.out.println(student.toString());
//            System.out.printf("%s %s - %d course - +389%d%n", student.getCourseNumber(), student.getName(), student.getCourse(), student.getMobileNumber());
        }
        System.out.println(DASHES);
    }

    public static void printBookList(List<Book> books) {
        System.out.println(DASHES);
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println(DASHES);
    }

    public static Student getBooksForStudent(List<Book> books, Student student, List<Book> takenBooks) {

        student.setTakenBooks(takenBooks);
        books.removeAll(takenBooks);

        System.out.println(student);
        System.out.println(DASHES);
        System.out.println("Books in Library:");
        printBookList(books);
        return student;
    }

    public static void addBook(List<Book> books, List<Book> takenBookForStudent, List<Integer> number) {
        for (Book book : books) {
            if (number.contains(book.getBookNumber())) {
                takenBookForStudent.add(book);
            }
        }
    }
}
