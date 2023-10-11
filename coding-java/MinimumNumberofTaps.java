package progarm;
import java.util.*;
public class MinimumNumberofTaps {
	public int solve(int[] nums,int n) {
		Integer[] tap=new Integer[nums.length];
		
		for(int i=tap.length-1;i>=0;i--) {
			if(nums[i]==0) {
				continue;
			}
			if(i-nums[i]<=0) {
				if(tap[0]==null) {
				tap[0]=i;
				}
			}
			
			else {
				if(tap[i-nums[i]]==null) {
				  tap[i-nums[i]+1]=i;
				}
			}
			
		}
		System.out.println(Arrays.toString(tap));
		int jumps = 0, curEnd = 0, curFarthest = 0;
		for (int i = 0; i < nums.length; i++) {
			if(tap[i]!=null) {
				curFarthest = Math.max(curFarthest, tap[i]+nums[tap[i]]);
			}
		
			if (i == curEnd) {
				jumps++;
				curEnd = curFarthest;
			}
		}
		if(curFarthest>=tap.length) {
		return jumps;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberofTaps ob =new MinimumNumberofTaps();
		int nums[]= {3,4,1,1,0,0};
		System.out.println(ob.solve(nums, nums.length));

	}

}
