package progarm;

import java.util.*;

public class _2104_Sum_of_Subarray_Ranges {
	
//	this question is exactly similar to sum of subarray mins
//	we know how to find sum of subarray mins , similarly fing sum of subarray max.
//	res = sum of subarray max - sum of subarray min;
	
	 public long subArrayRanges(int[] nums) {
	        long res = 0;
	        Stack<Integer> stack = new Stack();
	       
	        
//	        this is sorter version of sum of subarray mins using stack
	        for(int i = 0 ; i <= nums.length ; i++) {
	        	while(stack.size() > 0 && nums[stack.peek()] > (i == nums.length ? Integer.MIN_VALUE : nums[i])) {
	        		int  j = stack.pop();
	        		int k = stack.isEmpty() ? -1 : stack.peek();
	        		res -= (long)(i - j) * (j - k) * nums[j];  // i - j beause i is exact next smaller from j
	        	}
	        	stack.push(i);
	        }
	        
	        stack.clear();
//	      sorter version find sum of subarray maximum  
	        for(int i = 0 ; i <= nums.length ; i++) {
	        	
	        	while(stack.size() > 0 && nums[stack.peek()] < (i == nums.length ? Integer.MAX_VALUE : nums[i])) {
	        		int  j = stack.pop();
	        		int k = stack.isEmpty() ? -1 : stack.peek();
	        		res += (long)(i - j) * (j - k) * nums[j];  
	        	}
	        	stack.push(i);
	        }
	        
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
