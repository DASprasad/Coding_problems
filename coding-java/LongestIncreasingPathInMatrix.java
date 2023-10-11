package progarm;

public class LongestIncreasingPathInMatrix {
	
	public int dfs(int row,int col,int prev,int[][] matrix,Integer[][] dp) {
		if(row>=matrix.length || row<0 || col>=matrix[0].length || col<0) {
			return 0;
		}
		if(matrix[row][col]>prev && dp[row][col]!=null) {
			return dp[row][col];
		}
		if(matrix[row][col]>prev) {
			int down=dfs(row+1,col,matrix[row][col],matrix,dp);
			int right=dfs(row,col+1,matrix[row][col],matrix,dp);
			int up=dfs(row-1,col,matrix[row][col],matrix,dp);
			int left=dfs(row,col-1,matrix[row][col],matrix,dp);
			return dp[row][col]=Math.max( Math.max(down,right), Math.max(up, left))+1;
		}
		else {
			return 0;
		}
	}
		
		public int longestIncreasingPath(int[][] matrix) {
		     int ans=Integer.MIN_VALUE;
		     Integer[][] dp=new Integer[matrix.length][matrix[0].length];
		     for(int i=0;i<matrix.length;i++) {
		    	 for(int j=0;j<matrix[0].length;j++) {
		    		 int temp=dfs(i,j,Integer.MIN_VALUE,matrix,dp);
		    		 ans=Math.max(ans, temp);
		    	 }
		     }
		     
		     return ans;
		}
		
	

	public static void main(String[] args) {
		LongestIncreasingPathInMatrix ob=new LongestIncreasingPathInMatrix();
		int[][] matrix= {{9,9,4},{6,6,8},{2,1,1}};
		System.out.println(ob.longestIncreasingPath(matrix));

	}

}
