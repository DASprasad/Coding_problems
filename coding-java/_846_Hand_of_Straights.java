package progarm;
import java.util.*;
public class _846_Hand_of_Straights {
	

	public boolean isNStraightHand(int[] hand, int groupSize) {
    	 //we can use sorting and hash map to do it in a simple way but here is a better way
		
		Map<Integer , Integer> map = new TreeMap();
		
		for(int  i = 0 ; i < hand.length ; i++ )
            map.put(hand[i],1 + map.getOrDefault(hand[i], 0));
		
		for(int val : map.keySet()) {
			if(map.get(val) <= 0) continue;
			
			for(int  i = 1; i < groupSize ; i++) {
				
				if(map.getOrDefault(val + i , 0) < map.get(val)) return false;
				
				map.put(val + i, map.get(val + i) - map.get(val));
			}
		}
		
		return true;
          			
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_846_Hand_of_Straights ob = new _846_Hand_of_Straights();
		int[] hand = {1,2,3,6,2,3,4,7,8};
		int g = 3;
		
		System.out.println(ob.isNStraightHand(hand, g));

	}

}
