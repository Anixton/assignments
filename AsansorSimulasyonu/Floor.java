public class Floor {
    private int floorNumber;
    private CallButton upButton;
    private CallButton downButton;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.upButton = new CallButton("UP");
        this.downButton = new CallButton("DOWN");
    }

    public int getFloorNumber() { return floorNumber; }

    public void ringArrivalBell() {
        System.out.println("[Kat " + floorNumber + "] *Çing!* Asansör geldi.");
    }

    public void showDirectionLight(String direction) {
        System.out.println("[Kat " + floorNumber + "] Kapı Üstü Sinyal: Asansör " + direction + " yönüne gidiyor.");
    }
}
