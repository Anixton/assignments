public class Subscriber extends User {
    private int credits;

    public Subscriber(String id, String name) {
        super(id, name);
        this.credits = 0;
    }

    public int getCredits() { return credits; }

    public void buyCredits(int amount) {
        this.credits += amount;
        System.out.println(getName() + " hesabına " + amount + " kredi yüklendi.");
    }

    public void rentMovie(Movie movie) {
        if (!movie.isAvailable()) {
            throw new IllegalArgumentException("Film şu an mevcut değil!");
        }
        if (credits >= movie.getRentCreditCost()) {
            credits -= movie.getRentCreditCost();
            System.out.println(getName() + ", " + movie.getTitle() + " isimli filmi kiraladı. Kalan kredi: " + credits);
        } else {
            System.out.println("Yetersiz kredi! Kiralama işlemi başarısız.");
        }
    }
}
