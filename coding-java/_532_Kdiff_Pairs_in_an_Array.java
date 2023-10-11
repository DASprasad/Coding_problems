package progarm;
import java.util.*;
public class _532_Kdiff_Pairs_in_an_Array {
	
   public int findPairs(int[] nums, int k) {
        int res=0;
        HashSet<Integer> h=new HashSet();
        for(int i=0;i<nums.length;i++) {
        	if(!h.contains(nums[i])) {
        		if(h.contains(nums[i]+k)) {
        			res+=1;
        		}
        		if(h.contains(nums[i]-k)) {
        			res+=1;
        		}
        	}
        		h.add(nums[i]);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_532_Kdiff_Pairs_in_an_Array ob=new _532_Kdiff_Pairs_in_an_Array();
		int nums[]= {3,1,4,1,5};
		System.out.println(ob.findPairs(nums, 2));
		
		
	}

}
