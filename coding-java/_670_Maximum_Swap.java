package progarm;
import java.util.*;
public class _670_Maximum_Swap {
	
  public int createNum (ArrayList<Integer>number , int i , int j) {
	
      int temp = number.get(i);
      number.set(i, number.get(j));
      number.set(j, temp);
      
      int ans = 0;
      
      for(int k =0 ; k < number.size(); k++ ) {
      	ans = ans * 10 + number.get(k);
      }
      
             
      return ans;
  }
	
  public int maximumSwap(int num) {
	   int n = num;
        ArrayList<Integer> number = new ArrayList();
        
        while (n > 0) {
        	int temp = n % 10 ;
        	number .add(0, temp);
        	n = n / 10 ;
        }
        
        int i ;
        int k = -1;
        
        for(i = 0 ; i < number.size() ; i++) {
        	   int max = number.get(i);
        	for(int j = number.size() - 1 ; j > i ; j--) {
        		
        		if(number.get(j) > max) {
        			max = number.get(j);
        			k = j ; //which position
        		}
        		
        	}
        	if(max != number.get(i)) return createNum(number , i , k);
        	
        }
        
       return num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_670_Maximum_Swap ob = new _670_Maximum_Swap();
		int num = 23364626;
		System.out.println(ob.maximumSwap(num));

	}

}
