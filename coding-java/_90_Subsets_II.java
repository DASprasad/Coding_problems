package progarm;
import java.util.*;
public class _90_Subsets_II {
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res = new ArrayList<List<Integer>>();
        List<Integer>help = new ArrayList<Integer>();
        boolean[] flag = new boolean[nums.length];
        backTrack(res , help , nums , flag , 0);
        return res;
    }
	
	public void backTrack(List<List<Integer>> res , List<Integer> help , int[] nums , boolean[] flag , int pos) {
		if(pos >= nums.length) {
			res.add(new ArrayList(help));
		}
		
		for(int i = pos ; i < nums.length ; i++) {
			if(i != 0 && flag[i - 1] != true) {
				help.add(nums[i]); flag[i] = true;
				backTrack(res , help , nums , flag , i + 1);
				help.remove(help.size() - 1); flag[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_90_Subsets_II ob = new _90_Subsets_II();
		int[] nums = {1 , 2 , 2};
		
//		List<List<Integer>> l = ob.subsetsWithDup(nums);
		
//		for(int i = 0 ; i < l.size(); i++) {
//			System.out.println(l.get(i));
//		}
		Long val = 0l;
		Long limit = Long.MAX_VALUE / (long)Integer.MAX_VALUE;
//		for(long i = 0 ; i < limit ; i++) {
//			val += 1;
//		}
       System.out.println(limit);
	}

}
