package progarm;

import java.util.Arrays;

public class _1641_Count_Sorted_Vowel_Strings {
	
	public int countVowelStrings(int n) {
        int[] dp = new int[5];
        int[] prev = new int[5];
        int a= 0 , e = 1 , i = 2 , o = 3 , u = 4 ;
        Arrays.fill(prev , 1);
        for(int k = 1 ; k < n ; k++ ) {
        	dp[a] = prev[a];
        	dp[e] = prev[a] + prev[e];
        	dp[i] = prev[a] + prev[e] + prev[i];
        	dp[o] = prev[a] + prev[e] + prev[i]+prev[o];
        	dp[u] = prev[a] + prev[e] + prev[i] + prev[o]+prev[u];
        	
        	int[] tmp = dp; //update the previous to use it again
            dp = prev; 
            prev = tmp;
        }
        
        return prev[a] + prev[e] + prev[i] + prev[o] + prev[u];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1641_Count_Sorted_Vowel_Strings ob = new _1641_Count_Sorted_Vowel_Strings();
		
		int ans = ob.countVowelStrings(33);
		System.out.println(ans);

	}

}
