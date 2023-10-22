package myProjectLibrary;

public class Book {
    private int bookNumber;
    private String bookName;
    private String author;
    private int year;

    public Book() {
    }

    public Book(int bookNumber, String bookName, String author, int year) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book {" +
                " bookNumber = " + bookNumber +
                ", bookName = '" + bookName + '\'' +
                ", author = '" + author + '\'' +
                ", year = " + year +
                '}';
    }
}
