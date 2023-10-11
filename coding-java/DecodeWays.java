package progarm;

import java.util.Arrays;

public class DecodeWays {
	public int convert1(String str,int pos) {
		String temp=str.substring(pos,pos+2);
		int ans=Integer.parseInt(temp);
		return ans;
	}
	public int decode(String str,int n,int[] dp) {
		if(n>=str.length()) {
			return 1;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		if( n!= str.length()-1 && convert1(str,n)<=26 && convert1(str,n)>=1 && str.charAt(n)!='0') {
			return dp[n]=decode(str,n+1,dp)+decode(str,n+2,dp);
		}
		else if(str.charAt(n)!='0'){
			return dp[n]=decode(str,n+1,dp);
		}
        else{
            return 0;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecodeWays ob = new DecodeWays();
		String str="12121212121212222111121211121211111222121112";
		int[] dp=new int[str.length()];
		Arrays.fill(dp, -1);
		System.out.println(ob.decode(str, 0,dp));

	}

}
