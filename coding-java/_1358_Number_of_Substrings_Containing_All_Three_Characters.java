package progarm;

public class _1358_Number_of_Substrings_Containing_All_Three_Characters {
	
	public boolean isTrue(int[] freq) {
		for(int i : freq) if(i <= 0) return false;
		return true;
	}
	
	public int numberOfSubstrings(String s) {
        int[] freq = new int[3];
        int n = s.length() , res = 0;
        for(int i = 0 , last = 0 ; i < n ; i++) {
        	freq[s.charAt(i) - 'a']++;
        	while(isTrue(freq)) {
        		res += n - i;
        		freq[s.charAt(last++) - 'a']--;
        	} 
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 _1358_Number_of_Substrings_Containing_All_Three_Characters  ob = new _1358_Number_of_Substrings_Containing_All_Three_Characters ();
	String s = "ababcbcbabcbabcbcbccbababcb";	
	
	System.out.println(ob.numberOfSubstrings(s));

	}

}
