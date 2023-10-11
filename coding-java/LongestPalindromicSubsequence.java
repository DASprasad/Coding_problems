package progarm;

public class LongestPalindromicSubsequence {
	
	
	    public int Longest(String str,int left,int right,Integer[][] dp){
	        
	        if(left>right){
	            return 0; 
	        }
	        if(left==right) {
	        	return 1;
	        }
	        if(dp[left][right]!=null) {
	        	return dp[left][right];
	        }
	        if(str.charAt(left)==str.charAt(right))
	        {
	        return dp[left][right]=2+ Longest(str,left+1,right-1,dp);
	        }
	        else
	        {
	         int a=   Longest(str,left,right-1,dp);
	         int b=   Longest(str,left+1,right,dp);
	         return dp[left][right]=Math.max(a,b);
	        }
	      
	    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubsequence ob= new LongestPalindromicSubsequence();
		String str="bbbabegsfhjshedgdgddshshshscdgscgdvhwdhwv";
		
		int left=0;
		int right=str.length()-1;
		Integer[][] dp=new Integer[str.length()][str.length()];
		System.out.println(ob.Longest(str,left,right,dp));
	}
}


