package progarm;

public class _1043_Partition_Array_for_Maximum_Sum {
     public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp=new int[arr.length];
        int track[] =new int[k];
        int max=-1;
        int current=0;
        for(int i=0;i<k;i++) {
        	max=Math.max(arr[i], max);
        	dp[i]=Math.max(max, ((i-0)+1)*max);
        }
        max=-1;
        for(int i=k;i<arr.length;i++) {
        	for(int j=i;j>i-k;j--) {
        		max=Math.max(max, arr[j]);
        		current=Math.max(max*((i-j)+1)+dp[j-1],current);
        	}
        	dp[i]=current;
        	current=0;
        	max=-1;
        }
        return dp[dp.length-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1043_Partition_Array_for_Maximum_Sum ob=new _1043_Partition_Array_for_Maximum_Sum();
		int[] arr= {1,4,1,5,7,3,6,1,9,9,3,3,4,5,4,4,5,6,5,4,3,5,6,7,8,8,8,9,7,6,4,3,3,4,5,6,7,6,5,4,3,2,4,5,6};
		System.out.println(ob.maxSumAfterPartitioning(arr, 1));
	}

}
