package progarm;

public class fenwickTree {
	
	public void update(int[] range , int[] nums , int index) {
		if(index >= range.length) return;
		int nextIndex = index + (index & -index);
		range[index + 1] += nums[index];
		update(range , nums , nextIndex);
	}
	
	public int getSum(int[] range , int index) {
		if(index == 0) return 0;
		int nextindex = index + (index & -index);
		return getSum(range , nextindex) + range[index];
	}
	
	public void querry(int[] nums, int start , int end) {
		int n = nums.length;
		int[] range = new int[n + 1];
		for(int i = 0; i < n ; i++) {
			update(range , nums , i);
		}
	}

	public static void main(String[] args) {t
		// TODO Auto-generated method stub

	}

}
