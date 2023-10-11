package progarm;
import java.util.*;
import java.math.BigInteger;
public class _155_Min_Stack {
	
		int min = Integer.MAX_VALUE;
	    
	    
	    public void push(int x , Stack<Integer> stack) {
	        // only push the old minimum value when the current 
	        // minimum value changes after pushing the new value x
	        if(x <= min){          
	            stack.push(min);
	            min=x;
	        }
	        stack.push(x);
	    }
	
	    public void pop(Stack<Integer> stack) {
	        // if pop operation could result in the changing of the current minimum value, 
	        // pop twice and change the current minimum value to the last minimum value.
	        if(stack.pop() == min) min=stack.pop();
	    }
	
	    public int top(Stack<Integer> stack) {
	        return stack.peek();
	    }
	
	    public int getMin() {
	        return min;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_155_Min_Stack ob =new _155_Min_Stack();
		Stack<Integer> stack = new Stack<Integer>();
		
		ob.push(4, stack);
		ob.push(3, stack);
		ob.push(2, stack);
		ob.push(1, stack);
		ob.pop(stack);
		ob.pop(stack);
		ob.pop(stack);
		BigInteger a = new BigInteger("23");
		BigInteger b = new BigInteger("23");
        a.add(b);
	}

}
