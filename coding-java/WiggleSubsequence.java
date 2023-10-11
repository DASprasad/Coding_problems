package progarm;

import java.util.Arrays;

public class WiggleSubsequence {
	
	
	    public int wiggleMaxLength(int[] nums) {
	        
	        int up = 1;
	        int down = 1;
	        
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] > nums[i - 1]) {
	                up = down + 1;
	            }
	            else if (nums[i] < nums[i - 1]) {
	                down = up + 1;
	            }
	        }
	        
	        return Math.max(up, down); 
	    }
	
	
	public int findmax(int[] nums) {
		Integer[] dp=new Integer[nums.length];
		if(nums.length==1) return 1;
		if(nums.length==2 && nums[0]==nums[1]) return 1;
		if(nums.length==2) return 2;
		int ans=0;

       if(nums[1]>nums[0]) {
    	   dp[0]=-1;
       }
       else {
    	   dp[0]=1;
       }
		int max=0;
		for(int i=1;i<dp.length;i++) {
			int flag=0;
			for(int j=0;j<i;j++) {
				if(nums[i]-nums[j]<0 && dp[j]>0) {
					if(dp[j]>max) {
						max=dp[j];
						flag=-1;
					}
				}
				else if(nums[i]-nums[j]>0 && dp[j]<0) {
					if(-1*dp[j]>max) {
						max=-1*dp[j];
						flag=1;
					}
				}
			}
			if(flag==-1) {
			int temp=-1*(max+1);
			dp[i]=temp;
			ans=Math.max(ans, Math.abs(temp));
			}else {
				dp[i]=max+1;
				ans=Math.max(ans, dp[i]);
			}
			max=0;
		}
		return ans; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WiggleSubsequence ob =new  WiggleSubsequence ();
		 int[] nums= {1,1,7,4,9,2,5};
		 System.out.println(ob.findmax(nums));
		

	}

}
