package progarm;

import java.util.Arrays;

public class _467_Unique_Substrings_in_Wraparound_String {
	
	
	
	 public int findSubstringInWraproundString(String p) {
		 
		 int[] res=new int[26];
		 for(int i=0;i<p.length();i++) res[p.charAt(i)-'a'] = 1 ;
		 
		 int count=1;
		 
		 for(int i=1;i<p.length();i++) {
			  //curr character
	            int curr=p.charAt(i)-'a';
	            //previous character
	            int prev=(p.charAt(i-1)-'a'+1)%26;
			 
	             count= curr==prev? count+1 : 1;
	            
	            res[curr]=Math.max(count , res[curr]);
			 
		 }
		 
		 return Arrays.stream(res).sum();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_467_Unique_Substrings_in_Wraparound_String ob=new _467_Unique_Substrings_in_Wraparound_String();
		String s="abcdefghijklmnopqrstuvwxyz";
		String p="abcdaacca";
		
		System.out.println(ob.findSubstringInWraproundString(p));

	}

}
