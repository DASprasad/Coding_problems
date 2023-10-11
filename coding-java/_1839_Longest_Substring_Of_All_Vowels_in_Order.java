package progarm;

public class _1839_Longest_Substring_Of_All_Vowels_in_Order {
	
    public int longestBeautifulSubstring(String word) {
        char[] vowels = {'a' , 'e' , 'i' , 'o' , 'u'};
        int bitmask = 0;
        int max = 1;
        
        for(int i = 0 ; i < vowels.length ; i++) bitmask = bitmask | (1 << (vowels[i] - 'a'));
        
        int mask = 0 | (1 << word.charAt(0) - 'a');
        
        for(int i = 1 , last = 0; i < word.length() ; i++) {
        	if(word.charAt(i) >= word.charAt(i - 1)) {
        		mask = mask | (1 << word.charAt(i) - 'a');
        		if(mask == bitmask) max = Math.max(max, i - last + 1);
        	}
        	else {
        		mask =  0 | (1 << word.charAt(i) - 'a');
        	    last = i;
        	}
        }
        
        return max < 5 ? 0 : max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1839_Longest_Substring_Of_All_Vowels_in_Order ob = new _1839_Longest_Substring_Of_All_Vowels_in_Order();
		
		String s = "aeiou";
		
		System.out.println(ob.longestBeautifulSubstring(s));

	}

}
