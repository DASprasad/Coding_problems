package progarm;

public class Twokeys {
	public int  twokeys(int n,int step,int count,int prev,String str,String str1) {
		if(count>n) {
			return Integer.MAX_VALUE;
		}
		if(count==n) {
			return step;
		}
		if(str.equals("C") && str1.equals("C")) {
			return Integer.MAX_VALUE;
//			count=count*2;
		}
		else if(str.equals("C")) {
			prev=count;
		}
		if(str.equals("V") && str1.equals("C")) {
			prev=count;
			count=count*2;
		}
		else if(str.equals("V")){
			count=count+prev;
		}
		
		int p=twokeys(n,step+1,count,prev,"C",str);
		int q=twokeys(n,step+1,count,prev,"V",str);
				
		return Math.min(p, q); 
	}

	public static void main(String[] args) {
		Twokeys ob=new Twokeys();
		String str="C";
		String str1="V";
		int step=0;
		int prev=0;
		int count=1;
		System.out.println(ob.twokeys(1, step, count, prev, str, str1));

	}

}
