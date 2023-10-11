package progarm;

public class LongestIncreasingSubsequence {
	static int global=0;
	int maximum=0;
	static int count=0;
	public int longestsub(int[] nums,Integer[] dp,Integer[] help,int n) {
		global=global+1;
//		if(n>=nums.length) {
//			return 1;
//		}
		if(dp[n]!=null) {
			return dp[n];
		}
		int local=0;
		for(int i=n+1;i<nums.length;i++) {
			if(nums[i]>nums[n]) {
				int a=longestsub(nums,dp,help,i)+1;
				if(a>local) {
					local=a;
					count=0;
					maximum=local;
				}
				if(a==maximum){
                    count=count+1;
                }
			}
		}
		    help[n]=count;
			return dp[n]=local;

	}

	public static void main(String[] args) {
		
		LongestIncreasingSubsequence ob =new LongestIncreasingSubsequence();
		int[] nums= {10,11,12,2,100,101,3,4,5,6};     //{7,7,7,7,7,7,7};
		Integer[] dp=new Integer[nums.length];
		Integer help[] =new Integer[dp.length];
		int max=-1;
//		for(int i=1;i<5;i++) {
//			nums[i]=i;
//		}
		
		for(int i=0;i<nums.length;i++) {
			int temp=ob.longestsub(nums, dp,help, i);
			if(temp>max) {
				max=temp;
			}
		}
		System.out.println(count);
//		System.out.println(global);
//		for(int j=0;j<nums.length;j++) {
//			System.out.print(dp[j]+"  ");
//		}
	}

}



