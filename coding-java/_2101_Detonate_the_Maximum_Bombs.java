package progarm;

import java.util.Arrays;

public class _2101_Detonate_the_Maximum_Bombs {
	
      public int maximumDetonation(int[][] bombs) {
    	  
    	  Arrays.sort(bombs ,(a , b) -> a[2] - b[2]);
    	  int[] dp = new int[bombs.length]; dp[0] = 1;
    	  
    	  int max = 1;
    	  int res = 1;
    	  
    	  for(int i = 1 ; i < bombs.length ; i++) {
    		  
    		  int x1=bombs[i][0] , y1=bombs[i][1] , r1=bombs[i][2];
    		  
    		  for(int j = 0 ; j < i ; j ++) {
    			  
    			
    		    int x2=bombs[j][0] , y2=bombs[j][1],  r2=bombs[j][2];
    		    
    		    if(r1 >= Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) ) {
    		    	max = Math.max(max, dp[j] + 1);
    		    }
    			  
    		  }
    		  dp[i] = max; max = 1;
    		  res = Math.max(res, dp[i]);
    	  }
    	  
    	  return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2101_Detonate_the_Maximum_Bombs ob = new _2101_Detonate_the_Maximum_Bombs();
		
		int[][] bombs = {{1,2,3},{2,3,1},{3,4,2},{4,5,3},{5,6,4}};
		
		System.out.println(ob.maximumDetonation(bombs));

	}

}
