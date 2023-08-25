public class MovieManager {
    private String[] movies = new String[0];
    public int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] movies1 = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            movies1[i] = movies[i];
        }
        movies1[movies1.length - 1] = movie;
        this.movies = movies1;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] movies1 = new String[resultLength];
        for (int i = 0; i < movies1.length; i++) {
            movies1[i] = movies[movies.length - 1 - i];
        }
        return movies1;
    }
}
