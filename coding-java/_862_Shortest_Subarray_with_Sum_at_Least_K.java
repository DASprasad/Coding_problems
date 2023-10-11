package progarm;
import java.util.*;
public class _862_Shortest_Subarray_with_Sum_at_Least_K {
	
	class pair{
		int val , idx;
		public pair(int val , int idx) { this.val = val; this.idx = idx;}
		public int val() { return this.val; }
		public int idx() {return this.idx; }
	}
	
   public int shortestSubarray(int[] nums, int k) {
	   
	   int res = Integer.MAX_VALUE ,prefixSum = 0;
	   
	   Deque<pair> dq = new ArrayDeque<pair>(); dq.add(new pair(0 , -1));
	  
	   for(int i = 0 ; i < nums.length ; i++) {
		   
		   prefixSum += nums[i];
		   
		   while(dq.size() > 0 && prefixSum - dq.getFirst().val() >= k) res = Math.min(res, i - dq.removeFirst().idx());
		   
		   while(dq.size() > 0 && prefixSum <= dq.getLast().val())  dq.removeLast();
			  
		   dq.addLast(new pair(prefixSum , i));
		   	      
	   }
	   return res == Integer.MAX_VALUE ? -1 : res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_862_Shortest_Subarray_with_Sum_at_Least_K ob = new _862_Shortest_Subarray_with_Sum_at_Least_K();
		int[] nums = {2,7,3};
		int k = 12;
		
		System.out.println(ob.shortestSubarray(nums, k));

	}

}
