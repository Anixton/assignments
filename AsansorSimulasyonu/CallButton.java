public class CallButton extends Button {
    // Yukarı veya aşağı (UP/DOWN)
    private String direction;

    public CallButton(String direction) {
        this.direction = direction;
    }

    public String getDirection() { return direction; }

    @Override
    public void press() {
        setPressed(true);
        System.out.println("Kat çağrı butonuna tıklandı. Yön: " + direction);
    }
}
