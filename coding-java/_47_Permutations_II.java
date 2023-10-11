package progarm;
import java.util.*;
public class _47_Permutations_II {
	
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        int[] help = new int[nums.length];
		for(int i = 0 ; i < nums.length ; i++) help[i] = nums[i];
			
        permute(nums , help , 0 , new ArrayList<Integer>() , res);
        
        return res;
    }
    
    public void permute(int[] nums , int[] help , int n , List<Integer>list , List<List<Integer>>res) {
        
		if(n >= nums.length) { res.add(new ArrayList(list)); return;}
        
        HashSet<Integer> set = new HashSet();
		for(int i=0;i<nums.length;i++) {
            
			if(help[i] != -11 && !set.contains(nums[i])) {
                
			list.add(nums[i]); set.add(nums[i]); help[i] = -11;
		
			permute(nums , help , n+1 , list , res);
                
			help[i] = nums[i]; //backtracking
                
			if(list.size() != 0) {
			list.remove(list.size()-1);
			}
                
		}
	}
  } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
