package progarm;

public class _688_Knight_Probability_in_Chessboard {
	
	public double memo(Double[][][] dp  , int[][] direction , int n , int k , int row , int col) {
        if(k == 0) return 1;
		if(dp[k][row][col] != null) return dp[k][row][col];
		double local = 0;
		
		for(int i = 0 ; i < direction.length ; i++) {
			int x = row + direction[i][0];
			int y = col + direction[i][1];
			if(x < n && y < n && x >= 0 && y >= 0 && k > 0) {
			  local +=  memo(dp , direction , n , k - 1 , x , y);
			}
		}
		return dp[k][row][col] = local;
	}
	
	 public double knightProbability(int n, int k, int row, int column) {
		 double total_moves = Math.pow(8, k);
		 int [][] direction =new int[][]{{2,1},{-2,1},{2,-1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
		 Double[][][] dp = new Double[k + 1][n + 1][n + 1];
		 
		 return memo(dp , direction , n , k , row , column) / total_moves;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_688_Knight_Probability_in_Chessboard  ob = new _688_Knight_Probability_in_Chessboard();
		
		int n = 3, k = 2, row = 0, column = 0;
		
		System.out.println(ob.knightProbability(n, k, row, column));
		

	}

}
