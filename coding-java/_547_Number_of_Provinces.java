package progarm;
import java.util.*;
public class _547_Number_of_Provinces {
	
	public int find(int[] uf , int node) {
		if(uf[node] == node) return node;
		
		int parent = find(uf , uf[node]);
		
		return uf[node] = parent;
		
	}
	
	public void union(int x , int y , int[] uf) {
		int leaderx = find(uf , x);
		int leadery = find(uf , y);
		
		uf[leaderx] = leadery;
	}
	
	 public int findCircleNum(int[][] isConnected) {
		    int n = isConnected.length;
	        int[] uf = new int[n + 1];
	        
	        for(int i = 1 ; i <= n ; i++) uf[i] = i;
	        
	        for(int row = 0 ; row < n ; row ++) {
	        	for(int col = 0; col < n ; col++) {
	        		if(isConnected[row][col] == 1)
	        		     union(row + 1 , col + 1 , uf);
	        	}
	        }
	        
	        HashSet<Integer> count = new HashSet();  
	        for(int i = 1 ; i < uf.length ; i++) count.add(find(uf , uf[i]));
	        
	        return count.size();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _547_Number_of_Provinces ob = new  _547_Number_of_Provinces();
		 int[][] arr = {{1,1,0},{1,1,0},{0,0,1}};
		 
		 System.out.println(ob.findCircleNum(arr));
	}

}
