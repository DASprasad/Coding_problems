package progarm;

public class uglyNumber3 {
	
	 public int nthUglyNumber(int n, int a, int b, int c) {
	       
			int min=Integer.MAX_VALUE;
			
			int indexa=1; int indexb=1; int indexc=1;
			int factora=a; int factorb=b; int factorc=c;
				
			for(int i=0;i<n;i++) {
				min=Math.min(factora,Math.min(factorb, factorc));
				if(min==factora) {
					factora=a*(++indexa);
				}
				if(min==factorb) {   // donot write (else if) as it will add duplicates
					factorb=b*(++indexb);
				}
				if(min==factorc) {
					factorc=c*(++indexc);
				}
			}
			return min; 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uglyNumber3 ob =new uglyNumber3();
		int n=10;
		int a=2; int b=3; int c=5;
		System.out.println(ob.nthUglyNumber(n, a, b, c));

	}

}
