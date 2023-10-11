package progarm;

public class _2017_Grid_Game {
	
      public long gridGame(int[][] grid) {
        int n = grid[0].length - 1;
    	  //prefix sum
    	  
    	  for(int i = 1 ; i <= n ; i++) {
    		  grid[0][i] = grid[0][i] + grid[0][i - 1];
    		  grid[1][i] = grid[1][i] + grid[1][i - 1];
    	  }
    	  
    	  int row1 = grid[0][n]; //upper row sum
    	  
    	  long res = Integer.MAX_VALUE;
    	  
    	  for(int i = 0; i <= n ; i++) {
    		  
    		  int bottomLeftSum = i == 0 ? 0 : grid[1][i - 1];
    		  int topRightSum = row1 - grid[0][i];
    		  
    		  res = Math.min(res, Math.max(bottomLeftSum , topRightSum));
    	  }
    	  
    	  return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_2017_Grid_Game ob = new _2017_Grid_Game();
		
		int[][] grid = {{2,5,4},{1,5,1}};
		
		System.out.println(ob.gridGame(grid));

	}

}
