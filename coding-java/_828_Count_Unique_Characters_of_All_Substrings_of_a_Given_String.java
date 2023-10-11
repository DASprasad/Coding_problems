package progarm;
import java.util.*;
public class _828_Count_Unique_Characters_of_All_Substrings_of_a_Given_String {
	
	public int uniqueLetterString(String s) {
        int res = 0;
        HashMap<Character , List<Integer>> map = new HashMap();
        
        for(int i = 0 ; i < s.length() ; i++) {
        	char c = s.charAt(i);
        	if(map.containsKey(c)) {
        		map.get(c).add(i);
        	}
        	else {
        		List<Integer> list = new ArrayList();
        		list.add(i);
        		map.put(c, list);
        	}
        }
        for(Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
        	List<Integer> list = entry.getValue();
        	for(int i = 0 ; i < list.size(); i++) {
        		int left = i == 0 ? list.get(i) + 1 : list.get(i) - list.get(i - 1);
        		int right = i == list.size() - 1 ? s.length() - list.get(i) : list.get(i + 1) - list.get(i);
        		res += left * right;
        	}
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_828_Count_Unique_Characters_of_All_Substrings_of_a_Given_String ob = new _828_Count_Unique_Characters_of_All_Substrings_of_a_Given_String();
		String s = "ABCBC";
		
		System.out.println(ob.uniqueLetterString(s));

	}

}
