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

        System.out.println();
        System.out.println("Departure port: "+departurePort.getCity());
        System.out.println("Arrival port: "+arrivalPort.getCity());
        System.out.println("Distance: "+departurePort.getLocation().getDistanceTo(arrivalPort.getLocation())+ " meters.");
    }

}
