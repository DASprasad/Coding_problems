package progarm;

public class _713_Subarray_Product_Less_Than_K {
	
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        long product = 1;
        int last = 0;
        int res = 0;
        
        for(int i = 0 ; i < nums.length ; i++ ) {
        	
        	product *= nums[i];
        	
        	while(product >= k && last < i) {    // >= beacuse strictly less givens
        		product = product / nums[last];
        		last++;
        	}
        	
        	res += i - last + 1 ;
        }
        
        return res ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 _713_Subarray_Product_Less_Than_K ob = new  _713_Subarray_Product_Less_Than_K();
		int[] nums = {1,1,1};
		int k = 1;
		
		System.out.println(ob.numSubarrayProductLessThanK(nums, k));
		

	}

}
