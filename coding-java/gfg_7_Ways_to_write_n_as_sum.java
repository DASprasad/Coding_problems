package progarm;

public class gfg_7_Ways_to_write_n_as_sum {
	
	// basically coin change combination problem
	// refer sumeet video in youtube
	
	public int countWays(int n) {
		int dp[] = new int[n + 1]; dp[0] = 1;
		
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j < dp.length ; j++) {
				if(i > j) continue;
				dp[j] = dp[j] + dp[j - i];
			}
		}
		
		return dp[dp.length - 1] - 1; // - 1 because number itself is excluded
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gfg_7_Ways_to_write_n_as_sum ob = new gfg_7_Ways_to_write_n_as_sum();
		
		int n = 5;
		
		System.out.println(ob.countWays(n));

	}

}
