public class Movie implements Comparable<Movie> {
    private String id;
    private String title;
    private double buyPrice;
    private int rentCreditCost;
    private boolean isAvailable;

    public Movie(String id, String title, double buyPrice, int rentCreditCost, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.buyPrice = buyPrice;
        this.rentCreditCost = rentCreditCost;
        this.isAvailable = isAvailable;
    }

    public String getTitle() { return title; }
    public double getBuyPrice() { return buyPrice; }
    public int getRentCreditCost() { return rentCreditCost; }
    public boolean isAvailable() { return isAvailable; }

    // Filmlerin varsayılan sıralanma yöntemi (Örneğin adına göre)
    @Override
    public int compareTo(Movie other) {
        return this.title.compareToIgnoreCase(other.title);
    }
}
