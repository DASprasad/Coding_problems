package progarm;

public class wordSearch {
	
public boolean safe(char[][] grid,int x,int y) {
		
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
		
		return true;
	}

public boolean getWord(char[][] grid,int[][] help,int row,int col,String str,String input) {
	 
	 if(safe(grid,row,col)==false || str.length()>input.length()) {
		 return false;	 
	 }
	 if(str.length()!=0 && str.charAt(str.length()-1)!=input.charAt(str.length()-1)) {
		 return false;
	 }
	 if(str.equals(input)) {
		 return true;
	 }
	 if(help[row][col]==1) {
		 return false;
	 }
	 
	    help[row][col]=1;
	    str=str+String.valueOf(grid[row][col]);
		boolean m=getWord(grid,help,row+1,col,str,input);
		boolean n=getWord(grid,help,row,col+1,str,input);
		boolean o=getWord(grid,help,row-1,col,str,input);
		boolean p=getWord(grid,help,row,col-1,str,input);
	 
	 if(m==false && n==false && o==false && p==false) {//o==false && p==false
		 help[row][col]=0;
		 return false;
	 }
	 else 
	 {
	 return true;
	 }
}
public boolean find(char[][] grid,String input) {
	int[][] help=new int[grid.length][grid.length];
	for(int i=0;i<grid.length;i++) {
		for(int j=0;j<grid[i].length;j++) {
			String str="";
			if(getWord(grid,help,i,j,str,input)) {
				return true;
			}
		}
	}
	return false;
}
	public static void main(String[] args) {
		wordSearch ob = new wordSearch();
		char[][] grid={{'a','b','c','d','e'},{'f','g','h','i','j'},{'k','l','m','n','o'},{'p','q','r','s','t'},{'u','v','w','x','y'}};
        System.out.println(ob.find(grid, "ghinmlqrm"));
	}

}
