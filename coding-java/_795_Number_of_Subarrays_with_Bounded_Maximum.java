package progarm;
import java.util.*;
public class _795_Number_of_Subarrays_with_Bounded_Maximum {
	
	public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int res = 0;
        
        int n = nums.length, leftGreater[] = new int[n], rightGreater[] = new int[n];
        
        Stack<int[]> s1 = new Stack<>(), s2 = new Stack<>();
        for (int i = 0; i < n; ++i) {
            int count = 1;
            while (!s1.isEmpty() && s1.peek()[0] < nums[i])
                count += s1.pop()[1];
            s1.push(new int[] {nums[i], count});
            leftGreater[i] = count;
        }
        for (int i = n - 1; i >= 0; --i) {
            int count = 1;
            while (!s2.isEmpty() && s2.peek()[0] <= nums[i])
                count += s2.pop()[1];
            s2.push(new int[] {nums[i], count});
            rightGreater[i] = count;
        }
        for (int i = 0; i < n; ++i)
            if(nums[i] >= left && nums[i] <= right) res = res + ( leftGreater[i] * rightGreater[i]) ;
            
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_795_Number_of_Subarrays_with_Bounded_Maximum ob = new _795_Number_of_Subarrays_with_Bounded_Maximum();
		int[] nums = {2,9,2,5,6,4,3,2,4,5,5,4,32,4,3,2,3343,33,2,55,222,4,432,4,553,2,444,2,2,3,45,5,54,43,4,5,6,555,3,3,4,5,5,66,6,43,3,4};
		int left = 10;
		int right = 37;
		
		System.out.println(ob.numSubarrayBoundedMax(nums, left, right));

	}

}
