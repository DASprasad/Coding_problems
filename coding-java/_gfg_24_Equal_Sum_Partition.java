package progarm;

public class _gfg_24_Equal_Sum_Partition {
	
	public boolean findPartition(int[] a, int n) {
		
        int sum = 0 ;
        
        for(int i = 0 ; i < a.length ; i++) sum += a[i];
        
        if(sum % 2 != 0) return false;
        
        int target = sum / 2;
        
        boolean[][] dp = new boolean[a.length][target + 1];
        
        for(int i = 0 ; i < dp.length ; i++) {
        	
        	for(int j = 0 ; j < dp[0].length ; j++) {
        		if(j ==0) { dp[i][j] = true; continue;}
        		
        		else if(i == 0) {
        			
        			dp[i][j] = j == a[i] ? true : false;
        		}
        		else if(a[i] > j) dp[i][j] = i == 0 ? false : dp[i - 1][j];
        		
        		else dp[i][j] = dp[i - 1][j] || dp[i - 1][j - a[i]];
        	}
        }
        
        return dp[dp.length - 1][dp[0].length - 1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_gfg_24_Equal_Sum_Partition ob = new _gfg_24_Equal_Sum_Partition();
		int[] a = {1, 5 , 5, 11};
		int n = 4;
		


	}

}
