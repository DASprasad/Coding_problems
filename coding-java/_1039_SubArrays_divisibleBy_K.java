package progarm;
import java.util.*;
public class _1039_SubArrays_divisibleBy_K {
	
	public int numSubArrays(int[] nums,int k) {
		HashMap<Integer,Integer>map=new HashMap();
		map.put(0, 1);
		int res=0;
		int currentSum=0;
		
		for(int i=0;i<nums.length;i++) {
			currentSum += nums[i];
			int mod=(currentSum%k+k)%k;
			
			if(map.containsKey(mod)) {
				res+=map.get(mod);
				map.put(mod, 1+map.get(mod));
			}
			else {
				map.put(mod, 1);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1039_SubArrays_divisibleBy_K ob=new _1039_SubArrays_divisibleBy_K();
		int nums[]= {-1,2,9};
		int k=2;
		System.out.println(ob.numSubArrays(nums, k));
		

	}

}
