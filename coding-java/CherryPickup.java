package progarm;
import java.util.Arrays;
public class CherryPickup {///wrong
	
	public int dfs(int[][] grid , int row , int col ,Integer[][] dp) {
		if(row>=grid.length || col>=grid[0].length) {
			return 0;
		}
		if(grid[row][col]==-1) {
			return 0;
		}
		if(dp[row][col]!=null) {
			return dp[row][col];
		}
		int m=dfs(grid,row+1,col,dp)+grid[row][col];
		int n=dfs(grid,row ,col+1,dp)+grid[row][col];
		return dp[row][col]=Math.max(m, n);
	}
	public void fix(int[][] grid,Integer[][] dp,int row,int col) {
		while(row!=dp.length-1 && col!=dp[0].length-1) {
			if(dp[row][col+1]>=dp[row+1][col]) {
				grid[row][col+1]=0;
				col=col+1;
				
			}
			else {
				grid[row+1][col]=0;
				row=row+1;
			}
		}
		
		if(row==dp.length-1) {

			for(int i=col;i<dp[0].length;i++) {
				grid[row][i]=0;
			}
		}
		else if(col==dp[0].length-1) {
			for(int i=row;i<dp.length;i++) {
				grid[i][col]=0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CherryPickup ob =new CherryPickup();
		int[][] grid= {{0,1,-1},{1,0,-1},{1,1,1}};
		Integer[][] dp=new Integer[grid.length][grid[0].length];
		int row=0;
		int col=0;
		int ans1=ob.dfs(grid, row, col, dp);
		ob.fix(grid, dp, 0, 0);
		dp=new Integer[grid.length][grid[0].length];
		int ans2=ob.dfs(grid, row, col, dp);
		System.out.println(ans1+ans2);
//		System.out.println("original grid"+"\n");
//		for(int i=0;i<dp.length;i++) {
//			System.out.println(Arrays.toString(grid[i]));
//		}
//		System.out.println("dp array"+"\n");
//		for(int i=0;i<dp.length;i++) {
//			System.out.println(Arrays.toString(dp[i]));
//		}
	}

}
