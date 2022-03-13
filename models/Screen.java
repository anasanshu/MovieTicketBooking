import java.util.List;

public class Screen extends BaseModel {
    private String name;
    private Theatre theatre;
    private List<Seat> seats;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Theatre getTheatre() {
        return theatre;
    }
    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
    public List<Seat> getSeats() {
        return seats;
    }
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

}
