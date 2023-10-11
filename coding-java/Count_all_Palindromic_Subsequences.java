package progarm;

public class Count_all_Palindromic_Subsequences {
	
	
	
	public int countPalindromicSubsequences(String s) {
        int[][] dp = new int[s.length()][s.length()];
        
        for(int gap = 0 ; gap < s.length(); gap++) {
        	
        	for(int i = 0 , j = gap ; j < s.length() ; i++ , j++) {
        		if(gap == 0) { dp[i][j] = 1; continue; } // first two corners we fill
        		if(gap == 1) { dp[i][j] =  s.charAt(i) == s.charAt(j) ? 3 : 2; continue; } 
        		
        		if(s.charAt(i) == s.charAt(j)) {
        			dp[i][j] = dp[i][j - 1] + dp[i + 1][j] + 1; //prefix + sufix + 1
        		}
        		else {
        			dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1]; //prefix + suffix - middle
        		}
        	}
        }
        
        return dp[0][dp.length - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
