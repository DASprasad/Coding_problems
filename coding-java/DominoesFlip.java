package progarm;
import java.util.*;
public class DominoesFlip {
	public void flipRest(StringBuilder str) {
		int i=0;
		while(i<str.length()) {
			if(str.charAt(i)=='R') {
				int pos=i+1;
				while(pos<str.length() && str.charAt(pos)=='.' ) {
					str.setCharAt(pos, 'R');
					i++;
				}
			}
			else {
				i++;
			}
		}
		int j=str.length()-1;
		while(j>=0) {
			if(str.charAt(i)=='L') {
				int pos=j-1;
				while(pos>=0 && str.charAt(pos)=='.' ) {
					str.setCharAt(pos, 'L');
					i--;
				}	
			}
			else {
				i--;
			}
		}
	}
	public String getans(String s) {
		StringBuilder str=new StringBuilder(s);
		char temp='-';
		int pos=-1;
		ArrayList<Integer>a=new ArrayList<Integer>();
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='L' && temp=='R') {
				int right=i;
				while(pos<right) {
					str.setCharAt(pos,'R');
					str.setCharAt(right,'L');
					pos++;
					right--;
				}
				if(str.charAt(pos)=='.') {
					a.add(pos);
				}
			}
			if(str.charAt(i)=='R') {
				temp='R';
				pos=i;
			}
			else if(str.charAt(i)=='L'){
				temp='L';
			}
		}
		flipRest(str);
		return String.valueOf(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DominoesFlip ob = new DominoesFlip();
		String str="RL...R...L..L..R..L...L";
		System.out.println(ob.getans(str));
	}

}
