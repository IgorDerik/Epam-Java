package SeaFreightTransportation;

public class Cargo {

    private String name;
    private int weight;

    private int loadPrice;

    public int getLoadPrice() {
        return weight*2;
    }

    public Cargo(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

}
