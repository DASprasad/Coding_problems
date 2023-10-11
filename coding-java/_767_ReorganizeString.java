package progarm;
import java.util.*;
import java.util.Arrays;

//      https://leetcode.com/problems/reorganize-string/
public class _767_ReorganizeString {
	
	public String rearrange(String s) {
		int[] hash=new int[26];
		for(int i=0;i<s.length();i++) {
			hash[s.charAt(i)-'a']++;
		}
		int max=0;
		int letter=0;
		for(int i=0;i<hash.length;i++) {
			if(hash[i]>max) {
				max=hash[i];
				letter=i;
			}
		}
		char[] res=new char[s.length()];
		int pos=0;
		if(max>(s.length()+1)/2) {
			return "";
		}
		hash[letter]=0;
		while(pos<=res.length && max>0) {
			res[pos]=(char) (letter+'a');
			pos+=2;
			max--;
		}
		for(int i=0;i<hash.length;i++) {
			while(hash[i]>0) {
				if(pos>=res.length) {
					pos=1;
				}
				res[pos]=(char)(i+'a');
				hash[i]--;
				pos=pos+2;
			}
		}
		
		return String.valueOf(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_767_ReorganizeString ob =new _767_ReorganizeString();
		String s="aaaaaabbcde";
		System.out.println (ob.rearrange(s));
	}

}
