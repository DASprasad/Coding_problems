package progarm;
import java.util.*;
public class _856_Score_of_Parentheses {
	
	public int scoreOfParentheses(String S) {
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(cur);
                cur = 0;
            } else {
                cur = stack.pop() + Math.max(cur * 2, 1);  //powerful line
            }
        }
        return cur;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_856_Score_of_Parentheses ob=new _856_Score_of_Parentheses();
		String s="((())()(()))";
		System.out.println(ob.scoreOfParentheses(s));

	}

}
