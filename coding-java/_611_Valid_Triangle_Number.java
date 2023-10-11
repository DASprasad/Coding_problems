package progarm;
import java.util.*;
public class _611_Valid_Triangle_Number {
	
//	lets say we have a b c d e f g h in sorted order
//	if a + g > h that means every element after a such as b,c,d,e,f + g is also greater than h
//	so res  = res + leff - right.
//	if at any point condition doesnot meet we increment right pointer beacuse
//	
//	if a + g < h we have no other choice but to go to next that is b + h.
//	
//	starting from end saves us from a lot of trouble.
	
	public int triangleNumber(int[] nums) {
		
	int res = 0 ;
	
	for( int i = nums.length - 1 ; i >=  2 ; i--) {
		
		int left = 0;
		int right = i - 1;
		
		while(left < right) {
			
			if(nums[left] + nums[right] >= nums[i] ) {
				res = res + left - right ;
				right --;
			}
			else {
				left ++;
			}
		}	                                    
			                              
	}
		
  		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
