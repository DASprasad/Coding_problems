package progarm;

public class EditDistance {
	static int global=0;
	
	public int minDistance(String str1,String str2,int i,int j,Integer[][] dp) {
		global+=1;
		if(i==str1.length()) return str2.length()-j;
		if(j==str2.length()) return str1.length()-i;
		if(dp[i][j]!=null) return dp[i][j];
		
		if(str1.charAt(i)==str2.charAt(j)){
			return minDistance(str1,str2,i+1,j+1,dp);
		}
		else {
			int delete=minDistance(str1,str2,i+1,j,dp)+1;
			int insert=minDistance(str1,str2,i,j+1,dp)+1;
			int replace=minDistance(str1,str2,i+1,j+1,dp)+1;
			return dp[i][j]=Math.min(Math.min(delete, insert), replace);
		}

	}

	public static void main(String[] args) {
		EditDistance ob = new EditDistance();
		String str1="sjfhgjhagdaghjd";
		String str2="hgfjdskfhsljdhfl";
		int i=0;
		int j=0;
		Integer[][] dp=new Integer[str1.length()][str2.length()];
		System.out.println(ob.minDistance(str1, str2, i, j, dp));
        System.out.println(global);
	}

}
