package progarm;

public class StringMultiplication {

	public  String multiplication (String num1 , String num2,int i,int j , int k , int l ) {
		if (i==0 && j==0 && k==0 && l==0) {
			return "0";
		}
		int sum = 0;
		for(int a = 0;a<=k-i;a++) {
			int m =0;
			m = Character.getNumericValue(num1.charAt(i+a))*Character.getNumericValue(num1.charAt(l-a));
			sum = sum + m;
		}
		
		if(i==0) {
			if (j==0) {
				k--;
				l--;
				
			}
			else {
				l--;
				j--;
			}
		}
		else if(j==0 && i!=0) {
			k--;
			i--;
		}
		else {
			i--;
			j--;
		}
		String n = new String();
		n = multiplication(num1,num2,i,j,k,l);
		
		String sum2 = String.valueOf(Character.getNumericValue(0)+sum);
		return sum2 + n.substring(1,n.length());
		
	}

	public static void main(String[] args) {
		StringMultiplication  ob =new StringMultiplication(); 
		String num1 = "783456554545676";
		String num2 = "783456554545676559056";
		String ans = new String ();
		ans = ob.multiplication(num1,num2,num1.length(),num2.length(),num1.length(),num2.length()) ;
		
		System.out.println(ans);
		

	}


}
