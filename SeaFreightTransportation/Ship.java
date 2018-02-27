package SeaFreightTransportation;

public class Ship {

    private String name;
    private int speed;
    private int capacity;

    private int transferPrice;

    public int getTransferPrice() {
        return transferPrice;
    }

    public Ship(String name, int speed, int capacity) {
        this.name = name;
        this.speed = speed;
        this.capacity = capacity;

        this.transferPrice = speed*100; //to redone and move this logic from constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTransferPrice(int transferPrice) {
        this.transferPrice = transferPrice;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", capacity=" + capacity +
                ", transferPrice=" + transferPrice +
                '}';
    }

    public void toLoad(int weight) {
        capacity = capacity-weight;
    }

    public void toDropLoad(int weight) {
        capacity = capacity+weight;
    }

    public double getDeliverTime(double distance) {
        return distance/speed;
    }
}
