package progarm;

public class _81_Search_in_Rotated_Sorted_Array_II {
	
    public boolean search(int[] nums, int target) {
    	int low = 0 , high = nums.length - 1;
    	
    	while(low <= high ) {
    		int mid = (low + high) / 2;
    		
    		if(nums[mid] == target) return true;
    		
    		if(nums[mid] > nums[low]) {
    			if(target < nums[mid] && target >= nums[low] ) high = mid - 1;
    			
    			else low = mid + 1;
    		}
    		
    		else if(nums[mid] < nums[low]) {
    			if(target > nums[mid] && target < nums[low]) low = mid + 1;
    			else high = mid - 1;
    		}
    		
    		else {
    			low ++;
    		}
    		
    	}
        
    	
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
