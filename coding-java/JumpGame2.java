package progarm;

import java.util.Arrays;

public class JumpGame2 {
	
    public int solve(int nums[]) {
    	int[] dp=new int[nums.length];
    	int maxDist=Integer.MAX_VALUE;
    	for(int i=dp.length-1;i>=0;i--) {
    		if(nums[i]==0) {
    			dp[i]=1000000;
    			continue;
    		}
    		if(nums[i]+i>=nums.length-1) {
			    dp[i]=1;
			    continue;
			}
    		int temp=nums[i]+i;
    		for(int j=i+1;j<=temp;j++) {
    			
    			maxDist=Math.min(maxDist, dp[j]);
    		}
    		dp[i]=maxDist+1;
    		maxDist=Integer.MAX_VALUE;
    	}
    	System.out.println(Arrays.toString(dp));
    	return dp[0];
    }
	public static void main(String[] args) {
		JumpGame2 ob=new JumpGame2();
		
		int nums[]= {2,1,3,4,2,3,1,2,1,2,3,4};
//        System.out.println(ob.solve(nums));
        String str="agdfshsgdgssgsgdhshahsgshsjsj";
        if(str.contains("gdgssgsgdh")) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
		
	}

}
