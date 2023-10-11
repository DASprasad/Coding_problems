package progarm;
import java.util.*;
public class _912_Bucket_Sort {
	
     public static int[] sortArray(int[] nums) {
        List<Integer>[]list=new ArrayList[5*10000];
        
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(list[temp]==null){
                list[temp]=new ArrayList();
            }
            list[temp].add(nums[i]);
        }
        int count=0;
        int[] ans=new int [nums.length];
        
        for(int i=0;i<list.length;i++){
        	if(count==nums.length) break;
            if(list[i]==null) continue; 
            for(int j=0;j<list[i].size();j++){
                ans[count]=list[i].get(j);
                count++;
                if(count==nums.length) break;
            }
        }
       return ans; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_912_Bucket_Sort ob=new _912_Bucket_Sort();
		int[] nums= {2,1};
		System.out.println(Arrays.toString(ob.sortArray(nums)));

	}

}
