package progarm;

public class _1449_Form_Largest_Integer_With_Digits_That_Add_up_to_Target {
	public String largestNumber(int[] cost, int target) {
        String[] dp = new String[target + 1];
        dp[0] = "";
        
        for(int i = 1 ; i < dp.length ; i++) {
        	dp[i] = "";
        	for(int j = 0 ; j < cost.length ; j++) {
        		
        		if(i - cost[j] == 0) {
        			String temp  =  j+1 + "";
        			if(temp.length() < dp[i].length()) continue;
        			else if(temp.length() > dp[i].length()) dp[i] = temp;
            		else dp[i] = dp[i].compareTo(temp) > 0 ? dp[i] : temp;
        			continue;
        		}
        		
        		if(i < cost[j] || dp[i - cost[j]] == null) continue;
        		
        		String x = dp[i - cost[j]] + dp[cost[j]];
        		String y = dp[cost[j]] + dp[i - cost[j]];
        		String temp = x.compareTo(y) > 0 ? x : y;
        		if(x.length() < dp[i].length()) continue;
        		else if(x.length() > dp[i].length()) dp[i] = temp;
        		else dp[i] = dp[i].compareTo(temp) > 0 ? dp[i] : temp;
         	}
        	if(dp[i].equals("")) dp[i] = null;
        }
        return dp[dp.length - 1] == null ? "0" : dp[dp.length - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1449_Form_Largest_Integer_With_Digits_That_Add_up_to_Target  ob = new _1449_Form_Largest_Integer_With_Digits_That_Add_up_to_Target();
        int[] cost = {7,6,5,5,5,6,8,7,8};
        int target = 1193;
        System.out.println(ob.largestNumber(cost, target));
	}

}
