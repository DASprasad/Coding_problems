package progarm;

public class _2140_Solving_Questions_With_Brainpower {
	
     public long mostPoints(int[][] questions) {
    	 int n = questions.length ;
         long[] dp = new long[n];
         
         for(int i = n - 1 ; i >= 0 ; i--) {
        	 int idx = questions[i][1];
        	 dp[i] = questions[i][0] + ( idx + i + 1 >= n ? 0 : dp[i + idx + 1]);
        	 dp[i] = i == n - 1 ? dp[i] : Math.max(dp[i], dp[i + 1]);
         }
         
         return dp[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2140_Solving_Questions_With_Brainpower ob = new _2140_Solving_Questions_With_Brainpower();
		int[][] questions = {{1,1},{2,2},{3,3},{4,4},{5,5}};
		System.out.println(ob.mostPoints(questions));
		

	}

}
