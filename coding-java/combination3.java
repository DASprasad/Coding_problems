package progarm;
import java.util.*;
public class combination3 {
	static int global=0;
     public void pus(int[] arr,ArrayList<Integer>A,int target,int n,int part,int sum) {
    	 global=global+1;
    	 if(n>arr.length) {
    		 return;
    	 }
    	 if(part==0 && sum==target) {
    		 System.out.println(A);
    		 return;
    	 }
    	 if(part==0 || sum>target ) {
//    		 System.out.println(A);
    		 return;
    	 }
    	 for(int i=n;i<arr.length;i++) {
    		 A.add(arr[i]);
    		 pus(arr,A,target,i+1,part-1,sum+arr[i]);
   		     A.remove(A.size()-1);
    	 }
     }
	public static void main(String[] args) {
		combination3 ob = new combination3();
       int input=30;
       int arr[] =new int[input];
       for(int i=0;i<input;i++) {
    	   arr[i]=i+1;
//    	   System.out.println(arr[i]);
       }
       ob.pus(arr, new ArrayList(), 150, 0, 2,0);
       System.out.println(global);
	}

}
