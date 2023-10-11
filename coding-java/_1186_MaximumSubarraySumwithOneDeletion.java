package progarm;

import java.util.Arrays;

public class _1186_MaximumSubarraySumwithOneDeletion {
	
	public int maximumSum(int[] a) {
        int n = a.length;
        int[] maxEndHere = new int[n], maxStartHere = new int[n];
        int max = a[0];
        maxEndHere[0] = a[0];
        for(int i=1; i < n; i++){
            maxEndHere[i] = Math.max(a[i], maxEndHere[i-1]+a[i]);
            max = Math.max(max, maxEndHere[i]);
        }
        maxStartHere[n-1] = a[n-1];
        for(int i=n-2; i >= 0; i--)
            maxStartHere[i] = Math.max(a[i], maxStartHere[i+1]+a[i]);
        for(int i=1; i < n-1; i++)
            max = Math.max(max, maxEndHere[i-1]+maxStartHere[i+1]);
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1186_MaximumSubarraySumwithOneDeletion ob = new _1186_MaximumSubarraySumwithOneDeletion();
		
		int[] arr = {1,-2,-2,3};
		
		System.out.println(ob.maximumSum(arr));


	}

}
