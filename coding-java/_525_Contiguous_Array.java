package progarm;
import java.util.*;
public class _525_Contiguous_Array {
	
     public int findMaxLength(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
        h.put(0, -1);
        int current=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]==1) {
        	current+=1;
        	}
        	else {
        	   current-=1;
        	}
        	if(h.containsKey(current)) {
        		ans=Math.max(ans, i-h.get(current));
        	}
        	else {
        		h.put(current, i);
        	}
        }
        return ans;
    }
     public boolean compare(int a,int b) {
    	 return a>b ? true : false;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		_525_Contiguous_Array ob=new _525_Contiguous_Array();
		int nums[]= {0,1,0,1,1,1,0,0,0,1,1,0,0,0,1};
//		System.out.println(ob.findMaxLength(nums));
		System.out.println(ob.compare(3, 2));

	}

}
