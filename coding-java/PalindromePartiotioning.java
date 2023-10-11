package progarm;
import java.util.*;
public class PalindromePartiotioning {
public boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}

	public void filler(String s,int i,ArrayList<String>help,ArrayList<ArrayList<String>>A) {
		if(i>=s.length()) {
			A.add(new ArrayList<String>(help));
			return;
		}
		for(int k=i;k<s.length();k++) {
			String temp=s.substring(i,k+1);
			if(isPalindrome(temp)) {
				help.add(temp);
			filler(s,k+1,help,A);
			if(help.size()!=0) {
			help.remove(help.size()-1);
			}
		}
	}
}
	public static void main(String[] args) {
		PalindromePartiotioning ob =new PalindromePartiotioning();
		String str="abcacd";
		ArrayList<String>help=new ArrayList<String>();
		ArrayList<ArrayList<String>>A=new ArrayList<ArrayList<String>>();
		ob.filler(str, 0, help, A);
		for(int i=0;i<A.size();i++) {
			for(int j=0;j<A.get(i).size();j++) {
				System.out.print(A.get(i).get(j)+"   ");
			}
			System.out.println();
		}
	}

}
