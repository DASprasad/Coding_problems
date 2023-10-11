package progarm;

public class Catalan_Number {
	
	public int catalan(int n) {
		int[] nums=new int[n+1];
		nums[0]=1;
		nums[1]=1;
		for(int i=2;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				nums[i]=nums[i]+nums[j]*nums[i-j-1];
			}
		}
		return nums[nums.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalan_Number ob = new Catalan_Number();
		System.out.println(ob.catalan(15));
	}

}
