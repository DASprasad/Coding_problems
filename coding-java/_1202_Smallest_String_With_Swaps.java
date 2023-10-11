package progarm;
import java.util.*;
public class _1202_Smallest_String_With_Swaps {
	
	class pair{
		int[] arr ;
		int idx;
		pair(int[] arr , int idx) {
			this.arr = arr; this.idx = idx;
		}
	}
	
	public int find(int[] arr , int x) {
		if(arr[x] == x) return x;
		
		return arr[x] = find(arr , arr[x]);
	}
	
	public void union(int[] arr , int x , int y) {
		int parentx = find(arr , x);
		int parenty = find(arr , y);
		arr[parentx] = parenty;
	}
	
	public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        String res = "";
        int[] nodes = new int[s.length()];
        for(int i = 0 ; i < nodes.length ; i++) nodes[i] = i;
        for(int i = 0 ; i < s.length(); i++) {
        	int x = pairs.get(i).get(0);
        	int y = pairs.get(i).get(1);
        	union(nodes , x , y);
        }
        
        HashMap<Integer , pair> map = new HashMap();
        
        for(int i = 0 ; i < nodes.length ; i++) {
        	int val = nodes[i];
        	if(map.containsKey(val)) {
        		map.get(val).arr[s.charAt(i) - 'a']++;
        	}
        	else {
        		int[] freq = new int[26];
        		map.put(val, new pair(freq , 0));
        	}
        }
        
        for(int i = 0; i < nodes.length ; i++) {
        	pair cur = map.get(nodes[i]);
        	int[] arr = cur.arr;
        	int idx = cur.idx;
        	while(arr[idx] == 0) {idx++; continue;}
        	res += (char)('a' + idx);
        	arr[idx]--;
        }
		
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 _1202_Smallest_String_With_Swaps ob = new  _1202_Smallest_String_With_Swaps();
		 
		 String s = "";
		 int[] arr = null;

	}

}
