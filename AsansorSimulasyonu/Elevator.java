import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private String id;
    private int capacity = 6;
    private int currentFloor;
    private boolean isMoving;
    private ControlPanel controlPanel;
    private List<Passenger> passengers;

    public Elevator(String id, int maxFloors) {
        this.id = id;
        this.currentFloor = 0; // Giriş katı
        this.isMoving = false;
        this.controlPanel = new ControlPanel(maxFloors);
        this.passengers = new ArrayList<>();
    }

    public String getId() { return id; }
    public int getCurrentFloor() { return currentFloor; }
    public boolean isMoving() { return isMoving; }
    public ControlPanel getControlPanel() { return controlPanel; }

    public void displayIndicator() {
        System.out.println("[Asansör " + id + " İçi Gösterge] Şu anki kat: " + currentFloor);
    }

    public void openDoors() {
        System.out.println("[Asansör " + id + "] Kapılar Açılıyor...");
        // Belli bir süre bekleme simülesi...
    }

    public void closeDoors() {
        System.out.println("[Asansör " + id + "] Kapılar Kapanıyor...");
    }

    public boolean addPassenger(Passenger p) {
        if (passengers.size() < capacity) {
            passengers.add(p);
            return true;
        }
        return false;
    }
}
