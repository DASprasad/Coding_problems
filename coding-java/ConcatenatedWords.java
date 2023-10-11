package progarm;
import java.util.*;
public class ConcatenatedWords {
	
	static boolean flag=false;
	static int global=0;
    public boolean wordBreak(String str,int i,HashSet<String>h,Integer dp[]){
        global=global+1;
        if(flag==true){
            return true;
        }
        if(i>=str.length()){
            flag=true;
            return true;
        }
        if(dp[i]!=null) {

        	return false;
        }
        boolean local=false;
        for(int k=i;k<str.length();k++){
            if(h.contains(str.substring(i,k+1))){
            	boolean m=wordBreak(str,k+1,h,dp);
            	local=local||m;
            }
        }
        if(local==false) {
        dp[i]=0;
        return false;
        }
        else {
        	return local;
        }
    }

	public static void main(String[] args) {
		ConcatenatedWords ob =new ConcatenatedWords(); 
		HashSet<String>h=new HashSet<String>();
		
        String[] words= {"sdsd","sdvdhwgv"};
        
        for(int i=0;i<words.length;i++) {
        	h.add(words[i]);
        }
        
       ArrayList<String>A=new ArrayList<String> ();
        for(int i=0;i<words.length;i++) {
        	Integer[] dp=new Integer[words[i].length()];
        	    h.remove(words[i]);
        	    if(ob.wordBreak(words[i],0,h,dp)) {
        		  A.add(words[i]);
        	    }
        	    h.add(words[i]);
        	    flag=false;
        	
        }
        
        
        
        System.out.println(A);
        System.out.println(global);
        
        
	}

}
