package progarm;

public class _1937_Maximum_Number_of_Points_with_Cost {
	
	public int[] maxScoreSightseeingPairFromLeft(int[] values) {
	
	        int[] left = new int[values.length];
	        left[0] = values[0]; 
	        int startingVal = values[0];
	        
	        for(int i = 1; i < values.length; i++) {
	        	
	        	startingVal--;
	        	left[i] = Math.max(startingVal , values[i]);
	        	 
	        	
	        	if (values[i] >= startingVal) {
	        		startingVal = values[i];
	        	}
	        }
	        return left;
	    }

	public int[] maxScoreSightseeingPairFromRight(int[] values) {
	
	    int[] right = new int[values.length];
	    right[right.length - 1] = values[values.length - 1]; 
	    int startingVal = values[values.length - 1];
	    
	    for(int i = values.length - 2; i >= 0; i--) {
	    	
	    	startingVal--;
	    	right[i] = Math.max(startingVal , values[i]);
	    	 
	    	
	    	if (values[i] >= startingVal) {
	    		startingVal = values[i];
	    	}
	    }
	    return right;
	}
	
	 public long maxPoints(int[][] points) {
		 int[][] dp = new int[points.length][points[0].length];
		 dp[0] = points[0];
		 int res = 0;
		 for(int i = 1 ; i < points.length ; i++) {
			 int[] left = maxScoreSightseeingPairFromLeft(dp[i - 1]);
			 int[] right = maxScoreSightseeingPairFromRight(dp[i - 1]);
			 for(int j = 0 ; j < points[0].length ; j++) {
				 dp[i][j] = Math.max(dp[i][j], points[i][j] + Math.max(left[j], right[j]));
				 res = Math.max(res, dp[i][j]);
			 }
		 }
		 
		 return res;
	        
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1937_Maximum_Number_of_Points_with_Cost  ob = new _1937_Maximum_Number_of_Points_with_Cost();
		int[][] points = {{1,2,3},{1,5,1},{3,1,1}};
		System.out.println(ob.maxPoints(points));

	}

}
