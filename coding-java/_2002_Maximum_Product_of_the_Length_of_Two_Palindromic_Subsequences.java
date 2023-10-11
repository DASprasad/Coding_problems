package progarm;
import java.util.*;
public class _2002_Maximum_Product_of_the_Length_of_Two_Palindromic_Subsequences {
	
	public boolean checkandAdd(String s , HashMap<Integer , Integer> map , int mask) {
		int bit = 1 , idx = s.length() - 1;
		String res ="";
		
		while(bit <= mask) {
			if((mask & bit) != 0) res += s.charAt(idx);
			bit = bit << 1;
			idx --; 
		}
		if(res.length() == 0) return false;
		
		int i = 0 , j = res.length() - 1;
		
		while(i <= j) {
			if(res.charAt(i) != res.charAt(j)) return false;
			i ++; j --;
		}
		
		map.put(mask , res.length());
		
		return true;
	}
	
	
	public int maxProduct(String s) {
        int n = s.length();
        int limit = (1 << n) - 1;
        HashMap<Integer , Integer> map = new HashMap();
        for(int i = 1 ; i <= limit ; i++) {
        	checkandAdd(s , map , i);
        }
        
        // now get maximum product
       int max = 0; 
        for(int pal1 : map.keySet()) {
        	for(int pal2 : map.keySet()) {
        		if((pal1 & pal2) == 0) {
        			int product = map.get(pal1) * map.get(pal2);
        			max = Math.max(max, product);
        		}
        	}
        }
        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2002_Maximum_Product_of_the_Length_of_Two_Palindromic_Subsequences ob = new _2002_Maximum_Product_of_the_Length_of_Two_Palindromic_Subsequences();
		
		String s = "abab";
		
		System.out.println(ob.maxProduct(s));

	}

}
