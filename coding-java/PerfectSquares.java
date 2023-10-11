package progarm;

public class PerfectSquares {
	static int global=0;
	public int numSquares(int n) {
		if(n==1) {
			return 1;
		}
		
		int ans=Integer.MAX_VALUE;
		int[] dp = new int[n+1];
		
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<dp.length;i++) {
			for(int j=1;j*j<=i;j++) {
				global=global+1;
				int temp=i-(j*j);
				
				ans=Math.min(ans, dp[temp]+1);
			}
			dp[i]=ans;
			ans=Integer.MAX_VALUE;
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectSquares ob=new PerfectSquares();
		System.out.println(ob.numSquares(9998));
		System.out.println(global);
		System.out.println(Math.sqrt(30));

	}

}
