package progarm;

public class CoinChange2 {
	static int global=0;
	public int solve(int[] coins,int amount,int sum,int n,Integer[][] dp) {
		global=global+1;
		if(n>=coins.length || sum>amount) {
			return 0;
		}

		if(sum==amount) {
			return 1;
		}
		if(dp[n][sum]!=null) {
			return dp[n][sum];
		}
		int local=0;
		int temp=0;
		for(int i=n;i<coins.length;i++) {
		    temp=temp+solve(coins,amount,sum+coins[i],i,dp);
			if(temp>local) {
				local=temp;
			}
		}
		return dp[n][sum]=local;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinChange2 ob=new CoinChange2();
		int coins[]= {6,5,4,3,2,1};
		int amount=120;
		int sum=0;
		int n=0;
		Integer[][] dp=new Integer[coins.length][amount+1];
		System.out.println(ob.solve(coins, amount, sum, n,dp));
		System.out.println(global);

	}

}
