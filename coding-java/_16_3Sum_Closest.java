package progarm;

import java.util.Arrays;

public class _16_3Sum_Closest {
	
	 public int threeSumClosest(int[] nums, int target) {
		 int min = Integer.MAX_VALUE;
		 int res = Integer.MAX_VALUE;
		 int minDiff = Integer.MAX_VALUE;
		 
		 Arrays.sort(nums);
		 
		 for(int i = 0 ; i < nums.length - 2 ; i++ ) {
			 
			 int left = i + 1;
			 int right = nums.length - 1;
			 
			 while(left < right) {
				 
				 int sum = nums[i] + nums[left] + nums[right];
				 
				 int diff = Math.abs(target - sum);
				 
				 if(diff < minDiff) {minDiff = diff ; res = sum; }
				 
				 if(sum > target) {
				
					 right -- ;
				 }
				 else {
					
					 left ++ ;
				 }
			 }
		 }
		 
		 return res;
	        
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_16_3Sum_Closest ob  = new _16_3Sum_Closest();
		
		int[] nums = {-1,2,1,-4};
		int target = 1;
		
		System.out.println(ob.threeSumClosest(nums, target));

	}

}
