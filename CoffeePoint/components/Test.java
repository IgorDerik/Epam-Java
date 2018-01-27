package CoffeePoint.components;

public class Test {

    public static void main(String[] args) {

        EspressoBase coffee = new EspressoBase();

        coffee = new MilkCoffee(coffee);
        coffee = new CreamCoffee(coffee);
        coffee = new ChocolateCoffee(coffee);

        System.out.println(coffee.description());

    }

}
