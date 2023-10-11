package progarm;

import java.util.Arrays;

public class _gfg_23_Maximiz_The_Cut_Segments {
	
//	coin change combination
	
	 public int maximizeCuts(int n, int x, int y, int z) {
	       int[] dp = new int[n + 1]; 
	       Arrays.fill(dp, Integer.MIN_VALUE);
	       dp[0] = 1;
	       int[] arr  = new int[3]; arr[0] = x ; arr[1] = y; arr[2] = z;
	       
	       for(int i = 0 ; i < arr.length ; i++) {
	    	   for(int j = 1; j < dp.length ; j++) {
	    		   if(j < arr[i]) continue;
	    		   
	    		   if(j == arr[i]) dp[j] = Math.max(dp[j],1);
	    		   else dp[j] = Math.max(dp[j], dp[arr[i]] + dp[j - arr[i]]);
	    	   }
	       }
	       
	       return dp[dp.length - 1] < 0 ? 0 : dp[dp.length - 1];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_gfg_23_Maximiz_The_Cut_Segments ob = new _gfg_23_Maximiz_The_Cut_Segments();
		int n = 890;
		int x = 2 , y = 3 , z = 4;
		
		System.out.println(ob.maximizeCuts(n, x, y, z));
	}

}
