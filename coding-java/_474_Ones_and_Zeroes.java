package progarm;

import java.util.Arrays;

public class _474_Ones_and_Zeroes {
	
	public int[] count(String s) {
		int[] arr = new int[2];
		
		for(int  i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) == '0') arr[0] ++;
			else arr[1]++;
		}
		return arr;
	}
	
   public int findMaxForm(String[] strs, int m, int n) {
       
        int dp[][][] = new int[strs.length + 1][m + 1][n + 1];
        
        for(int i = 0 ; i < strs.length  + 1; i++) {
            
            int[] arr = new int[2];
        	 
        	if(i > 0) arr = count(strs[i - 1]);
        	
        	for(int j = 0 ; j < m + 1 ; j ++) {
        		
        		for(int k = 0 ; k < n + 1 ; k ++) {
        			
        			if(i == 0) dp[i][j][k] = 0;
        			else if(j >= arr[0] && k >= arr[1]) dp[i][j][k] = Math.max(dp[i - 1][j][k], 1 + dp[i - 1][j - arr[0]][k - arr[1]]);
        			else dp[i][j][k] = dp[i - 1][j][k];
        		}
        	}
        }
        
        return dp[strs.length][m][n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_474_Ones_and_Zeroes ob = new _474_Ones_and_Zeroes();
		
		String[] strs = {"10","0001","111001","1","0"};
		int m = 5 , n = 3;
		System.out.println(ob.findMaxForm(strs, m, n));

	}

}
