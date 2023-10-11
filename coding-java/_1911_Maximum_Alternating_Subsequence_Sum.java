package progarm;

public class _1911_Maximum_Alternating_Subsequence_Sum {
	
	 public static long maxAlternatingSum(int[] A) {
	        long res = A[0];
	        for (int i = 1; i < A.length; ++i)
	            res += Math.max(A[i] - A[i-1], 0);
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {5,6,7,4,3,4};
		maxAlternatingSum( A);
	}

}
