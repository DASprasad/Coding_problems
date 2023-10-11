package progarm;

public class _8_Count_ways_to_reach_the_nth_stair {
	
	//this is coin change permutation problem
	//as you can use 1 or 2 stairs at a time it basically becomes fibonacci series
	
	public int countWays(int n) {
		
		int[] dp = new int[n + 1]; dp[0] = 1;
		int mod = 1000000007;
		
		for(int i = 1; i < dp.length ; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
		}
		
		return dp[dp.length - 1];
 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
