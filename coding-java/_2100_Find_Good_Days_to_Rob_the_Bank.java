package progarm;
import java.util.*;
public class _2100_Find_Good_Days_to_Rob_the_Bank {
	
     public List<Integer> goodDaysToRobBank(int[] security, int time) {
    	 List<Integer>ans=new ArrayList();
    	 int[] dpLeft=new int[security.length];
    	 int[] dpRight=new int[security.length];
    	 dpRight[dpRight.length-1]=1;
    	 dpLeft[0]=1;
    	 
    	 for(int i=1;i<dpLeft.length;i++) {
    		 if(security[i]<=security[i-1]) dpLeft[i]=dpLeft[i-1]+1;
    		 else dpLeft[i]=1;
    	 }
    	 
    	 for(int i=dpRight.length-2;i>=0;i--) {
    		 if(security[i]<=security[i+1]) dpRight[i]=dpRight[i+1]+1;
    		 else dpRight[i]=1;
    	 }
    	 
    	 for(int i=0;i<security.length;i++) {
    		 int temp=Math.min(dpLeft[i], dpRight[i]);
    		 if(temp>time) {
    			 ans.add(i);
    		 }
    	 }
    	 
    	 
    	 return ans;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2100_Find_Good_Days_to_Rob_the_Bank ob=new _2100_Find_Good_Days_to_Rob_the_Bank();
		int[] security= {1,2,3,4,5,6};
		int time=2;
		System.out.println(ob.goodDaysToRobBank(security, time));

	}

}
