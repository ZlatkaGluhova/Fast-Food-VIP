package Tests;

public class Cat extends Animal{

    private String country;

    public Cat() {
    }
    public Cat(String country) {
        this.country = country;
    }

    public Cat(String name, int age, String country){
        super(name, age);
        this.country = country;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    @Override
//    public void speak(){
//        System.out.println("Cat speak");
//    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
