package progarm;
import java.util.*;
public class _682_Baseball_Game {
	
	public int calPoints(String[] ops) {
        Stack<Integer> stack  = new Stack();
        
        for(int i = 0 ; i < ops.length ; i++){
            if(ops[i].equals("D")){
                int n = stack.peek();
                stack.push(n * 2);
            }
            else if(ops[i].equals("C")){
                stack.pop();
            }
            else if(ops[i].equals("+")){
                int first = stack.pop();
                int second = stack.pop();
                int top = first + second;
                stack.add(second); stack.add(first); stack.add(top);
            }
            else{
                stack.add(Integer.parseInt(ops[i]));
            }
        }
        
        int res = 0;
        
        for(int A : stack) {
        	res += A; 
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_682_Baseball_Game ob = new _682_Baseball_Game();
		
		String[] ops = {"5","2","C","D","+"};
		
		System.out.println(ob.calPoints(ops));
		

	}

}
