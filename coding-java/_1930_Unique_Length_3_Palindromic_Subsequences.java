package progarm;
import java.util.*;
public class _1930_Unique_Length_3_Palindromic_Subsequences {
	
    public int countPalindromicSubsequence(String s) {
    	int n = s.length() , mask = 0 , res = 0;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        HashMap<Character,HashSet<Character>> map = new HashMap();
        
        for(int i = 0 ; i < n ; i++) {
        	mask |= 1 << (s.charAt(i) - 'a');
        	prefix[i] = mask;
        }
        mask = 0;
        for(int i = n - 1 ; i >= 0 ; i--) {
        	mask |= 1 << (s.charAt(i) - 'a');
        	suffix[i] = mask;
        }
        
        for(int i = 1 ; i < s.length() - 1 ; i++) {
        	res += checkAndAdd(map , prefix[i - 1] , s.charAt(i) , suffix[i + 1]);
        }
        
        return res;
    }
    
    public int checkAndAdd( HashMap<Character,HashSet<Character>> map , int x , char cur ,int y) {
    	int count = 0;
    	for(int i = 0 ; i < 26 ; i++) {
    		int leftchar = x & (1 << i);
    		int rightchar = y & (1 << i);
    		
    		if(leftchar >= 1 && rightchar >= 1) {
    			char ch = (char)('a' + i);
    			if(map.containsKey(cur)) {
    				if(!map.get(cur).contains(ch)) {
    					count += 1;
    					map.get(cur).add(ch);
    				}
    			}
    			else {
    				map.put(cur, new HashSet<Character>());
    				map.get(cur).add(ch);
    				count += 1;
    			}
    		}
    	}
    	
    	return count;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1930_Unique_Length_3_Palindromic_Subsequences ob = new _1930_Unique_Length_3_Palindromic_Subsequences();
		String s = "bbcbaba";
		System.out.println(ob.countPalindromicSubsequence(s));

	}

}
