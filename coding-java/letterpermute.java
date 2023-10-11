package progarm;

import java.util.ArrayList;

public class letterpermute {

	public void permute(ArrayList<String>A,String str,String help,int n) {
		if(n==str.length()) {
			A.add(help);
			return;
		}
		if((str.charAt(n)>=90 && str.charAt(n)<=122) ) {
		permute(A,str,help+String.valueOf((str.charAt(n))),n+1);
		permute(A,str,help+String.valueOf(Character.toUpperCase(str.charAt(n))),n+1);
		}
		else {
			permute(A,str,help+String.valueOf(str.charAt(n)),n+1);
		}
	}
	public static void main(String[] args) {
		letterpermute ob=new letterpermute();
		ArrayList<String>A=new ArrayList<String>();
		String str="a";
		String help="";
		ob.permute(A,str.toLowerCase(), help, 0);
		System.out.println(A);

	}

}
