package progarm;

public class DiffWayToAddParanthesis {
	public int calculation(int a,int b,char ch) {
		if(ch=='*') 
		{
		return a*b;
		}
		else if(ch=='+') 
		{
		return a+b;
		}
		else {
			return a-b;
		}
	}
    public int ways(String str,int i,int j) {
    	if(i>=j) {
    		return Character.getNumericValue(str.charAt(i));
    	}
    	int local=-1000;
    	for(int k=i+1;k<=j;k=k+2) {
    		int left=ways(str,k+1,j);
    		int right=ways(str,i,k-1);
    		int ans=calculation(right,left,str.charAt(k));
    		if(ans>local) {
    			local=ans;
    		}
    	}
    	return local;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffWayToAddParanthesis ob= new DiffWayToAddParanthesis();
      String str="2*3-5+1-2+23-12-2";
      int i=0;
      int j=str.length()-1;
      System.out.println(ob.ways(str, i, j));
	}

}
