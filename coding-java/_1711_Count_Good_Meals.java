package progarm;
import java.util.*;
public class _1711_Count_Good_Meals {
	
	  int mod = 1000000000 + 7;
    public int countPairs(int[] deliciousness) {
        int res = 0 , two = 1;
        int[] power = new int[23];
        HashMap<Integer , Integer> map = new HashMap();
        
        for(int i = 0 ; i < power.length ; i++) { power[i] = two; two *= 2;}
        
        for(int num : deliciousness) {
            
        	for(int pow : power) { res += map.getOrDefault(pow - num, 0); res %= mod; }
        	
        	map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return res;   	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1711_Count_Good_Meals ob = new _1711_Count_Good_Meals();
		int[] nums = {149,107,1,63,0,1,6867,1325,5611,2581,39,89,46,18,12,20,22,234};
		System.out.println(ob.countPairs(nums));
	}

}
