package progarm;

public class Rat_In_Mage {
	public boolean safe(int[][] grid,int x,int y) {
		
		if(x==grid.length) {
			return false;
		}
		if(y==grid[0].length) {
			return false;
		}
		if(x==-1) {
			return false;
		}
		if(y==-1) {
			return false;
		}
		if(grid[x][y]==0) {
			return false;
		}
		
		
		return true;
	}
 public boolean getPath(int[][] grid,int[][] ans,int row,int col) {
	 
	 if(row==grid.length-1 && col==grid.length-1) {
		 ans[row][col]=1; 
		 return true;
	 }
	 if(safe(grid,row,col)==false) {
		 return false;	 
	 }
	 if(ans[row][col]==1) {
		 return true;
	 }
	 
		ans[row][col]=1; 
		boolean m=getPath(grid,ans,row+1,col);
		boolean n=getPath(grid,ans,row,col+1);
		boolean o=getPath(grid,ans,row-1,col);
		boolean p=getPath(grid,ans,row,col-1);
	 
	 if(m==false && n==false && o==false && p==false) {//o==false && p==false
		 ans[row][col]=0;
		 return false;
	 }
	 else 
	 {
//	 ans[row][col]=1;
	 return true;
	 }
}
 

	public static void main(String[] args) {
		Rat_In_Mage ob=new Rat_In_Mage();
        int[][] grid={{1,1,1,0,0},{0,0,1,0,0},{0,1,1,0,1},{0,1,0,0,1},{0,1,1,1,1}}; 
        int[][] ans=  {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        
        ob.getPath(grid,ans,0,0);
        
        for(int i=0;i<ans.length;i++) {
        	for(int j=0;j<ans[i].length;j++) {
        		System.out.print(ans[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}