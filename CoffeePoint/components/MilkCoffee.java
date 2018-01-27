package CoffeePoint.components;

public class MilkCoffee extends EspressoBase {

    private EspressoBase base;

    public MilkCoffee(EspressoBase base) {
        this.base = base;
    }

    @Override
    public String description() {
        return base.description() + ", Milk";
    }
}
