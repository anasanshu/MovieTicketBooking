import java.util.Date;
import java.util.UUID;

public class MovieService {
    
    MovieRepository movieRepository;

    public MovieService(){
        this.movieRepository = new MovieRepository();
    }

    public Movie createMovie(String movieName, int durationInMins){
        String id = UUID.randomUUID().toString();
        Date date = new Date();

        Movie movie = new Movie(id, date, movieName, durationInMins);
        return this.movieRepository.save(movie);
    }

}
