package progarm;
import java.util.*;

public class _446_Arithmetic_Slices_II_Subsequence {
	
	public int numberOfArithmeticSlices(int[] nums) {
        int res = 0;
        HashMap<Long , Integer>[] dp = new HashMap[nums.length];
        dp[0] = new HashMap();
    
        for(int i = 1 ; i < nums.length ; i++) {
        	dp[i] = new HashMap();
            
        	for(int j = 0 ; j < i ; j++) {
                long first = nums[i] , second = nums[j]; //handle integer overflow error
        		long diff = first - second;
                
        		if(dp[j].containsKey(diff)) {
        			int len = dp[j].get(diff);
        			res += len;
                    if(dp[i].containsKey(diff)) dp[i].put(diff, len + 1 + dp[i].get(diff));
        			else dp[i].put(diff, len + 1);
        		}
                
        		else {
        			 if(dp[i].containsKey(diff)) dp[i].put(diff,  1 + dp[i].get(diff));
        			 else dp[i].put(diff,  1);
        		}
                
        	}
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_446_Arithmetic_Slices_II_Subsequence ob = new _446_Arithmetic_Slices_II_Subsequence();
		int[] nums = {7,7,7,7,7};
		System.out.println(ob.numberOfArithmeticSlices(nums));
		long l1 = -294967296;
		long l2 = 2000000000;
		System.out.println(l1 - l2);

	}

}
