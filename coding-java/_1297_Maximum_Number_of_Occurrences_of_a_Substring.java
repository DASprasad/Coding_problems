package progarm;
import java.util.*;
public class _1297_Maximum_Number_of_Occurrences_of_a_Substring {
	
   public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
	   
	   HashMap<Character , Integer> freq = new HashMap();
	   HashMap<String , Integer> map = new HashMap();
	   
	   String findStr = null;
	   int count = 0;
	   
	   for(int i = 0 , last = 0; i < s.length() ; i++) {
		   
		   freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
		   
		   while(freq.size() > maxLetters || i - last >= minSize) {
			   int repeat = freq.get(s.charAt(last)) - 1;
			   if(repeat == 0) freq.remove(s.charAt(last++));
			   else freq.put(s.charAt(last++), repeat);
		   }
		   
		   if( i - last + 1 == minSize) { 
			   findStr = s.substring(last , i + 1);
			   map.put(findStr ,map.getOrDefault(findStr, 0)+1);
			   count = Math.max(map.get(findStr), count);
                   
		   } 
	   }

	  
	  return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1297_Maximum_Number_of_Occurrences_of_a_Substring ob = new _1297_Maximum_Number_of_Occurrences_of_a_Substring();
		
        String s ="aabcabcab";
        int maxLetters = 2;
        int min = 2;
        int max = 3;
        
        System.out.println(ob.maxFreq(s, maxLetters, min, max));
	}

}
