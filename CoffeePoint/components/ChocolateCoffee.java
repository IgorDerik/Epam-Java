package CoffeePoint.components;

public class ChocolateCoffee extends EspressoBase {

    private EspressoBase base;

    public ChocolateCoffee(EspressoBase base) {
        this.base = base;
    }

    @Override
    public String description() {
        return base.description() + ", Chocolate";
    }

}
