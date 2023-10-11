package progarm;

import java.util.*;

public class _1352_Product_of_the_Last_K_Numbers {
	
	ArrayList<Integer> prefix;
	int currentVal=1 ;
	int depth=Integer.MIN_VALUE;  //if there is a zero
	
	_1352_Product_of_the_Last_K_Numbers(){
		this.prefix=new ArrayList();
	}
	public void add(int n) {
		if(n==0) {
			prefix.add(1);
			depth=prefix.size();
			currentVal=1;
		}
		else {
			currentVal *= n;
			prefix.add(currentVal);
		}
	}
	
	public int get(int k) {
		int pos=prefix.size()-k;
		
		if(pos<depth) return 0;
		
		if(k == prefix.size()) return currentVal ;
		
		else return currentVal / prefix.get(pos-1) ;
	}
	
	 public int numSubarraysWithSum(int[] A, int S) {
	        int psum = 0, res = 0, count[] = new int[A.length + 1];
	        count[0] = 1;
	        for (int i : A) {
	            psum += i;
	            if (psum >= S)
	                res += count[psum - S];
	            count[psum]++;
	        }
	        return res;
	    }
	 
	 public static int[] deckRevealedIncreasing(int[] deck) {
	        int n= deck.length;
	        Arrays.sort(deck);
	        Queue<Integer> q= new LinkedList<>();
	        for (int i=0; i<n; i++) q.add(i);
	        int[] res= new int[n];
	        for (int i=0; i<n; i++){
	            res[q.poll()]=deck[i];
	            q.add(q.poll());
	        }
	        return res;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_1352_Product_of_the_Last_K_Numbers ob =new _1352_Product_of_the_Last_K_Numbers();
//		ob.add(2);
//		ob.add(4);
//		ob.add(3);
//		ob.add(-3);
//		System.out.println(ob.get(4));
//		System.out.println(ob.get(3));
//		ob.add(0);
//		ob.add(3);
//		System.out.println(ob.get(1));
//		ob.add(4);
//		System.out.println(ob.get(1));
//		System.out.println(ob.get(3));
//		System.out.println(ob.get(2));
		int[] deck= {17,13,11,2,3,5,7};
		deckRevealedIncreasing(deck);
		
	

	}

}
