public class Rodent extends Animal {
    public Rodent(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return getAgirlik() * 0.1;
    }

    @Override
    public String getFeedSchedule() {
        return "Sabah 08:00 (Tohum), Gece 22:00 (Meyve)";
    }
}
