package progarm;
import java.util.*;
public class PacificAtlanticWaterFlow {
	public void dfs(int[][] grid,int row,int col,int prev,Boolean[][] ref) {
		if(row<0 || col<0 || row>=grid.length || col>=grid[0].length) {
			return;
		}
		
		if(ref[row][col]==null && grid[row][col]>=prev) {
		ref[row][col]=true;
		dfs(grid,row+1,col,grid[row][col],ref);
		dfs(grid,row,col+1,grid[row][col],ref);
		dfs(grid,row-1,col,grid[row][col],ref);
		dfs(grid,row,col-1,grid[row][col],ref);
		}
	}
	public List<List<Integer>> pacificAtlantic(int[][] heights){
		List<List<Integer>>A=new ArrayList<List<Integer>>();
		//from pacific
		Boolean [][] mapPacific=new Boolean[heights.length][heights[0].length];
		for(int i=0;i<heights.length;i++) {
			dfs(heights,i,0,-1,mapPacific);
		}
		for(int i=0;i<heights[0].length;i++) {
			dfs(heights,0,i,-1,mapPacific);
		}
		//for atlantic
		Boolean[][] mapAtlantic=new Boolean[heights.length][heights[0].length];
		for(int i=0;i<heights[0].length;i++) {
			dfs(heights,heights.length-1,i,-1,mapAtlantic);
		}
		for(int i=0;i<heights.length;i++) {
			dfs(heights,i,heights[0].length-1,-1,mapAtlantic);
		}
		
		for(int i=0;i<heights.length;i++) {
			for(int j=0;j<heights[0].length;j++) {
				if(mapPacific[i][j]==null || mapAtlantic[i][j]==null) {
					continue;
				}
				else{
					ArrayList<Integer> a=new ArrayList();
					a.add(i);a.add(j);
					A.add(a);
				}
			}
		}
		return A;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PacificAtlanticWaterFlow ob =new PacificAtlanticWaterFlow();
		int[][] heights= {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
		ob.pacificAtlantic(heights);

	}

}
