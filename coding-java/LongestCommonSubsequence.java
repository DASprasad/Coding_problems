package progarm;

public class LongestCommonSubsequence {
	
	public int common(String str1,String str2,int m,int n) {
		if(m>=str1.length() || n>=str2.length()) {
			return 0;
		}
		if(str1.charAt(m)==str2.charAt(n)) {
			return 1+common(str1,str2,m+1,n+1);
		}
		else {
			int left=common(str1,str2,m+1,n);
			int right=common(str1,str2,m,n+1);
			return Math.max(left,right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonSubsequence ob =new LongestCommonSubsequence();
		String str1="execution";
		String str2="intention";
		int m=0;
		int n=0;
		System.out.println(ob.common(str1, str2, m, n));

	}

}
