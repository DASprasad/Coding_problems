package progarm;
import java.util.*;
//import java.math.*;
public class _1461_Check_If_a_String_Contains_All_Binary_Codes_of_Size_K {
	
	public boolean hasAllCodes(String s, int k) {
        double requiredTotalNumber = Math.pow(2 , k);
        int mask = 0;
        HashSet<Integer> set = new HashSet();
        
        for(int i = 0 , last = 0 ; i < s.length() ; i++){
            while(i - last > k - 1){
                int n = 1 << k - 1;
                mask = (mask & n) != 0 ? mask ^ n : mask;
                
                last++;
            }
            mask = mask << 1;
            mask |= Character.getNumericValue(s.charAt(i)); 
            if(i - last == k - 1) set.add(mask);
        }
        
        return set.size() == requiredTotalNumber;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1461_Check_If_a_String_Contains_All_Binary_Codes_of_Size_K ob = new _1461_Check_If_a_String_Contains_All_Binary_Codes_of_Size_K();
		String s = "0110";
		
		System.out.println(ob.hasAllCodes(s, 2));

	}

}
