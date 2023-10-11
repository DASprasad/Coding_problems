package progarm;
import java.util.*;
public class _658_Find_K_Closest_Elements {
	
public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList();
        
        int low = 0; 
        int high =  arr.length - 1;
        
        while(high - low > 1) {
        	int mid = (low + high) / 2;
        	
        	if(arr[mid] < x) low = mid;
        	else if (arr[mid] > x) high = mid;
        	else { low = mid; high = mid;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
