import java.util.*;

public class MovieRepository {
    List<Movie> movies = new ArrayList<Movie>();

    public Movie save(Movie movie){
        movies.add(movie);
        System.out.println("Movie added");
        return movie;
    }
}
