public abstract class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    // Ortak eylem: İki kullanıcı tipi de film satın alabilir.
    public void buyMovie(Movie movie) {
        if (!movie.isAvailable()) {
            throw new IllegalArgumentException("Film şu an mevcut değil!");
        }
        System.out.println(name + ", " + movie.getTitle() + " isimli filmi satın aldı.");
    }

    // Ortak eylem: İstekte bulunma
    public MovieRequest requestMissingMovie(String requestedTitle) {
        return new MovieRequest(this, requestedTitle);
    }
}
