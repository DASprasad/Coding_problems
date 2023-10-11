package progarm;
import java.util.*;

public class _923_3Sum_With_Multiplicity {
	
	public int threeSumMulti(int[] A, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int res = 0;
        int mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            res = (res + map.getOrDefault(target - A[i], 0)) % mod;
            
            for (int j = 0; j < i; j++) {
                int temp = A[i] + A[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_923_3Sum_With_Multiplicity ob = new _923_3Sum_With_Multiplicity();
		
		int[] arr = {1,2,4,2,3,4,3,5,3,5,6,8,6,4,3,5,6,8,9,6,4,3,3,5,6,7,6,5,4,5,7,8,8,6,5,43,2,1,1,1,1,2,3,4,4,4,4,5,6,7,8,8,8,7,5,4,6,7,8,8,7,6,5};
		int target =21;
		
		System.out.println(ob.threeSumMulti(arr, target));

	}

}
