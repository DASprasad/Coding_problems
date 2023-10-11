package progarm;

import java.util.Arrays;

public class _31_Next_Permutation {
	
     public void nextPermutation(int[] nums) {
        
    	 int pos = nums.length - 2 ;
    	 
    	 while(pos >= 0 && nums[pos] >= nums[pos + 1]) {
    		 pos -- ;
    	 }
    	 if(pos == -1) {
    		 Arrays.sort(nums);
    		 System.out.println(Arrays.toString(nums));
    	 }
    	 
    	 else {
    	 
    	 int  i = nums.length - 1; 
    	 int val = -1;
    	 
    	 while( pos > 0 && i > pos ) {   //find the element closest greater than nums[pos] ans swap it
    		 if(nums[i] > nums[pos] ) {
    			 val = i;
    			 break;
    		 }
    		 i--;
    	 }
    	 
    	 // swap 
    	 int temp = nums[pos];
    	 nums[pos] = nums[i];
    	 nums[i] = temp ;
    	 
    	 Arrays.sort(nums , pos+1 , nums.length);
    	 
    	 System.out.println(Arrays.toString(nums));
    }
        
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_31_Next_Permutation ob = new _31_Next_Permutation();
		int[] nums = {2,3,1};
		
		ob.nextPermutation(nums);
		
		

	}

}
