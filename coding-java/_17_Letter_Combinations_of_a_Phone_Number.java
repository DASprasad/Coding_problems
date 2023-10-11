package progarm;
import java.util.*;
public class _17_Letter_Combinations_of_a_Phone_Number {
	
	public void combination(String[] arr , int n , String s , String res , List<String>list) {
		if(n >= s.length()) {
			list.add(res);
			return;
		}
		
		for(int i = 0; i < arr[Character.getNumericValue(s.charAt(n))].length() ; i++) {
			combination(arr , n + 1 , s , res + arr[Character.getNumericValue(s.charAt(n))].charAt(i) , list);
		}
	}
    public List<String> letterCombinations(String digits) {
        
        String[] arr = {"ahaha","lol" , "abc" , "def" , "ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        List<String>A=new ArrayList<String>();
        
        if(digits.length() == 0) return A;
        
        
        combination(arr , 0 , digits , "" , A);
        
        return A;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
