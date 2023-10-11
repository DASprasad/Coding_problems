package progarm;

public class DungeonGame {
	
public boolean isSafe(int[][] grid,int x,int y) {
		
		if(x==grid.length) {
			return false;
		}
		if(y==grid[0].length) {
			return false;
		}
		return true;
	}

   public int Dungeon(int[][] grid,int row,int col,Integer[][] dp) {
	   if(row==grid.length-1 && col==grid[0].length-1) {
		   return grid[row][col];
	   }
	   
	   if(isSafe(grid,row,col)==false) {
		   return Integer.MIN_VALUE+10000;
	   }
	   if(dp[row][col]!=null) {
		   return dp[row][col];
	   }
	   
	  int a= Dungeon(grid,row+1,col,dp);
	  int b= Dungeon(grid,row,col+1,dp);
      if(a>0 && grid[row][col]<0) {
    	  a=grid[row][col];
      }else {
    	  a=a+grid[row][col];
      }
      if(b>0 && grid[row][col]<0) {
    	  b=grid[row][col];
      }else {
    	  b=b+grid[row][col]; 
      }
      
	  int min=Math.max(a, b); //when both value a and b is negetive then max is always taken
	  if(min<=0) {
	  return dp[row][col]=min;
	  }
	  else {
	   return dp[row][col]=0;
	  }
	  
   }
	public static void main(String[] args) {
		DungeonGame ob = new DungeonGame();
		int[][] grid= {{-1},{-2},{-3},{0},{5}};
//			            {{-2 , -3  ,3},
//			           {-5 ,-10   ,1},
//			           {10 , 30  ,-5}};
		Integer dp[][]=new Integer[grid.length][grid[0].length];
        int ans=ob.Dungeon(grid, 0, 0, dp);
        if(ans>0) {
        	System.out.println(1);
        }else {
        System.out.println(Math.abs(ans)+1);
        }
        
        
        for(int i=0;i<dp.length;i++) {
        	for(int j=0;j<dp[0].length;j++) {
        		System.out.print(dp[i][j]+"  ");
        	}
        	System.out.println();
        }
	}

}
