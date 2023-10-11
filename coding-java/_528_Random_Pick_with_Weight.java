package progarm;

import java.util.Arrays;

public class _528_Random_Pick_with_Weight {
	int[][] range;
	int weight[];
	int total;   // total cumulative sum
	
	   public _528_Random_Pick_with_Weight(int[] w) {  //constuctor
		    this.weight = w;
	        range = new int[w.length][2];
	        
	        range[0][0] = 1 ; range[0][1] = w[0];
	        int[] cumSum = new int[w.length]; cumSum[0] = w[0];
	        
	        for(int i = 1 ; i < w.length ; i++) {
	        	
	        	cumSum[i] = w[i] + cumSum[i - 1];
	        	
	        	range[i][0] = cumSum[i - 1] + 1 ; range[i][1] = cumSum[i];
	        }
	        
	        total = cumSum[cumSum.length - 1]; //get the total sum as we will use it generate random number
	    }
	   
	   public int getRandomNumber(int min, int max) { //get rendom number with java library function
		    return (int) ((Math.random() * (max - min)) + min);
		 }
	   
//we can do linear search to find range but binary search is much better	   
	   public int BinarySearch(int[][] range , int n) {
		   int low = 0; int high = range.length - 1;
		   
		   while(low <= high) {
			  int mid = ( low + high )/ 2;
			  if(n < range[mid][0]) high = mid - 1;
			  else if(n > range[mid][1]) low = mid + 1;
			  else   return mid;
		   }
		   
		   return -1; 
	   }
	    
	    public int pickIndex() {
	       int n = getRandomNumber(1 , total + 1);

	       
	       int mid = BinarySearch(range , n);
	       
	       return mid;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] w = {2,3,4,5};
		_528_Random_Pick_with_Weight ob = new _528_Random_Pick_with_Weight(w);
		
		System.out.println(ob.pickIndex());
		System.out.println(ob.pickIndex());
		System.out.println(ob.pickIndex());
		System.out.println(ob.pickIndex());
		System.out.println(ob.pickIndex());
		System.out.println(ob.pickIndex());
		System.out.println(ob.pickIndex());
		System.out.println(ob.pickIndex());
		

	}

}
