package progarm;

import java.util.Arrays;

public class _945_Minimum_Increment_to_Make_Array_Unique {
	
	 public int minIncrementForUnique(int[] nums) {
	        int increments = 0;
	        
	        Arrays.sort(nums);
	        int prev = nums[0];
	        for(int i = 1 ; i < nums.length ; i++) {
	        	increments += prev - nums[i] >= 0 ? prev - nums[i] + 1   : 0 ;
	        	if(nums[i] > prev) prev = nums[i];
	        	  else prev = nums[i] + prev - nums[i] + 1;
	        }
	        
	        return increments;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_945_Minimum_Increment_to_Make_Array_Unique ob = new _945_Minimum_Increment_to_Make_Array_Unique();
		
		int[] nums = {3,2,1,2,1,7};
		
		System.out.println(ob.minIncrementForUnique(nums));

	}

}
