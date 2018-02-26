package SeaFreightTransportation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to our transportation system!");
        System.out.println("We have discount for you if your name is Volodymyr! :)");
        System.out.println();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is the maximum price you agree to pay?");
        int maxPrice = Integer.parseInt( reader.readLine() );

        Seaport Odessa = new Seaport("Odessa",5000);
        Seaport Istanbul = new Seaport("Istanbul",100000);

        Cargo potato = new Cargo("Potato",100);

        Offer offer = new Offer(Odessa,Istanbul,potato,maxPrice);

        offer.printDescription();

        /*
        System.out.println("Enter a departure port:");
        String portFrom = reader.readLine();
        System.out.println("Enter an arrival port:");
        String portTo = reader.readLine();
        System.out.println("What is the weight of your goods?");
        int cargoWeight = Integer.parseInt( reader.readLine() );
        System.out.println("Looking for proposals to transport cargo from "+portFrom+" to "+portTo+"... Max price: "+maxPrice+" Weigh: "+cargoWeight);
        */

    }

}
