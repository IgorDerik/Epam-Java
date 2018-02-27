package SeaFreightTransportation;

public class Ship {

    private String name;
    private int speed;
    private int capacity;

    public Ship(String name, int speed, int capacity) {
        this.name = name;
        this.speed = speed;
        this.capacity = capacity;
    }

    public void toLoad(int weight) {
        capacity = capacity-weight;
    }

    public void toDropLoad(int weight) {
        capacity = capacity+weight;
    }

    public int getDeliverTime(int distance) {
        return distance/speed;
    }
}
