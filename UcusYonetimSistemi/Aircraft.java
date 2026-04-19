public class Aircraft {
    public enum State { WORKING, REPAIR }

    private String id;
    private String type;
    private State state;
    private int requiredPilots;

    public Aircraft(String id, String type, int requiredPilots) {
        this.id = id;
        this.type = type;
        this.requiredPilots = requiredPilots;
        this.state = State.WORKING;
    }

    public String getId() { return id; }
    public String getType() { return type; }
    public State getState() { return state; }
    public void setState(State state) { this.state = state; }
    public int getRequiredPilots() { return requiredPilots; }
}
