package progarm;
import java.util.*;
import java.util.HashMap;

public class __1477_FindTwoNonoverlappingSubarraysEachWithTargetSum {
	
		public int minSumOfLengths(int[] arr, int target) {
			HashMap<Integer,Integer> map = new HashMap();
			map.put(0, -1);
			Integer[] dp = new Integer[arr.length];
		       int currentMin=Integer.MAX_VALUE;
		       int rolling_sum = 0;
		       int res=Integer.MAX_VALUE;
		       
		       for(int i = 0 ;i<arr.length ; i++) {
		    	   rolling_sum += arr[i];
		    	   
		    	   if(map.containsKey(rolling_sum - target)) {
		    		   
		    		   int left = map.get(rolling_sum - target);
		    		   
		    		   if(left>=0 && dp[left] != Integer.MAX_VALUE) res = Math.min( res, dp[left]+i-left);
		    		   
		    		   currentMin =Math.min(currentMin, i-left);
		    	   }
		    	   
		    	   map.put(rolling_sum , i);
		    	   dp[i] = currentMin;
		    	   
		       }
		       if(res == Integer.MAX_VALUE) return -1;
		       
		       return res;
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		__1477_FindTwoNonoverlappingSubarraysEachWithTargetSum ob = new __1477_FindTwoNonoverlappingSubarraysEachWithTargetSum();
		int[] arr = {3,2,2,4,3};
		int target = 3;
		System.out.println(ob.minSumOfLengths(arr, target));

	}

}
