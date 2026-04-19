import java.util.ArrayList;
import java.util.List;

public class ControlPanel {
    private List<Button> destinationButtons;
    private Button openDoorButton;
    private Button closeDoorButton;
    private Button emergencyButton;

    public ControlPanel(int maxFloors) {
        destinationButtons = new ArrayList<>();
        // Basit temsil
        openDoorButton = new Button() { @Override public void press() { System.out.println("Kapı açma butonuna basıldı."); } };
        closeDoorButton = new Button() { @Override public void press() { System.out.println("Kapı kapama butonuna basıldı."); } };
        emergencyButton = new Button() { @Override public void press() { System.out.println("! ACİL DURUM BUTONUNA BASILDI !"); } };
    }

    public void pressDestinationButton(int floorIndex) {
        System.out.println("Hedef kat butonuna basıldı: " + floorIndex);
    }
}
