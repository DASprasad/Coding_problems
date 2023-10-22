package progarm;
import java.util.*;
public class _1691_Maximum_Height_by_Stacking_Cuboids {
	
	 public int maxHeight(int[][] cuboids) {
		 
//		 grredily sort each array in cuboids
		 
		 for(int i = 0 ; i < cuboids.length ; i++) Arrays.sort(cuboids[i]);
		 
		 //now sort whole array in ascending order of box sizes
		 
		 Arrays.sort(cuboids ,new Comparator<int[]>() {
			 public int compare(int[] a , int[] b) {
				 if(a[0] != b[0]) return a[0] - b[0];
				 else if(a[1] != b[1]) return a[1] - b[1];
				 else return a[2] - b[2];
			 }

		 });

		 // howdi
		 
	//now it is just simple LIS algorithm
		 int[] dp = new int [cuboids.length]; dp[0] = cuboids[0][2];
		 int res = dp[0];
		 
		 for(int  i = 1 ; i < cuboids.length ; i++ ) {

			 dp[i] = cuboids[i][2];
			 
			 for(int j = 0 ; j < i ; j++) {
				 
				 if(cuboids[j][0] <= cuboids[i][0] && cuboids[j][1] <= cuboids[i][1] && cuboids[j][2] <= cuboids[i][2]) {
					 dp[i]= Math.max(dp[i], cuboids[i][2] + dp[j]);
				 }
			 }
			 
			res = Math.max(res, dp[i]);
		 }
		 
		 return res;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1691_Maximum_Height_by_Stacking_Cuboids ob = new _1691_Maximum_Height_by_Stacking_Cuboids();
		
		int[][] cuboids = {{35,32,11},{7,6,65},{3,39,41}};
		
		System.out.println(ob.maxHeight(cuboids));

	}

}
