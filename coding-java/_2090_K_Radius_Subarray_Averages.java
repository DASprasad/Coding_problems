package progarm;

import java.util.Arrays;

public class _2090_K_Radius_Subarray_Averages {
	
	 public int[] getAverages(int[] nums, int k) {
		 
		 int[] res = new int[nums.length]; 
		 
		 
		 Arrays.fill(res, res.length - k , res.length , -1);
		 
		 int sum = 0;
		 for(int i = 0 ; i < 2*k + 1 ; i++) {
			 sum += nums[i]; res[i] = -1;
		 }
		 
		 res[2*k - 3] = sum /( 2 * k + 1 ); 
		 
		 for(int i = k + 1 , last = 0; i < nums.length - k ; i++) {
			 
			 sum = sum + nums[i + k] - nums[last++];
			 
			 int average = sum  / (2 * k + 1);
			 
			 res[i] = average;
			 
		 }
		 
		 return res;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_2090_K_Radius_Subarray_Averages ob  = new _2090_K_Radius_Subarray_Averages();
		
		int[] nums = {7,4,3,9,1,8,5,2,6};
		
		System.out.println(Arrays.toString(ob.getAverages(nums, 3)));

	}

}
