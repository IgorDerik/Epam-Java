package CoffeePoint.components;

public class CreamCoffee extends EspressoBase {

    private EspressoBase base;

    public CreamCoffee(EspressoBase base) {
        this.base = base;
    }

    @Override
    public String description() {
        return base.description() + ", Cream";
    }

}
