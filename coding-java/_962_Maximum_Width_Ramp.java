package progarm;
import java.util.*;


public class _962_Maximum_Width_Ramp {
	
	 public int maxWidthRamp(int[] nums) {
		 Stack<Integer>stack=new Stack();
		 int res=0;
		 for(int i=0;i<nums.length;i++) {
			 if(stack.isEmpty() || nums[i]<nums[stack.peek()]) {
				 stack.push(i);
			 }
		 }
		 
		 for(int i=nums.length-1;i>=0;i--) {
			 while(stack.size()>0 && nums[i]>=nums[stack.peek()]) {
				 res=Math.max(res, i-stack.pop());
			 }
		 }
		 
	       return res;
	    }
	 
//	 public int longestSubarray(int[] A, int limit) {
//		    int i = 0, j;
//		    TreeMap<Integer, Integer> m = new TreeMap<>();
//		    for (j = 0; j < A.length; j++) {
//		        m.put(A[j], 1 + m.getOrDefault(A[j], 0));
//		        if (m.lastEntry().getKey() - m.firstEntry().getKey() > limit) {
//		            m.put(A[i], m.get(A[i]) - 1);
//		            if (m.get(A[i]) == 0)
//		                m.remove(A[i]);
//		            i++;
//		        }
//		    }
//		    return j - i;
//		}
	 
	 public int longestSubarray(int[] nums, int limit) {
	        int left = 0;
	        TreeSet<Integer> set = new TreeSet<>((a, b) -> nums[a] == nums[b] ? a - b : nums[a] - nums[b]);
	        set.add(0);
	        int res = 1;
	        for (int right = 1; right < nums.length; right++) {
	            set.add(right);
	            while (nums[set.last()] - nums[set.first()] > limit) {
	                set.remove(left++);
	            }
	            res = Math.max(res, right - left + 1);
	        }
	        return res;
	    }
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_962_Maximum_Width_Ramp ob=new _962_Maximum_Width_Ramp();
		int nums[]= {10,10,1,2,4,7,2,5};
		System.out.println(ob.longestSubarray(nums ,5));
		
	
	
	}

}
