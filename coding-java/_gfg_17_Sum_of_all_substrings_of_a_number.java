package progarm;

public class _gfg_17_Sum_of_all_substrings_of_a_number {
	
	public long sumSubstrings(String s)
    {
       int[] nums = new int[s.length()];
       int mod = 1000000007;
       
       for(int i = 0 ; i < nums.length ; i++) {
    	   nums[i] = Character.getNumericValue(s.charAt(i));
       }
       int res = 0;
       long[] dp = new long[nums.length];
       dp[0] = nums[0]; res += dp[0];
       
       
       
       for(int i = 1; i < dp.length ; i++) {
    	   dp[i] =  (i + 1) * nums[i] + 10*dp[i - 1];
    	   res += dp[i];
       }
       
       
       return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_gfg_17_Sum_of_all_substrings_of_a_number ob = new _gfg_17_Sum_of_all_substrings_of_a_number();
		
		String s = "1234";
		
		System.out.println(ob.sumSubstrings(s));
		

	}

}
