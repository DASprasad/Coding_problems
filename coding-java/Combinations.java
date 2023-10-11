package progarm;
import java.util.*;
public class Combinations {
	
      public void getCombinations(int pos,int n,int k,ArrayList<ArrayList<Integer>>A,ArrayList<Integer>help) {
    	  if(k==0) {
    		  A.add(new ArrayList<Integer>(help));
    		  return;
    	  }
    	  if(pos>n) {
    		  return;
    	  }
    	  
    	  for(int i=pos;i<=n;i++) {
    		  
    		  help.add(i);
    		  getCombinations(i+1,n,k-1,A,help);          
    		  help.remove(help.size()-1);
    		  
    	  }
      }
      
	public static void main(String[] args) {
		Combinations ob=new Combinations();
		ArrayList<ArrayList<Integer>>A=new ArrayList<ArrayList<Integer>>();
		
		ob.getCombinations(1, 4, 3, A, new ArrayList<Integer>());
		System.out.println(A);

	}

}
