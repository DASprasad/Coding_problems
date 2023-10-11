package progarm;
import java.util.*;
public class _14_Longest_Common_Prefix {
	
	 public String longestCommonPrefix(String[] strs) {
	      
	        String res = "";
	       Arrays.sort(strs , (a,b)->a.length() - b.length());
	       
	       for(int i = 0 ; i < strs[0].length() ; i++) {
	    	   char ch = strs[0].charAt(i);
	    	   for(int j = 0 ; j < strs.length ; j++) {
	    		   if(strs[j].charAt(i) != ch) return res;
	    	   }
	    	   res += strs[0].charAt(i);
	       }
	        
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 _14_Longest_Common_Prefix ob = new  _14_Longest_Common_Prefix();
		 String strs[] = {"flower","flow","flight"};
		 
		 System.out.println(ob.longestCommonPrefix(strs));

	}

}
