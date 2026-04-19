import java.time.LocalDateTime;

public class Flight {
    private String id;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Aircraft aircraft;
    private Pilot pilot;
    private Pilot coPilot;

    public Flight(String id, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureTime, LocalDateTime arrivalTime, Aircraft aircraft, Pilot pilot, Pilot coPilot) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.pilot = pilot;
        this.coPilot = coPilot;
    }

    public String getId() { return id; }
    public Airport getDepartureAirport() { return departureAirport; }
    public Airport getArrivalAirport() { return arrivalAirport; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public Aircraft getAircraft() { return aircraft; }
    public Pilot getPilot() { return pilot; }
    public Pilot getCoPilot() { return coPilot; }
}
