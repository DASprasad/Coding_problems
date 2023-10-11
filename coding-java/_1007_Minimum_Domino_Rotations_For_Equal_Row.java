package progarm;

public class _1007_Minimum_Domino_Rotations_For_Equal_Row {
	
     public int minDominoRotations(int[] tops, int[] bottoms) {
    	 int res = 0;
    	 boolean topflag = true , bottomflag = true;
    	 int top = tops[0] ; int bottom = bottoms[0];
    	 int topSwaps = 0; int bottomSwaps = 0;
    	 
    	 for(int i = 0 ; i < tops.length ; i++) {
    		 
    		 
    			 if((tops[i] != top && bottoms[i] != top)) topflag = false;
    			 if(tops[i] != bottom && bottoms[i] != bottom) bottomflag = false;
    			 
    			 if((topflag || bottomflag) == false) return -1;
    			
    			 
    			 if(tops[i] != top ) topSwaps += 1;
    			 
    			 if(bottoms[i]!=bottom) bottomSwaps += 1;
    			 
    		 
    	 }
    	 
    	 
     return Math.min(topSwaps, bottomSwaps);   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1007_Minimum_Domino_Rotations_For_Equal_Row ob = new _1007_Minimum_Domino_Rotations_For_Equal_Row();
		
		int[] tops =   {2,1,2,4,2,2};
		int[] bottom = {5,2,6,2,3,2};
		
		System.out.println(ob.minDominoRotations(tops, bottom));

	}

}
