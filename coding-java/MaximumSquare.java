package progarm;

public class MaximumSquare {
	
	static int global=0;
	
	 public int checker(int row,int col,int count,int[][] pp) { //goes to top and bottom to check for same size subarrays with all ones
			int temp=count;
			int ansdown=0;
			int ansup=0;
			int r=row;
			
			while(count>=1 && row<=pp.length-1 &&  pp[row][col]>=temp) 
			{
				ansdown=ansdown+temp;
				count--;
				row++;
			}
			if(count==0) {
				return ansdown;
			}
			
			row=r-1;//stsrting from the row after that
			while(count>=1 && row>=0 &&  pp[row][col]>=temp) 
			{
				
				ansup=ansup+temp;
				count--;
				row--;
			}
			if(count==0) {
				return ansup+ansdown;
			}
			return 0;
		}
	
	
	public void preprocessing(int[][] matrix,int[][] pp) {//preprocesses with how many consecutive ones are there
		int count=0;
		for(int i=0;i<matrix.length;i++) 
		{
			for(int j=0;j<matrix[0].length;j++) 
			{
				if(matrix[i][j]==1) 
				{
					count=count+1;
					pp[i][j]=count;
				}
				else 
				{
					count=0;
					pp[i][j]=0;
				}
			}
			count=0;
		}
	}
	
	public int findMax(int[][] matrix) {
		int count=0;
		int max=0;
		int update=0;
		int[][] pp=new int[matrix.length][matrix[0].length];
		
		preprocessing(matrix,pp);

		for(int i=0;i<matrix.length;i++) 
		{
			for(int j=0;j<matrix[0].length;j++) 
			{
				
				if(matrix[i][j]==1) 
				{
					count=count+1;
				}
				else 
				{
					count=0;
				}
				if(count>update) 
				{
					int temp=checker(i,j,count,pp);
                    max=Math.max(max,temp);
					if(temp>0) {
					update=count;
					}
				}
			}
			count=0;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSquare ob=new MaximumSquare();
		int[][] matrix= {{0,0,0,0,0,1},
				         {1,1,1,1,0,1},
				         {1,1,1,1,0,1},
				         {1,1,1,1,0,1},
				         {1,1,1,1,0,0}
				         };
		System.out.println(ob.findMax(matrix));
		System.out.println(global);
	}

}
