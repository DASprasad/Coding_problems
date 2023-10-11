package progarm;

public class MergeStones {///////////////// wrong //////////////////
	static int min=1000000;
	
//	static int global=0;
//	public int sum(int nums[],int i,int j) {
//		int sum=0;
////		if(i>j) {
////			return nums[j];
////		}
//		for(int a=i;a<=j;a++) {
//			sum=sum+nums[a];
//		}
//		return sum;
//	}
//	public int solve(int[] nums,int i,int j,Integer[][] dp) {
//		global=global+1;
//		if(j-i==2) {
//			return sum(nums,i,j);
//		}
//		if(j-i==1) {
//			return sum(nums,i,j);
//		}
//		if(j-i<1) {
//			return 0;
//		}
////		if(dp[i][j]!=null) {
////			return dp[i][j];
////		}
//		int local=0;
//		int temp=0;
//		for(int k=i+1;k<=j;k++) {
//			int left=solve(nums,k,j,dp);
//			int right=solve(nums,i,k-1,dp);
//			   temp=left+right;
////			int temp=solve(nums,i,k-1)+solve(nums,k,j)+nums[i]*nums[k]*nums[j];
//			local=local+temp;
//		}
//		return local;
//	}
	//////////////Backtracking solution 
	
	public void BackTrack(int[] nums,int sum,int left,int right,int count,int k,int total) {
		if(left<=0 || right>=nums.length) {
			return;
		}
		if(left==0 && right==0) {
			min=Math.min(min, total);
		}
		
		
		if(count==k-1) {
			BackTrack(nums,0,left-1,right,1,k,total+sum);
			BackTrack(nums,0,left,right+1,1,k,total+sum);
		}
		if(nums[left]!=-1) {
			
		BackTrack(nums,sum+nums[left],left-1,right,count+1,2,total);
		}else {
	     BackTrack(nums,sum,left-1,right,count+1,2,total);
		}
		if(nums[right]!=-1) {
		BackTrack(nums,sum+nums[right],left,right+1,count+1,2,total);
		}else {
		     BackTrack(nums,sum,left,right+1,count+1,2,total);
		}
	}
	
	public int call(int[] nums,int k) {
		int min=100000;
		int  sum =0;
           for(int i=0;i<k;i++) {
			sum=sum+nums[i];
		}
//		
//		for(int i=k;i<nums.length;i++) {
//			int temp=BackTrack(nums,sum,k-3,k+1,1);
//		}
           return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeStones ob =new MergeStones();
		int nums[]= {1,2,3,4,5};
		int i=0;
		int j=nums.length-1;
		Integer[][] dp=new Integer[nums.length][nums.length];
//		System.out.println(ob.solve(nums, i, j, dp));

	}

}
