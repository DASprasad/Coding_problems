package progarm;

import java.util.Arrays;
import java.util.*;
public class _2054_Two_Best_Non_Overlapping_Events {
	
	 public int maxTwoEvents(int[][] events) {
//		 sort it to intial value if it is same sort it with end value;
	        Arrays.sort(events , (a , b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
	        
//	        sort heap in increasing order for end value
	        PriorityQueue <int[]> minHeap = new PriorityQueue<int[]>(events.length , (a , b)->a[0] - b[0]);
	        
	        int max  = 0; int res = 0;
	        for(int i = 0 ; i < events.length ; i++) {
	        	int start = events[i][0] ;
	        	
	        	while(minHeap.size() > 0) {
	        		
	        		if(minHeap.peek()[0] >= start) break;
	        		
	        		max = Math.max(max, minHeap.poll()[1]);
	        	}
	        	
	        	res = Math.max(res, events[i][2] + max);
	        	minHeap.add(new int[] {events[i][1], events[i][2]});
	        	
	        }
	        
	        return res;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
