import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Theatre extends BaseModel {
    private String name;
    private String address;
    private List<Screen> screens;

    public Theatre(String id, Date createdAt, String name, String address) {
        super(id, createdAt);
        this.name = name;
        this.address = address;
        this.screens = new ArrayList<Screen>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<Screen> getScreens() {
        return screens;
    }
    public void setScreens(List<Screen> screens) {
        this.screens.addAll(screens);
    }

    public void addScreen(Screen screen){
        this.screens.add(screen);
    }

}
