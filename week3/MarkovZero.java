
/**
 * Write a description of MarkovZero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

//public class MarkovZero implements IMarkovModel {
public class MarkovZero extends AbstractMarkovModel {
//    private String myText;
//	private Random myRandom;
	
//	public MarkovZero() {
//		myRandom = new Random();
//	}
//	
//	public void setRandom(int seed){
//		myRandom = new Random(seed);
//	}
//	
//	public void setTraining(String s){
//		myText = s.trim();
//	}
	
	public String getRandomText(int numChars){
		if (myText == null){
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for(int k=0; k < numChars; k++){
			int index = myRandom.nextInt(myText.length());
			sb.append(myText.charAt(index));
		}
		
		return sb.toString();
	}
	
	@Override
	public String toString(){
		return String.format("MarkovModel of order %d",0);
	}
}
