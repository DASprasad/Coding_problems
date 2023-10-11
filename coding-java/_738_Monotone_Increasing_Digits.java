package progarm;
import java.util.Arrays;


public class _738_Monotone_Increasing_Digits {
	
   public int monotoneIncreasingDigits(int n) {
        int num[] = new int[14];
        int len = num.length;
        for(int i = len - 1 ; i >= 0 ; i--) {
        	num[i] = n % 10;
        	n = n /10;
        }
        
        for(int i = len - 2 ; i >= 0 ; i --) {
        	if(num[i] > num[i + 1]) {
        		Arrays.fill(num, i + 1, len, 9);
        		num[i]--;
        	}
        }
        int res = 0;
        
        for(int i : num) {
        	res = res * 10 + i;
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_738_Monotone_Increasing_Digits ob = new _738_Monotone_Increasing_Digits();
		System.out.println(ob.monotoneIncreasingDigits(1000000000));

	}

}
