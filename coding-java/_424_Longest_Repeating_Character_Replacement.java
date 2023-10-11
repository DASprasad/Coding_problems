package progarm;

public class _424_Longest_Repeating_Character_Replacement {
	
	 public int characterReplacement(String s, int k) {
	        int max=0;
	        int[] freq=new int[27];
	        int pointer=0;
	        int left=0;
	        int ans=0;
           while(pointer<s.length()) {
        	   freq[s.charAt(pointer)-'A']++;
        	   max=Math.max(max,freq[s.charAt(pointer)-'A']);
	        	if(max+k>=pointer-left+1) {
	        		
	        		
	        		ans=Math.max(ans, pointer-left+1);
	        		pointer++;
	        		
	        	}
	        	else {
	        	freq[s.charAt(left)-'A']--;
	        	freq[s.charAt(pointer)-'A']--;
	        	left++;
	        	}
	        }
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_424_Longest_Repeating_Character_Replacement ob = new _424_Longest_Repeating_Character_Replacement();
		String s="AABABBAAHGSGGSGSGSFDDDBDBCHDHDDBDGDTDGDBDBSGGSGSGSDDBDBAAAGAGSBDJDKDDDJDJDNFNFJDJDBDDUDJDFIIDUEHEBNDJSNSBDHSJHSDMMMMVKDMMAMAKZAUWHDBDJKSKSJFHFBCBCJSKSF";
		int k=2;
		System.out.println(ob.characterReplacement(s, k));

	}

}
