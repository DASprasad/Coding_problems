package progarm;
import java.util.*;
public class _743_Network_Delay_Time {
	
	class Solution {
	    public int networkDelayTime(int[][] times, int n, int k) {   /// djikstra's algorithm
	        HashMap<Integer , HashMap<Integer , Integer>> map = new HashMap();
	        
	        for(int i = 0; i < times.length ; i++){  //prepare adjancent list with hashmap
	            int u = times[i][0] , v = times[i][1] , wt = times[i][2];
	            if(map.containsKey(u)){
	                map.get(u).put(v , wt);
	            }
	            else{
	                map.put(u , new HashMap<Integer , Integer>());
	                map.get(u).put(v , wt);
	            }
	        }
	        
	        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(n , (a , b) -> a[1] - b[1]);
	        boolean visited[] = new boolean[n + 1];
	        int res = 0;
	        pq.add(new int[]{k , 0});
	        
	        while(!pq.isEmpty()){
	            int[] cur = pq.remove();
	            int u = cur[0] , wt = cur[1]; 
	            if(visited[u]) continue;
	            visited[u] = true;
	            
	            res = wt;
	            n--;
	            if(map.containsKey(u)){
	                for(int v : map.get(u).keySet()){
	                    pq.add(new int[]{v , wt + map.get(u).get(v)});
	                }
	            }
	        }
	        
	        return n == 0 ? res : -1;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
