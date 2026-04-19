public class Passenger {
    private int startFloor;
    private int destinationFloor;

    public Passenger(int startFloor, int destinationFloor) {
        this.startFloor = startFloor;
        this.destinationFloor = destinationFloor;
    }

    public int getStartFloor() { return startFloor; }
    public int getDestinationFloor() { return destinationFloor; }
}
