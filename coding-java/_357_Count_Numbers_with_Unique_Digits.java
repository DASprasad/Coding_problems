package progarm;

public class _357_Count_Numbers_with_Unique_Digits {
	
	public int countNumbersWithUniqueDigits(int n) {
		
        int[] dp = new int[n + 1];
        dp[0] = 1; dp[1] = 9 ; //(one digit numbers 1 - 9 except 0 because we dont want leading zeros
        int res = 9 ; // 1 -- 9
        int choicesLeft = 9 ; // lets  say number is 1 choices (0,2,3,4,5,6,7,8,9)
         
        for(int  i = 2 ; i <= n ; i++) {
        	dp[i] = dp[i - 1] * choicesLeft ;
        	res = res + dp[i];
        	choicesLeft -- ; // for number 12 - choices are (0,3,4,5,6,7,8,9)
        }
        
        return res + 1; //0 included thats why plus one
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_357_Count_Numbers_with_Unique_Digits ob = new _357_Count_Numbers_with_Unique_Digits();
		
		int n = 8;
		System.out.println(ob.countNumbersWithUniqueDigits(n));

	}

}
