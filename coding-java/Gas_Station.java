package progarm;

public class Gas_Station {
	
	public int check(int[] gas,int[] cost) {
		int candidate=-1;
		int gasLeft=0;
		
		for(int i=0;i<gas.length;i++) {

		gasLeft=gasLeft+(gas[i]-cost[i]);
		
			if(gasLeft>=0) {
				if(candidate==-1) candidate=i;	
			}
			else {
				gasLeft=0;
				candidate=-1;
			}
		}
		if(candidate==-1) {
			return -1;
		}
		for(int i=0;i<candidate;i++) {
			gasLeft=gasLeft+(gas[i]-cost[i]);
			if(gasLeft<0) {
				return -1;
			}
		}
		return candidate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gas_Station ob=new Gas_Station();
		int[] gas= {0,0,0};
		int cost[]={0,0,0};
		System.out.println(ob.check(gas, cost));

	}

}
