import java.util.*;

public class TheatreRepository {
   List<Theatre> theatres = new ArrayList<Theatre>();
   
   public Theatre save (Theatre theatre){
        theatres.add(theatre);
        System.out.println("Theatre added");
        return theatre;
   }
}
