package progarm;
import java.util.*;
public class amazon {
	class pair{
		int m;
		int n;
		pair(int n,int m){
			this.m=m;
			this.n=n;
		}
		public void print() {
		System.out.print(m+" "+n);
		}
	}
	
	
	public ArrayList<Integer> get(int truckSpace, int numPackages, ArrayList<Integer>packagesSpace) {
		int req=truckSpace-30;
		int max=0;
		int prevmax=-1;
		
		ArrayList<Integer>ans=new ArrayList<Integer>(2);
		ans.add(-1);
		ans.add(-1);
		
		HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
		
		for(int i=0;i<packagesSpace.size();i++) {
			
			if(h.containsKey(req-packagesSpace.get(i))) {
				
				max=Math.max(packagesSpace.get(i),packagesSpace.get(h.get(req-packagesSpace.get(i))));
				System.out.println(max);
				
				if(max>prevmax) {
				ans.set(0,h.get(req-packagesSpace.get(i)));
				
				ans.set(1, i);
				prevmax=max;
				}
				
				
			}
			else {
				h.put(packagesSpace.get(i), i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amazon ob=new amazon();
		ArrayList<Integer>A=new ArrayList<Integer>();
		A.add(20);
		A.add(40);
		A.add(60);
		A.add(10);
		A.add(50);
		
		
		System.out.println(ob.get(90,3,A));
	}

}
