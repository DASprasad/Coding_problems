package progarm;
import java.util.*;
public class MergeInterVals {
	
	public int[][] solve(int[][] arr){
		Arrays.sort(arr , (a,b)->a[0]-b[0]);
		int max=arr[0][1];
		int pos=0;
		int count=0;

		for(int i=1;i<arr.length;i++) {
			if(arr[i][0]<max) {
			  arr[pos][1]=Math.max(arr[pos][1],arr[i][1]);
			  max=Math.max(max, arr[i][1]);
			  arr[i][0]=-1;
			  arr[i][1]=-1;
			  count++;
			}
			else {
				pos=i;
				max=arr[i][1];
			}	
		}
		
		pos=0;
		int[][] ans=new int[arr.length-count][2];
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]!=-1) {
				ans[pos][0]=arr[i][0];
				ans[pos][1]=arr[i][1];
				pos+=1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeInterVals ob = new MergeInterVals();
		int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
		ob.solve(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(Arrays.toString(arr[i])+" ");
		}
		HashSet<ArrayList<Integer>> h=new HashSet();
		ArrayList<Integer>A=new ArrayList();
		ArrayList<Integer>B=new ArrayList();
		A.add(2);
		A.add(3);
		A.add(5);
		h.add(A);
		B.add(2);
		B.add(3);
		B.add(5);
		if(h.contains(B)) {
			System.out.println(true);
		}
		

	}

}
