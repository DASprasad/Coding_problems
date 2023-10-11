package progarm;

public class _581_ShortestUnsortedContinuousSubarray {
	
		public int findUnsortedSubarray(int[] nums) {
		        int minLeft =  Integer.MAX_VALUE;
		        int maxRight = Integer.MIN_VALUE;
		        boolean sorted = true;
		        
		        for(int i = 1 ; i < nums.length ; i++) {
		        	if(nums[i]<nums[i-1]) {
		        		sorted = false;
		        	}
		        	if(sorted == false) minLeft = Math.min(minLeft, nums[i]);
		        }
		        sorted = true;
		        
		        for(int i = nums.length-2 ; i >= 0 ; i-- ) {
		        	if(nums[i]<nums[i+1]) sorted = false;
		        	
		        	if(sorted == false) maxRight = Math.max(maxRight, nums[i]);
		        }
		        int begin = -1;
		        int end = -1;
		       
		        for(int i = 0 ; i < nums.length ; i++) {
		        	if(minLeft < nums[i]) { begin = i;  break; }
		        }
		        
		        for(int i = nums.length-1 ; i >= 0 ; i--) {
		        	if(maxRight > nums[i]) { end = i ; break; }
		        }
		        
		        
		        return end - begin + 1;
		        
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_581_ShortestUnsortedContinuousSubarray ob = new _581_ShortestUnsortedContinuousSubarray();
        int[] nums = {1,2,3,4,5,6,7};
        
        System.out.println(ob.findUnsortedSubarray(nums));
	}

}
