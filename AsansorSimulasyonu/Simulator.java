import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulator {
    private List<Floor> floors;
    private List<Elevator> elevators;
    private ElevatorController controller;
    private Random randomGenerator;

    public Simulator() {
        floors = new ArrayList<>();
        for (int i = 0; i < 12; i++) floors.add(new Floor(i)); // 12 kat

        elevators = new ArrayList<>();
        for (int i = 0; i < 5; i++) elevators.add(new Elevator("E" + (i+1), 12)); // 5 asansör

        controller = new ElevatorController(elevators);
        randomGenerator = new Random();
    }

    public void logTimeAndEvent(String event) {
        System.out.println("[" + LocalTime.now() + "] " + event);
    }

    public void triggerRandomPassenger() {
        int start = randomGenerator.nextInt(12);
        int dest = randomGenerator.nextInt(12);
        Passenger p = new Passenger(start, dest);

        logTimeAndEvent("Yolcu oluşturuldu. Kalkış Kattı: " + start + ", Hedef Kat: " + dest);

        // Yolcu butona basar
        Elevator assigned = controller.dispatchElevator(start, (start < dest) ? "YUKARI" : "AŞAĞI");
        
        // Simüle edilen olaylar
        floors.get(start).ringArrivalBell();
        floors.get(start).showDirectionLight((start < dest) ? "YUKARI" : "AŞAĞI");
        assigned.openDoors();
        assigned.addPassenger(p);
        assigned.getControlPanel().pressDestinationButton(dest);
        assigned.closeDoors();
    }
}
