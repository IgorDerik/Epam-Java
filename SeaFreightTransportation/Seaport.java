package SeaFreightTransportation;

public class Seaport {

    private String city;
    private String country;

    private String name;

    private int maxWeightCanBeLoaded;

    Location location;

    public Seaport(String city, String country, int maxWeightCanBeLoaded, Location location) {
        this.city = city;
        this.country = country;
        this.maxWeightCanBeLoaded = maxWeightCanBeLoaded;
        this.location = location;
    }

    public Seaport(String name, int maxWeightCanBeLoaded) {
        this.name = name;
        this.maxWeightCanBeLoaded = maxWeightCanBeLoaded;
    }

    public void toLoad(int weight) {
        maxWeightCanBeLoaded = maxWeightCanBeLoaded-weight;
    }

    public void toShip(int weight) {
        maxWeightCanBeLoaded = maxWeightCanBeLoaded+weight;
    }

    public String getName() {
        return name;
    }

    public int getMaxWeightCanBeLoaded() {
        return maxWeightCanBeLoaded;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Seaport{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", maxWeightCanBeLoaded=" + maxWeightCanBeLoaded +
                ", location=" + location +
                '}';
    }
}
