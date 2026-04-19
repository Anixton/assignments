import java.util.List;

public class Airline {
    private String id;
    private String name;
    private List<Aircraft> aircrafts;
    private List<Pilot> pilots;
    private List<Flight> flights;

    public Airline(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<Aircraft> getAircrafts() { return aircrafts; }
    public List<Pilot> getPilots() { return pilots; }
    public List<Flight> getFlights() { return flights; }
}
