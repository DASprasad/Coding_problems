package progarm;

import java.util.Scanner;

public class MineSweeper {
	
	public void print(int[][] preProssesed) {
      for (int i=0;i<preProssesed.length;i++) {
          System.out.println();

    for(int j=0;j<preProssesed[i].length;j++) {
	       System.out.print(preProssesed[i][j]  + "   ");
      }
          System.out.println();

   }
	}
	public int[][] preProssesing (int[][] input ) {
		
		int [][] result = new int [6][6];
		
		for (int i=0;i<input.length;i++) {
			//System.out.println();
			
			for(int j=0;j<input[i].length;j++) {
				//System.out.print(input[i][j]  + ",");
				int count = 0;
				if (i==0) {
					if (input[i+1][j]==1) {
						count=count+1;
					}
				}
				if(j==0) {
					if (input[i][j+1]==1) {
						count=count+1;
					}
				}
				if(i==0 && j==0) {
					if (input[i+1][j+1]==1) {
						count=count+1;
					}
				}
				if(i==input.length-1) {
					if (input[i-1][j]==1) {
						count=count+1;
					}
				}
				if(j==input[i].length-1) {
					if (input[i][j-1]==1) {
						count=count+1;
					}
				}
				if(i==input.length-1 && j==input[i].length-1 ) {
					if (input[i-1][j-1]==1) {
						count=count+1;
					}
				}
				if(i==0 && j==input[i].length-1 ) {
					if (input[i+1][j-1]==1) {
						count=count+1;
					}
				}
				if(i==input.length-1 && j==0 ) {
					if (input[i-1][j+1]==1) {
						count=count+1;
					}
				}
				if (i==0 && j>0 && j<input[i].length-1) {
					if (input[i+1][j+1]==1) {
						count=count+1;
					}
					if (input[i+1][j-1]==1) {
						count=count+1;
					}
				}
				if (i==input.length-1 && j>0 && j<input[i].length-1) {
					if (input[i-1][j+1]==1) {
						count=count+1;
					}
					if (input[i-1][j-1]==1) {
						count=count+1;
					}
				}
				if (j==0 && i>0 && i<input.length-1) {
					if (input[i-1][j+1]==1) {
						count=count+1;
					}
					if (input[i+1][j+1]==1) {
						count=count+1;
					}
				}
				if (j==input[i].length-1 && i>0 && i<input.length-1) {
					if (input[i-1][j-1]==1) {
						count=count+1;
					}
					if (input[i+1][j-1]==1) {
						count=count+1;
					}
				}
				
				if( i>0 && j>0 && i<input.length-1 && j<input[i].length-1 ) {
					if (input[i+1][j]==1) {
						count=count+1;
					}
					if (input[i][j+1]==1) {
						count=count+1;
					}
					if (input[i+1][j+1]==1) {
						count=count+1;
					}
					if (input[i-1][j]==1) {
						count=count+1;
					}
					if (input[i][j-1]==1) {
						count=count+1;
					}
					if (input[i-1][j-1]==1) {
						count=count+1;
					}
					if (input[i-1][j+1]==1) {
						count=count+1;
					}
					if (input[i+1][j-1]==1) {
						count=count+1;
					}
					
				}
				if (input[i][j]==1) {
					count = 9;
				}
				
				result[i][j] = count;
				
				
			}
		}
		return result;
	}
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
		return true;
	}
	public int obstacle(int[][] grid,int x,int y) {

		if(grid[x][y]>=0) {
				return grid[x][y];
			}
		
		return 0;
	}
	public boolean boosh(int[][] grid,int x,int y) {
		if(grid[x][y]>=9) {
			return false;
		}
		return true;
	}
	
	
     public void reveal(int[][] grid,int[][] help ,int row,int col){
    	 
    	 if(safe(grid,row,col)==false) {
    		 return;	 
    	 }
    	if(obstacle(grid,row,col)>0) {
    		help[row][col]=grid[row][col];
    		return;
    	}
    	if(help[row][col]==-1) {
    		return;
    	}

        help[row][col]=-1;

    	reveal(grid,help,row+1,col);
    	reveal(grid,help,row,col+1);
    	reveal(grid,help,row-1,col);
    	reveal(grid,help,row,col-1);
    	reveal(grid,help,row+1,col-1);
    	reveal(grid,help,row-1,col+1);
    	reveal(grid,help,row-1,col-1);
    	reveal(grid,help,row+1,col+1);
    	
    	 if(help[row][col]==-1) 
    	 {
    		 help[row][col]=0;
    	 }
    	
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MineSweeper ob=new MineSweeper();
		int[][] question =  {{0,0,0,0,0,0,},
                             {0,1,0,0,0,0,},
                             {0,0,0,1,0,0,},
                             {0,0,0,0,1,0,},
                             {0,1,0,0,0,0,},
                             {0,0,0,0,1,0,}};

		int[][] help=new int[question.length][question.length];

        int[][] preProssesed = ob.preProssesing(question);

      ob.print(preProssesed);
      while(true) {
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      Scanner sc1=new Scanner(System.in);
      int col=sc.nextInt();
      if(ob.boosh(preProssesed , row, col)==false) {
    	  System.out.println("Dropped on bomb");
    	  break;
      }
      ob.reveal(preProssesed,help,row,col);
      ob.print(help);
      System.out.println();
      
      }
	}

}
