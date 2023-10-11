package progarm;

public class _1567_Maximum_Length_of_Subarray_With_Positive_Product {
	
      public int getMaxLen(int[] nums) {
    	  int last = -1; //for initial case where subarray starts from first index
    	  int negCount = 0;
    	  int maxLen = 0;
    	  int posCount = 0;
    	  
    	  for(int i = 0 ; i < nums.length ; i ++) {
    		  if(nums[i] == 0) { negCount = 0; last = i; posCount = 0;}
    		  if(nums[i] < 0) { negCount += 1; posCount = 0;}
    		  if(nums[i] > 0) posCount += 1;
    		  
    		  if(negCount % 2 == 0) maxLen = Math.max(maxLen, i - last);
    		  maxLen = Math.max(maxLen, posCount);
    	  }
    	  
    	
        
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
_1567_Maximum_Length_of_Subarray_With_Positive_Product ob = new _1567_Maximum_Length_of_Subarray_With_Positive_Product();
		int[] nums = {0,-1,-2,-3,4,5,-3,-3,0,1};
		
		System.out.println(ob.getMaxLen(nums));

	}

}
