package progarm;

public class _1147_Longest_Chunked_Palindrome_Decomposition {
	
	public int longestDecomposition(String S) {
        int res = 0, n = S.length();
        String l = "", r = "";
        for (int i = 0; i < n; ++i) {
            l = l + S.charAt(i);
            r = S.charAt(n - i - 1) + r;
            if (l.equals(r)) {
                ++res;
                l = "";
                r = "";
            }
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
