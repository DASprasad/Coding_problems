package progarm;

public class _1277_Count_Square_Submatrices_with_All_Ones {
	
    public int countSquares(int[][] matrix) {
    	int row = matrix.length , col = matrix[0].length;
    	
    	int[][] dp = new int[row + 1][col + 1];
    	int res = 0;
    	for(int i = 1 ; i <= row ; i++) {
    		for(int j = 1 ; j <= col ; j++) {
    			if(matrix[i - 1][j - 1] == 1) {
    				dp[i][j] =1 + Math.min(dp[i - 1][j - 1],Math.min(dp[i - 1][j], dp[i][j - 1]));
    				res += dp[i][j];
    			}
    		}
    	}
    	
    	return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1277_Count_Square_Submatrices_with_All_Ones ob = new _1277_Count_Square_Submatrices_with_All_Ones();
		int[][] matrix = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
		
		System.out.println(ob.countSquares(matrix));

	}

}
