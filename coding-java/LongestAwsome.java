package progarm;

public class LongestAwsome {
	public static int longestAwesome(String s) {
        Integer map[] = new Integer[1 << (27)];
        map[0]=1; // set it to 1 because if not it will the count for all zero mask (0000000000) as it dowsnot occur in the beginning but that shit is helpful.
        int ans = 0;
        int state = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
	          char ch = s.charAt(i);
	 
	          int mask = (1 << (ch - 'a'));
	          state = state ^ mask;
	 
	          Integer j = map[state];
	          
	          if (j != null) {
	        	  ans =ans+j;
	        	  map[state]=j+1;
	        	  
	          }
	 
			          for (int odd = 0; odd < 27; odd++) {
			            int temp = 1 << odd;
			            j = map[state ^ temp];
			            if (j != null) {
			            	 ans =ans+map[state ^ temp];
			            }
			          }
	 
	          if (map[state] == null) {
	            map[state] = 1;
	          }
	        }
 
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
