package progarm;

public class _410_Split_Array_Largest_Sum_Allocate_Min_number_of_pages {
	
	public boolean allocate(int[] nums , int m , int mid) {
		int total=0;
		for(int i=0;i<nums.length;i++) {
			total+=nums[i];
			
			if(total > mid) {
				m-=1;
				total=nums[i];
			}
			if(m==0) return false;
		}
		
		return true;
	}
	
     public int splitArray(int[] nums, int m) {
    	 int high=0;
    	 int low=0;
    	 int res=0;
    	 for(int i=0;i<nums.length;i++) {
    		 high+=nums[i];  low = Math.max(low, nums[i]);
    	 }
    	 
    	 while(low<=high) {
    		 int mid = low+ (high-low)/2 ;
    		 
    		 if(allocate(nums , m , mid)==true) {
    			 res=mid;
    			 high=mid-1;
    		 }
    		 else {
    			 low=mid+1;
    		 }
    		 
    	 }
    	 return res;
        
     }
     
     //dynamic programming method always better to know more ,,note : this is slow solution
     
     public int split(int[] nums , int k) {
    	 
    	 int[][] dp = new int[k][nums.length];
    	 
    	 for(int i = 0 ; i < dp.length ; i++) {
    		 
    		for(int j = 0 ; j < dp[0].length ; j++) {
    		 
    		  if(i == 0) dp[i][j] = nums[j] + (i == 0 && j == 0 ? 0 : dp[i][j - 1]);
    		 
    		  else if(j < i) dp[i][j] = dp[i - 1][j];
    		 
    		  else {
    			 
    			 dp[i][j] = Integer.MAX_VALUE;
    			 
    			 for(int pos = 0 ; pos < j ; pos ++) {
    				 
    				 int max = Math.max(dp[i - 1][pos], dp[0][j] - dp[0][pos]);
    				 dp[i][j] = Math.min(dp[i][j], max);
    			 }
    		 }
    	 }
     }
    	 
    	 return dp[dp.length - 1][dp[0].length - 1];
  }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_410_Split_Array_Largest_Sum_Allocate_Min_number_of_pages ob = new _410_Split_Array_Largest_Sum_Allocate_Min_number_of_pages();
		
		int[] nums = {10,20,30,40,4,2,24,4,13,5,6,4,2,7,9,67,6,8,7,5,4,41,2,4,5,4,2,6,7,56,33};
		int k = 9;
		System.out.println(ob.split(nums, k));

	}

}
