package progarm;

import java.util.Arrays;

public class _1838_Frequency_of_the_Most_Frequent_Element {
	
		public int maxFrequency(int[] nums, int k) {
			
			int sumDiff = 0;
			
			int last = 0;  //it tracks the last position of sliding window
			
			Arrays.sort(nums);
			
			int res = 0; 
			
			for(int i = 1 ; i < nums.length ; i++) {
				
				sumDiff += nums[i]-nums[i-1];
				
				while(sumDiff > k) {
					
					sumDiff -= nums[last+1] - nums[last];
					
					last ++;
					
				}
				
				res = Math.max(res, i - last + 1);
			}
			
		    return res ;    
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1838_Frequency_of_the_Most_Frequent_Element ob = new _1838_Frequency_of_the_Most_Frequent_Element();
		
		int[] nums = {1,4,8,13};
		int k = 5;
		
		System.out.println(ob.maxFrequency(nums, k));

	}

}
