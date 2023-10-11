package progarm;
import java.util.*;
public class _76_Minimum_Window_Substring {
	
	
//	 public String minWindow(String s, String t) {
//	        String res="";
//	        Deque<Integer> dq=new ArrayDeque();
//	        int[] cache =new int[26];
//	        int[] visited=new int[26];
//	        
//	        for(int i=0;i<t.length();i++)  cache[t.charAt(i)-'A']++;
//	        
//	        for(int i=0;i<s.length();i++) {
//	        	
//	        	if(cache[s.charAt(i)-'A']>0) {
//	        		dq.offer(i);
//	        	    cache[s.charAt(i)-'A']--;
//	        	   visited[s.charAt(i)-'A']++;
//	        	}
//	        	
//	        	if(dq.size()>=t.length()) {
//	        		String temp=s.substring(dq.getFirst(),dq.getLast()+1);
//	        		if(temp.length()>res.length()) {
//	        			res=temp;
//	        		}
//	        	}
//	        	
//	        	while(visited[s.charAt(dq.getFirst())-'A'] >= cache[s.charAt(i)-'A']) {
//	        		cache[s.charAt(dq.getFirst())-'A']++;
//	        		visited[s.charAt(dq.getFirst())-'A']--;	        		
//	        		dq.removeFirst();
//	        	}
//	          	
//	        	
//	        }
//	        
//	        return res;
//	    }
//	 
	 public String minWindow(String s, String t) {
		 String res="";
		 HashMap<Character,Integer> map =new HashMap();
		 int[] cache =new int[26];
		 int visited=0;
		 int last=0;
		 
		 for(int i=0;i<t.length();i++)  cache[t.charAt(i)-'A']++;
		 
		 for(int i=0;i<s.length();i++) {
			 if(map.containsKey(s.charAt(i))) {
				 map.put(s.charAt(i),1+map.get(s.charAt(i)));
				 if(cache[s.charAt(i)-'A']>0) {
					  visited++;
				      cache[s.charAt(i)-'A']--;
				  }
			 }
			 else {
				  if(cache[s.charAt(i)-'A']>0) {
					  visited++;
				      cache[s.charAt(i)-'A']--;
				  }
				 map.put(s.charAt(i), 1);
			 }
			 
			 if(visited == t.length()) {
				 
			 }
			 
			 while(map.get(last)>0) {
				 map.put(s.charAt(last), map.get(last)-1);
				 last++;
			 }
		 }
		 return res;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_76_Minimum_Window_Substring ob =new _76_Minimum_Window_Substring();
		String s="ADOBECODEBANC";
		String t="ABC";
		
		ob.minWindow(s, t);

	}

}
