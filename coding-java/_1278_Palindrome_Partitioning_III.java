package progarm;

public class _1278_Palindrome_Partitioning_III {
	
	public int solver(String s ,int n , int k , int[][] dp , Integer[][] cache) {
		   if(n >= s.length() && k == 0) return 0;
		   if(n >= s.length() || k < 0) return 1000000;
	       if(cache[n][k] != null) return cache[n][k];
		   
		   int local = Integer.MAX_VALUE;
		   
		for(int i = n ; i < s.length(); i++) {
			int  a = solver(s , i + 1, k - 1 , dp , cache) + dp[n][i];
			local = Math.min(local, a);
		}
		
		return cache[n][k] = local;
		
	}
	    public int palindromePartition(String s, int k) {
	        int[][] dp = new int[s.length()][s.length()];
		   
		   for(int gap = 0 ; gap < dp.length; gap ++) {  //gap stategy MCM
			   for(int i = 0 , j = gap ; j < dp.length ; i++ , j++ ) {
				   if(i == j) { dp[i][j] = 0; continue; }
				   
				   dp[i][j] = (s.charAt(i) == s.charAt(j) ? 0 : 1) + dp[i + 1][j - 1];
				   
			   }
		   }
		   Integer[][] cache = new Integer[s.length()+1][k+1];
		   
		   return solver(s , 0 , k , dp , cache);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
