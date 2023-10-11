package progarm;
import java.util.*;


public class learning {

	public int compare(String a , String b) {
		int first = 0, second = 0;
		if(a.contains("Beginner")) first = 1;
		else if(a.contains("Intermediate")) first = 2;
		else first = 3;
		
		if(b.contains("Beginner")) second = 1;
		else if(b.contains("Intermediate")) second = 2;
		else second = 3;
		
		return first - second;
	}
	
	public void sort(List<String> list) {
		Collections.sort(list ,(a , b) -> compare(a , b));
	}
	
	
	public static void main(String[] args) {
		learning ob = new learning();
		
		List<String> list = new ArrayList<String>();
		
		list.add("English , 203, Intermediate , subdivision");
		list.add("Hindi , 123, Beginner , subdivision");
		list.add("odia , 232, Advanced , subdivision-232");
		
		ob.sort(list);
		
		for(String s : list) {
			System.out.println(s);
		}
        
	
   }
}
