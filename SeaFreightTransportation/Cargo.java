package SeaFreightTransportation;

public class Cargo {

    private String name;
    private int weight;

    private int loadPrice;

    public int getLoadPrice() {
        return loadPrice;
    }


    public Cargo(String name, int weight) {
        this.name = name;
        this.weight = weight;

        this.loadPrice = weight*2; //to redone and move this logic from constructor
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", loadPrice=" + loadPrice +
                '}';
    }
}
