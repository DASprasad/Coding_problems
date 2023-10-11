package progarm;

public class _991_Broken_Calculator {
	
	public int brokenCalc(int startValue, int target) {
		int n = target;
		int steps = 0;
		
		while(n > startValue) {
			if(n % 2 == 0) n /= 2;
			else n += 1;
			steps += 1;
		}
		
		return steps + startValue - n;
	}
        
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_991_Broken_Calculator ob = new _991_Broken_Calculator();
		
		System.out.println(ob.brokenCalc(6, 72));

	}

}
