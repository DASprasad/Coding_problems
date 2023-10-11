package progarm;

import java.util.Arrays;

public class _1220_Count_Vowels_Permutation {
	
	public int countVowelPermutation(int n) {
		long mod = (long)1e9 + 7;
        long[] dp = new long[5];  
        long[] prev = new long[5]; // for  --> a e i o u
        int a = 0 , e = 1 , i = 2 , o = 3 , u = 4;
        Arrays.fill(prev , 1);
        
        for(int k = 1 ; k < n ; k++ ) {
        	
        	dp[a] = (prev[e] + prev[i] + prev[u]) % mod;
            dp[e] = (prev[a] + prev[i]) % mod;
            dp[i] = (prev[e] + prev[o]) % mod;
            dp[o] = prev[i];
            dp[u] = (prev[i] + prev[o]) % mod;
            
            long[] tmp = dp; //update the previous to use it again
            dp = prev; 
            prev = tmp;
        }
        
        return (int) ((prev[a] + prev[e] + prev[i] + prev[o] + prev[u]) % mod);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1220_Count_Vowels_Permutation ob = new _1220_Count_Vowels_Permutation();
		int n = 3 ;
		System.out.println(ob.countVowelPermutation(n));

	}

}
