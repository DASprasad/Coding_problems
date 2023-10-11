package progarm;
import java.util.*;
public class largestDivisibleSubset {
	static int global=0;
	static ArrayList<Integer>ans=new ArrayList<Integer>();
    public boolean check(ArrayList<Integer>A,int num) {
    	for(int i=0;i<A.size();i++) {
    		if(A.get(i) % num !=0 && num % A.get(i)!=0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public void solve(int[] nums,ArrayList<Integer>help,int n){
    	if(help.size()>ans.size()) {
    		ans=new ArrayList<Integer>(help);
    	}
    	if(n>=nums.length) {
    		return; 
    	}
    	
    	for(int i=n;i<nums.length;i++) {
    		if(check(help,nums[i])) {
    			help.add(nums[i]);
    		    solve(nums,help,i+1);
    		    help.remove(help.size()-1);
    		}
    	}
    	
    	
    }

    
    /////////////////////iterative way faster
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        int[] pre = new int[n];
        Arrays.sort(nums);
        int max = 0, index = -1;
        for (int i = 0; i < n; i++) {
            count[i] = 1;
            pre[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
            	global=global+1;
                if (nums[i] % nums[j] == 0) {
                    if (1 + count[j] > count[i]) {
                        count[i] = count[j] + 1;
                        pre[i] = j;
                    }
                }
            }
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        while (index != -1) {
            res.add(nums[index]);
            index = pre[index];
        }
        System.out.println(res);
        return res;
    }
    
	public static void main(String[] args) {
		largestDivisibleSubset ob = new largestDivisibleSubset();
		int[] nums= {2,3,4,9,27};
		int n=0;
		ob.solve(nums, new ArrayList<Integer>(), n);
//		ob.largestDivisibleSubset(nums);
//		ob.largest(nums);
		System.out.println(ans);
//		System.out.println(global);

	}

}
