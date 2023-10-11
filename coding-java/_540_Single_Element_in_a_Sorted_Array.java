package progarm;

public class _540_Single_Element_in_a_Sorted_Array {
	
//	this question has a property that if there is a single number and every other number in array is repeating 2 times 
//	and array is sorted then :
//	
//	-> for a zero indexed array the single number can only be placed in even indexes
//	
//	-> do a binary search on even based based indexes and get result
	
	public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length-1;
        
        while (lo < hi) {
        	
            int mid = lo + (hi - lo) / 2;
            
            int even = (mid % 2 == 0)? nums[mid] : nums[mid-1];
            int followingOdd = (mid % 2 == 0)? nums[mid+1] : nums[mid];
            
            if (even == followingOdd) {
                lo = mid + 1;
            } else {
                hi = (mid / 2) * 2;
            }
        }
        return nums[lo];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
