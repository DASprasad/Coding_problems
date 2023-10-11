package progarm;

public class _845_Longest_Mountain_in_Array {
	
	 public int longestMountain(int[] arr) {
		   int ans=0;
	       int[] dp=new int[arr.length];
	       
	       dp[0]=1;
	       
	       for(int i=1;i<arr.length;i++) {
	    	   if(arr[i]>arr[i-1]) {
	    		   dp[i]=dp[i-1]+1;
	    	   }
	    	   else {
	    		   dp[i]=1;
	    	   }
	       }
	       int len=0;
	       for(int i=arr.length-2;i>=0;i--) {
	    	   if(arr[i]>arr[i+1]) {
	    		  len+=1;
	    		  if(dp[i]>1) {
	    			ans=Math.max(ans, dp[i]+len);  
	    		  }
	    	   }
	    	   else {
	    		   len=0;
	    	   }
	       }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 _845_Longest_Mountain_in_Array ob=new  _845_Longest_Mountain_in_Array();
		 int[] nums= {2,1,4,7,5,7,3,2,5};
		 System.out.println(ob.longestMountain(nums));

	}

}
