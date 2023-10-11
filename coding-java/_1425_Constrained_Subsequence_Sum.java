package progarm;
import java.util.*;
public class _1425_Constrained_Subsequence_Sum {
	
public int constrainedSubsetSum(int[] nums, int k) {   //using maxHeap O(nLogn)
	   int res = Integer.MIN_VALUE;
	   int[] dp = new int[nums.length];
	   PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k , (a , b) -> b - a);
	   
	   for(int i = 0 , last = 0 ; i < nums.length ; i++) {
		   
	     while(maxHeap.size() > 0 && i - last > k)   maxHeap.remove(dp[last++]);
		
	      dp[i] = Math.max(nums[i], (maxHeap.size() > 0 ? maxHeap.peek() : -100000) + nums[i]);
	      maxHeap.add(dp[i]);
	      res = Math.max(res, dp[i]);
	 }
	   
	   return res;
        
    }
//use this method always
  public int constrainedSubsetSum1(int[] A, int k) {  //using DiubleEnded Queue best method O(n)
    int res = A[0];
    Deque<Integer> q = new ArrayDeque<>();
    for (int i = 0; i < A.length; ++i) {
    	
        A[i] += !q.isEmpty() ? q.peek() : 0;
        res = Math.max(res, A[i]);
        
        while (!q.isEmpty() && A[i] > q.peekLast())  q.pollLast();
           
        if (A[i] > 0)
            q.offer(A[i]);
        if (i >= k && !q.isEmpty() && q.peek() == A[i - k])
            q.poll();
    }
    return res;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1425_Constrained_Subsequence_Sum ob = new _1425_Constrained_Subsequence_Sum();
		
		int[] nums = {-1,-2,-3};
		int k = 2;
		
		System.out.println(ob.constrainedSubsetSum(nums, k));

	}

}
