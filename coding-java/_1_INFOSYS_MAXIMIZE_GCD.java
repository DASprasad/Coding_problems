package progarm;

import java.util.Arrays;

public class _1_INFOSYS_MAXIMIZE_GCD {
	
	public boolean isPossible(int limit , int[] arr) {
		for(int i = 1 ; i < arr.length ; i++) {
			limit -= arr[i] % arr[0];
			if(limit < 0) return false;
		}
		
		
		return true;
	}
	
	public int maxGcd(int[] arr , int limit) {
		int low = 1;
		int high = arr[0];
		int res = 1;
		Arrays.sort(arr);
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if(arr[0] - mid > limit) low = mid + 1;
			
			else if(isPossible(limit , arr)) {res = mid; low = mid + 1; } 
			
			else high = mid - 1;
		}
		
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1_INFOSYS_MAXIMIZE_GCD ob = new _1_INFOSYS_MAXIMIZE_GCD();
		
		int[] arr = {1,5,6,1,1};
		int k =4;
		
		System.out.println(ob.maxGcd(arr, k));
		

	}

}
