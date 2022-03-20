import java.util.Date;

public class Movie extends BaseModel {
    private String name;
    private int durationInMins;

    public Movie(String id, Date createdAt, String name, int durationInMins){
        super(id, createdAt);
        this.setName(name);
        this.setDurationInMins(durationInMins);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDurationInMins() {
        return durationInMins;
    }
    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }
    
}
