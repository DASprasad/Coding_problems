package progarm;

public class PalindromePartitioning {
	public boolean isPalindrome(int i,int j,String str) {
		
		while(i<=j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}
  public int partition(String str,int i,int j,int[][] dp) {
        
        if(dp[i][j]!=-2){
            return dp[i][j];
        }
    	
    	if(i >= j || isPalindrome(i,j,str)) {
    		return dp[i][j]=0;
    	}
        
    	int local=Integer.MAX_VALUE;
        int m=0;
    	for(int k=i;k<j;k++) {
    		
            if(isPalindrome(i,k,str))
            {
    	    m=1+partition(str,k+1,j,dp);
            }
    		if(m<local)
    		{
    			local=m;
    		}
    	}
    	return dp[i][j]=local;
    }
	 
	public static void main(String[] args) {
		PalindromePartitioning ob = new PalindromePartitioning();
		String str="aaaaa";
		int m=0;
		int n=str.length()-1;
		int[][] dp=new int[str.length()][str.length()];
        for(int i=0;i<str.length();i++){
           for(int j=0;j<str.length();j++){
               dp[i][j]=-2;
           }
        }
//		int dp[i][j]
		System.out.println(ob.partition(str, m, n,dp));
//		System.out.println(ob.isPalindrome(i, j, str));

	}

}
