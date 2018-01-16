
/**
 * Write a description of QuakeSortDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;

public class QuakeSortDemo {
    
    public void testSort(){
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        //String source = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.atom";
        
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list);
        
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }
    }
}
