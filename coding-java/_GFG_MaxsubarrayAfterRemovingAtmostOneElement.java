package progarm;

public class _GFG_MaxsubarrayAfterRemovingAtmostOneElement {
	
	 public  int maxSumSubarray(int A[], int n){
         int[] prefix = new int[A.length];
         int[] suffix = new int[A.length];
         int res = 0;
         
         for(int i = 0  ; i < prefix.length ; i++){
             prefix[i] = Math.max(A[i] , A[i] + (i == 0 ? 0 : prefix[i - 1]));
         }
         
         for(int i = suffix.length - 1 ; i >= 0 ; i--){
             suffix[i] = Math.max(A[i] , A[i] + (i == suffix.length - 1 ? 0 : suffix[i + 1]));
         }
         
         for(int i = 0 ; i < A.length ; i++){
             int left = i == 0 ? 0 : prefix[i - 1];
             int right = i == suffix.length -1 ? 0 : suffix[i + 1];
             res = Math.max(res , Math.max (A[i] ,Math.max(left + right , left + right + A[i])));
             
         }
         
         return res;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
