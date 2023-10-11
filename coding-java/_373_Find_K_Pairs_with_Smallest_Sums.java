package progarm;
import java.util.*;
public class _373_Find_K_Pairs_with_Smallest_Sums {
	
	public int comp(int[] a , int[] b ,int[] nums1 , int[] nums2) {
		
		if(nums1[a[0]] + nums2[a[1]] > nums1[b[0]] + nums2[b[1]]){
			return 1;
		}
		return -1;
	}
	
	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(nums1.length , (a, b) -> comp(a , b ,nums1 , nums2) );
        
        for(int i = 0 ; i < nums1.length ; i++) {
        	int[] arr = {i , 0}; minHeap.add(arr);	
        }
        
        while(minHeap.size() > 0  && k > 0) {
        	int[] arr = minHeap.poll();
        	
        	List<Integer> temp = new ArrayList();  temp.add(nums1[arr[0]]); temp.add(nums2[arr[1]]);
        	
        	res.add(temp);
        	
        	arr[1] = arr[1] + 1;
        	
        	if(arr[1] < nums2.length) minHeap.add(arr);
        	
        	k--;
        }
        
        return res;
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubnt
		
		 _373_Find_K_Pairs_with_Smallest_Sums ob = new  _373_Find_K_Pairs_with_Smallest_Sums();
		 
		 int[] nums1 = {1,1,2};
		 int[] nums2 = {1,2,3};
		 int k = 9;
		 
		 System.out.println(ob.kSmallestPairs(nums1, nums2, k));
		
		

	}

}
