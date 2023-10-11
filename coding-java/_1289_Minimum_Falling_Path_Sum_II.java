package progarm;

import java.util.Arrays;

public class _1289_Minimum_Falling_Path_Sum_II {//just track the minimum ans second min element of next array in grid
	public int minFallingPathSum(int[][] grid) {
		int n=grid.length;
		int[][] dp=new int[n][n];
		
	// preprocessing	
		dp[n-1]=grid[n-1];
		for(int i=n-2;i>=0;i--) {
			
			int min=Integer.MAX_VALUE;
			int secondmin=Integer.MAX_VALUE;
            int mincount=0;
			
			
			for(int j=0;j<n;j++) {
				 if (dp[i+1][j] < min) { secondmin = min; min = dp[i+1][j];}
		       else if(dp[i+1][j] < secondmin && dp[i+1][j] != min) { secondmin = dp[i+1][j];}
		                	
			}
			
			for(int k=0;k<n;k++) {
				if(dp[i+1][k]==min) mincount+=1;
			}
			for(int l=0;l<n;l++) {
				int below=dp[i+1][l];
				if(mincount>1) dp[i][l]=grid[i][l]+min;
				else if(below==min) dp[i][l]=grid[i][l]+secondmin;
				else dp[i][l]=grid[i][l]+min;
			}
		}
		//preprocessing completed
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			ans=Math.min(ans, dp[0][i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _1289_Minimum_Falling_Path_Sum_II ob=new  _1289_Minimum_Falling_Path_Sum_II();
		 int[][] grid= {{1,2,3},{4,5,3},{7,8,9}};
		 System.out.println(ob.minFallingPathSum(grid));

	}

}
