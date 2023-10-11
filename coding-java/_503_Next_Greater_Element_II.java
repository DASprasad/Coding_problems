package progarm;
import java.util.*;
public class _503_Next_Greater_Element_II {
	
	 public int[] nextGreaterElements(int[] nums) {
		 
		 int[] ans=new int[nums.length];
		Stack<Integer>stack=new Stack();
		
	//fill the stsck as it is an rotating array given in question
		for(int i=nums.length-1;i>=0;i--) {
			stack.push(nums[i]);
		}
		
		for(int i=nums.length-1;i>=0;i--) {
			while(stack.size()>0 && nums[i]>=stack.peek()) {
				stack.pop();
			}
			if(stack.size()==0) { //if stack size becomes zero then there is no next greater
				ans[i]=-1;
				stack.push(nums[i]);
			}
			else {
				ans[i]=stack.peek();
				stack.push(nums[i]);
			}
		}
		 
		 
		 return ans;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 _503_Next_Greater_Element_II ob=new  _503_Next_Greater_Element_II();
		 int[] nums= {5,4,3,2,1};
		 
		 System.out.println(Arrays.toString(ob.nextGreaterElements(nums)));

	}

}
