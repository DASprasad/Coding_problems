package progarm;

import java.util.Arrays;

public class LongestMountain {
	static int global=0;
	
	public void lis(int[] nums,Integer[] dp) {
		dp[0]=1;
		int max=0;
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j]) {
					max=Math.max(max, dp[j]);
				}
			}
			dp[i]=max+1;
			max=0;
		}
	}
	public void lds(int[] nums,Integer[] dp) {
		
		dp[dp.length-1]=1;
		int max=0;
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=dp.length-1;j>i;j--) {
				if(nums[i]>nums[j]) {
					max=Math.max(max, dp[j]);
				}
			}
			dp[i]=max+1;
			max=0;
		}
	}

	public static void main(String[] args) {
		
		LongestMountain ob = new LongestMountain();
		int nums[]= {1,2,3,4,5,6};
		Integer[] lis=new Integer[nums.length];
		Integer[] lds=new Integer[nums.length];
		ob.lis(nums, lis);
		ob.lds(nums, lds);

		int max=1;
		for(int i=0;i<nums.length;i++) {
			int temp=(lis[i]+lds[i])-1;//one number repeats two times thats why -1;
			max=Math.max(max, temp);
		}
		System.out.println(Arrays.toString(lis));
		System.out.println(Arrays.toString(lds));
		System.out.println(max);
//		System.out.println(global);
	}

}
