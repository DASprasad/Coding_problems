package progarm;

public class IlluminateWholeRoad {
   public int countZeros(int[][] grid) {
	   int count=0;
	   for(int row=0;row<grid.length;row++) {
		   for(int col=0;col<grid[0].length;col++) {
			   if(grid[row][col]==0) {
				   count++;
			   }
		   }
	   }
	   return count;
   }
   
   public boolean safe(int[][] grid,int x,int y) {
		
		if(x==grid.length) {
			return false;
		}
		if(y==grid[0].length) {
			return false;
		}
		if(x<=-1) {
			return false;
		}
		if(y<=-1) {
			return false;
		}
		return true;
	}
   public int traverse(int[][] grid ,int row,int col,int count){
	  if(safe(grid,row,col)==false) {
		  return 0;
	  }
	  if(grid[row][col]==9) {
		  return 0;
	  }
	  if(grid[row][col]==-1) {
		  return 0;
	  }
	  if(grid[row][col]==2 && count!=0) {
		  return 0;
	  }
	  if(grid[row][col]==2 && count==0) {
		  return 1;
	  }
	  grid[row][col]=9;
	  
	  int down=traverse(grid,row+1,col,count-1);
	  int left=traverse(grid,row,col-1,count-1);
	  int up=traverse(grid,row-1,col,count-1);
	  int right=traverse(grid,row,col+1,count-1);
	  grid[row][col]=0;
	  return up+down+left+right;
   }
	public static void main(String[] args) {
		IlluminateWholeRoad ob = new IlluminateWholeRoad();
        int[][] grid= {{1,0,0,0},{0,0,2,0},{-1,-1,0,-1}};
        int row=0;int col=0;
        int count=(ob.countZeros(grid));
//        System.out.println(count);
        System.out.println(ob.traverse(grid, row, col, count+1));
	}

}
