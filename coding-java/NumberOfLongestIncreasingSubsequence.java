package progarm;

public class NumberOfLongestIncreasingSubsequence {
	
	public int solve(int nums[]) {
		int[] dp=new int[nums.length];
		int[] freq=new int[nums.length];
		int max=0;
		int count=0;
		int ans=0;
		int res=0;
		dp[0]=1;
		freq[0]=1;
		for(int i=1;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j]) {
					max=Math.max(max, dp[j]);
				}
			}
			dp[i]=max+1;
			res=Math.max(res,dp[i]);
			max=0;
		}
		for(int i=1;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j] && dp[i]-dp[j]==1) {
					count=count+freq[j];
				}
			}
			if(count==0) {
				freq[i]=1;
			}
			else {
			freq[i]=count;
			}
			count=0;
		}
		ans=0;
		for(int i=0;i<freq.length;i++) {
			if(dp[i]==res) {
				ans=ans+freq[i];
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfLongestIncreasingSubsequence ob=new NumberOfLongestIncreasingSubsequence();
		int nums[]= {1,1,1,2,2,3,2,2,34,4,5,6,7,8,6,6,5,5,4,4,4,4,5,5,4,4,3,3,2,2,3,3,3,4,5,6,6,4,3,3,4,54,3,2,2,2,34,5,6,6,5,4,3,3,4,5,5,33,22,22,2,2,2,2,2,3,4,5};
		System.out.println(ob.solve(nums));

	}

}
