package progarm;

import java.util.Arrays;

public class _689_Maximum_Sum_of_3_Non_Overlapping_Subarrays {
	
	 public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
		 
		 int[][] fi = new int[nums.length][2]; fi[0][0] = nums[0]; //fi stands for first iteration
		 int sum = 0;
		 for(int  i = 0 ,last = 0 ; i < nums.length ; i++) {
			 
			 sum += nums[i];
			 
			 while(last < i - k + 1 )  { sum -= nums[last] ; last++; }
				 
			 if(i - 1 < 0) { fi[i][0] = sum; fi[i][1] = last; continue; }
			 
			 if(fi[i - 1][0] >= sum) { fi[i][0] = fi[i-1][0]; fi[i][1] = fi[i - 1][1];}
			 
			 else { fi[i][0] = sum; fi[i][1] = last; }
			 
		 }
		 
		 int[][] si = new int[nums.length][3]; si[0][0] = nums[0];
		 int max= 0;
		 sum = 0; //reusing same variable 

        for(int  i = 0 ,last = 0 ; i < nums.length ; i++) {
			 
			 sum += nums[i];
			 while(last < i - k + 1 )  {
				 sum -= nums[last] ; last++;
			 }
			 if(i - k < 0) { continue; } //corner case nothing important
			 int temp = sum + fi[i - k][0];
			 if(temp > max) { max = temp; si[i][0] = temp; si[i][1] = fi[i - k][1]; si[i][2] = last; }
			 else {si[i][0] = max; si[i][1] = si[i-1][1]; si[i][2] = si[i-1][2]; }
			 
		 }
        
        int res = 0;
        sum = 0;
        int ans[] = new int[3];
        
        for(int  i = 0 ,last = 0 ; i < nums.length ; i++) {
			 
			 sum += nums[i];
			 while(last < i - k + 1 )  {
				 sum -= nums[last] ; last++;
			 }
			 if(i - k < 0) continue;  //nothing to do
			 
			 if(sum + si[i - k][0] > res) {
				 ans[0] = si[i - k][1]; ans[1] = si[i - k][2]; ans[2] = last;
				 res = sum + si[i - k][0];
			 }
		 }
		 return ans;
		
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_689_Maximum_Sum_of_3_Non_Overlapping_Subarrays ob = new _689_Maximum_Sum_of_3_Non_Overlapping_Subarrays();
		int nums[] = {1,2,1,2,6,7,5,1};
		
		System.out.println(Arrays.toString(ob.maxSumOfThreeSubarrays(nums, 2)));

	}

}
