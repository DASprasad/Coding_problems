package progarm;
import java.util.*;

public class _1405_Longest_Happy_String {
	
	class pair{
		char ch;  int val=0;
		
		pair(char ch,int val)  { this.ch = ch;  this.val=val; } //constructor
	
		public char getChar() { return ch; }
			
		
		public int getVal() { return val; }
			
		
		public void put(int val) { this.val=val; }
			
	}
	public int comp(pair p1,pair p2) {
		if(p1.getVal()>=p2.getVal()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	 public String longestDiverseString(int a, int b, int c) {
		 
		 String res=" ";
		 pair A=new pair('a',a); pair B=new pair('b',b); pair C=new pair('c',c);
		 
		 PriorityQueue<pair> pq=new PriorityQueue<pair>((p1,p2)->comp(p1,p2));
		 pq.add(A); pq.add(B); pq.add(C);
		 
		 int max=10;
		 
		 int con=0;
		 while(true) {
			
			 pair top=pq.poll();
			 
			 if(con==2)
			 {
				 pair sec =pq.poll();
				 if(sec.getVal()<=0)  break;
				 res+=sec.getChar();
				  sec.put(sec.getVal()-1);
				  pq.add(sec);
				  pq.add(top);
				 con=0;
				 
			 }
			 else
			 {
				 
			 res+=top.getChar();	 
			 top.put(top.getVal()-1);
			 pq.add(top);
			 con++;
			 if(top.getVal()<=0)  break;
			 }
			 
		 }
		 
		 
		 return res.substring(1);
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1405_Longest_Happy_String ob=new _1405_Longest_Happy_String();
		int a=4; int b=3;int c=7;
		
		System.out.println(ob.longestDiverseString(a, b, c));

	}

}
