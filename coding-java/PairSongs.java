package progarm;
import java.util.*;
public class PairSongs {
	
	//{150,30,60,20,90,100,160,150} after sorting {20,30,60,90,100,150,150,160} sorting will not help much..

	//lets say we are trying to find out in O(n) time and O(n) space

	//can we see the numbers in array it  remainder of 60s 

	//  30, 30 ,0 ,20 ,30 ,40 ,40 ,30   1+2+1+1+3=8 

	// we got it
	
	 public int numPairsDivisibleBy60(int[] time) {
	        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
	        int count=0;
	        int divisible=0;
	       
	        
	        for(int i=0;i<time.length;i++){
	        	if(time[i]%60==0) {
	        		divisible=divisible+1;
	        	}
	        	int temp=60-(time[i]%60);
	        	
	            if(h.containsKey(temp)) 
	            {
	            	count=count+h.get(temp);
	            	
	            	if(h.containsKey(time[i]%60)) 
	            	{
	            	  h.put(time[i]%60, h.get(time[i]%60)+1);
	            	}
	            	else 
	            	{
	            		h.put(time[i]%60,1);
	            	}
	            	
	            }
	            
	            else 
	            {
	            	
	            	if(h.containsKey(time[i]%60)) 
	            	{
	            	  h.put(time[i]%60, h.get(time[i]%60)+1);
	            	}
	            	else 
	            	{
	            		h.put(time[i]%60,1);
	            	}
	            
	          }
	        
	        }
	               int n=divisible-1;
	               
	               if(divisible>=2) {

	               return count+((n*(n+1))/2);
	               }
	               return count;
	        
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairSongs ob=new PairSongs();
		int [] time= {10,80,70,50,180,30,300,240,150,30,60,20,90,100,160,150,30,30,20,40,120,150,50,40,90,60,240,130,240,300,60,60,120};// {150,30,60,20,90,100,160,150} after so
		System.out.println(ob.numPairsDivisibleBy60(time));

	}

}

//{150,30,60,20,90,100,160,150} after sorting {20,30,60,90,100,150,150,160} sorting will not help much

//lets say we are trying to find out in O(n) time and O(1) space

//can we divide it into remainder of 60s 

//  30, 30 ,0 ,20 ,30 ,40 ,40 ,30   1+2+1+1+3=8 

// we got it

//{10,80,70,50,180,30,300,240,150,30,60,20,90,100,160,150,30,30,20,40,120,150,50,40,90,60,240,130,240,300,60,60,120)
