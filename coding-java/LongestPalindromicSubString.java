package progarm;
import java.util.*;
public class LongestPalindromicSubString {
    static String Biggest="";
    static int global=0;
 

  
    public boolean isPalindrome(String str) {
    	int i=0;
    	int j=str.length()-1;
    	while(i<=j) {
    		if(str.charAt(i)!=str.charAt(j)) {
    			return false;
    		}
    		
    		i++;
    		j--;
    }
    	return true;
    }
    public String longest(String str,int i,int j,String [][] dp) {
    	
    	if(i>=j) {
    		return String.valueOf(str.charAt(i));
    	}
//    	if(dp[i][j]!=null) {
//    		return dp[i][j];
//    	}
    	String local="";
    		for(int k=i+1;k<=j;k++) {
    			
    			String a=longest(str,k,j,dp);
    			String b=longest(str,i,k-1,dp);
    			
    			local=b+a;	
    			if(isPalindrome(local)) {
        			if(local.length()>=Biggest.length()) {
    					Biggest=local;
    				}

    			}
    					
    		}
    		
				return local;
			
    	
    	}
    //////// Fastest method
    
    public String expand(String str,int left,int right) {
    	while(left>=0 && right<=str.length()-1 && str.charAt(left)==str.charAt(right) ) {
    		global=global+1;
    		left--;
    		right++;
    	}
    	
    	return str.substring(left+1,right);
    }
    public String findLongest(String str) {
    	if(str.length()==0) {
    		return "";
    	}
    	if(str.length()==1) {
    		return str;
    	}
    	
    	String temp1="";
    	String temp2="";
    	String max="";
    	for(int i=0;i<str.length()-1;i++) {
    		temp1=expand(str,i,i);
    		temp2=expand(str,i,i+1);
    		if(temp1.length()>max.length()) {
    			max=temp1;
    		}
    		if(temp2.length()>max.length()) {
    			max=temp2;
    		}
    		if(max.length()==str.length()) {
    			break;
    		}
    	}
    	return max;
    }
    
    
    

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubString ob = new LongestPalindromicSubString();
		String str="a";//"forgeeksskeegfor";//"shgahshj";//
		int i=0;
		int j=str.length()-1;
		String[][] dp=new String[i][j];
//		ob.longest(str, i, j,dp);
       System.out.println( ob.findLongest(str));
       System.out.println(global);





		

	}

}
