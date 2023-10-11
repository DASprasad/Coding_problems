package progarm;

public class _1191_K_Concatenation_Maximum_Sum {
//	lets observe the question carefully , we have k copies of the array
//	after observing we get that
//	-->  if sum of while array is negative we find out the kadane of first two copies
//	--> if sum is positive we find out kadane of (first + last  + (k - 2 * sum) 
	
	 public int maxSubArray(int[] nums) {
	        int local=0; int max=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            local=local+nums[i];  max=Math.max(local,max);
	            if(local<0) local=0;
	        }
	        return max;
	    }
	 
	 public int kConcatenationMaxSum(int[] arr, int k) {
	        int sum = 0;
	        
	        for(int i = 0 ; i < arr.length ; i++) sum += arr[i];
	        
	        if(k == 1) return maxSubArray(arr);
	        
	        int[] nums = new int[arr.length*2];
	        int pos = 0;
	        for(int i = 1; i <= 2 ; i++) {
	        	int j = 0;
	        	while(j < arr.length) {nums[pos] = arr[j]; j++ ; pos++;}
	        }
	        
	        if(sum < 0) return maxSubArray(nums);
	        
	        else return maxSubArray(nums) + (k - 2) * sum;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1191_K_Concatenation_Maximum_Sum ob = new _1191_K_Concatenation_Maximum_Sum();
		
		int[] arr = {1,-2,1};
		int k = 5;
		
		System.out.println(ob.kConcatenationMaxSum(arr, k));
		}

}
