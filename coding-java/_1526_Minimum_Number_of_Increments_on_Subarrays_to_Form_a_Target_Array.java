package progarm;

public class _1526_Minimum_Number_of_Increments_on_Subarrays_to_Form_a_Target_Array {
	
     public int minNumberOperations(int[] target) {
    	 int res = 0 , prev = 0;
    	 
    	 for(int i = 0 ; i < target.length ; i++) {
               res += Math.max(target[i] - prev , 0);
               prev = target[i];
    	 }
    	 
    	 return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1526_Minimum_Number_of_Increments_on_Subarrays_to_Form_a_Target_Array ob = new _1526_Minimum_Number_of_Increments_on_Subarrays_to_Form_a_Target_Array();

	}

}
