package progarm;

public class _1359_CountAllValidPickupandDeliveryOptions {
	
	public int countOrders(int n) {
        long[] dp = new long[n+1];
        dp[1] = 1 ; 
        long mod = (long)1e9 + 7;
        
        for(int i = 2 ; i <= n ; i++ ) {
        	long gaps = (i - 1) * 2 + 1 ;
        	dp[i] = gaps * (gaps + 1) / 2 * dp[i - 1] % mod;
        }
        return (int)dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1359_CountAllValidPickupandDeliveryOptions ob = new _1359_CountAllValidPickupandDeliveryOptions();
		
		int n = 60;
		
		System.out.println(ob.countOrders(n));

		
		
	}

}
