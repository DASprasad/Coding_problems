package progarm;

public class NumberOfPalindromicSubStrings {
	public int expand(String str,int left,int right) {
		int count=0;
    	while(left>=0 && right<=str.length()-1 && str.charAt(left)==str.charAt(right) ) {
    		left--;
    		right++;
    		count=count+1;
    	}
    	
    	return count;
    }
	
	 public int findLongest(String str) {
	    	
	    	if(str.length()==1) {
	    		return 1;
	    	}
	    	
	    	int temp1=0;
	    	int temp2=0;
	    	int total=0;
	    	for(int i=0;i<=str.length()-1;i++) {
	    		temp1=expand(str,i,i);
	    		temp2=expand(str,i,i+1);

	    		total=total+temp1+temp2;
	    		
	    	}
	    	return total;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfPalindromicSubStrings ob=new NumberOfPalindromicSubStrings();
		String str="aaabbcccaccacabbbabbaaabbbccc";
	    System.out.println(ob.findLongest(str));

	}

}
