package progarm;
import java.util.*;
public class RussianDollEnvelopes { 
	static int global=0;
	
	 public int longestIncreasing(int[][] envelopes,Integer[] dp,int n){
		 global=global+1;
	        if(n>=envelopes.length){
	            return 0;
	        }
	        if(dp[n]!=null){
	            return dp[n];
	        }
	        int local=0;
	        for(int i=n+1;i<envelopes.length;i++){
	            if(envelopes[i][0]>envelopes[n][0]  && envelopes[i][1]>envelopes[n][1]){
	                int temp=1+longestIncreasing(envelopes,dp,i);
	                if(temp>local){
	                    local=temp;
	                }
	            }
	        }
	        return dp[n]=local;
	    }
	 public int maxEnvelopes(int[][] envelopes) {
	        Arrays.sort(envelopes,(a,b)->a[1]-b[1]);
	        Integer[] dp=new Integer[envelopes.length+1];
	        int max=1;
	        for(int i=0;i<envelopes.length;i++){
	            int temp=longestIncreasing(envelopes,dp,i)+1;
	            max=Math.max(max,temp);
	        }
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RussianDollEnvelopes ob = new RussianDollEnvelopes();
		
		int[][] arr= {{5,6},{5,4},{1,2},{4,5},{7,8},{4,9},{6,8},{8,9},{3,6},{10,9}};
		System.out.println(ob.maxEnvelopes(arr));
		System.out.println(global);

	}

}
