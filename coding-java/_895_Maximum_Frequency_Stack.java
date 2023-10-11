package progarm;
import java.util.*;
public class _895_Maximum_Frequency_Stack {
	
	
	HashMap<Integer , Stack<Integer>> map;
	HashMap<Integer , Integer> freq;
	int maxFreq;                //track the max current max frequency not element
	
	
	
	_895_Maximum_Frequency_Stack (){
		map = new HashMap(); freq = new HashMap();
		
	}
	
	
	  public void push(int val) {
		  int x = freq.getOrDefault(val, 0) + 1;
		  
		  freq.put(val , x);
		  maxFreq = Math.max(maxFreq ,  x);
		  
		  if(!map.containsKey(x)) map.put(x, new Stack<Integer>()); //very important
		  
		  map.get(x).push(val);
		     
	    }
	    
	    public int pop() {
	    	Stack<Integer> s = map.get(maxFreq);
	    	int res = s.pop();
	    	if(s.size() == 0) { map.remove(maxFreq); maxFreq -- ;}
	    	return res;
	    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_895_Maximum_Frequency_Stack ob = new _895_Maximum_Frequency_Stack();
		ob.push(5); ob.push(7); ob.push(5); ob.push(7); ob.push(4); ob.push(5); 
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		

	}

}
