public class Feline extends Animal {
    public Feline(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return getAgirlik() * 0.8 + getYas();
    }

    @Override
    public String getFeedSchedule() {
        return "Öğlen 12:00 (Çiğ Et)";
    }
}
