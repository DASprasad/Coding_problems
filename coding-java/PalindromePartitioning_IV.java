package progarm;

public class PalindromePartitioning_IV {
	static boolean flag=false;
	 static int global=0;
	    
	 public void quickLookup(String str,int left,int right,Boolean[][]lookUp){
	        while(left>=0 && right<=str.length()-1 && str.charAt(left)==str.charAt(right) ) {
	    		lookUp[left][right]=true;
	    		left--;
	    		right++;
	    	}
	    	
	    }
	     public boolean check(String str,int n,int count,Boolean[][] dp,Boolean[][] lookUp){
		    	
		    	if(flag==true){ return true; }
		           
		        if(count>3){ return false; }
		           
		        if(n>=str.length() && count==3 ){  flag=true; return true; }
		        
		        if(dp[n][count]!=null && dp[n][count]==false){  return false; }
		            
		        boolean local=false;
		        
		        for(int i=n; i<str.length();i++)
		        {
		            if(lookUp[n][i]!=null)
		            {
		                check(str,i+1,count+1,dp,lookUp);
		            }
		        }
		        return dp[n][count]=local || flag;
		    }
	    public boolean checkPartitioning(String s) {
	       Boolean[][] dp = new Boolean[s.length()+1][s.length()+1];
	       Boolean[][] lookUp = new Boolean[s.length()+1][s.length()+1]; 
	        for(int i=0;i<s.length();i++) {
	    	         quickLookup(s,i,i,lookUp);
	    		     quickLookup(s,i,i+1,lookUp);
	        }
	        
	        return check(s,0,0,dp,lookUp);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePartitioning_IV ob = new PalindromePartitioning_IV();
		String s="bbab" ;
		
        System.out.println(ob.checkPartitioning(s));

	}

}
