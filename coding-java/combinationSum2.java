package progarm;
import java.util.*;
public class combinationSum2 {
	HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
	public void solve(int[] nums,int n,int sum,int target,ArrayList<Integer>help,ArrayList<ArrayList<Integer>>A){
        if(n>=nums.length){
            return;
        }
        if(sum==target){
            
           if(!A.contains(help))
            A.add(new ArrayList<Integer>(help));
            
        }
        for(int i=n;i<nums.length;i++){
            if(sum<target && h.get(nums[i])==null){
            help.add(nums[i]);
            solve(nums,i+1,sum+nums[i],target,help,A);
            help.remove(help.size()-1);
            h.put(nums[n], -1); 
            }
            
        }
       
        
    }
	public static void main(String[] args) {
		combinationSum2 ob=new combinationSum2();
		int nums[]= {1,1,3,4};
		int target=5;
		int sum=0;
		int n=0;
		ArrayList<ArrayList<Integer>>A=new ArrayList<ArrayList<Integer>>();
		ob.solve(nums, n, sum, target, new ArrayList<Integer>(), A);
		
		

	}

}
