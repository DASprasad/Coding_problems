package progarm;

public class _813_Largest_Sum_of_Averages {
	
	public double average(int[] prefix , int start , int end) {
		return (double)(prefix[end] -(start == 0 ? 0 : prefix[start - 1])) / (double)(end - start + 1) ;
	}
	
	public double solver(int[] nums  ,int n , int k , Double[][] dp , int[] prefix) {
		
		if( n >= nums.length && k == 0) return 0;
		
		if(n >= nums.length || k < 0) return -1000;
		
		if(dp[n][k] != null) return dp[n][k];
		
		double local = -1000;
		
		for(int i = n ; i < nums.length ;  i++) {
			
			double a = solver(nums , i + 1 , k - 1 , dp , prefix) + average(prefix ,n ,i);
			
			local = Math.max(local, a);
		}
		
		return dp[n][k] = local;
		
	}
	
   public double largestSumOfAverages(int[] nums, int k) {
	   
	   int[] prefix = new int[nums.length]; prefix[0] = nums[0];
	   
	   for(int i = 1 ; i < nums.length ; i++) prefix[i] += nums[i] + prefix[i - 1];
       
	   Double[][] dp = new Double[nums.length][k+1];
	      
	   double ans = solver(nums , 0 , k , dp , prefix);
	   
	   return ans;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_813_Largest_Sum_of_Averages ob = new _813_Largest_Sum_of_Averages ();
		
		int[] nums = {4,6,7,8,7};
		System.out.println(ob.largestSumOfAverages(nums, 2));
	

	}

}
