package progarm;
import java.util.*;
public class LongestFibSequence {
	 public int lenLongestFibSubseq(int[] arr) {
	        HashSet<Integer> h=new HashSet<Integer>();
	        int ans=0;
	        for(int i=0;i<arr.length;i++){
	            h.add(arr[i]);
	        }
	        int temp=0;
	        int count=0;
	        for(int i=0;i<arr.length-1;i++){
	            
	            for(int j=i+1;j<arr.length;j++){
	            	int last=arr[i];
	                int first=arr[j];
	                count=2;
	                
	                while(h.contains(last+first)){
	                    
	                    temp=last;
	                    last=first;
	                    first=first+temp;
//	                    System.out.println(last+ " "+first);
	                    count++;
	                    ans=Math.max(ans,count);
	                }
	                
	      
	                
	            }
	        }
	        if(ans<=2) return 0;
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestFibSequence ob=new LongestFibSequence();
		int [] arr= {2,4,7,8,9,10,14,15,18,23,32,50};
		System.out.print(ob.lenLongestFibSubseq(arr));

	}

}
