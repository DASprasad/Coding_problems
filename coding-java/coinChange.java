package progarm;

import java.util.Arrays;

public class coinChange {
	
	
	static int global=0;
	
	
private int coinChangeHelper(int[] coins, int index, int amount, Integer[][] dp) {
        global=global+1;
        if(amount == 0)                                                        
            return 0;
        
        if(index >= coins.length)                                              
            return Integer.MAX_VALUE-1;
        
        if(dp[index][amount] != null)                                           
            return dp[index][amount];
        
        int count1=Integer.MAX_VALUE-1, count2=Integer.MAX_VALUE-1;
        
        if(coins[index] <= amount)                                              
            count1 = 1+coinChangeHelper(coins,index,amount-coins[index],dp);
        
            count2 = coinChangeHelper(coins,index+1,amount,dp);                     
        
            dp[index][amount] = Math.min(count1,count2);                            
        return dp[index][amount];
    }



		private int coinChangeHelperr(int[] coins, int index, int amount, Integer[][] dp) {
		    
		    if(amount == 0)                                                        
		    return 0;
		
		if(index <0)                                              
		    return Integer.MAX_VALUE-1;
		
		if(dp[index][amount] != null)                                           
		    return dp[index][amount];
		
		int count1=Integer.MAX_VALUE-1, count2=Integer.MAX_VALUE-1;
		
		if(coins[index] <= amount)                                              
		    count1 = 1+coinChangeHelper(coins,index,amount-coins[index],dp);
		
		    count2 = coinChangeHelper(coins,index-1,amount,dp);                     
		
		    dp[index][amount] = Math.min(count1,count2);                            
		return dp[index][amount];
		}
		   
	 
 
	    
	public static void main(String[] args) {
		coinChange ob=new coinChange();
		int[] coins=  {56,76,45,34,43,56,78,98,76,65,34,33,23,21,23};
		int amount=8732;
		
//		Integer[][] dp = new Integer[coins.length][amount+1];
//        System.out.println(ob.coinChangeHelper(coins,0,amount,dp));
//        System.out.println(global);
        
	  Integer[][] dp = new Integer[coins.length][amount+1]; 
	  Arrays.sort(coins);
	  System.out.println(ob.coinChangeHelperr(coins,coins.length-1,amount,dp));
      System.out.println(global);		
		

	}

}
