import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TheatreService {
    TheatreRepository theatreRepository;

    public TheatreService(){
        this.theatreRepository = new TheatreRepository();
    }

    public Theatre createTheatre(String theatreName, String address){
        String id = UUID.randomUUID().toString();
        Date createdAt = new Date();
        Theatre theatre = new Theatre(id, createdAt, theatreName, address);
        return this.theatreRepository.save(theatre);
    }

    public List<Screen> createScreensInTheatre(String name, String theatreId){
        Optional<Theatre> theatre = this.theatreRepository.theatres.stream().filter(obj -> obj.getId().equals(theatreId)).findFirst();
        if(theatre.isPresent()){
            Theatre theatreObj = theatre.get();
            String id = UUID.randomUUID().toString();
            Date createdAt = new Date();

            Screen screen = new Screen(id, createdAt, name, theatreObj);

            theatreObj.addScreen(screen);

            return theatreObj.getScreens();
        }else{
            System.out.println("Wrong theatre id, theatre not present");
        }

        return null;
    }

    // createSeatsInScreens()

}
