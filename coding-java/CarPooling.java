package progarm;
import java.util.*;
public class CarPooling {
	
	public boolean isPossible(int capacity , int[][] trips) {
	PriorityQueue<Integer> pq=new PriorityQueue();
	HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
     Arrays.sort(trips , (a,b)->a[1]-b[1]);
     pq.add(trips[0][2]);
     h.put(trips[0][2],trips[0][0]);
     int total=trips[0][0];
     if(total>capacity) return false;
     for(int i=1;i<trips.length;i++) {
    	 
    	 while(trips[i][1]>=pq.peek()) {
    		 total-=h.get(pq.poll());
    		 if(pq.size()==0) {
    			 break;
    		 }
    	 }
    	 total=total+trips[i][0];
    	 if(total>capacity) {
    		 return false;
    	 }
    	 
    	 if(h.containsKey(trips[i][2])) {
    		 h.put(trips[i][2], trips[i][0]+h.get(trips[i][2]));
    	 }
    	 else {
    		 h.put(trips[i][2],trips[i][0]);
    		 pq.add(trips[i][2]);
    	 }
    	 
     }
     return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarPooling ob =new CarPooling();
		int[][] trips= {{2,3,7},{3,1,9},{3,2,6},{2,4,10},{8,13,14},{2,6,7}};
		int capacity=10;
		System.out.println(ob.isPossible(capacity, trips));

	}

}
