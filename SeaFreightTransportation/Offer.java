package SeaFreightTransportation;

public class Offer {

    private Seaport departurePort;
    private Seaport arrivalPort;
    private Cargo cargo;
    private int maxFullPrice;
    private Ship ship;

    private int fullPrice;

    public int getFullPrice() {
        return fullPrice;
    }

    public Offer(Seaport departurePort, Seaport arrivalPort, Cargo cargo, Ship ship) {
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.cargo = cargo;
        this.ship = ship;
        this.fullPrice = cargo.getLoadPrice()+ship.getTransferPrice();
    }

    public Offer(Seaport departurePort, Seaport arrivalPort, Cargo cargo) {
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.cargo = cargo;
    }

    public void setMaxFullPrice(int maxFullPrice) {
        this.maxFullPrice = maxFullPrice;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Seaport getDeparturePort() {
        return departurePort;
    }

    public Seaport getArrivalPort() {
        return arrivalPort;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public int getMaxFullPrice() {
        return maxFullPrice;
    }

    public Ship getShip() {
        return ship;
    }

    public Offer(Seaport departurePort, Seaport arrivalPort, Cargo cargo, int maxFullPrice, Ship ship) {
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.cargo = cargo;
        this.maxFullPrice = maxFullPrice;
        this.ship = ship;
    }

    public boolean isPriceAcceptable() {
        return getFullPrice() <= maxFullPrice;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "departurePort=" + departurePort +
                ", arrivalPort=" + arrivalPort +
                ", cargo=" + cargo +
                ", maxFullPrice=" + maxFullPrice +
                ", ship=" + ship +
                ", fullPrice=" + fullPrice +
                '}';
    }

    /*
    public void printDescription() {
        System.out.println("You are going to transfer "+cargo.getName());
        System.out.println("From "+departurePort.getName()+" To "+arrivalPort.getName());
        System.out.println("Weight: "+cargo.getWeight());
        System.out.println("Price: "+cargo.getLoadPrice());
        System.out.println("Is price acceptable: "+isPriceAcceptable());
    }
*/

}
