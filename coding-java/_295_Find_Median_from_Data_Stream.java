package progarm;
import java.util.*;
public class _295_Find_Median_from_Data_Stream {
	
	PriorityQueue<Integer> minHeap;
	PriorityQueue<Integer> maxHeap;
	
       public _295_Find_Median_from_Data_Stream() {
        minHeap = new PriorityQueue<Integer>(1000 , (a , b)-> a - b);
        maxHeap = new PriorityQueue<Integer>(1000 , (a , b)-> b - a);
      }
    
       public void addNum(int num) {
    	   
           maxHeap.add(num);
    	   
    	   if(maxHeap.size() - minHeap.size() > 1) minHeap.add(maxHeap.poll());
    	   
    	   if(minHeap.size() > 0 && maxHeap.peek() > minHeap.peek()) {
    		  minHeap.add(maxHeap.poll());
    	   }
    	   
    	   if(minHeap.size() > 0 && minHeap.size() - maxHeap.size() > 1) maxHeap.add(minHeap.poll());
        
    }
    
       public double findMedian() {
    	   
    	   if(minHeap.size() == maxHeap.size()) return (double)(minHeap.peek()+maxHeap.peek()) / 2;
    	   else if(minHeap.size() > maxHeap.size()) return minHeap.peek();
    	   else return maxHeap.peek();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_295_Find_Median_from_Data_Stream  ob = new _295_Find_Median_from_Data_Stream ();
		ob.addNum(1);
		ob.addNum(2);
//		ob.addNum(3);
//		ob.addNum(7);
//		ob.addNum(3);
//		ob.addNum(20);
//		ob.addNum(8);
//		ob.addNum(1);
//		ob.addNum(1);
		
		System.out.println(ob.findMedian());
		

	}

}
