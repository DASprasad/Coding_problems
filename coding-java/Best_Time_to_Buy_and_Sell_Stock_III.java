package progarm;
public class Best_Time_to_Buy_and_Sell_Stock_III {
//	static int global=0;
	
	////////this is recursion
    public int solve(int[] nums,int n,int count,int[][] dp) {
//    	global=global+1;
    	if(count>=5) {
    		return 0;
    	}
    	if(n>=nums.length) {
    		return 0;
    	}
    	if(dp[n][count]!=-1) {
    		return dp[n][count];
    	}
    	
    	int local=0;
    	if (count%2==1) {
    		for(int i=n;i<nums.length;i++) {
        	int a=solve(nums,i+1,count+1,dp)-nums[i];	
        	if (a>local) {
        		local=a;
        	   }
        	}
    	}
    	else {
    		for(int i=n;i<nums.length;i++) {
        		if(nums[i]>nums[n-1]) {
        		int a=solve(nums,i+1,count+1,dp)+nums[i];
        		if (a>local) {
            		local=a;
            	   }
        		}		
        	}
    	}
    	return dp[n][count]=local;
    }
    
    
    ///////////////this is linear
    
    public int solve1(int[] nums) {
    	int min=nums[0];
    	int profit=0;
    	int sum=0;
    	int max=0;
    	int firstmax=0;
    	int secmax=0;
    	for(int i=1;i<nums.length;i++) {
    		
    		if(nums[i]>=nums[i-1]) {
    			profit=nums[i]-min;
//    			System.out.println(profit);
    			
    			max=Math.max(max, profit);
    			
    			if(max>firstmax) {
    		    	
    		    	firstmax=max;
    		    	
    		    }
    		    else if(max<=firstmax && max>secmax) {
    		    	secmax=max;
    		    	
    		    }
    		}
    		else {
//    		    if(max>firstmax) {
//    		    	secmax=firstmax;
//    		    	firstmax=max;
//    		    	
//    		    }
//    		    else if(max<=firstmax && max>secmax) {
//    		    	secmax=max;
//    		    	
//    		    }
     			min=nums[i];
    			
    		}
    	}
    	return firstmax+secmax;
    }
    
	
	public static void main(String[] args) {
		Best_Time_to_Buy_and_Sell_Stock_III ob = new Best_Time_to_Buy_and_Sell_Stock_III();
		
		int[] nums = {1,6,2,7,3,8,4,10};//{1,2,3,6,2,7}
//		for(int i=0;i<nums.length;i++) {
//			nums[i]=i+1;
//		}
		int [][] dp=new int[nums.length][5];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}
//		System.out.println(ob.solve(nums, 0,1,dp));
//		System.out.println(global);
		System.out.println(ob.solve1(nums));

	}

}
