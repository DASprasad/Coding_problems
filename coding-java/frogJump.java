package progarm;
import java.util.*;
public class frogJump {
//	static int global=0;
	boolean flag=false;
     static HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
     
     public boolean check(int last,int n,int jump,boolean[][]dp) {
    	
    	if(flag==true) {
    		return true;
    	}
    	if(dp[map.get(n)][jump]!=true) {
    		return false;
    	}
    	
    	if(n==last) {
    		return flag=true;
    	}
    	if(n>last) {
    		return false;
    	}
    	
    	if(map.containsKey(n+jump)) {
    		 check(last,n+jump,jump,dp);
    	}
    	if(map.containsKey(n+jump+1)) {
    		 check(last,n+jump+1,jump+1,dp);
    	}
    	if(map.containsKey(n+(jump-1)) && (jump-1)!=0) {
    		 check(last,n+jump-1,jump-1,dp);
    	}
    	
    	return dp[map.get(n)][jump]=flag;
    }
	public static void main(String[] args) {
		frogJump ob =new frogJump();
		int[] nums= new int[2000];
		for(int i=0;i<2000;i++) {
			nums[i]=i;
		}
		nums[nums.length-1]=999999;
		
		boolean[][] dp=new boolean[nums.length][nums.length];
		for(int i=0;i<dp.length;i++) {
			map.put(nums[i],i);
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=true;
			}
		}
        System.out.println(ob.check(nums[nums.length-1], nums[1], 1,dp));
//        System.out.println(global);
	}

}
