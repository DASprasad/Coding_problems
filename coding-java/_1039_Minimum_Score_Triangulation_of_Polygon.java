package progarm;
import java.util.*;
public class _1039_Minimum_Score_Triangulation_of_Polygon {
	
	//yet another gap strategy of MCM
	
//      public int minScoreTriangulation(int[] values) {
//    	  int n = values.length;
//    	  int[][] dp = new int[n][n];
//    	  
//    	  for(int gap = 2 ; gap < n ; gap++) {
//    		  
//    		  for(int i = 0, j = gap ; j < n ; j++ , i++) {
//    			  dp[i][j] = Integer.MAX_VALUE;
//    			  
//    			  for(int k = i + 1 ; k < j ; k++) {
//    				  dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j] + values[i] * values[k] * values[j]);
//    			  }
//    		  }
//    	  }
//    	 
//        return dp[0][dp.length - 1];
//    }
//      
      public int minScoreTriangulation(int[] values) {
    	  int n = values.length;
    	  int[][] dp = new int[n][n];
    	  
    	  for(int gap = 2 ; gap < n ; gap++) {
    		  
    		  for(int i = 0, j = gap ; j < n ; j++ , i++) {
    			  dp[i][j] = Integer.MIN_VALUE;
    			  
    			  for(int k = i + 1 ; k < j -1 ; k++) {
    				  dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + values[i] * values[k] * values[k + 1]* values[j]);
    			  }
    		  }
    	  }
    	 
        return dp[0][dp.length - 1];
    }
      
      public static void convertBase(String N)
      {
   
          // 128 bit integer to store
          // the decimal conversion
          int decimal = 0;
   
          // Loop to iterate N
          for (int i = 0; i < N.length(); i++) {
              // Binary to decimal
              decimal = decimal * 2 + (N.charAt(i) - '0');
          }
   
          // Stores the base 6 int
          ArrayList<Integer> ans = new ArrayList<Integer>();
   
          // Decimal to base 6
          while (decimal > 0) {
              ans.add(decimal % 6);
              decimal = decimal / 6;
          }
   
          // Print Answer
          for (int i = ans.size() - 1; i >= 0; i--) {
              System.out.print(ans.get(i));
          }
      }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1039_Minimum_Score_Triangulation_of_Polygon ob = new _1039_Minimum_Score_Triangulation_of_Polygon();
		int[] values = {1,3,1,5,8,1};
		String s = "10000";
		
//		ob.convertBase(s);
		
		System.out.println(ob.minScoreTriangulation(values));

	}

}
