package progarm;
import java.util.*;
public class _1851_Minimum_Interval_to_Include_Each_Query {
	
	// we are going to use priority queue cleverly here
	// first we sort intervals by strating value
	// -->create a new list and sort it by query values so that we get indexes in ascending order accoring to the querry array

	// we get each query and increment out i while query is >= start value intervals so that we get the lower
	// bound for a query . mean while we are pusing the values into heap int form of [end - start , end]
	// and it is sorted in the order of end - start value. at index 1 we are storing end value which will be used in next loop

	// now to get the upper bound of each querry we again strat polling the heap while our query greater 
	// than the end value .
	    
	// this is a compplicated solution and there is no easy way out of it

	// another explanation :
	// Here we sort queries by their position and intervals by their left point. Then we process queries in the increasing order, and maintain a set of intervals that can potentially overlap with each query. Intervals in that set are ordered by the interval size.

	// For each query, we first add overlapping intervals (left <= query) to our set. Then, we pick the first interval from the set (smallest, as intervals are sorted by their size in the set).

	// However, we need to check if the smallest interval still overlaps with our query. We use the second value in our set (right) to check and remove intervals that no longer overlap.

	public int[] minInterval(int[][] intervals, int[] queries) {
		
	    Arrays.sort(intervals ,(a , b) -> a[0] - b[0]); //sort with initial value
    
        List<Integer> sortedIndexList = new ArrayList<>();
    
        for (int i = 0; i < queries.length; i++) sortedIndexList.add(i);
    
        Collections.sort(sortedIndexList, (a, b)->(queries[a] - queries[b]));
    
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->(a[0] - b[0]));
   
    int i = 0;
    int[] res = new int[queries.length];
   
    
    for (int j = 0; j < queries.length; j++) {
    	
    	int query = queries[sortedIndexList.get(j)];
    	
    	while(i < intervals.length && query >= intervals[i][0]) {
    		
    		int diff = intervals[i][1] - intervals[i][0] + 1;
    		
    		int[] arr = {diff , intervals[i][1]};
    		pq.add(arr);
    		
    		i++;
    	}
   
    	  while(pq.size() > 0 && query > pq.peek()[1]) {  
    		     pq.poll(); 
    		}
    	 
    		if(pq.size() == 0) res[sortedIndexList.get(j)] = -1;
    		
    		else res[sortedIndexList.get(j)] = pq.peek()[0];
    	}
    	
    
    
      return res;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1851_Minimum_Interval_to_Include_Each_Query ob =new _1851_Minimum_Interval_to_Include_Each_Query();
		int[][] intervals = {{1,10},{2,5},{3,19},{4,24}};
		int queries[] = {6 , 3 , 9, 10};
		
		System.out.println(Arrays.toString(ob.minInterval(intervals, queries)));

	}

}
