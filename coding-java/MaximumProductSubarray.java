package progarm;

public class MaximumProductSubarray {
	public void preprocessingFromRight(int[] nums,int[] pre) {
		int count=0;
		for(int i=nums.length-1;i>=0;i--) {
			if(nums[i]==0) {
				count=0;
				continue;
			}
			if(nums[i]<0) {
				count=count+1;
				pre[i]=count;
			}
		}
	}
	
	public void preprocessingFromLeft(int[] nums,int[] pre) {
		int count=0;
		for(int i=0;i<=nums.length-1;i++) {
			if(nums[i]==0) {
				count=0;
				continue;
			}
			if(nums[i]<0) {
				count=count+1;
				pre[i]=count;
			}
		}
	}
	public int solveFromLeft(int[] nums) {
		int last=0;
		int local=1;
		int max=0;
		int[] pre =new int[nums.length];
		preprocessingFromRight(nums,pre);
		for(int i=0;i<nums.length;i++) {
			last=Math.max(last, nums[i]);
			if(nums[i]>0) {
				local=local*nums[i];
				max=Math.max(max, local);
			}
			else if(nums[i]<0 && pre[i]>1) {
				local=local*nums[i];
				max=Math.max(max, local);
			}
			else if(nums[i]<0 && pre[i]==1 && local*nums[i]>0) {
				local=local*nums[i];
				max=Math.max(max, local);
			}
			else {
				local=1;
			}
		}
		return Math.max(max, last);
	}
	
	public int solveFromRight(int[] nums) {
		int last=0;
		int local=1;
		int max=0;
		int[] pre =new int[nums.length];
		preprocessingFromLeft(nums,pre);
		for(int i=nums.length-1;i>=0;i--) {
			last=Math.max(last, nums[i]);
			if(nums[i]>0) {
				local=local*nums[i];
				max=Math.max(max, local);
			}
			else if(nums[i]<0 && pre[i]>1) {
				local=local*nums[i];
				max=Math.max(max, local);
			}
			else if(nums[i]<0 && pre[i]==1 && local*nums[i]>0) {
				local=local*nums[i];
				max=Math.max(max, local);
			}
			else {
				local=1;
			}
		}
		return Math.max(max, last);
	}
	
	public int ans(int[] nums) {
		int maxfromleft=solveFromLeft(nums);
		int maxfromright=solveFromRight(nums);
		return Math.max(maxfromleft, maxfromright);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumProductSubarray ob =new MaximumProductSubarray();
		int[] nums= {-2, -40, 0, -2, -3};
		System.out.println(ob.ans(nums));

	}

}
