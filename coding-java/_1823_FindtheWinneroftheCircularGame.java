package progarm;
import java.util.*;
public class _1823_FindtheWinneroftheCircularGame {
	
	 public int findTheWinner(int n, int k) {
		int pos=1;
		int calls=0;
		Queue<Integer> q=new LinkedList();
		for(int i=1;i<=n;i++) {
			q.add(i);
		}
		
		while(q.size()>1) {
			calls+=1;
			if(pos==k) {
				pos=1;
				q.poll();
			}
			
			else {
				q.add(q.poll());
				pos++;
			}
		}
		System.out.println(calls);
		return q.poll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_1823_FindtheWinneroftheCircularGame ob=new _1823_FindtheWinneroftheCircularGame();
		int n=500;
		int k=500;
		System.out.println(ob.findTheWinner(n, k));

	}

}
