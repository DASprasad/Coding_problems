package progarm;
import java.util.*;
public class _621_Task_Scheduler {
	
	public int leastInterval(char[] tasks, int n) {
        int time = 0; 
        int[] freq = new int[130];
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a , b)-> Integer.compare(b, a)); //sort to descending order of freq
        
        for(int i = 0 ; i < tasks.length ; i++ ) {
        	freq[tasks[i] - 'A']++;
        }
       for(int  i = 0 ; i < freq.length ; i++) if(freq[i] != 0) heap.add(freq[i]);
       
       Queue<int[]> q = new LinkedList();
       
        while(heap.size() > 0 || q.size() > 0) {
        	time += 1;
        if(heap.size() > 0) {
        	int count = heap.poll();
        	count = count - 1;
        	
        	if(count != 0) {
        		int[] arr = {count , time + n};
        		
        		q.add(arr);
        			
        	}
        }
        	if(q.size() > 0 && time == q.peek()[1]) {
        		heap.add(q.poll()[0]);
        	}
        	
        }
        
        return time;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_621_Task_Scheduler ob = new _621_Task_Scheduler();
		char[] tasks = {'A','A','A','A','B','C'};
		int n = 3;
		System.out.println(  ob.leastInterval(tasks, n));

	}

}
