package progarm;

public class _gfg_14_Kadanes_Algorithm_ {
	
	 public long maximumSum(int arr[], int sizeOfArray) {
		 int n = arr.length;
		 long res = Long.MIN_VALUE;
		 for(int i = 0 ; i < n ; i++) {
			 arr[i] = Math.max(arr[i], arr[i] + i == 0 ? 0 : arr[i - 1]);
			 res = Math.max(res, arr[i]);
		 }
		 
		 return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
