package progarm;
import java.util.*;
public class _239_Sliding_Window_Maximum {
	
    public int[] maxSlidingWindow(int[] nums, int k) {
         int[] res=new int[nums.length-k+1];
         Deque<Integer> dq =new ArrayDeque();
         
         dq.addLast(0); // dq.offer() is same = this is added to clear corner case
         int count=0;
         for(int i=0;i<nums.length;i++) {
        	 
        	 
        	 while(dq.size()>0 && dq.getFirst() < i-k+1) {
        		 dq.removeFirst();
        		
        	 }
        	 
        	 
        	 while( dq.size()>0 && nums[dq.getLast()]<=nums[i]) {
        		 dq.removeLast();
        	 }
        	  
        	 
               dq.addLast(i);
         
         if(i>=k-1) {
        	 res[count++]=nums[dq.getFirst()];
         }
    }
         
         return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_239_Sliding_Window_Maximum ob =new _239_Sliding_Window_Maximum();
		
		int [] nums= {1,3,-1,-3,5,3,6,7};
		int k =1;
		
		System.out.println(Arrays.toString(ob.maxSlidingWindow(nums, k)));

	}

}
