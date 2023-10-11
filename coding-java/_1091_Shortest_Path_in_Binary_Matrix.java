package progarm;
import java.util.*;
public class _1091_Shortest_Path_in_Binary_Matrix {
	
	public int shortestPathBinaryMatrix(int[][] grid) {
		 int n = grid.length;
        if(grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1; //base case 
       
		 boolean[][] visited = new boolean[n][n];
       
		 int[][] dir = {{0 , 1},{0 , -1},{1 , 0},{-1 , 0},{1 , -1},{-1 , 1},{-1 , -1},{1 , 1}}; // all 8 directions
       
	     Queue<int[]> q = new LinkedList<>();
       
	     q.add(new int[]{0 , 0}); //adding source
       
	     visited[0][0] = true; //marking source as true
       
	     int ans = 0;
	     
	     while(!q.isEmpty()) {
            int size = q.size(); //really important as it differentiates each level dont directly write i < q.size() in for loop
	    	 for(int i = 0; i < size; i++) {
	    	      int pos[] = q.poll();
                
	    	     if(pos[0] == n - 1 && pos[1] == n - 1) return ans + 1;
	
	    	     for(int j = 0 ; j < dir.length ; j++) {
	    		     int x = pos[0] + dir[j][0];
	    		     int y = pos[1] + dir[j][1];
	    		 
	    		       if(x < n && y < n && x >= 0 && y >= 0 && !visited[x][y] && grid[x][y] == 0) {
                          q.add(new int[] {x , y});
	    			       visited[x][y] = true;
	    		      }
	    	     }
	    	}
	    	 ans += 1;
	     }
	     
	     return -1;
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1091_Shortest_Path_in_Binary_Matrix ob = new _1091_Shortest_Path_in_Binary_Matrix();
		
		int[][] grid = {{0,0,0},{0,0,0},{0,0,0}};
		System.out.println(ob.shortestPathBinaryMatrix(grid));

	}

}
