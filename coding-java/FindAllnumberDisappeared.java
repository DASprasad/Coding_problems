package progarm;
import java.util.*;
public class FindAllnumberDisappeared {
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>A=new ArrayList<Integer>();
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
             temp=-1*nums[i];
            }
            else{
             temp=nums[i];
            }
            if(nums[temp-1]>0) {
            nums[temp-1]=-1*nums[temp-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                A.add(i+1);
            }
        }
        
        return A;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);

	}

}
