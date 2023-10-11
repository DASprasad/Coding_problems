package progarm;

public class _1525_Number_of_Good_Ways_to_Split_a_String {
	
	public int CountBits(int n) {
		int count = 0;
	    
	    while (n>0) {
	        n &= (n - 1);
	        count++;
	    }
	    
	    return count;
	}
	
       public int numSplits(String s) {
    	   int number=0;
    	   int mask=0;
    	   int freq[]=new int[26];
    	   for(int i=0;i<s.length();i++) {
    		   freq[s.charAt(i)-'a']++;
    		   mask=(mask | 1<<(s.charAt(i)-'a'));
    	   }
    	   int currentmask=0;
    	   for(int i=0;i<s.length();i++) {
    		   currentmask=currentmask | (1<<s.charAt(i)-'a');
    		   freq[s.charAt(i)-'a']--;
    		   if(freq[s.charAt(i)-'a']==0) {
    			   mask=mask & (~(1<<(s.charAt(i)-'a')));
    		   }
    		   if(CountBits(currentmask)==CountBits(mask)) number+=1;
    	   }
    	   return number;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1525_Number_of_Good_Ways_to_Split_a_String ob=new _1525_Number_of_Good_Ways_to_Split_a_String();
		String s="aacaba";
		System.out.println(ob.numSplits(s));

	}

}
