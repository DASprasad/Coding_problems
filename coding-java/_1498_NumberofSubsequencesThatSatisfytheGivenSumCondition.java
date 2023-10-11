package progarm;
import java.util.Arrays;


//Sort input A first,
//For each A[i], find out the maximum A[j]
//that A[i] + A[j] <= target.

//For each elements in the subarray A[i+1] ~ A[j],
//we can pick or not pick,
//so there are 2 ^ (j - i) subsequences in total.
//So we can update res = (res + 2 ^ (j - i)) % mod.

//We don't care the original elements order,
//we only want to know the count of sub sequence.
//So we can sort the original A, and the result won't change.

///my explanation  

//basically we use two pointer  and where left + right <= target we count the number of subsequences starting from left number
//ex = 1 2 3   and target = 7;
//in first step we do 2 ^ 3 - 2 ^ 2 (number of subsequences starting from 1 i e = 1 2 3 , 1 3 , 1 2 , 1). in the code it is shortened.   
public class _1498_NumberofSubsequencesThatSatisfytheGivenSumCondition {
	
	public int numSubseq(int[] A, int target) {
        Arrays.sort(A);
        int res = 0, n = A.length, l = 0, r = n - 1, mod = (int)1e9 + 7;
        int[] pows = new int[n];
        pows[0] = 1;
        for (int i = 1 ; i < n ; ++i)
            pows[i] = pows[i - 1] * 2 % mod;
        while (l <= r) {
            if (A[l] + A[r] > target) {
                r--;
            } else {
                res = (res + pows[r - l++]) % mod;
            }
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
