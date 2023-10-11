package progarm;
import java.util.*;
public class _792_Number_of_Matching_Subsequences {
	
	public int binarySearch(ArrayList<Integer> list , int target) {
		if(list.size() == 0) return Integer.MIN_VALUE;  //if there is no such character
		int low = 0 , high = list.size() - 1 , mid = 0;
		while(high - low > 1) {
			mid = (low + high) / 2;
			if(list.get(mid) <= target) low = mid;
			else high = mid;
		}
		if(list.get(low) > target) return list.get(low);
		else if(list.get(high) > target) return list.get(high);
		return Integer.MIN_VALUE;
	}
	
	 public int numMatchingSubseq(String s, String[] words) {
         int res = 0;
		 ArrayList<Integer>[] idx = new ArrayList[27]; 
		 for(int i = 0 ; i < idx.length ; i++) idx[i] = new ArrayList();
	     for(int i = 0 ; i < s.length() ; i++) {
	    	 int pos = s.charAt(i) - 'a';
	    	 idx[pos].add(i);
	     }
	     
	     for(String str : words) {
	    	 if(str.length() > s.length()) continue;
	    	 int prev = -1; boolean flag = true;
	    	 for(int i = 0 ; i < str.length() ; i++) {
	    		 int pos = binarySearch(idx[str.charAt(i) - 'a'] , prev);
	    		 if(pos <= prev) { flag = false ; break; }
	    		 prev = pos;
	    	 }
	    	 if(flag) res += 1;
	     }
	     return res;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_792_Number_of_Matching_Subsequences ob = new _792_Number_of_Matching_Subsequences();
		
		String s = "rwpddkvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvjubjgloeofnpjqlkdsqvruvabjrikfwronbrdyyjnakstqjac"; 
		String[] words = {"wpddkvbnn","lnagtva","kvbnnuglnagtvamxkqtwhqgwbqgfbvgkwyuqkdwhzudsxvju","rwpddkvbnnugln","gloeofnpjqlkdsqvruvabjrikfwronbrdyyj","vbgeinupkvgmgxeaaiuiyojmoqkahwvbpwugdainxciedbdkos","mspuhbykmmumtveoighlcgpcapzczomshiblnvhjzqjlfkpina","rgmliajkiknongrofpugfgajedxicdhxinzjakwnifvxwlokip","fhepktaipapyrbylskxddypwmuuxyoivcewzrdwwlrlhqwzikq","qatithxifaaiwyszlkgoljzkkweqkjjzvymedvclfxwcezqebx"};
		System.out.println(ob.numMatchingSubseq(s, words));

	}

}
