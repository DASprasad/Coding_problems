package progarm;
import java.util.*;
public class DeleteAndEarn {
	
	 public int deleteAndEarn(int[] nums) {
         int[] buckets = new int[10001];
         for (int num : nums) {
             buckets[num] += num;
         }
         int[] dp = new int[10001];
         dp[0] = buckets[0];
         dp[1] = buckets[1];
         for (int i = 2; i < buckets.length; i++) {
             dp[i] = Math.max(buckets[i] + dp[i - 2], dp[i - 1]);
         }
         return dp[10000];
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteAndEarn ob=new DeleteAndEarn();
		int[]nums= {2,3,4,5,3,3,2,2,2,3,3,4,4,5,4,5,4,5,4,5,6,6,7,7,8,7,5,4,2,2,2,3,4,5,5,6,6,6,6,7,7,8,8,8,7,6,5,4,3,3,3,4,4,4,9,9,9,9,9,9,9,5,5,5,5,5,5,3,22,2,1,1,1,1,1,1,4,4,5,5,6,7,7,7,6,5,4,4,3,3,4,4,5,5,6,5,4,3,3,3,4,5,6,6,5,4,3,4,5,6};
		System.out.println(ob.deleteAndEarn(nums));

	}

}
