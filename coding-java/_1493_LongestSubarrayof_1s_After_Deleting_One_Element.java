package progarm;

public class _1493_LongestSubarrayof_1s_After_Deleting_One_Element {
      public int longestSubarray(int[] nums) {
    	  boolean flag=false;
    	  int ans=0;
    	  int currentSize=0;
    	  int lastSize=0;
    	  int countZeros=0;
    	  for(int i=0;i<nums.length;i++) {
    		  if(nums[i]==0) {countZeros+=1; flag=true;}
    		  
    		  if(countZeros<1) {
    			  currentSize+=1;
    			  ans=Math.max(ans, currentSize+lastSize); //incase there is only one zero in array
    		  }
    		  else {
    			  
    			  lastSize=currentSize;
    			  currentSize=0;
    			  countZeros=0;
    		  }
    		  
    	  }
    	  if(flag==false) return nums.length-1; //you must delete one element
    	  return ans;
        
    }
//      if(nums[i-1]==0) lastSize=0;
//	  else

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1493_LongestSubarrayof_1s_After_Deleting_One_Element ob=new _1493_LongestSubarrayof_1s_After_Deleting_One_Element();
		int[] nums= {0,0,0,0,0};
		System.out.println(ob.longestSubarray(nums));
		
	}

}
