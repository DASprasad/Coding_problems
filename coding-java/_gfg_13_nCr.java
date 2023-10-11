package progarm;

public class _gfg_13_nCr {
	
	public int nCrModp(int n, int r)
    {
		 int mod = 1000000007;
	        if(r > n) return 0;
	        long[] dp = new long[n + 1];
	        dp[0] = 1;
	        
	        for(int i = 1; i < dp.length ; i++) dp[i] = (dp[i - 1] * i) % mod;
	        
	        long nq = dp[n];
	        long nr = dp[n - r];
	        long rq = dp[r]; 
	        
	        int ans = (int)(dp[n] / (dp[n - r] * dp[r]));
            return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_gfg_13_nCr ob = new _gfg_13_nCr();
		
		System.out.println(ob.nCrModp(20, 12));

	}

}
