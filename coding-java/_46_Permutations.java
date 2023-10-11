package progarm;
import java.util.*;
public class _46_Permutations {
	
	public void permute(int nums[],int sub[],int n,ArrayList<Integer>help,List<List<Integer>>ans) {
		if(n>=nums.length) {
			ans.add(new ArrayList(help));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(sub[i]!=-1) {
			help.add(nums[i]);
			sub[i]=-1;
			permute(nums,sub,n+1,help,ans);
			sub[i]=nums[i];
			if(help.size()!=0) {
			help.remove(help.size()-1);
			}
			}
		}
	}
	
	public void call(int[] nums) {
		List<List<Integer>>ans=new ArrayList<List<Integer>>();
		ArrayList<Integer> help=new ArrayList();
		int[] sub=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			sub[i]=nums[i];
		}
		permute(nums,sub,0,help,ans);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_46_Permutations ob=new _46_Permutations();
		int[] nums= {1,2,3};
		ob.call(nums);

	}

}
