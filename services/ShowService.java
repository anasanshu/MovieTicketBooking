import java.util.Date;
import java.util.UUID;

public class ShowService {
    ShowRepository showRepository;

    public ShowService(){
        this.showRepository = new ShowRepository();
    }   

    // private String name;
    // private Screen screen;
    // private Movie movie;
    // private Date startTime;
    // private int durationInMins;

    public Show createShow(String name, Screen screen, Movie movie, Date startTime, int durationInMins){
        String id = UUID.randomUUID().toString();
        Date createdAt = new Date();

        Show show = new Show(id, createdAt, name, screen, movie, startTime, durationInMins);
        return this.showRepository.save(show);
    }

}
