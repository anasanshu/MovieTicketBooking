import java.util.*;
public class Show extends BaseModel {
    private String name;
    private Screen screen;
    private Movie movie;
    private Date startTime;
    private int durationInMins;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Screen getScreen() {
        return screen;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    public Movie getMovie() {
        return movie;
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public int getDurationInMins() {
        return durationInMins;
    }
    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    } 
}
