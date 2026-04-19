import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    private List<Movie> movies;
    private List<User> users;
    private List<MovieRequest> pendingRequests;

    public Application() {
        this.movies = new ArrayList<>();
        this.users = new ArrayList<>();
        this.pendingRequests = new ArrayList<>();
    }

    public void addMovie(Movie movie) { movies.add(movie); }
    public void addUser(User user) { users.add(user); }

    public void displayMovies() {
        for (Movie m : movies) {
            System.out.println(m.getTitle() + " - Satış: " + m.getBuyPrice() + " ₺ | Kiralama: " + m.getRentCreditCost() + " Kredi");
        }
    }

    public void sortMovies() {
        Collections.sort(movies);
    }

    public void addRequest(MovieRequest request) {
        pendingRequests.add(request);
        System.out.println("Yeni film talebi alındı: " + request.getRequestedMovieTitle() + " (İsteyen: " + request.getRequestedBy().getName() + ")");
    }
}
