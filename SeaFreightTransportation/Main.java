package SeaFreightTransportation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to our transportation system!");
        System.out.println("Currently we are working with such ports: ");

        PortList.viewList();

        System.out.println("Please choose and print a number of a departure port:");
        int departurePortIndex = Integer.parseInt(reader.readLine());

        System.out.println("Please choose and print a number of an arrival port:");
        int arrivalPortIndex = Integer.parseInt(reader.readLine());

        Seaport departurePort = PortList.ports.get(departurePortIndex);
        Seaport arrivalPort = PortList.ports.get(arrivalPortIndex);

        double distance = departurePort.getLocation().getDistanceTo(arrivalPort.getLocation());

        System.out.println();
        System.out.println("Departure port: "+departurePort.getCity());
        System.out.println("Arrival port: "+arrivalPort.getCity());
        System.out.println("Distance: "+distance+ " meters.");

        System.out.println();
        System.out.println("Please enter your cargo name:");
        String cargoName = reader.readLine();

        System.out.println("Please enter a cargo weight:");
        int cargoWeight = Integer.parseInt(reader.readLine());

        Cargo yourCargo = new Cargo(cargoName,cargoWeight);

        OfferService offerService = new OfferService(new Offer(departurePort,arrivalPort,yourCargo));
        offerService.buildOffersDependingOnShip();

        System.out.println();
        System.out.println("Our offers for you:");
        for (Offer offer : offerService.getOffers()) {
            System.out.println("Ship: " + offer.getShip().getName());
            System.out.println("Road time: "+ offer.getShip().getDeliverTime(distance) / 3600 +" h");
            System.out.println("Full Price: "+ offer.getFullPrice());
            System.out.println();
        }

    }

}
