package progarm;
import java.util.*;
public class _232_Implement_Queue_using_Stacks {
	
	class MyQueue {
	       Stack<Integer> s1; Stack<Integer> s2;
	    public MyQueue() {
	        s1 = new Stack<Integer>(); s2 = new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        while(s1.size() > 0) s2.push(s1.pop());
	        s1.push(x);
	        while(s2.size() > 0) s1.push(s2.pop());
	    }
	    
	    public int pop() {
	        return s1.pop();
	    }
	    
	    public int peek() {
	        return s1.peek();
	    }
	    
	    public boolean empty() {
	        return s1.isEmpty();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
