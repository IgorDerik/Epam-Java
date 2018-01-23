package PizzaNew;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza = new PizzaCheese(pizza);
        pizza = new PizzaOnion(pizza);
        pizza = new PizzaChicken(pizza);
        pizza = new PizzaOlives(pizza);

        System.out.println("You're getting " + pizza.description());

    }

}