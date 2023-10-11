package progarm;
import java.util.*;
public class _1695_Maximum_Erasure_Value {
	
public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> map = new HashSet();
        int curSum = 0 , res = 0;
        for(int i = 0 , last = 0;  i < nums.length ; i++) {
        	if(!map.contains(nums[i])) {
        		curSum += nums[i];
        		res = Math.max(curSum, res);
        		map.add(nums[i]);
        	}
        	else {
        		while(nums[last] != nums[i]) {
        			curSum -= nums[last];
        			map.remove(nums[last++]);	
        		}
        		last++;
        	}
        }
        
        return res;
    }

  public int comp(HashMap<Integer , Integer>map , int a , int b) {
	  if(map.get(a) > map.get(b)) return -1;
	  return 1;
  }
  public void freq(Integer[] nums) {
	  HashMap<Integer,Integer> map = new HashMap();
		 for(int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
		 
		 Arrays.sort(nums, (a , b)->comp(map , a , b));
		 
		 System.out.println(Arrays.toString(nums));
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _1695_Maximum_Erasure_Value ob = new  _1695_Maximum_Erasure_Value();
		 int[] nums = {4,4,4,5,4,1,1,1,1,2,3};
		 System.out.println(ob.maximumUniqueSubarray(nums));
		 
		 

	}

}
