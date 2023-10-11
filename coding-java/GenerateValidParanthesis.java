package progarm;
import java.util.*;
public class GenerateValidParanthesis {
	public void generate(int pair,int n,int size,String str,ArrayList<String>A) {
		if(size==(pair*2)) {
			if(n==0) {
				A.add(str);
				return;
			}
			return;
		}
		
		
		if(n<0) {
			return;
		}
		
		
		generate(pair,n+1,size+1,str+"(",A);
		generate(pair,n-1,size+1,str+")",A);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateValidParanthesis ob=new GenerateValidParanthesis();
		ArrayList<String>A=new ArrayList<String>();
		int pair=6;
		int n=1;
		String str="(";
		int size=1;
		ob.generate(pair, n, size, str, A);
		System.out.println(A);
	}

}
