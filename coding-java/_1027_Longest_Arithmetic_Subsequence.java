package progarm;
import java.util.*;
public class _1027_Longest_Arithmetic_Subsequence {
	
	public int longestArithSeqLength(int[] nums) {
   	 
   	 HashMap<Integer,Integer>[] dp=new HashMap[nums.length];
   	 
   	 int len=2;
   	 
   	 for(int i = 0; i < nums.length; i ++) {
   		 
   		 dp[i] = new HashMap();
   		 
   		 for(int j = 0; j < i; j ++) {
   			 
   			 int diff = nums[i] - nums[j];
   			 
   			 if(dp[j].containsKey(diff)) {
   				 
   				 int get = dp[j].get(diff) + 1;
   				 
   				 len = Math.max(len, get);
   				 
   				 dp[i].put(diff, get);
   			 }
   			 
   			 else {
   				 dp[i].put(diff, 2);
   			 } 
   		 }
   	 }
   	 
   	 return len;
       
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1027_Longest_Arithmetic_Subsequence ob=new _1027_Longest_Arithmetic_Subsequence();
		int nums[]= {9,4,7,2,10};
		System.out.println(ob.longestArithSeqLength(nums));

	}

}
