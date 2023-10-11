package progarm;

public class BurstBallons {
	static int global=0;
	public int solve(int[] nums,int i,int j,Integer[][] dp) {
		global=global+1;
		if(i==j) {
			return 0;
		}
		if(dp[i][j]!=null) {
			return dp[i][j];
		}
		int local=0;
		for(int k=i+1;k<j;k++) {
			int left=solve(nums,k,j,dp);
			int right=solve(nums,i,k,dp);
			int temp=left+right+nums[i]*nums[k]*nums[j];
//			int temp=solve(nums,i,k-1)+solve(nums,k,j)+nums[i]*nums[k]*nums[j];
			if(temp>local) {
				local=temp;
			}
		}
		return dp[i][j]=local;
	}

	public static void main(String[] args) {
		BurstBallons ob = new BurstBallons();
		int nums[]= {1,3,1,5,5,1};
		
		int i=0;
		int j=nums.length-1;
		Integer dp[][]=new Integer[nums.length][nums.length];
		System.out.println(ob.solve(nums,i,j,dp));
		System.out.println(global);

	}

}
