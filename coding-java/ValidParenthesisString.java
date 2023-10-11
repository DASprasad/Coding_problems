package progarm;

public class ValidParenthesisString {
	static int global=0; 
	static boolean flag=false;
     public boolean checkValid(String str,int n,int balance,boolean[][] dp) {
    	 global=global+1;
    	 if(flag==true) {
    		 return true;
    	 }
    	 if(n>=str.length() && balance==0) {
    		 flag=true;
    		 return true;
    	 }
    	 if(dp[n][str.length()+balance]!=true) {
    		 return dp[n][str.length()+balance];
    	 }
    	 if(n>=str.length() || balance<0) {
    		 return false;
    	 }
    	 if(str.charAt(n)=='*') {
    		 
    		 boolean a=checkValid(str,n+1,balance+1,dp);
    		 boolean b=checkValid(str,n+1,balance-1,dp);
    		 boolean c=checkValid(str,n+1,balance,dp);
    		 return dp[n][str.length()+balance]=(a && b && c);
    	 }
    	 else {
    		 if(str.charAt(n)=='(') {
    			 return dp[n][str.length()+balance]=checkValid(str,n+1,balance+1,dp);
    		 }else {
    			 return dp[n][str.length()+balance]=checkValid(str,n+1,balance-1,dp); 
    		 }
    	 }
     }
	public static void main(String[] args) {
		ValidParenthesisString ob =new ValidParenthesisString();
		String str="*******************))))))))))))))))))))))";
		boolean[][] dp=new boolean[str.length()+1][2*str.length()+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp.length;j++) {
				dp[i][j]=true;
			}
		}
		ob.checkValid(str, 0, 0,dp);
        System.out.println(flag); 
        System.out.println(global);
	}

}
