package progarm;
import java.util.*;
public class _1774_Closest_Dessert_Cost {
	
	public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        HashSet<Integer> set = new HashSet();
        
        for(int i = 0 ; i < baseCosts.length ; i++) set.add(baseCosts[i]);
        
        for(int n : toppingCosts) {
       	 HashSet<Integer> temp = new HashSet(set);
       	 for(int val : set) {
       		 temp.add(val + n);
       		 temp.add(val + 2*n);
       	 }
       	 set = temp;
        }
        int res = 0;
        int diff = Integer.MAX_VALUE;
        for(int val : set) {
            int curDiff = Math.abs(target - val);
       	 if(curDiff < diff) {
       		 res = val; diff = curDiff;
       	 }
            else if(curDiff == diff) res = Math.min(res , val);
        }
        
        return res;
   }
       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1774_Closest_Dessert_Cost ob = new _1774_Closest_Dessert_Cost();
		int[] base = {2 , 3};
		int[] ticket = {4 ,5 ,100};
		int target = 18;
		System.out.println(ob.closestCost(base, ticket, target));

	}

}
