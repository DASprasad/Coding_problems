package progarm;

public class _930_Binary_Subarrays_With_Sum {
	
	public int atMost(int[] nums , int k) {
		int res = 0;
		int sum = 0 ;
		for(int i = 0 , j =0 ; i < nums.length ; i++) {
			if(nums[i] == 1) sum += 1;
			
			while(sum > k) {
				sum = sum - nums[j++];
			}
			
			res = res + i - j + 1 ;
		}
		
		return  res ;
		
	}
	
    public int numSubarraysWithSum(int[] nums, int goal) {
    	
    	   int atMostK = atMost(nums , goal);
    	   int atMostKMinusOne = atMost(nums , goal-1);
        
    	   return atMostK - atMostKMinusOne;
        }
        
     
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_930_Binary_Subarrays_With_Sum ob = new _930_Binary_Subarrays_With_Sum();
		int nums[] = {0,0};
				
		int goal = 0;
		
		System.out.println(ob.numSubarraysWithSum(nums, goal));

	}

}
