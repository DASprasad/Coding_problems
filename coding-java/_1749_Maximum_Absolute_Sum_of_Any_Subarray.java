package progarm;

public class _1749_Maximum_Absolute_Sum_of_Any_Subarray {
	
	 public int maxAbsoluteSum(int[] nums) {
	        int positiveSum = 0; int negetiveSum = 0;
	        int positiveMax = Integer.MIN_VALUE;
	        int negetiveMax = Integer.MAX_VALUE;
	        
	        for(int i = 0; i < nums.length; i++){
	            
	            positiveSum = positiveSum+nums[i];
	            
	            positiveMax = Math.max(positiveSum,positiveMax);
	            
	            if(positiveSum < 0) {
	                positiveSum = 0;
	            }
	            
	                negetiveSum = negetiveSum+nums[i];
	                
	                negetiveMax = Math.min(negetiveMax , negetiveSum);
	            
	             if(negetiveSum > 0) {
	                negetiveSum = 0;
	            }
	                
	                
	            
	        }
	        
	        return Math.max(positiveMax , Math.abs(negetiveMax));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1749_Maximum_Absolute_Sum_of_Any_Subarray ob=new _1749_Maximum_Absolute_Sum_of_Any_Subarray();
		int[] nums= {1,-3,2,3,-4};
		
		System.out.println(ob.maxAbsoluteSum(nums));

	}

}
