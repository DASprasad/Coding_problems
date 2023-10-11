package progarm;
import java.util.*;
public class _1031_MaximumSumofTwoNonOverlappingSubarrays {
	
		public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
			int res = 0;
			int[] dp_first = new int[nums.length];
			int[] dp_second = new int[nums.length];
			int Max_firstLen = 0; int Max_secondLen = 0;
			int Sum_firstLen = 0 ; int Sum_secondLen = 0; 
			
			for(int i=0;i<firstLen;i++) Sum_firstLen += nums[i];
			
			dp_first[firstLen-1] = Sum_firstLen;
			
			for(int i=0;i<secondLen;i++) Sum_secondLen += nums[i];
			
			dp_second[secondLen-1] = Sum_secondLen;
			
			for(int i=firstLen ; i<nums.length ; i++) {
				Sum_firstLen = Sum_firstLen - nums[i-firstLen] + nums[i];
				dp_first[i] = Math.max(dp_first[i-1],Sum_firstLen);
			}
			
			for(int i=secondLen ; i<nums.length ; i++) {
				Sum_secondLen = Sum_secondLen - nums[i-secondLen] + nums[i];
				res = Math.max(res, dp_first[i-secondLen]+Sum_secondLen);
				dp_second[i] = Math.max(dp_second[i-1],Sum_secondLen);
			}
			
			Sum_firstLen = 0;
			for(int i=firstLen ; i<nums.length ; i++) {
				Sum_firstLen = Sum_firstLen - nums[i-firstLen] + nums[i];
				res = Math.max(res, dp_second[i-firstLen]+Sum_firstLen);
			}
			
			return res;
	
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1031_MaximumSumofTwoNonOverlappingSubarrays ob = new _1031_MaximumSumofTwoNonOverlappingSubarrays();
		int[] arr= {1,2,3,4,5,6};
		int len1= 2;
		int len2 = 3;
		System.out.println(ob.maxSumTwoNoOverlap(arr, len1, len2));
		
		System.out.println(Arrays.toString(arr));

	}

}
	
