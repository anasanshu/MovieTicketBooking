import java.util.*;

public class ShowRepository {
   List<Show> shows = new ArrayList<Show>();
   
   public Show save(Show show){
       this.shows.add(show);
       System.out.println("Show added");
       return show;
   }
}
