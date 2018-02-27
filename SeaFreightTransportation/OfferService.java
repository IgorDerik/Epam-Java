package SeaFreightTransportation;

import java.util.ArrayList;

public class OfferService {

    private ArrayList<Offer> offers = new ArrayList<>();

    public ArrayList<Offer> getOffers() {
        return offers;
    }

    private Offer preOffer;

    public OfferService(Offer preOffer) {
        this.preOffer = preOffer;
    }

    public void buildOffersDependingOnShip() { //to redone
        for (Ship ship : ShipList.ships) {
            offers.add(new Offer(preOffer.getDeparturePort(),preOffer.getArrivalPort(),preOffer.getCargo(),ship));
        }
    }
}
