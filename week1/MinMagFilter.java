
public class MinMagFilter implements Filter
{
    private double magMin; 
    private String name = "MinMagFilter";
    
    public MinMagFilter(double min) { 
        magMin = min;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return qe.getMagnitude() >= magMin; 
    } 
    
    public String getName(){
		return name;
	}

}
