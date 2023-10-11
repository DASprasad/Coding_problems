package progarm;
import java.util.HashMap;
public class _1218_LongestArithmeticSubsequenceofGivenDifference {
	
	//below algorithm wont work input size very large
//     public int longestSubsequence(int[] arr, int difference) {
//    	 int res = 0;
//    	 int[] dp = new int[arr.length];
//    	 dp[0] = 1;
//    	 
//    	 for(int i = 1 ; i < arr.length ; i++) {
//    		 int max = 0;
//    		 for(int j = 0 ; j < i ; j++) {
//    			 if(arr[i] - arr[j] == difference) max = Math.max(dp[j], max);
//    		 }
//    		 dp[i] = max + 1;
//    		 res = Math.max(res, dp[i]);
//    	 }
//    	 
//    	 return res ;
//        
//    }
	
	public int longestSubsequence(int[] arr, int difference) {
		
		HashMap<Integer , Integer> map = new HashMap();
		int res = 1;
		
		for(int i = 0 ;i < arr.length ; i++) {
			if(map.containsKey(arr[i] - difference)) {
				int temp = map.get(arr[i] - difference)+1;
				res = Math.max(res, temp);
				map.put(arr[i], temp);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1218_LongestArithmeticSubsequenceofGivenDifference ob = new _1218_LongestArithmeticSubsequenceofGivenDifference();
		int[] arr = {1,5,7,8,5,3,4,2,1};
		int difference = -2;
		
		System.out.println(ob.longestSubsequence(arr, difference));

	}

}
