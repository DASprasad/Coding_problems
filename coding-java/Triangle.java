package progarm;

public class Triangle {
	static int global=0;
   public int minimum(int[] nums,int n,int count,Integer[] dp) {
	   global=global+1;
	   if(n>=nums.length) {
		   return 0;
	   }
	   if(dp[n]!=null) {
		   return dp[n];
	   }
	   int a= minimum(nums,n+count,count+1,dp)+nums[n];
	   int b=minimum(nums,n+count+1,count+1,dp)+nums[n];
	   return dp[n]=Math.min(a, b);
   }
	public static void main(String[] args) {
		Triangle ob=new Triangle();
		int[] nums= {-100};
		Integer[] dp=new Integer[nums.length];
		System.out.println(ob.minimum(nums, 0, 1,dp));
		System.out.println(global);

	}

}
