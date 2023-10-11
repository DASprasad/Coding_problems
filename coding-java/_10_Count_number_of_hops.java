package progarm;

public class _10_Count_number_of_hops {
	
//	basically coin change permutation deduced to tribonnacci series
	public static long countWays(int n) {
		long mod = 1000000007;
		
		long[] dp = new long[n + 1];
		dp[0] = 1;
		
		
		for(int  i  = 1; i < dp.length ; i++) {
			long prev = dp[i - 1];
			long prevprev = i < 2 ? 0 : dp[i - 2];
			long prevprevprev = i < 3 ? 0 : dp[i - 3];
			
			dp[i] = (prev + prevprev + prevprevprev) % mod;
		}
		
		return dp[dp.length - 1];
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_10_Count_number_of_hops ob = new _10_Count_number_of_hops();
		int n = 4;
		
		System.out.println(ob.countWays(n));

	}

}
