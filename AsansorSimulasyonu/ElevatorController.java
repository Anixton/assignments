import java.util.List;

public class ElevatorController {
    private List<Elevator> elevators;

    public ElevatorController(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public Elevator dispatchElevator(int calledFloor, String direction) {
        // En basit dispatch mantığı: İlk rastgele asansörü veya en yakın olanı döndür. (Simülasyon özü)
        System.out.println("Programlayıcı (Controller): Kat " + calledFloor + " için " + direction + " yönünde bir asansör görevlendiriyor...");
        return elevators.get(0); // Örnek olarak ilk asansörü atayalım
    }
}
