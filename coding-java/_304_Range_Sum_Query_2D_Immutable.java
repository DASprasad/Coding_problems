package progarm;

public class _304_Range_Sum_Query_2D_Immutable {
	   int[][] sum;
      public _304_Range_Sum_Query_2D_Immutable(int[][] matrix) {
    	  int m = matrix.length, n = matrix[0].length;
          sum = new int[m + 1][n + 1]; // sum[i][j] is sum of all elements from rectangle (0,0,i,j) as left, top, right, bottom corresponding
          for (int r = 1; r <= m; r++) {
              for (int c = 1; c <= n; c++) {
                  sum[r][c] = matrix[r - 1][c - 1] + sum[r - 1][c] + sum[r][c - 1] - sum[r - 1][c - 1];
              }
          }
     }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    	row1++; col1++; row2++; col2++; //as sum is a one length bigger matrix of  than given matrix
    
    	return sum[row2][col2] - sum[row2][col1-1] - sum[row1-1][col2] + sum[row1-1][col1-1];
    			
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
		_304_Range_Sum_Query_2D_Immutable ob =new _304_Range_Sum_Query_2D_Immutable(matrix);
		
		
		System.out.println(ob.sumRegion(2, 1, 4, 3));
		System.out.println(ob.sumRegion(1, 1, 2, 2));
		System.out.println(ob.sumRegion(1, 2, 2, 4));
		System.out.println(ob.sumRegion(0, 0, 0, 0));
		System.out.println(ob.sumRegion(0, 0, 0, 0));
	}

}
