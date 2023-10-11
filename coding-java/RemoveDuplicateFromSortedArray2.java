package progarm;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray2 {
	 public static int removeDuplicates(int[] nums) {
	       int i=0;
	        int j=0;
	        int count=1;
	        while(j<nums.length){
	            j++;
	            if(j==nums.length){
	                break;
	            }
	            if(nums[i]==nums[j] && count<2){
	                count++; i++;
	            }
	            else if(nums[i]!=nums[j]){
	                i++; nums[i]=nums[j]; count=1;
	            }
	        }
	        System.out.println(Arrays.toString(nums));
	        return i;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums[]= {-1,0,0,0,0,0,0,0,1,1,1,2,2,3};
        removeDuplicates(nums);
	}

}
