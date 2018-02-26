package SeaFreightTransportation;

import java.util.ArrayList;

public class PortList { //Тимчасове рішення замість норм бази

    public static ArrayList<Seaport> ports = new ArrayList<>();

    static {
        Location Odessa = new Location(46.503611,30.744444);
        Location Kherson = new Location(46.328889,30.659444);
        Location Shanghai = new Location(30.626539,122.064958);
        Location Singapore = new Location(1.264,103.84);
        Location Tianjin = new Location(38.975833,117.7875);
        Location Rotterdam = new Location(51.885,4.2867);
        Location Hedland = new Location(-20.316667,118.575);
        Location Klang = new Location(3,101.4);
        Location Nagoya = new Location(35.08,136.88);
        Location Dampier = new Location(-20.66,116.71);
        Location Istanbul = new Location(41.0228,28.97834);
        ports.add(new Seaport("Odessa","Ukraine",313680,Odessa));
        ports.add(new Seaport("Kherson","Ukraine",156840,Kherson));
        ports.add(new Seaport("Shanghai","China",590439,Shanghai));
        ports.add(new Seaport("Singapore","Singapore",531176,Singapore));
        ports.add(new Seaport("Tianjin","China",459941,Tianjin));
        ports.add(new Seaport("Rotterdam","Netherlands",434551,Rotterdam));
        ports.add(new Seaport("Hedland","Australia",246672,Hedland));
        ports.add(new Seaport("Klang","Malaysia",193726,Klang));
        ports.add(new Seaport("Nagoya","Japan",186305,Nagoya));
        ports.add(new Seaport("Dampier","Australia",171844,Dampier));
        ports.add(new Seaport("Istanbul","Turkey",541268,Istanbul));
    }

    public static void viewList() {
        System.out.println();
        for (int i=0; i<ports.size(); i++) {
            System.out.println(i+": "+ports.get(i).getCity());
        }
        System.out.println();
    }
}
