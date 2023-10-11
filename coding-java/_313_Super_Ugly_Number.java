package progarm;
import java.util.*;
public class _313_Super_Ugly_Number {
	
	public int comp(int[] a,int[] b) {
		if(a[0]>b[0]) {
			return 1;
		}
		return -1;
	}
	
	 public int nthSuperUglyNumber(int n, int[] primes) {
	
		 PriorityQueue<int[]> heap = new PriorityQueue<>(3, (a,b) -> comp(a,b));
		  for(int i=primes.length-1;i>=0;i--) {
			  int arr[] =new int[3];
			  arr[0] = primes[i]; arr[1] = primes[i]; arr[2]=1;
			  heap.add(arr);
		  }
		  int ans[] = new int[n];
		  ans[0] = 1;
		  int i=1;
		  while(i<n) {
			  int arr[] = heap.poll();
			  
			  if(arr[0]==ans[i-1]) {  //handle duplicates
				   arr[0] = arr[1] * ans[arr[2]++]; 
				   heap.add(arr);
				   continue;
			  }
			  
			  ans[i] = arr[0];
			  arr[0] = arr[1] * ans[arr[2]++];
			  
			  heap.add(arr);
			  i++;
			  
		  }
		       return ans[n-1];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_313_Super_Ugly_Number  ob =new _313_Super_Ugly_Number ();
		int[] primes = {2,7,13,19};
		int n =12;
		System.out.println(ob.nthSuperUglyNumber(n, primes));
		

	}

}
