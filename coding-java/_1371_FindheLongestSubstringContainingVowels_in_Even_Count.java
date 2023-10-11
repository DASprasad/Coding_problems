package progarm;
import java.util.*;
public class _1371_FindheLongestSubstringContainingVowels_in_Even_Count {
	
	 public int findTheLongestSubstring(String s) {
		 int res=0;
		 int current=0;
		 HashMap<Integer,Integer>map=new HashMap();
		 map.put(0, -1); //when first character is not vowel
		 for(int i=0;i<s.length();i++) {
			 current = current ^ 1<< ("aeiou".indexOf(s.charAt(i))+1) >>1;
			 // +1 is there to handle if the character is not vowel them ondexOf returns -1 ans +1makes it neutral
//			 so no changes to current in case of consonant.
//			 >>1 is there to handle when there is not a vowel then 1<< ("aeiou".indexOf(s.charAt(i))+1) can 
//				 become 1 ,than can change the current value which would be a problem so we again >>1 to neutral it
			 
			 if(!map.containsKey(current)) map.put(current, i);
			 
			 res=Math.max(res, i-map.get(current));
		 
		 }
	       return res; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1371_FindheLongestSubstringContainingVowels_in_Even_Count ob=new _1371_FindheLongestSubstringContainingVowels_in_Even_Count();
	}

}
