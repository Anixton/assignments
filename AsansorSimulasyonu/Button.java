public abstract class Button {
    private boolean isPressed;

    public Button() {
        this.isPressed = false;
    }

    public boolean isPressed() { return isPressed; }
    public void setPressed(boolean pressed) { this.isPressed = pressed; }

    // Polimorfik metod
    public abstract void press();
}
