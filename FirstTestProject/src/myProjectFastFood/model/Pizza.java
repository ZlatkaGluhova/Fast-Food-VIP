package myProjectFastFood.model;

public class Pizza {
    private int number;
    private String name;
    private double price;
    private int quantity;
    private double sum;

    public Pizza() {

    }


    public Pizza(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;

    }

    public Pizza(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
