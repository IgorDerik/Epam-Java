package PizzaNew;

public class PizzaOnion extends PizzaBase {

    private Pizza pizza;

    public PizzaOnion(Pizza pizza) {
        this.pizza = pizza;
    }

    public String description() {
        return pizza.description() + " [onions]";
    }

}