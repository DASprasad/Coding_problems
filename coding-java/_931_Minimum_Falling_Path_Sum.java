package progarm;

public class _931_Minimum_Falling_Path_Sum {
	
	public int dfs(int row,int col,int[][] matrix,Integer[][] dp){
		 if(row>=matrix.length ){
	            return 0;
	        }
	        if(col<0 || col>=matrix[0].length){
	            return 1000000000+9;
	        }
         if(dp[row][col]!=null){
            return dp[row][col];
        }
        int a=dfs(row+1,col-1,matrix,dp)+matrix[row][col];
        int b=dfs(row+1,col,matrix,dp)+matrix[row][col];
        int c=dfs(row+1,col+1,matrix,dp)+matrix[row][col];
        
        return dp[row][col]=Math.min(a,Math.min(b,c));
    }
    public int minFallingPathSum(int[][] matrix) {
       Integer dp[][]=new Integer[matrix.length][matrix[0].length];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            ans=Math.min(ans,dfs(0,i,matrix,dp));
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_931_Minimum_Falling_Path_Sum ob=new _931_Minimum_Falling_Path_Sum();
		int[][] matrix= {{2,1,3},{6,5,4},{7,8,9}};
		System.out.println(ob.minFallingPathSum(matrix));
	}

}
