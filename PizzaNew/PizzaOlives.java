package PizzaNew;

public class PizzaOlives extends PizzaBase {

    private Pizza pizza;

    public PizzaOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    public String description() {
        return pizza.description() + " [olives]";
    }

}
