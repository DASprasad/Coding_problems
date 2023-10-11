package progarm;
import java.util.*;
public class _1209_Remove_All_Adjacent_Duplicates_in_String_II {
	
	public String removeDuplicates(String s, int k) {
        // ArrayDeque has better performance than Stack and LinkedList
        ArrayDeque<Adjacent> st = new ArrayDeque<>(s.length());
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peekLast().ch == c) {
                st.peekLast().freq++; // Increase the frequency
            } else {
                st.addLast(new Adjacent(c, 1));
            }
            if (st.peekLast().freq == k) // If reach enough k duplicate letters -> then remove
                st.removeLast();
        }
        StringBuilder sb = new StringBuilder();
        for (Adjacent a : st) {
            sb.append(String.valueOf(a.ch).repeat(a.freq));
        }
        return sb.toString();
    }
    class Adjacent {
        char ch;
        int freq;
        public Adjacent(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1209_Remove_All_Adjacent_Duplicates_in_String_II ob = new _1209_Remove_All_Adjacent_Duplicates_in_String_II();
		
		
		String s = "deeedbbcccbdaa";
		
		System.out.println(ob.removeDuplicates(s, 3));

	}

}
