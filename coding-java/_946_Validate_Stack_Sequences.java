package progarm;
import java.util.*;
public class _946_Validate_Stack_Sequences {
	
    public boolean validateStackSequences(int[] pushed, int[] popped) {
         Stack<Integer> stack = new Stack();
         
         int i = 0;
         
         i = 0; //reuse
         int last = 0; 
         while(last < pushed.length) {
        	 
        	 if(stack.size() > 0 && stack.peek() == popped[last]) {
        		 stack.pop(); last ++;
        	 }
        	 else {
        		 while( i < pushed.length && pushed[i] != popped[last]) { stack.push(pushed[i]); i++;}
        		 if( i >= pushed.length ) return false; 
                 else { stack.push(pushed[i]); i++;};
        	 }
        	 
         }
         
         return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_946_Validate_Stack_Sequences ob = new _946_Validate_Stack_Sequences();
		
		int[] pushed = {1,2,3,4,5};
		int[] popped = {4,3,5,1,2};
		
		System.out.println(ob.validateStackSequences(pushed, popped));

	}

}
