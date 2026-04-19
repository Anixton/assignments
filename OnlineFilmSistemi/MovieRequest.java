public class MovieRequest {
    private User requestedBy;
    private String requestedMovieTitle;

    public MovieRequest(User requestedBy, String requestedMovieTitle) {
        this.requestedBy = requestedBy;
        this.requestedMovieTitle = requestedMovieTitle;
    }

    public String getRequestedMovieTitle() { return requestedMovieTitle; }
    public User getRequestedBy() { return requestedBy; }
}
