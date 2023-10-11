package progarm;

public class ScrambledString {
	static boolean flag=false;
	static int global=0;
	
	public String solve(String str,String check,int i,int j,String[][] dp) {
		global=global+1;
		if(i>=j) {
			return String.valueOf(str.charAt(i));
		}
		if(flag==true) {
			return "";
		}
		if(dp[i][j]!=null){
			return dp[i][j];
		}
		
		String temp="";
		for(int k=i+1;k<=j;k++) {
			if(flag==true) {
				break;
			}
			String right=solve(str,check,k,j,dp);
			String left=solve(str,check,i,k-1,dp);
			
			if(check.contains(right+left)) {
				if((right+left).length()==check.length()) {
					flag=true;
				}
				return dp[i][j]=right+left;
				
			}else if(check.contains(left+right)) {
				if((right+left).length()==check.length()) {
					flag=true;
				}
				return dp[i][j]=left+right;
				
			}
			else {
				temp=left+right;
			}
		}
		return dp[i][j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScrambledString ob =new ScrambledString();
		String str="";
		String check="";
		int i=0;
		int j=str.length()-1;
		String[][] dp=new String[str.length()+1][str.length()+1];
		System.out.println(ob.solve(str, check, i, j,dp));
		System.out.println(flag);
		System.out.println(global);
//		System.out.println(check.contains("ba"));
	}

}

//reversed=right+left;//reversed
//same=left+right;

//if(check.contains(local)) {
//dp[i][j]=reversed;
//return reversed;
//}else if(check.contains(same)) {
//dp[i][j]=same;
//return same;
//}else {
//dp[i][j]="";
//return same;
//}
