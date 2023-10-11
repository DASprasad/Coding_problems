package progarm;

import java.util.Arrays;

public class _1647_MinimumDeletionstoMakeCharacterFrequenciesUnique {
	
	public int minDeletions(String s) {
 
        //count frequency
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)-'a']++;
        Arrays.sort(freq);
        int deletions=0;
        
        for(int i=freq.length-2;i>=0;i--) {
        	if(freq[i]==0) break;
        	if(freq[i] >= freq[i+1]) {
        		int currentDeletes=(freq[i]-freq[i+1])+1;
        		deletions += currentDeletes;
        		
        		freq[i] -= currentDeletes;
        		
        		if(freq[i]==0) break;
        	}
        }
        
        
        return deletions;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1647_MinimumDeletionstoMakeCharacterFrequenciesUnique ob =new _1647_MinimumDeletionstoMakeCharacterFrequenciesUnique();
		String s="abc";
		
		System.out.println(ob.minDeletions(s));

	}

}
