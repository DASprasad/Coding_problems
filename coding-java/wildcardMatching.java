package progarm;

import java.util.Arrays;

public class wildcardMatching {
	
	public boolean match(String s,String p) {
		Boolean[][] dp=new Boolean[p.length()][s.length()];
		if(p.equals("*")) return true;
		if(s.length()==0 && p.length()==0) return true;
		if(s.length()==0) return false;
		if(p.length()==0) return false;
		  for(int i=0;i<p.length();i++){
	            if(p.charAt(i)!='*')
	                break;
	            else
	                dp[0][i]=true;
	        }
		System.out.println(Arrays.toString(dp[0]));
		
		for(int i=0;i<p.length();i++) {
			for(int j=0;j<s.length();j++) {
				
				if(i==0 && j==0 ) {
					if(p.charAt(i)=='?' || p.charAt(i)=='*' ) { dp[i][j]=true; continue; }
					if(p.charAt(i)==s.charAt(j)) { dp[i][j]=true; continue; }
					return false;
					
				}
				if(p.charAt(i)=='*' && (i==0 || j==0)) {
					dp[i][j]=true;
					continue;
				}
				if(p.charAt(i)=='*' && dp[i-1][j]==true) {
					for(int k=j;k<dp[0].length;k++) {
						dp[i][k]=true;
							
					}
					break;
				}
				if(p.charAt(i)=='*' && dp[i-1][j]==false) {
					dp[i][j]=false;
					continue;
				}
				
				if(s.charAt(j)==p.charAt(i)) {
					if(i==0 || j==0) {
						dp[i][j]=false;
					}else {
					dp[i][j]=dp[i-1][j-1];
					}
				}else {
					dp[i][j]=false;
				}
				
				if(p.charAt(i)=='?') {
					if(i==0 || j==0) {
						dp[i][j]=false;
					}else {
					dp[i][j]=dp[i-1][j-1];
					}
				}
					
				
			}
		}
		
		
		return dp[dp.length-1][dp[0].length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wildcardMatching ob =new wildcardMatching();
		String s="adceb";
		String p="*a*b";
//		System.out.println(ob.match(s,p));
		System.out.println(5);

	}

}
