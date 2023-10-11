package progarm;

public class _378_Kth_Smallest_Element_in_a_Sorted_Matrix {
	
	 int m, n;
	    
	    public int kthSmallest(int[][] matrix, int k) {
	        m = matrix.length; n = matrix[0].length; // For general, the matrix need not be a square
	        int left = matrix[0][0], right = matrix[m-1][n-1], ans = -1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (countLessOrEqual(matrix, mid) >= k) {
	                ans = mid;
	                right = mid - 1; // try to looking for a smaller value in the left side(lower bound)
	            } else left = mid + 1; // try to looking for a bigger value in the right side
	        }
	        return ans;
	    }
	    
	    // we use this genius method to find how many elements are smaller than mid
	    public int countLessOrEqual(int[][] matrix, int x) {
	        int cnt = 0, c = n - 1; // start with the rightmost column
	        for (int r = 0; r < m; ++r) {
	            while (c >= 0 && matrix[r][c] > x) --c;  // decrease column until matrix[r][c] <= x
	            cnt += (c + 1);
	        }
	        return cnt;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
