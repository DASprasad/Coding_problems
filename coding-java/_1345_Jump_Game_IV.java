package progarm;
import java.util.*;
public class _1345_Jump_Game_IV {
	
	 public int minJumps(int[] arr) {
	        HashMap<Integer , HashSet<Integer>> location = new HashMap();
	        HashMap<Integer , HashSet<Integer>> map = new HashMap();
	        
	        for(int i = 0 ; i < arr.length ; i++){
	            if(location.containsKey(arr[i])){
	            	location.get(arr[i]).add(i);
	            }
	            else{
	                HashSet<Integer> set = new HashSet();
	                set.add(i);
	                location.put(arr[i] , set);
	            }
	        }
	        
	        for(int i = 0 ; i < arr.length ; i++){
	            HashSet<Integer> set = new HashSet(location.get(arr[i]));
	            set.remove(i);
	            if(i != 0) set.add(i - 1);
	            if(i != arr.length - 1) set.add(i + 1);
	            
	            map.put(i , set);
	        }
	        
	         //BFS part
	        int steps = 1;
	        Queue<Integer> bfs = new LinkedList();
	        boolean[] visited = new boolean[arr.length];
	        bfs.add(0); visited[0] = true;
	        
	        while(!bfs.isEmpty()){
	        	int size = bfs.size();
	        	 
	        	for(int i = 0 ; i < size ; i++) {
	        		int u = bfs.remove();
		            HashSet<Integer> destinations = map.get(u);
		           
		            
		            for(int v : destinations){
		                if(v == arr.length - 1) return steps;
		                if(!visited[v]){
		                    bfs.add(v);
		                    visited[v] = true;
		                }
		            }
	             }
	        	 steps += 1;
	        }
	        
	        return steps;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1345_Jump_Game_IV ob = new _1345_Jump_Game_IV();
		int[] arr = {100,-23,-23,404,100,23,23,23,3,404};
		System.out.println(ob.minJumps(arr));

	}

}
