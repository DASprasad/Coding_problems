package progarm;

import java.util.*;

import progarm._23_Merge_k_Sorted_Lists.ListNode;

import java.math.BigInteger;
import java.io.*;

public class testing {
	// lets track what we are picking with a mask
	
	public void encode(String s) {
		int n = s.length();
		
		List<Integer> factors = new ArrayList<Integer>();
		
		for(int i = 1 ; i * i <= n ; i++) {
			int divisor = n / i;
			factors.add(i); factors.add(divisor);
		}
		
		String res = ""; boolean flag = false;
		
		for(int i = 0 ; i < factors.size() ; i++) {
			
			if(s.charAt(i) == ' ') {
				res += s.charAt(factors.get(i) + 1);
			}
			else {
				res += s.charAt(factors.get(i));
			}
		}
		
		System.out.println(res);
	}
	
   public int recursion(String s ,int n , int k , int[][] dp , Integer[][] cache) {
	   if(n >= s.length() && k == 0) return 0;
	   if(n >= s.length() || k < 0) return 1000000;
	   
	   int local = Integer.MAX_VALUE;
	   
	for(int i = n ; i < s.length(); i++) {
		int  a = recursion(s , i + 1, k - 1 , dp , cache) + dp[n][i];
		local = Math.min(local, a);
	}
	
	return dp[n][k] = local;
	
}
   
   public int minChanges(String s , int k) {
	   int[][] dp = new int[s.length()][s.length()];
	   
	   for(int gap = 0 ; gap < dp.length; gap ++) {
		   for(int i = 0 , j = gap ; j < dp.length ; i++ , j++ ) {
			   if(i == j) { dp[i][j] = 0; continue; }
			   
			   dp[i][j] = (s.charAt(i) == s.charAt(j) ? 0 : 1) + dp[i + 1][j - 1];
			   
		   }
	   }
	   Integer[][] cache = new Integer[s.length()][k];
	   
	   return recursion(s , 0 , k , dp , cache);
   }
        
 
 public static void main(String[] args) {
   
	 testing ob = new testing();
	 String s ="akwueyiuqbdadnnnadiawdwndnadaoeseiurijmmnssgsgsgqyqydbcbsvaczddzdzgdjdkekfmgmgjbufududuueben";
	 
	 
	 System.out.println(ob.minChanges(s, 3));
    
 }
}