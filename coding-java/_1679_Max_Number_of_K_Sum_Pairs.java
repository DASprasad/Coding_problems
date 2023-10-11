package progarm;
import java.util.*;
public class _1679_Max_Number_of_K_Sum_Pairs {
		
	//map solution
	
	public int maxOperations(int[] nums, int k) {
		HashMap<Integer , Integer> map = new HashMap();
		int res  = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			
			if(map.containsKey(k - nums[i]) && map.get(k - nums[i]) > 0) {
				res += 1;
				map.put(k - nums[i], map.get(k - nums[i]) - 1);
			}
			
			else map.put(nums[i] , map.getOrDefault(nums[i], 0) + 1);
		}
		
		return res;
	}
	
//  public int maxOperations(int[] nums, int k) { //sorting solution (really bad for an easy question)
//	   
//	   Arrays.sort(nums);
//	   
//	   int left = 0 , right = nums.length - 1 , res = 0;
//	   
//	   while(left < right) {
//		   if(nums[left] + nums[right] == k) {res += 1; left ++ ; right-- ;}
//		   else if(nums[left] + nums[right] < k) left ++;
//		   else right--;
//	   }
//	   
//	   return res;
//     
// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1679_Max_Number_of_K_Sum_Pairs ob = new _1679_Max_Number_of_K_Sum_Pairs();
		int[] nums = {2,4,2};
		int k = 6;
		System.out.println(ob.maxOperations(nums, k));
	}

}
