package progarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class _454_4Sum_II {
	
	 public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		  int res = 0;
		  HashMap<Integer,Integer> map = new HashMap();
		  
		  for(int i = 0 ; i < nums1.length ; i++) {
			  for(int j = 0 ; j < nums2.length ; j++) {
				  int key = nums1[i] + nums2[j];
				  if(map.containsKey(key)) map.put(key, map.get(key) + 1);
				  else map.put(key, 1);
			  }
		  }
		  
		  for(int i = 0 ; i < nums3.length ; i++) {
			  for(int j = 0 ; j < nums4.length ; j++) {
				  res += map.getOrDefault(-(nums3[i] + nums4[j]),0);
			  }
		  }
		  
		  return res;
		 
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_454_4Sum_II ob = new _454_4Sum_II();
		int[] nums1 = {1,2};
		int[] nums2 = {-2,-1};
		int[] nums3 = {-1,2};
		int[] nums4 = {0,2};
		
		System.out.println(ob.fourSumCount(nums1, nums2, nums3, nums4));
		
		char[] ch = new char[3];
		

	}

}
