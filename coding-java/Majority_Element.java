package progarm;

public class Majority_Element {
	public int majorityElement(int[] nums) {
		 int major=nums[0], count = 1;
	        for(int i=1; i<nums.length;i++){
	            if(count==0){
	                count++;
	                major=nums[i];
	            }else if(major==nums[i]){
	                count++;
	            }else count--;
	            
	        }
	        return major;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Majority_Element ob=new Majority_Element();
		_912_Bucket_Sort ob1=new _912_Bucket_Sort();
		int nums[]= {6,6,6,7,7};
		System.out.println(ob.majorityElement(nums));
		ob1.sortArray(nums);

	}

}
