package progarm;

public class SearchPermuteString {   //BIT MASKING 
	
	public boolean checkInclusion(String s1, String s2) {
		if(s2.length()<s1.length()) return false;// base case
		int[] freq=new int[27];
		
		for(int i=0;i<s1.length();i++) freq[s1.charAt(i)-'a']+=1;
		
		
		int[] window=new int[27];
		int bitmask=0;
		
		for(int i=0;i<s1.length();i++) {
			
			int temp=s2.charAt(i)-'a';
			window[temp]+=1;
			
			if(window[temp]!=freq[temp]) bitmask=(bitmask | (1<<temp));
			else bitmask=bitmask & (~(1<<temp)); // flipping perticular set bit to zero
			
		    if(bitmask==0) return true;
		}
		
		int pos=s1.length();
		int last=0;
		while(pos<s2.length()) {
			
			int prev=s2.charAt(last)-'a'; int now=s2.charAt(pos)-'a';
			window[prev]=window[prev]-1;
			
			if(window[prev]!=freq[prev]) bitmask=(bitmask | (1<<prev));
			else bitmask=bitmask & (~(1<<prev)); // flipping perticular set bit to zero
			
			window[now]=window[now]+1;
			
			if(window[now]!=freq[now]) bitmask=(bitmask | (1<<now));
		    else bitmask=bitmask & (~(1<<now)); // flipping perticular set bit to zero
			
			if(bitmask==0) return true;
			
			last++; pos++;	
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchPermuteString ob=new SearchPermuteString();
		String s1="sa";
		String s2="amns";
		System.out.println(ob.checkInclusion(s1, s2));
	}

}
