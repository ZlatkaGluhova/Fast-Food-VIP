package myProjectFastFood.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Pizza> pizzas = new ArrayList<>();
    private List<Burger> burgers = new ArrayList<>();


    public List<Burger> getBurgers() {
        return burgers;
    }

    public void setBurgers(List<Burger> burgers) {
        this.burgers = burgers;
    }

    public void setBurger(Burger burger) {
        burgers.add(burger);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void setPizza(Pizza pizza) {
        pizzas.add(pizza);
    }


}
