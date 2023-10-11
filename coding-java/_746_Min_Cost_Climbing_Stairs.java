package progarm;

public class _746_Min_Cost_Climbing_Stairs {
	
   public int minCostClimbingStairs(int[] cost) {

	   int[] dp = new int[cost.length];
	   dp[0] = cost[0]; dp[1] = cost[1];
	  
	   for(int i = 2; i < dp.length; i++) {
		   
		   int curMin = Math.min(cost[i] + dp[i - 1], cost[i] + dp[i - 2]);
		   
		   dp[i] = curMin;
	   }
	   
	   return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_746_Min_Cost_Climbing_Stairs ob = new _746_Min_Cost_Climbing_Stairs();
		int[] cost = {1,1,100,1,1,100,1};
		
		System.out.println(ob.minCostClimbingStairs(cost));

	}

}
