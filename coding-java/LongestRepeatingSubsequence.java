package progarm;

public class LongestRepeatingSubsequence {
	
	public int solve(String str1,String str2 ,int m,int n,Integer[][] dp) {
		if(m>=str1.length()|| n>=str2.length()) {
			return 0;
		}
		if(dp[m][n]!=null) {
			return dp[m][n];
		}
		if(str1.charAt(m)==str2.charAt(n) && m!=n) {
			return dp[m][n]=solve(str1,str2,m+1,n+1,dp)+1;
		}
		else {
			return dp[m][n]=Math.max(solve(str1,str2,m,n+1,dp), solve(str1,str2,m+1,n,dp));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestRepeatingSubsequence ob =new LongestRepeatingSubsequence();
		String str="ax";
		String str1=new String (str);
		Integer[][] dp = new Integer[str.length()][str.length()];
		System.out.println(ob.solve(str,str1,0,0,dp));

	}

}
