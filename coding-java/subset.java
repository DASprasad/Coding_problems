package progarm;
import java.util.*;
public class subset {
	 public void generate(ArrayList<ArrayList<Integer>>A,ArrayList<Integer>help,int[] nums,int n){
	       if(n>=nums.length){
	           A.add(new ArrayList<Integer>(help));
	           return;
	       } 
	        for(int i=n;i<nums.length;i++){
	            help.add(nums[i]);
	            generate(A,help,nums,i+1);
	            help.remove(help.size()-1);
	        }
	        A.add(new ArrayList<Integer>(help)); 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subset ob =new subset();
		ArrayList<ArrayList<Integer>>A=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer>help=new ArrayList<Integer>();
		int nums[]= {1,2,3};
		ob.generate(A, help, nums, 0);
		for(int i=0;i<A.size();i++) {
			System.out.print(A.get(i)+" ");
		}

	}

}
