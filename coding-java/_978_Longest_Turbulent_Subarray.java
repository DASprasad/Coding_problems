package progarm;

public class _978_Longest_Turbulent_Subarray {
	
	public int maxTurbulenceSize(int[] arr) {
	       int res = 1;
	       if(arr.length == 1) return 1;
	       if(arr.length == 2) return arr[0] == arr[1] ? 1 : 2;
	       int count = arr[0] == arr[1] ? 1 : 2;
	       res = Math.max(res, count);
	       Boolean[] dp = new Boolean[arr.length]; 
	       if(arr[1] > arr[0]) dp[1] = true;
	       else if(arr[1] < arr[0]) dp[1] = false;
	       
	       for(int i = 2; i < arr.length ; i++) {
	    	   if(arr[i] > arr[i - 1] && (dp[i - 1] == null || dp[i - 1] == false)){
	    		   count += 1; dp[i] = true;
	    	   }
	    	   else if(arr[i] < arr[i - 1] && (dp[i - 1] == null || dp[i - 1] == true)){
	    		   count += 1; dp[i] = false;
	    	   }
	    	   else {
	    		   if(arr[i] == arr[i - 1]) {
	    			   count = 1; continue;
	    		   }
	    		   else if(arr[i] > arr[i - 1]) {
	    			   count = 2 ; dp[i] = true;
	    		   }
	    		   else {
	    			   count = 2; dp[i] = false;
	    		   }
	    		   
	    	   }
	    	   
	    	   res = Math.max(res, count);
	       }
	       
	       return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_978_Longest_Turbulent_Subarray ob = new _978_Longest_Turbulent_Subarray();
		
		int[] arr = {9,4,2,10,7,8,8,1,9};
		System.out.println(ob.maxTurbulenceSize(arr));

	}

}
