package progarm;

public class _gfg_11_Reach_a_given_score {
	
	//coin change combination problem similar
	
	public static int count(int n) {
        int[] arr = new int[3];
        arr[0] = 3; arr[1] = 5; arr[2] = 10;
        int[] dp = new int[n + 1]; dp[0] = 1;
        
        for(int i = 0 ; i < arr.length ; i++) {
        	for(int j = arr[i]; j < dp.length ; j++) {
        		dp[j] = dp[j] + dp[j - arr[i]];
        	}
        }
        
        return dp[dp.length -1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_gfg_11_Reach_a_given_score ob = new _gfg_11_Reach_a_given_score();
		int n = 20;
		
		System.out.println(ob.count(n));

	}

}
