package progarm;
import java.util.*;
public class LongestCommonSubString {
	
	public int solve(int[] nums1,int[] nums2) {
		int[][] dp=new int[nums2.length][nums1.length];
		
		for(int i=0;i<nums2.length;i++) {
			for(int j=0;j<nums1.length;j++) {
				if(nums1[i]==nums2[j]) {
					if(i==0 || j==0) {
						dp[j][i]=1;
					}else {
						dp[j][i]=dp[j-1][i-1]+1;
					}
				}
			}
		}
		
//		for(int i=0;i<dp.length;i++) {
//			System.out.println(Arrays.toString(dp[i])+" ");
//		}
		return dp[dp.length-1][dp[0].length-1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestCommonSubString ob = new LongestCommonSubString();
		int[] nums1= {1,2,3,4};
		int[] nums2= {4,1,2,3};
		System.out.println(ob.solve(nums1, nums2));
		

	}

}
