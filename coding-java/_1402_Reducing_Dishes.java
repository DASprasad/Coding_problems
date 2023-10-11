package progarm;

import java.util.Arrays;

public class _1402_Reducing_Dishes {
	
   public int maxSatisfaction(int[] satisfaction) {
	   Arrays.sort(satisfaction);
	   int n = satisfaction.length;
	   int cur_Sum = 0;
	   int total_Sum = 0;
	   int res = 0;
	   
	   for(int i = n - 1 ; i >= 0 ; i--) {
		   cur_Sum = cur_Sum + total_Sum + satisfaction[i];
		   total_Sum = total_Sum + satisfaction[i];
		   
		   res = Math.max(cur_Sum, res);
	   }
	   
	   return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
