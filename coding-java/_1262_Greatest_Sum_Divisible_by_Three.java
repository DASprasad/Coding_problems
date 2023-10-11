package progarm;

public class _1262_Greatest_Sum_Divisible_by_Three {
	
	public int maxSumDivThree(int[] nums) {
        int[] dp = new int[3];
        
        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            int[] next = dp.clone();
            for(int j = 0 ; j < dp.length ; j++){
                int newSum = n + dp[j];
                int index = newSum % 3;
                next[index] = Math.max(next[index] , newSum);
            }
            dp = next;
        }
        
        return dp[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
