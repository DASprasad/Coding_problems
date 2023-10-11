package progarm;
import java.util.*;
public class _659_Split_Array_into_Consecutive_Subsequences {
	

	
    public boolean isPossible(int[] nums) {
     HashMap<Integer , Integer> map = new HashMap();
		
		for(int  i = 0 ; i < nums.length ; i++ )
            map.put(nums[i],1 + map.getOrDefault(nums[i], 0));
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(map.get(nums[i]) <= 0) continue;
			
			int val = nums[i];
			int count = 1;
			while(map.containsKey(val + 1)) {	
				if(map.getOrDefault(val + 1 , 0) < map.get(val)) {
					if(count < 3) return false;
					map.put(val ,map.get(val) - map.getOrDefault(val + 1 , 0));
					break;
				}
				else {
				    map.put(val + 1, (map.get(val + 1) - map.get(val) == 0) ? 1 : map.get(val + 1) - map.get(val));
				}
			    count += 1;
				val += 1;
			}
			
		}
		
		
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_659_Split_Array_into_Consecutive_Subsequences ob = new _659_Split_Array_into_Consecutive_Subsequences();
		
		
		
		System.out.println(ob.isPossible(nums));

	}

}
