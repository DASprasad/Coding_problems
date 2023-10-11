package progarm;

import java.util.Arrays;

public class DistinctSubsequences {
	static int count=0;
	static int global=0;
	
	//Donot try this at home , school or anywhere.
	public int distincts(String str,String check,int n,String help,Integer[] dp) {
		global=global+1;

//		if(help.equals(check)) {
////			count=count+1;
//			return 1;
//		}
		if(n>=str.length()) {
			return 0;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		
		if(help.length()==1 && help.charAt(0)!=check.charAt(0)) {
			return 0;
		}
		
		int local=0;
		for(int i=n;i<str.length();i++) {
			
            if(check.contains(help)) {  
			int temp= distincts(str,check,i+1,help+str.charAt(i),dp);
			local=local+temp;
            }
		}
		return dp[n]=local;
	}
	
	public int numDistinct(String s,String t) {
		int[][] dp=new int[t.length()+1][s.length()+1];
		
		Arrays.fill(dp[0], 1);
		
		
		for(int i= 1;i<dp[0].length;i++) {
			for(int j=1;j<dp.length;j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {

					dp[j][i]=dp[j-1][i-1]+dp[j][i-1];
				}
				else {
					dp[j][i]=dp[j][i-1];
				}
				
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DistinctSubsequences ob=new DistinctSubsequences();
		String str="babgbagbbababababababgbgbgbgbgbgbbbgggggaaaababababbbgggbgbgbgbggggaaaaaaaaabbbggabjdhfirhffhfhfjfaaaaggg";
		String check="bag";
        System.out.println(ob.numDistinct(str, check));


		
	}

}
