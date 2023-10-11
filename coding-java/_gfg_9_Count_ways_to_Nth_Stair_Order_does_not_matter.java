package progarm;

public class _gfg_9_Count_ways_to_Nth_Stair_Order_does_not_matter {
	
	public Long countWays(int m) {
		
		long[] dp = new long[m + 1]; dp[0] = 1;
		int[] arr = new int[2]; arr[0] = 1; arr[1] = 2;
		
		for(int i = 0 ; i < arr.length ; i ++) {
			for(int j = 1 ; j < dp.length ; j++) {
				if(arr[i] > j) continue;
				dp[j] = dp[j] + dp[j - arr[i]];
			}
		}
		
		return dp[dp.length - 1];
        
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_gfg_9_Count_ways_to_Nth_Stair_Order_does_not_matter ob = new _gfg_9_Count_ways_to_Nth_Stair_Order_does_not_matter();
		
		int n = 5;
		
		System.out.println(ob.countWays(n));

	}

}
