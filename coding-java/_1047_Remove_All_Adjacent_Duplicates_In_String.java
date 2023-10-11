package progarm;
import java.util.*;
public class _1047_Remove_All_Adjacent_Duplicates_In_String {
	
   public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
        	if(stack.size() > 0 && stack.peek() == s.charAt(i)) {
        		while(stack.size() > 0 && s.charAt(i) == stack.peek()) stack.pop();
        	}
        	else stack.push(s.charAt(i));
        }
        
        String res = "";
        for(char c : stack) {
        	res += c;
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
