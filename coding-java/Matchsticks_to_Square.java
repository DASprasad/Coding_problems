package progarm;

import java.util.Arrays;

public class Matchsticks_to_Square {
//	static int global=0;
	boolean flag=false;
	
	public boolean check(int[] nums,int help[],int n,int k,int sum,int target) {
//		global=global+1;
		if(k==0 || flag==true) {
			flag=true;
			return true;
		}
		if(sum==target) {
			check(nums,help,0,k-1,0,target);
		}
		if(sum>target) {
			return false;
		}
		boolean local=false;
		for(int i=n;i<nums.length;i++) {
			if(flag) return true;
			if(help[i]!=-1) {
			help[i]=-1;
			boolean m=check(nums,help,i+1,k,sum+nums[i],target);
			local=local || m;
			help[i]=nums[i];
		}
	}
	return local;	
}
	public boolean call(int[] nums) {
		Arrays.sort(nums);
		int[] help=new int[nums.length];
		int l=0;
		int j=nums.length-1;
		while(l<=j) {
			int temp=nums[l];
			nums[l]=nums[j];
			nums[j]=temp;
			l++;
			j--;
		}
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
			help[i]=nums[i];
		}
		if(sum%4!=0) {
			return false;
		}
		int target=sum/4;
		sum=0;
		return check(nums,help,0,4,sum,target);
	}

	public static void main(String[] args) {
		 Matchsticks_to_Square ob =new  Matchsticks_to_Square();
		 int[] nums= {1,1,2,2,2,2,2,1,1,1,1,1,1,1,1};
		 System.out.println(ob.call(nums));
		 

	}

}
