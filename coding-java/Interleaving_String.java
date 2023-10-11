package progarm;

public class Interleaving_String {
	boolean flag=false;
	
	public boolean check(String str1,String str2,String str3,String help,int n,int i,int j) {
		
		if((help.equals(str3) && i==str1.length() && j==str2.length()) || flag==true) {
			return flag=true;
		}
//		if(!help.equals(str3.substring(0,help.length()))) {
//			return false;
//		}
		if (help.charAt(i+j)!=str3.charAt(i+j)) {
			return false;
		}

		if(n>=str3.length()) {
			return flag;
		}
		if(i<str1.length()) {
		
		check(str1,str2,str3,help+String.valueOf(str1.charAt(i)),n+1,i+1,j);
		
	}
		if(j<str2.length()) {
		
		check(str1,str2,str3,help+String.valueOf(str2.charAt(j)),n+1,i,j+1);
		
	}
		return flag;
	}
	
	
	/////////////////////////  linear solution
	
	public boolean checkInterLeaving(String str1,String str2,String str3) {
		int i=0;
		int j=0;
		int k=0;
		if((str1.length()+str2.length()) != str3.length()) {
			return false;
		}
		while(i<str1.length() || j<str2.length() || k<str3.length()) {
			if(k!=str3.length() && i!=str1.length() && str1.charAt(i)==str3.charAt(k)) {
				i++;
				k++;
			}
			else if(k!=str3.length() && j!=str2.length() && str2.charAt(j)==str3.charAt(k)) {
				j++;
				k++;
			}
			else{
				return false;
			}
		}
		if(i!=str1.length() || j!=str2.length()) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interleaving_String ob= new Interleaving_String();
		String str1="aabcc";
		String str2="dbbca";
		String str3="aadbbcbcac";
		String help="";
		int n=0;
//		System.out.println(ob.check(str1, str2, str3, help, n,0,0));
		System.out.println(ob.checkInterLeaving(str1, str2, str3));
	}

}
