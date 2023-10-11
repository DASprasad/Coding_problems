package progarm;
import java.util.*;
public class ReturnAllCombinationOfSumInArray {
	public void calculate(ArrayList<ArrayList<Integer>>A,ArrayList<Integer>help,int[] arr,int n,int sum,int target) {
		if(n==arr.length) {
			return;
		}
		if(sum>target) {

			return;
		}
		if(sum==target) {

				A.add(new ArrayList(help));

			return;
		}

		sum=sum+arr[n];
		help.add(arr[n]);
		
		calculate(A,help,arr,n,sum,target);
		
		for(int i=n;i<arr.length;i++) 
		{
		calculate(A,help,arr,i+1,sum,target);	
		}
		
	    help.remove(help.size()-1);
	    return;
	}
	public ArrayList<ArrayList<Integer>> brain(int[] arr,int target){
		ArrayList<ArrayList<Integer>>A=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>help=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			calculate(A,help,arr,i,0,target);
		}
		return A;
	}

	public static void main(String[] args) {
		ReturnAllCombinationOfSumInArray ob=new ReturnAllCombinationOfSumInArray();
		int arr[]= {4,2,3,6,4,5,7};
		int target=6;
		System.out.println(ob.brain(arr, target));
//		ob.brain(arr, target);
	}

}
