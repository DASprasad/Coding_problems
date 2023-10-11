package progarm;
import java.util.*;
public class _347_Top_K_Frequent_Elements {

	 public int[] topKFrequent(int[] nums, int k) {
	        int[] ans=new int[k];
	        Map<Integer,Integer>map=new TreeMap();
	        List<Integer>[] sorted = new List[nums.length + 1];
	        
	        // count frequency of each element in map
	        for(int i=0;i<nums.length;i++) {
	        	if(map.containsKey(nums[i])) {
	        		map.put(nums[i], map.get(nums[i])+1);
	        	}
	        	else {
	        		map.put(nums[i], 1);
	        	}
	        }

	        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
	        	int key=entry.getKey();
	        	int freq=entry.getValue();
	        	if(sorted[freq]==null) {
	        		sorted[freq]=new ArrayList();
	        	}
	        	sorted[freq].add(key);
	        }
	        
	        
	     int count=0;
	        for(int i=sorted.length-1;i>=0;i--) {
	        	if(count==k) break;
	        	if(sorted[i]==null) continue;
	        	for(int j=0;j<sorted[i].size();j++) {
	        		ans[count++]=sorted[i].get(j);
	        		if(count==k) {
	        			break;
	        		}
	        	}
	        }
	        return ans;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_347_Top_K_Frequent_Elements ob=new _347_Top_K_Frequent_Elements();
		
		int[] nums= {1,1,2,3,4,5};
		System.out.println(Arrays.toString(ob.topKFrequent(nums, 5)));

	}

}
