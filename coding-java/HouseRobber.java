package progarm;

import java.util.Arrays;

public class HouseRobber {
	static int global=0; 
	public int steal(int[] arr,int n,int[] dp) {
		global=global+1;
		if(n>=arr.length) {
			
			return 0;
		}
		if(dp[n]!=-2) {
			return dp[n]; 
		}
		int local=0;
		for(int i=n;i<arr.length;i++) {
			
			int temp=arr[i]+steal(arr,i+2,dp);
			if(temp>local) {
				local=temp;
			}
		}
		return dp[n]=local;
	}
	public int topBottom(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int[] dp=new int[arr.length+1];
		int max=0;
		max=Math.max(arr[0], arr[1]);
		dp[1]=arr[0];
		dp[2]=arr[1];
		for(int i=2;i<dp.length;i++) {
			dp[i]=Math.max(dp[i-1], arr[i-1]+dp[i-2]);
			max=Math.max(max, dp[i]);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HouseRobber ob=new HouseRobber();
         String str="";
         int[] arr= {2,1,2,3,4,3,4,3,2,4};
         int[] dp=new int[arr.length];
         for(int i=0;i<dp.length;i++) {
        	 dp[i]=-2;
         }
//         System.out.println(ob.steal(arr,0,dp));
//         System.out.println(global);
//         System.out.println(ob.topBottom(arr));
       
         
         
         int[][] array= {{1,2},{4,5}};
         Arrays.sort(array,(a,b)->a[0]-b[0]);
         System.out.println(Arrays.toString(array));
         
	}

}
