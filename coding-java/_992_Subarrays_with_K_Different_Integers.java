package progarm;
import java.util.*;
public class _992_Subarrays_with_K_Different_Integers {
	
	   public int atmost_K_times(int[] nums , int k ){
		     int res = 0 ;
		    HashMap<Integer,Integer> visited = new HashMap();
		    int unique = 0;
		    int last = 0;
		    
		    for(int i = 0 ; i < nums.length ; i++) {
		    	
		    	if(visited.containsKey(nums[i])) {
		    		visited.put(nums[i] , visited.get(nums[i])+1);
		    	}
		    	else {
		    		unique += 1;
		    		visited.put(nums[i], 1);
		    	}
		    	
		    	while(unique > k) {
		    		
		    		int temp = visited.get(nums[last]);
		    		temp -= 1;
		    		if(temp == 0) {
		    			visited.remove(nums[last]);
		    			unique -= 1;
		    		}
		    		
		    		else {
		    			visited.put(nums[last], temp);
		    		}
		    		last++;
		    	}
		    	
		    	res += i - last + 1;
		    }
		    
		    return res ;
	   }
  	
		public int subarraysWithKDistinct(int[] nums, int k) {
			
			    return atmost_K_times(nums , k) - atmost_K_times(nums , k - 1);
		        
		    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_992_Subarrays_with_K_Different_Integers ob = new _992_Subarrays_with_K_Different_Integers();
		int nums[] = {1,2,1,2,3,4,3,4,6,5,3,5,7,9,7,5,23,4,5,3,3,3,2,3,5,4,4,3,2,3,45,6,7,8,8,8,7,6,5,4,3,3,3,5,6,6,6,6,7,7,7,4,4,4,4,3,2,2,2,2,3,4,4,5,6,7,7,8,9,9,9,8,7,7,6,5,4,32,3,2,4,5,56,6,5,4,3,3,4};
		int k = 10 ;
		
		System.out.println(ob.subarraysWithKDistinct(nums, k));

	}

}
