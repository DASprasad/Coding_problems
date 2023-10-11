package progarm;

public class _50_Pow_x_n_ {
	
//	wanted to do with bit manipulation but as the input is in decimal do with it recursion
	
	public double pow(double x , int n) {
		if(n == 0) return 1;
		if(x == 0) return 1;
		
		double res = pow(x , n /2);
		
		return n % 2 == 0 ? res*res : res * res * x;
	}
	
   public double myPow(double x, int n) {
	   
	   boolean flag = false;
	   if(n < 0) flag = true;
	   
	   int val = Math.abs(n);
	   
	   return flag == true ? 1 / pow(x , val) : pow(x , val);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_50_Pow_x_n_ ob = new _50_Pow_x_n_();
		System.out.println(ob.myPow(2, 5));

	}

}
