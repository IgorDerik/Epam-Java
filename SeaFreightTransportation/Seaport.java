package SeaFreightTransportation;

public class Seaport {

    private String name;

    private int maxWeightCanBeLoaded;

    public Seaport(String name, int maxWeightCanBeLoaded) {
        this.name = name;
        this.maxWeightCanBeLoaded = maxWeightCanBeLoaded;
    }

    public void toLoad(int weight) {
        maxWeightCanBeLoaded = maxWeightCanBeLoaded-weight;
    }

    public void toShip(int weight) {
        maxWeightCanBeLoaded = maxWeightCanBeLoaded+weight;
    }

    public String getName() {
        return name;
    }

    public int getMaxWeightCanBeLoaded() {
        return maxWeightCanBeLoaded;
    }

}
