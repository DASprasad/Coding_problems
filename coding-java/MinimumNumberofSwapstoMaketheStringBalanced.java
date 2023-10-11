package progarm;

public class MinimumNumberofSwapstoMaketheStringBalanced {
	public int swaps(String s) {
		int ans=0;
		int oddParanthesis=0;
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='[') {
				oddParanthesis=oddParanthesis+1;
			}
			else {
				oddParanthesis=oddParanthesis-1;
			}
			if(oddParanthesis<0) {
				oddParanthesis=0;
				count=count+1;
			}
		}
		return (count+1)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberofSwapstoMaketheStringBalanced ob=new MinimumNumberofSwapstoMaketheStringBalanced();
		String s="]]][[[";
		System.out.println(ob.swaps(s));

	}

}
