package SeaFreightTransportation;

import java.util.ArrayList;

public class ShipList { //Тимчасове рішення замість норм бази

    public static ArrayList<Ship> ships = new ArrayList<>();

    static {
        ships.add(new Ship("SS Bessemer",8,4500));
        ships.add(new Ship("CMA CGM Medea",13,10770));
        ships.add(new Ship("CMA CGM Thalassa",12,13070));
        ships.add(new Ship("CMA CGM Vela",11,13180));
        ships.add(new Ship("SS Desabla",18,6000));
        ships.add(new Ship("SS Atlantic Conveyor",11,14950));
        ships.add(new Ship("Axel Maersk",13,10900));
        ships.add(new Ship("MV Acavus",6,8010));
        ships.add(new Ship("MV Adula",7,8040));
        ships.add(new Ship("SS Atlantic Causeway",10,14946));
    }

}
