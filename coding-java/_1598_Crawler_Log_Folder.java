package progarm;
import java.util.*;
public class _1598_Crawler_Log_Folder {
	
   public int minOperations(String[] logs) {
        Stack<Integer> stack = new Stack();
        
        for(int i = 0 ; i < logs.length ; i++) {
        	
        	if(logs[i].equals("../")) {
        		if(!stack.isEmpty()) stack.pop();
        	}
        	else if(logs[i].equals("./")) continue;
        	else { 
        		if(stack.size() == 0) stack.add(1);
        		else stack.add(stack.peek() + 1);
        	}
        }
        
        return stack.isEmpty() ? 0 : stack.peek();
        	
        	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		_1598_Crawler_Log_Folder ob = new _1598_Crawler_Log_Folder();
		
		String[] logs = {"./","../","./"};
		
		System.out.println(ob.minOperations(logs));

	}

}
