package progarm;

public class _gfg_15_kaadanes_algorithm {
	
	public long maximumSum(int arr[], int sizeOfArray) {
		
		if(arr.length <= 1) return arr[0] < 0 ? 0 :arr[0];
		long[] dp = new long[arr.length + 1];
		int max = Math.max(arr[0], arr[1]);
		dp[0] = 0;
		dp[1] = arr[0] < 0 ? 0 : arr[0];
		
		
		
		for(int i = 2; i < dp.length ; i++) {
		    max = Math.max(arr[i - 1], max);
			if(arr[i - 1] < 0) dp[i] = dp[i - 1];
			else dp[i] = Math.max(dp[i - 1] , arr[i - 1] + dp[i - 2]);
			
		}
		
		if(dp[dp.length - 1] == 0) return Math.min(dp[dp.length - 1], max);
		
		return dp[dp.length - 1];
   
      
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_gfg_15_kaadanes_algorithm ob = new _gfg_15_kaadanes_algorithm();
		int arr[] = {-39 ,-69 ,-18 ,-45};
//		System.out.println(ob.maxSumSubarray(arr, 0));

	}

}
