package progarm;

public class _397_Integer_Replacement {
	
	public int integerReplacement(int n) {
	    long l = n;
        int count=0;
	  while(l>1) {
		
		  if(l==3) { count = count +2; break ;  }
		  
		  if(l%2 ==0) {
			  l=l/2;
		  }
		  else if(l%4 ==1) {
			 l = l-1; 
		  }
		  else if(l%4 == 3) {
			l = l+1;  
		  }
		  
		  count+=1;
	  }
	  
	  return count ;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_397_Integer_Replacement ob =new _397_Integer_Replacement();
		int n=2147483647;
		System.out.println(ob.integerReplacement(n));
	}

}
