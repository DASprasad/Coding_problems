package progarm;

public class _764_Largest_Plus_Sign {
	
	 public int orderOfLargestPlusSign(int n, int[][] mines) {
	        int ans=0;
	        Integer grid[][]=new Integer[n][n];
	        int[][] dp=new int[n][n];
	        for(int i=0;i<mines.length;i++) grid[mines[i][0]][mines[i][1]]=0;
	        
	        //from left to right
	        int count=1;
	        for(int i=0;i<grid.length;i++) {
	        	count=1;
	        	for(int j=0;j<grid.length;j++) {
	        		if(grid[i][j]==null) dp[i][j]=count++;
	        		else count=1;
	        	}
	        	
	        }
	        
//	        from left to right
	        for(int i=grid.length-1;i>=0;i--) {
	        	count=1;
	        	for(int j=grid.length-1;j>=0;j--) {
	        		if(grid[i][j]==null) {
	        			dp[i][j]=Math.min(count, dp[i][j]);
	        			count++;
	        		}
	        		else count=1;
	        	}
	        	
	        }
//	        from top to bottom
	        
	        for(int i=0;i<grid.length;i++) {
	        	count=1;
	        	for(int j=0;j<grid.length;j++) {
	        		if(grid[j][i]==null) {
	        			dp[j][i]=Math.min(dp[j][i], count);
	        			count++;
	        		}
	        		else count=1;
	        	}
	        }
	        
//	        from bottom to top
	       
	        for(int i=grid.length-1;i>=0;i--) {
	        	 count=1;
	        	for(int j=grid.length-1;j>=0;j--) {
	        		if(grid[j][i]==null) {
	        			dp[j][i]=Math.min(dp[j][i], count);
	        			ans=Math.max(ans, dp[j][i]);   // update the ans
	        			count++;
	        		}
	        		else count=1;
	        	}
	        }

	        
	        
	        
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _764_Largest_Plus_Sign ob=new  _764_Largest_Plus_Sign();
		 int n=1;
		 int[][] mines={{0,0}};
		 
		 System.out.println(ob.orderOfLargestPlusSign(n, mines));

	}

}
