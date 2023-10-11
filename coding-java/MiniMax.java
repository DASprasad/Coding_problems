package progarm;

public class MiniMax {
	static int global=0;
	public int minmax(int[] nums,int left,int right,int id,Integer[][][] dp){
		global=global+1;
        if(left>right){
            return 0;
        }
        if(dp[left][right][id]!=null){
        	System.out.println("wow");
            return dp[left][right][id];
        }
        id=Math.abs(id-1);
        if(id==1){
            int a=minmax(nums,left+1,right,id,dp)+nums[left];
            int b=minmax(nums,left,right-1,id,dp)+nums[right];
            return dp[left][right][id]=Math.max(a,b);
        }
        else{
           int a=minmax(nums,left+1,right,id,dp)-nums[left];
           int b=minmax(nums,left,right-1,id,dp)-nums[right]; 
           return dp[left][right][id]=Math.min(a,b);
        }
    }
	/////////well this is the fastest!!!
	public int minmaxopt(int[] nums,int left,int right,Integer[][] dp){
		global=global+1;
        if(left==right){
            return nums[left];
        }
        if(dp[left][right]!=null){
            return dp[left][right];
        }
        
            int a=nums[left]-minmaxopt(nums,left+1,right,dp);
            int b=nums[right]-minmaxopt(nums,left,right-1,dp);
            return dp[left][right]=Math.max(a,b);
        
    }
	
	 public boolean PredictTheWinner(int[] nums) {
	        int left=0;
	        int right=nums.length-1;
	        Integer[][]dp=new Integer[nums.length+1][nums.length+1];
	        int ans=minmaxopt(nums,left,right,dp); 
	        return (ans>=0);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniMax ob =new MiniMax();
		int[] nums= {1,2,4,3,2};
		System.out.println(ob.PredictTheWinner(nums));
		System.out.println(global);

	}

}
