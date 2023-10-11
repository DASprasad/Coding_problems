package progarm;
import java.util.*;
public class _316_Remove_Duplicate_Letters {
	
      public String removeDuplicateLetters(String s) {
    	  Stack<Character> stack = new Stack();
    	  int[] freq=new int[27];
    	  int[] visited=new int[27];
    	 // count occurences of each character in frequency array
    	  
    	  for(int i=0;i<s.length();i++) {
    		  freq[s.charAt(i)-'a']++;
    	  }
    	  
    	  for(int i=0;i<s.length();i++) {
    		  char c=s.charAt(i);
    		  if(visited[c-'a']>0) {
    			  freq[c-'a']--;
    			  continue;
    		  }
    		  while(stack.size()>0 && c<stack.peek() && freq[stack.peek()-'a']>0) {
    			  visited[stack.peek()-'a']--;
//    			  freq[stack.peek()-'a']++;
    			  stack.pop();
    			  
    		  }
    		  freq[c-'a']--;
    		  stack.push(c);
    		  visited[c-'a']++;
    	  }
    	  
    	  StringBuilder sb=new StringBuilder();
    	  while(stack.size()>0) {
    		  sb.append(stack.pop());
    	  }
    	return String.valueOf(sb.reverse());  
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_316_Remove_Duplicate_Letters ob=new _316_Remove_Duplicate_Letters();
		String s= "acdcdsdsajdvacacxgxjsndjeisncbscaxxfssuwusshvsgfaxacxfsgacaxzfagsgdusn";
		System.out.println(ob.removeDuplicateLetters(s));

	}

}
