package progarm;

public class _1000_Minimum_Cost_to_Merge_K_Stones {
	
	//very very important for logic build before starting with merge k start with merge 2 stones version below
	
	public int mergeTwoStones(int[] stones, int k) {
        int len = stones.length;
        int[][] dp = new int[len][len];
        int[] prefix = new int[len]; //direct get sum in the specific range
        prefix[0] = stones[0];
        for(int i = 1 ; i < prefix.length ; i++) {
        	prefix[i] = prefix[i - 1] + stones[i];
        }
        
        for(int gap = 0 ; gap < len ; gap++) {
        	
        	for(int i = 0 , j = gap ; j < len ; i++ ,j++ ) {
        		
        		if( i == j) { dp[i][j] = 0; continue; } //for one element cost is zero no merge needed
        		
        		dp[i][j] = Integer.MAX_VALUE;
        		
        		for(int pos = i ; pos < j ; pos++) {
        			
        			int sum = prefix[j] - ( i == 0 ? 0 : prefix[i - 1]);
        			dp[i][j] = Math.min(dp[i][j], sum + dp[i][pos] + dp[pos + 1][j]);
        		}
        		
        	}
        }
        
        return dp[0][len - 1];
    }
	
public int mergeKStones(int[] stones, int k) {
		
        int len = stones.length;
        if((len - k) % (k -1) != 0) return  -1;
        int[][] dp = new int[len][len];
        int[] prefix = new int[len];      
        prefix[0] = stones[0];
        for(int i = 1 ; i < prefix.length ; i++) { //direct get sum in the specific range
        	prefix[i] = prefix[i - 1] + stones[i];
        }
        
        for(int gap = 0 ; gap < len ; gap++) {
        	
        	for(int i = 0 , j = gap ; j < len ; i++ ,j++ ) {
        		
        		if( gap < k - 1) { dp[i][j] = 0; continue; } //for less then k stones cost is zero no merge needed
        		if(gap == k - 1) {dp[i][j] = prefix[j] - ( i == 0 ? 0 : prefix[i - 1]); continue;}
        		
        		dp[i][j] = Integer.MAX_VALUE;
        		
        		int sum = prefix[j] - ( i == 0 ? 0 : prefix[i - 1]);
        		
        		for(int pos = i ; pos < j ; pos = pos + k - 1) {	
        			dp[i][j] = Math.min(dp[i][j], dp[i][pos] + dp[pos + 1][j]);
        		}
        		
        		if(gap % (k - 1) == 0) dp[i][j] += sum; // where we can merge we can add all stones
        		
        	}
        }
        
        return dp[0][len - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
