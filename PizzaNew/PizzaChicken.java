package PizzaNew;

public class PizzaChicken extends Pizza {

    private Pizza pizza;

    public PizzaChicken(Pizza pizza) {
        this.pizza = pizza;
    }

    public String description() {
        return pizza.description() + " [chicken]";
    }

}
