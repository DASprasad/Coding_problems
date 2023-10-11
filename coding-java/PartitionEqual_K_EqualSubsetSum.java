package progarm;

public class PartitionEqual_K_EqualSubsetSum {
	boolean flag=false;
	public boolean backtrack(int[] nums,int[] help,int n,int k,int sum,int target) {
		if(k==0) {
			flag=true;
			return true;
		}
		if(sum==target) {
			backtrack(nums,help,0,k-1,0,target);
		}
		if(n>=nums.length) {
			return false;
		}
		
		for(int i=n;i<nums.length;i++) {
			if(help[i]!=-1 && sum<target) {
				help[i]=-1;
				backtrack(nums,help,i+1,k,sum+nums[i],target);
				help[i]=0;
			}
		}
		return (flag==true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionEqual_K_EqualSubsetSum ob=new PartitionEqual_K_EqualSubsetSum();
		int[] nums= {2, 1, 5, 5, 6};
		int sum=0;
		int target=6;
		int help[]=new int[nums.length];
		int k=3;
		int n=0;
		System.out.println(ob.backtrack(nums, help, n, k, sum, target));

	}

}
