package progarm;
import java.util.*;

public class _150_Evaluate_Reverse_Polish_Notation {
	
	public int compute(int a ,int b ,String s) {
		if(s.equals("*")) return a*b;
		if(s.equals("/")) return a/b;
		if(s.equals("+")) return a+b;
		if(s.equals("-")) return a-b;
		
		return -1;
	}				
	
     public int evalRPN(String[] tokens) {
    	 Stack<Integer> s = new Stack();
    	 
    	 for(int i=0 ; i < tokens.length ; i++) {
    		 if(!( tokens[i].equals("*") || tokens[i].equals("/") || tokens[i].equals("+") || tokens[i].equals("-"))) {
    			 s.push(Integer.parseInt(tokens[i]));
    		 }
    		 else {
    			 
    			 int b = s.pop();
    			 int a = s.pop();
    			 
    			 int get = compute(a ,b , tokens[i]);
    			 
    			 s.push(get);
    		 }
    	 }
    	 
        return s.pop();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_150_Evaluate_Reverse_Polish_Notation ob  =  new _150_Evaluate_Reverse_Polish_Notation();
		String [] tokens = {"4","3","-"};
		System.out.println(ob.evalRPN(tokens));

	}

}
