package progarm;
import java.util.*;
public class _456_132_Pattern {
	
	class pair{
		int idx , min;
		pair(int val , int min){this.idx = val; this.min = min;}
	}
	
   public boolean find132pattern(int[] nums) {
        int smallestSoFar = Integer.MAX_VALUE;
        Stack<pair> stack = new Stack<pair>();
        
        for(int i = 0 ; i < nums.length ; i++) {
        	
        	while(stack.size() > 0 && nums[i] >= stack.peek().idx) stack.pop();
        	
        	if(stack.size() > 0 && stack.peek().min < nums[i]) return true;
        	stack.push(new pair(nums[i] , smallestSoFar));
        	smallestSoFar = Math.min(smallestSoFar, nums[i]);
        	
        }
        
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
