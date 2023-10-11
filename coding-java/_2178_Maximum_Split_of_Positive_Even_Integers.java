package progarm;
import java.util.*;
public class _2178_Maximum_Split_of_Positive_Even_Integers {
	
     public List<Long> maximumEvenSplit(long finalSum) {
    	 List<Long> list = new ArrayList();
    	 
    	 if(finalSum % 2 != 0) return list;//cant be partioned any way if odd
    	 
    	 long curSum = 0;
    	 long val = 2; //smallest positiive even
    	 
    	 while(curSum <= finalSum) {
    		 curSum += val;
    		 list.add(val);
    		 val += 2 ; //increment by 2 to visit every even number
    		 if(curSum + val > finalSum) break; //we want get closest we can get to final sum by this process
    	 }
    	 
    	 long diff = finalSum - curSum > 0 ? finalSum - curSum : 0;
    	 
    	 long lastElement = list.get(list.size() -1);
    	 
    	 list.set(list.size() - 1, lastElement + diff);
    	 
    	 return list;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_2178_Maximum_Split_of_Positive_Even_Integers ob = new _2178_Maximum_Split_of_Positive_Even_Integers();
		long finalSum = 28;
		
		System.out.println(ob.maximumEvenSplit(finalSum));

	}

}
