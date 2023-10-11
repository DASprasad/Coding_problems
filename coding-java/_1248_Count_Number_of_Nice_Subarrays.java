package progarm;

public class _1248_Count_Number_of_Nice_Subarrays {
	
	public int atMost(int[]nums ,int k) {
		int res=0;
		 int OddCount=0;
		 int last=0;
		 for(int i=0;i<nums.length;i++) { 
			 
			 if((nums[i] & 1)==1) OddCount+=1;
		         
			 while(OddCount > k) {
		        	if((nums[last++]& 1) ==1) {
		        		OddCount-=1;
		        	}
		        }
		 
	         res  +=  i - last + 1 ;	    
		 }
		 
		 return res;
	}
	
	 public int numberOfSubarrays(int[] nums, int k) {
		 
		return atMost(nums,k) - atMost(nums,k-1); 
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1248_Count_Number_of_Nice_Subarrays ob =new _1248_Count_Number_of_Nice_Subarrays();
		int[] nums= {1,2,1,1,3,5,4,1};
		int k=2;
		System.out.println(ob.numberOfSubarrays(nums, k));
	}

}
