package progarm;

public class PartitionEqualSubsetSum {
	boolean flag=false;
	public boolean check(int nums[],int n,int target,int sum) {
		if(sum>target) {
			return false;
		}
		if(sum==target || flag==true) {
			flag=true;
			return true;
		}
		if(n>=nums.length) {
			return false;
		}
		boolean local=false;
		for(int i=n;i<nums.length;i++) {
			boolean m=check(nums,i+1,target,sum+nums[i]);
			local=local || m;
		}
		return local;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionEqualSubsetSum ob= new PartitionEqualSubsetSum();
		int nums[]= {1,2,3,5};
		int target=0;
		for(int i=0;i<nums.length;i++) {
			target=target+nums[i];
		}
		if(target%2 !=0) {
			System.out.println("false");
		}else {
			target=target/2;
		}
		int n=0;
		
		int sum=0;
		System.out.println(ob.check(nums, n, target, sum));

	}

}
