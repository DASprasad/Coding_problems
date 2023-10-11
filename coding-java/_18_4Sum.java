package progarm;
import java.util.*;
public class _18_4Sum {
	
	 public List<List<Integer>> fourSum(int[] nums, int target) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        
	        Arrays.sort(nums);
	        
	        for(int i = 0 ; i < nums.length - 3 ; i++) {
	        	
	        	if(i != 0  && nums[i] == nums[i - 1]) continue;
	        	
	        	for(int j = i + 1 ; j < nums.length - 2 ; j++) {
	        		
	        		if(j - i !=1 && nums[j] == nums[j - 1]) continue;
	        		
	        		int left = j  + 1; int right = nums.length - 1;
	        		
	        		while(left  < right) {
	        			//handle duplicates in below two steps
	        			if(left - j != 1 && nums[left] == nums[left - 1]) { left++; continue; }  
	        			if(right!= nums.length -1 && nums[right] == nums[right + 1]) {right --; continue;}
	        			
	        			int sum = nums[i] + nums[j] + nums[left] + nums[right];
	                    
	        	    if(sum == target) {
	                    
	        		  List<Integer> list = new ArrayList(List.of(nums[i], nums[j], nums[left], nums[right]));
	                    
	        				res.add(list);
	        				
	        				left++;		
	        			}
	        			else if(sum < target) left++;
	        			
	        			else right --;	
	        		}
	        	}
	        }
	        
	        
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_18_4Sum ob = new _18_4Sum();
		int nums[] = {1,0,-1,0,-2,2};
		System.out.println(ob.fourSum(nums, 0));
			
		}

	}


