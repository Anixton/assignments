public abstract class Animal {
    private String turAdi;
    private double agirlik;
    private int yas;

    public Animal(String turAdi, double agirlik, int yas) {
        this.turAdi = turAdi;
        this.agirlik = agirlik;
        this.yas = yas;
    }

    public String getTurAdi() { return turAdi; }
    public double getAgirlik() { return agirlik; }
    public int getYas() { return yas; }

    public abstract double getDosage();
    public abstract String getFeedSchedule();
}
