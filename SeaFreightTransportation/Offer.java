package SeaFreightTransportation;

public class Offer {

    private Seaport departurePort;
    private Seaport arrivalPort;
    private Cargo cargo;
    private int maxLoadPrice;

    public Offer(Seaport departurePort, Seaport arrivalPort, Cargo cargo, int maxLoadPrice) {
        this.departurePort = departurePort;
        this.arrivalPort = arrivalPort;
        this.cargo = cargo;
        this.maxLoadPrice = maxLoadPrice;
    }

    public void setMaxLoadPrice(int maxLoadPrice) {
        this.maxLoadPrice = maxLoadPrice;
    }

    public boolean isPriceAcceptable() {
        return cargo.getLoadPrice() <= maxLoadPrice;
    }

    public void printDescription() {
        System.out.println("You are going to transfer "+cargo.getName());
        System.out.println("From "+departurePort.getName()+" To "+arrivalPort.getName());
        System.out.println("Weight: "+cargo.getWeight());
        System.out.println("Price: "+cargo.getLoadPrice());
        System.out.println("Is price acceptable: "+isPriceAcceptable());
    }

}
