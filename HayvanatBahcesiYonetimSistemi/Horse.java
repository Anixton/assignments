public class Horse extends Animal {
    public Horse(String turAdi, double agirlik, int yas) {
        super(turAdi, agirlik, yas);
    }

    @Override
    public double getDosage() {
        return getAgirlik() * 0.5;
    }

    @Override
    public String getFeedSchedule() {
        return "Sabah 06:00 (Ot), Akşam 18:00 (Yulaf)";
    }
}
