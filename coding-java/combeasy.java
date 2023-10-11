package progarm;

import java.util.ArrayList;
import java.util.HashSet;
public class combeasy {
	HashSet<Integer>h=new HashSet<Integer>();
	static int global=0;
	  public void getCombinations(int pos,int n,int k,String str,int sum,int target) {
		  global=global+1;
		  if(sum>target) {
			  return;
		  }
		  
    	  if(str.length()==k && sum==target) {
    		  System.out.print(str+"  ");
    		  return;
    		  
    	  }
    	  if(pos>n) {
    		  return;
    	  }
    	    
    		  getCombinations(pos+1,n,k,str+String.valueOf(pos),sum+pos,target);
    		  getCombinations(pos+1,n,k,str,sum,target);
    		  
  
    	  }
      
      
	public static void main(String[] args) {
		combeasy ob=new combeasy();
		ArrayList<ArrayList<Integer>>A=new ArrayList<ArrayList<Integer>>();
		String str="";
		ob.getCombinations(1, 30, 2,str,0,150);
		System.out.println(global);

	}
}
