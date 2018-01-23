package PizzaNew;

public class PizzaOnion extends Pizza {

    private Pizza pizza;

    public PizzaOnion(Pizza pizza) {
        this.pizza = pizza;
    }

    public String description() {
        return pizza.description() + " [onions]";
    }

}