package progarm;
import java.util.*;
public class _994_Rotting_Oranges {
	
 //add all the rotten oranges pos in souce and start BFS from there 
	     public int orangesRotting(int[][] grid) {
		   int m = grid.length , n = grid[0].length;
	        Queue<int[]> q = new LinkedList<>();
	        
	        int[][] dir = {{1 , 0},{0 , 1},{-1, 0}, {0 , -1}};
//	        boolean[][] visited = new boolean[m][n];
	        for(int i = 0; i < m ; i++) {
	        	for(int j = 0 ; j < n ; j++) {
	        		if(grid[i][j] == 2) q.add(new int[] {i , j});
	        	}
	        }
	         
	        int time = 0;
	        while(q.size() > 0) {
	        	int size = q.size();
	        	for(int i = 0 ; i < size; i++) {
	        		int[] pos = q.remove();
	        		
	        		for(int k = 0 ; k < dir.length ; k++) {
	        			int x = pos[0] + dir[k][0] , y = pos[1] + dir[k][1];
	        			
	        			if(x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1) {
	        				q.add(new int[] {x , y});
	        				grid[x][y] = 2;
	        			}
	        			
	        		}
	        		
	        	}
	        	time += 1;
	        }
	        
	        for(int i = 0; i < m ; i++) {
	        	for(int j = 0 ; j < n ; j++) {
	        		if(grid[i][j] == 1) return -1;
	        	}
	        }
	        
	        return time - 1 < 0 ? 0 : time - 1;
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_994_Rotting_Oranges ob = new _994_Rotting_Oranges();
		
		int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
				
		System.out.println(ob.orangesRotting(grid));
	}

}
